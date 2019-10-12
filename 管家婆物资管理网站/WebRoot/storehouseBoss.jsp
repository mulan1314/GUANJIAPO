<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<link rel="stylesheet" href="css/bootstrap.min.css" type="text/css">
<script type="text/javascript" src="js/jquery-3.4.1.min.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>


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

	<div style="padding-left:20px ;padding-right:40px">
		<div class="row clearfix" >
			<div class="col-md-2 column " style="background: #A8A8A8;height: 300px">
				<ul class="list-unstyled"
					style="margin-left: 150px;margin-top: 100px;">
					<li>鼠标</li>
					<li>显示屏</li>
					<li>主机</li>
					<li>键盘</li>
				</ul>
			</div>

			<div class="col-md-10 column ">
				<div class="row clearfix">
					<div class="col-md-12 column" style="margin-left: 200px;">

						<form class="navbar-form navbar-left" role="search">
							<div class="form-group">
								<input type="text" class="form-control" />
							</div>
							<button type="submit" class="btn btn-default">查询</button>
						</form>
						<button type="button" class="btn btn-default " data-toggle="modal"
							data-target="#myModal" style="margin-top: 8px;">添加</button>
					</div>

				</div>

				<div class="modal fade" id="myModal" tabindex="-1" role="dialog"
					aria-labelledby="myModalLabel" aria-hidden="true">
					<div class="modal-dialog">
						<div class="modal-content">
							<div class="modal-header">
								<button type="button" class="close" data-dismiss="modal"
									aria-hidden="true">&times;</button>
								<h4 class="modal-title" id="myModalLabel">物资添加</h4>
							</div>
							<div class="modal-body">

								<form class="form-horizontal" action="#" method="post"
									enctype="multipart/form-data">
									<div class="form-group">
										<label for="macName" class="col-sm-2 control-label">物资名称</label>
										<div class="col-sm-10">
											<input type="text" class="form-control" id="macName"
												placeholder="请输入物资名称">
										</div>
									</div>
									<div class="form-group">
										<label for="macIntroduct" class="col-sm-2 control-label">物资详情</label>
										<div class="col-sm-10">
											<input type="text" class="form-control" id="macIntroduct"
												placeholder="请输物资详情">
										</div>
									</div>
									<div class="form-group">
										<label for="macPrice" class="col-sm-2 control-label">物资价格</label>
										<div class="col-sm-10">
											<input type="text" class="form-control" id="macPrice"
												placeholder="请输物价格">
										</div>
									</div>
									<div class="form-group" style="margin-left: -4px;">
										<label for="macImg" class="col-sm-2 control-label"
											style=" margin-top: 10px;">物资图片</label>
										<div class="col-sm-10" style="margin-top: 15px;">

											<input type="file" id="macImg">
										</div>
									</div>
									<div class="form-group">
										<label for="macType" class="col-sm-2 control-label">
											物资类别 </label>
										<div class="col-lg-4">
											<select class="form-control" οnchange="selectOnchang(this)"
												id="macType"">
												<option>鼠标</option>
												<option>显示屏</option>
												<option>主机</option>
												<option>键盘</option>
											</select>
										</div>
									</div>
									<div class="form-group">
										<label for="macAddress" class="col-sm-2 control-label">物资地址</label>
										<div class="col-sm-10">
											<input type="text" class="form-control" id="macAddress"
												placeholder="请输物地址">
										</div>
									</div>
								</form>

							</div>


							<div class="modal-footer">

								<button type="button" class="btn btn-primary">添加</button>
							</div>
						</div>
						<!-- /.modal-content -->
					</div>
					<!-- /.modal -->
				</div>
				<div class="row clearfix">
					<div class="col-md-12 column">
						<table class="table">
							<thead>
								<tr>
									<th>编号</th>
									<th>产品</th>

									<th>状态</th>
									<th>借</th>
									<th>删除</th>
								</tr>
							</thead>
							<tbody>
								<tr>
									<td>1</td>
									<td>TB - Monthly</td>

									<td>Default</td>

									<td><span class="glyphicon glyphicon-share-alt"> </span>
									</td>
									<td><span class="glyphicon glyphicon-trash"> </span>
									</td>
								</tr>
								<tr class="success">
									<td>1</td>
									<td>TB - Monthly</td>

									<td>Approved</td>
									<td><span class="glyphicon glyphicon-share-alt"> </span>
									</td>
									<td><span class="glyphicon glyphicon-trash"> </span>
									</td>
								</tr>
								<tr class="error">
									<td>2</td>
									<td>TB - Monthly</td>

									<td>Declined</td>
									<td><span class="glyphicon glyphicon-share-alt"> </span>
									</td>
									<td><span class="glyphicon glyphicon-trash"> </span>
									</td>
								</tr>
								<tr class="warning">
									<td>3</td>
									<td>TB - Monthly</td>

									<td>Pending</td>
									<td><span class="glyphicon glyphicon-share-alt"> </span>
									</td>
									<td><span class="glyphicon glyphicon-trash"> </span>
									</td>
								</tr>
								<tr class="info">
									<td>4</td>
									<td>TB - Monthly</td>

									<td>Call in to confirm</td>
									<td><span class="glyphicon glyphicon-share-alt"> </span>
									</td>
									<td><span class="glyphicon glyphicon-trash"> </span>
									</td>
								</tr>
							</tbody>
						</table>
					</div>
				</div>
				<br> <br> <br> <br>  
				<div class="row clearfix na">
					<div class="col-md-12 column"></div>
					<center>
						<div class="col-md-8 ">
							<a href="#">首页</a> <a href="#">尾页</a>
						</div>
					</center>
				</div>
			</div>
		</div>
	</div>
	<br> <br> <br> <br> <br> <br> <br>
	<br> 
	<!--Footer-->
	<footer class="inner-footer" style="background: #000000;">
		<div class="container">
			<p class="text-muted footer-nav" style="color: #FFFFFF;">
				<a href="" style="color: #FFFFFF;">联系我们|</a> <a href="#"
					style="color: #FFFFFF;">|新闻中心|</a> <a href="#"
					style="color: #FFFFFF;">|网站地图|</a> <a href="#"
					style="color: #FFFFFF;">|站长统计|</a>
			</p>
			<HR style="FILTER: alpha(opacity=100,finishopacity=0,style=1)"
				width="100%" color=#987cb9 SIZE=3>
		</div>
		<div class="line"></div>
		<div class="container">
			<div class="text-muted copyright">
				<span style="color: #FFFFFF;"> Copyright &copy;
					2016&nbsp;&nbsp;亚洲管家婆技术有限公司 <a href="# target="
					_blank" style="color: #FFFFFF;">粤ICP备09131601号-3</a> </span>
				<div class="dropdown pull-right hidden-xs hidden-sm">
					<button id="dLabel" type="button" data-toggle="dropdown"
						aria-haspopup="true" aria-expanded="false">
						友情链接/Links <span class="caret"></span>
					</button>
					<ul class="dropdown-menu" aria-labelledby="dLabel">
						&nbsp;
						<strong><a href="http://www.merway.cn/" target="_blank">仓库管理软件</a>
							<a href="http://www.merway.cn/" target="_blank">ERP条码系统</a> <a
							href="http://www.merway.cn/" target="_blank">GJP</a>
						</strong>
					</ul>
				</div>
			</div>
		</div>
		<a class="to-top"><i class="glyphicon glyphicon-triangle-top"></i><br>TOP</a>
	</footer>
	<!--/Footer-->
</body>
</html>
