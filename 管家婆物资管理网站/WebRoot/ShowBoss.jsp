<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<link rel="stylesheet" href="css/bootstrap.min.css" type="text/css">
<script type="text/javascript" src="js/jquery-3.4.1.min.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  <style type="text/css">
			/*
			用于设置页面的div参数
			宽1200
			高580
			边框1像素灰色实线
			上下边距0左右居中
			背景颜色白色透明度50%
			*/
			#divOne {
				width: 1000px;
				height: 580px;
				border: #999999 solid 1px;
				margin: 0px auto;
				background-color: rgba(255, 255, 255, 0.5);
			}
		</style>
  </head>
  <body background="img/01.jpg">
		<!-- 导航栏 -->
<nav class="navbar navbar-inverse" role="navigation">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand" href="Boss.jsp">管家婆管理系统</a>

			</div>
			<div>
				<ul class="nav navbar-nav navbar-right">

					<li><a href="storehouseBoss.jsp">仓库</a>
					</li>
					<li><a href="bbox.jsp">口袋</a>
					</li>
					<li><a href="smanage.jsp"> 员工管理 </a>
					</li>

					<li class="dropdown" id="relogin" style="width: 200px"><a
						href="#" class="dropdown-toggle" data-toggle="dropdown">
							个人中心:&nbsp;&nbsp;${user.user_name} <b class="caret"></b> </a>
						<ul class="dropdown-menu" style="width: 200px">
							<li><a href="ShowBoss.jsp"><span
									class="glyphicon glyphicon-user">&nbsp;</span>个人信息</a></li>
							<li><a href="messageinit"><span
									class="glyphicon glyphicon-bell">&nbsp;</span>消息 <span
									class="badge pull-right">${message_count}</span>
							</a>
							</li>
							<li><a href="login.jsp"><span
									class="glyphicon glyphicon-off">&nbsp;</span>重新登陆 </a>
							</li>
						</ul></li>
				</ul>
			</div>
		</div>
	</nav>
	<!-- 导航栏结束 -->

		<div id="divOne">
			<form class="form-horizontal" role="form" style="padding-left: 200px;padding-right: 200px">

				<fieldset disabled>
					<div style="padding: 20px 0px 10px 210px" class="input-group">
						<h2><i>员工个人信息</i></h2>
					</div>
					<div style="padding:20px 80px">
						<img src="img/pk1.jpg">
					</div>
					<div style="padding:20px 80px" class="input-group">
						<span class="input-group-addon">工号</span>
						<input type="text" class="form-control" id="passwordagain" name="passwordagain" placeholder="显示您的工号">
					</div>
					<div style="padding:20px 80px" class="input-group">
						<span class="input-group-addon">姓名</span>
						<input type="text" class="form-control" id="passwordagain" name="passwordagain" placeholder="显示您的姓名">
					</div>
					<div style="padding:20px 80px" class="input-group">
						<span class="input-group-addon">电话</span>
						<input type="text" class="form-control" id="passwordagain" name="passwordagain" placeholder="显示您的电话">
					</div>
					<div style="padding:20px 80px" class="input-group">
						<span class="input-group-addon">邮箱</span>
						<input type="text" class="form-control" id="passwordagain" name="passwordagain" placeholder="显示您的邮箱">
					</div>
				</fieldset>

			</form>

			<div style="padding-left: 200px;padding-right: 200px">

			</div>
			<div class="text-center" style="padding-left: 200px;padding-right: 200px">
				<button class="btn btn-default" data-toggle="modal" data-target="#update_pass_modal" id="update_pass">修改密码
				</button>
				<button class="btn btn-default" data-toggle="modal" data-target="#update_info_modal" id="update_info">修改个人信息
				</button>
			</div>

		</div>
		<div class="modal fade" id="update_pass_modal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
			<div class="modal-dialog">
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal" aria-hidden="true">
							&times;
						</button>
						<h4 class="modal-title">修改密码</h4>
					</div>
					<div class="modal-body">
						<form id="update_pass_form" class="form-horizontal" role="form" action="messagesend" method="post">
							<div style="padding:20px 100px" class="input-group">
								<span class="input-group-addon">输入原密码</span>

								<input type="password" class="form-control" id="password" name="password" placeholder="请输入原来的密码">

							</div>
							<div style="padding:20px 100px" class="input-group">
								<span class="input-group-addon">输入新密码</span>

								<input type="password" class="form-control" id="newpassword" name="newpassword" placeholder="请输入新密码">

							</div>
							<div style="padding:20px 100px" class="input-group">
								<span class="input-group-addon">请再次输入</span>
								<input type="password" class="form-control" id="passwordagain" name="passwordagain" placeholder="确认新密码">


							</div>

						</form>
					</div>
					<div class="modal-footer">
						<button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
						<button type="button" class="btn btn-primary" onclick="update_pass()">修改密码</button>
					</div>

				</div><!-- /.modal-content -->
			</div><!-- /.modal -->
		</div>
		<div class="modal fade" id="update_info_modal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
			<div class="modal-dialog">
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal" aria-hidden="true">
							&times;
						</button>
						<h4 class="modal-title">修改个人信息</h4>
					</div>
					<!--膜态框修改用户信息  -->
					<div class="modal-body">
						<form id="update_info_form" class="form-horizontal" role="form" action="messagesend" method="post">
							<div style="padding:20px 100px" class="input-group">
								<span class="input-group-addon">姓名</span>
								<input type="text" class="form-control" id="passwordagain" name="passwordagain" placeholder="姓名">
							</div>

							<div style="padding:20px 100px" class="input-group">
								<span class="input-group-addon">电话</span>
								<input type="text" class="form-control" id="passwordagain" name="passwordagain" placeholder="手机号码">
							</div>

							<div style="padding:20px 100px" class="input-group">
								<span class="input-group-addon">邮箱</span>
								<input type="text" class="form-control" id="passwordagain" name="passwordagain" placeholder="电子邮箱">
							</div>

							<div style="padding:20px 100px" class="input-group">
								<span class="input-group-addon">上传头像</span>
								<input type="file" />
							</div>

						</form>
					</div>
					<div class="modal-footer">
						<button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
						<button type="button" class="btn btn-primary" onclick="update_info()">修改信息</button>
					</div>
				</div><!-- /.modal-content -->
			</div><!-- /.modal -->

		</div>


	</body>

	<script type="text/javascript">
		function update_pass() {
			var flag = true;
			var uid = '${user.uid}';
			var user_id = '${user.user_id}';
			var user_name = '${user.user_name}';
			var user_telnumber = '${user.user_telnumber}';
			var user_email = '${user.user_email}';
			var user_qqnumber = '${user.user_qqnumber}';
			var updatetime = '${user.updatetime}';
			var userpass = '${user.user_password}';

			var password = $("#password").val();
			var newpassword = $("#newpassword").val();
			var passwordagain = $("#passwordagain").val();
			if (password != userpass) {
				alert("原密码不正确");
				flag = false;
			}
			if (passwordagain != newpassword) {
				alert("两次密码不一样");
				flag = false;
			}
			if (password == "" | newpassword == "" | passwordagain == "") {
				alert("不能有不填项");
				flag = false;
			}
			if (flag) {
				$.post(
					"updatepass", {
						"uid": uid,
						"user_id": user_id,
						"user_name": user_name,
						"user_telnumber": user_telnumber,
						"user_email": user_email,
						"user_qqnumber": user_qqnumber,
						"updatetime": updatetime,
						"user_password": newpassword
					},
					function(result) {
						alert(result.update_result);
						if (result.update_result == "ok") {
							alert("密码修改成功,请重新登陆");
							$('#update_pass_modal').modal('hide');
							window.location.href = "index.jsp";
						} else {
							alert("密码修改有误,请重新修改");
							$('#update_pass_modal').modal('hide');
						}
					},

					"json"
				);
			}

		}

		function update_info() {
			var uid = '${user.uid}';
			var user_id = '${user.user_id}';
			var user_name = '${user.user_name}';
			var updatetime = '${user.updatetime}';
			var userpass = '${user.user_password}';

			var user_email = $("#user_email").val();
			var user_telnumber = $("#user_telnumber").val();
			var user_qqnumber = $("#user_qqnumber").val();
			if (user_email == "" | user_qqnumber == "" | user_telnumber == "") {
				alert("不能有不填项");
			} else {
				$.post(
					"updatepass", {
						"uid": uid,
						"user_id": user_id,
						"user_name": user_name,
						"user_telnumber": user_telnumber,
						"user_email": user_email,
						"user_qqnumber": user_qqnumber,
						"updatetime": updatetime,
						"user_password": userpass
					},
					function(result) {
						alert(result.update_result);
						if (result.update_result == "ok") {
							alert("个人信息修改成功,请重新登陆");
							$('#update_pass_modal').modal('hide');
							window.location.href = "index.jsp";
						} else {
							alert("个人信息有误,请重新修改");
							$('#update_pass_modal').modal('hide');
						}
					},

					"json"
				);
			}
		}
	</script>
	
 
</html>
