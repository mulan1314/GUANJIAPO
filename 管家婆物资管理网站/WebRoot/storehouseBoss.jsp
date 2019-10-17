<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
<style type="text/css">
	body {background: #E8E8E8} 定义网页背景色为灰色；
</style>

</head>

<body>
	<!-- 导航栏 -->
	<nav class="navbar navbar-inverse" role="navigation">
	<div class="container-fluid">
		<div class="navbar-header">
			<a class="navbar-brand" href="Boss.jsp">管家婆管理系统</a>

		</div>
		<div>
			<ul class="nav navbar-nav navbar-right">

				<li><a href="storehouseBoss.jsp">仓库</a></li>
				<li><a href="bbox.jsp">口袋</a></li>
				<li><a href="smanage.jsp"> 员工管理 </a></li>

				<li class="dropdown" id="relogin" style="width: 200px"><a
					href="#" class="dropdown-toggle" data-toggle="dropdown">
						个人中心:&nbsp;&nbsp;${user.user_name} <b class="caret"></b> </a>
					<ul class="dropdown-menu" style="width: 200px">
						<li><a href="ShowBoss.jsp"><span
								class="glyphicon glyphicon-user">&nbsp;</span>个人信息</a>
						</li>
						<li><a href="messageinit"><span
								class="glyphicon glyphicon-bell">&nbsp;</span>消息 <span
								class="badge pull-right">${message_count}</span> </a></li>
						<li><a href="login.jsp"><span
								class="glyphicon glyphicon-off">&nbsp;</span>重新登陆 </a></li>
					</ul>
				</li>
			</ul>
		</div>
	</div>
	</nav>
	<!-- 导航栏结束 -->

	<div style="padding-left:20px ;padding-right:40px">
<<<<<<< HEAD
		<div class="row clearfix">
			<!-- 左边类型筛选数据 -->
			<div class="col-md-2 column "
				style="background: #A8A8A8;height: 300px">
				<ul class="list-unstyled" style="margin-left: 150px;margin-top: 100px;" id="type" onlick="type()">
					<c:forEach items="${TList }" var="tl">
					<a href="MStatusTypeServlet?type_id=${tl.type_id }" ><li>${tl.material_type }</li></a>
					</c:forEach>
				
=======
		<div class="row clearfix" >
			<div class="col-md-2 column " style="background: #FFFAFA;height: 300px">
				<ul class="list-unstyled"
					style="margin-left: 80px;margin-top: 100px;">
					<li>鼠标</li>
					<li>显示屏</li>
					<li>主机</li>
					<li>键盘</li>
>>>>>>> 201762bed1dd65891c41124006a4c485e77c7bb5
				</ul>
			</div>
			<!-- 左边物资删选结束 -->
			<div class="col-md-10 column ">
				<div class="row clearfix">

					<div class="col-md-12 column" style="margin-left: 200px;">
						<!-- 模糊查询物资信息 -->
						<form class="navbar-form navbar-left" role="search" action="MStatusLinkServlet"
							method="post">
							<div class="form-group">
								<input type="text" class="form-control" name="link"/>
							</div>
							<button type="submit" class="btn btn-default">查询</button>
						</form>
						<!-- 模糊物资查询结束 -->

						<!-- 添加新物资 -->
						<button type="button" class="btn btn-default " data-toggle="modal"
							data-target="#myModal" style="margin-top: 8px;">添加</button>
						<!-- 物资添加按钮结束 -->
					</div>

				</div>
				<!-- 物资添加模态框 -->
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

								<form class="form-horizontal" action="addMaterialServlet" method="post"
									enctype="multipart/form-data">
									<div class="form-group">
										<label for="macName" class="col-sm-2 control-label">物资名称</label>
										<div class="col-sm-10">
											<input type="text" class="form-control" id="macName" name="macName"
												placeholder="请输入物资名称">
										</div>
									</div>
									<div class="form-group">
										<label for="macIntroduct" class="col-sm-2 control-label">物资详情</label>
										<div class="col-sm-10">
											<input type="text" class="form-control" id="macIntroduct" name="macIntroduct"
												placeholder="请输物资详情">
										</div>
									</div>
									<div class="form-group">
										<label for="macPrice" class="col-sm-2 control-label">物资价格</label>
										<div class="col-sm-10">
											<input type="text" class="form-control" id="macPrice" name="macPrice"
												placeholder="请输物价格">
										</div>
									</div>
									<div class="form-group" style="margin-left: -4px;">
										<label for="macImg" class="col-sm-2 control-label"
											style=" margin-top: 10px;">物资图片</label>
										<div class="col-sm-10" style="margin-top: 15px;">

											<input type="file" id="macImg" name="macImg">
										</div>
									</div>
									<div class="form-group">
										<label for="macType" class="col-sm-2 control-label">
											物资类别 </label>
										<div class="col-lg-4">
											<select class="form-control" οnchange="selectOnchang(this)"
												id="macType" name="macType">
												<c:forEach items="${TList }" var="tl">
					
													<option value="${tl.type_id }">${tl.material_type }</option>
												</c:forEach>
											</select>
										</div>
									</div>
									<div class="form-group">
										<label for="macAddress" class="col-sm-2 control-label">物资地址</label>
										<div class="col-sm-10">
											<input type="text" class="form-control" id="macAddress" name="macAddress"
												placeholder="请输物地址" >
										</div>
									</div>
									<div class="modal-footer">

										<button type="submit" class="btn btn-primary">添加</button>
									</div>

								</form>

							</div>



						</div>
						<!-- /.modal-content -->
					</div>
					<!-- /.modal -->
					<!-- 物资添加模态框结束 -->
				</div>
				<!-- 数据显示表格 -->
				<div class="row clearfix">
					<div class="col-md-12 column">
						<table class="table">
							<thead>
								<tr>
									<th>编号</th>
									<th>产品</th>
									<th>图片</th>
									<th>状态</th>
									<th>借</th>
									<th>删除</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach items="${MList }" var="ml">
									<tr>
										<td>${ml.material_id }</td>
										<td>${ml.material_name }</td>

										<td>${ml.material_picture }</td>
										<td>${ml.status.material_status }</td>

										<td><a href="#"><span
												class="glyphicon glyphicon-share-alt"> </span>
										</a></td>
										<td><a href="MaterialDeleteServlet?material_id=${ml.material_id }" onclick="return del()" id="delete"><span
												class="glyphicon glyphicon-trash"> </span>
										</a></td>
									</tr>
								</c:forEach>
							</tbody>
						</table>
					</div>
				</div>
<<<<<<< HEAD
				<!-- 数据显示表格结束 -->
				<br> <br> <br> <br>
				<!-- 分页开始 -->
				<div class="row clearfix na">
					<div class="col-md-12 column"></div>
					<center>
						<div class="col-md-8 ">

							<ul class="pagination">
								<li><a href="#">&laquo;</a>
								</li>
								<li class="active"><a href="#">1</a>
								</li>
								<li class="disabled"><a href="#">2</a>
								</li>
								<li><a href="#">3</a>
								</li>
								<li><a href="#">4</a>
								</li>
								<li><a href="#">5</a>
								</li>
								<li><a href="#">&raquo;</a>
								</li>
							</ul>

=======
				<br> <br>  
				<div class="row clearfix na">
					<div class="col-md-12 column"></div>
					<center>
						<div class="col-md-10 ">
							<a href="#">首页</a> <a href="#">尾页</a>
>>>>>>> 201762bed1dd65891c41124006a4c485e77c7bb5
						</div>
					</center>
				</div>
			</div>
			<!-- 分页结束 -->
		</div>
	</div>
<<<<<<< HEAD
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
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
						href="http://www.merway.cn/" target="_blank">GJP</a> </strong>
				</ul>
=======
	<br> <br> <br> <br> 
	<!--Footer-->
	<footer class="inner-footer" style="background: #E8E8E8;">
		<div class="container">
			<p class="text-muted footer-nav" style="color: #FFFFFF;">
				<a href="" style="color: #000000;">联系我们|</a> <a href="#"
					style="color: #000000;">|新闻中心|</a> <a href="#"
					style="color: #000000;">|网站地图|</a> <a href="#"
					style="color: #000000;">|站长统计|</a>
			</p>
			<HR style="FILTER: alpha(opacity=100,finishopacity=0,style=1)"
				width="100%" color=#987cb9 SIZE=3>
		</div>
		<div class="line"></div>
		<div class="container">
			<div class="text-muted copyright">
				<span style="color: #000000;"> Copyright &copy;
					2016&nbsp;&nbsp;亚洲管家婆技术有限公司 <a href="# target="
					_blank" style="color: #000000;">粤ICP备09131601号-3</a> </span>
				<div class="dropdown pull-right hidden-xs hidden-sm">
					<button style="color: #000000;width: 158px" id="dLabel" type="button" data-toggle="dropdown"
						aria-haspopup="true" aria-expanded="false">
						友情链接/Links<span class="caret"></span>
					</button>
					<ul class="dropdown-menu" aria-labelledby="dLabel">
						&nbsp;
						<strong><a href="http://www.merway.cn/" target="_blank">仓库管理软件</a></br>
								<a href="http://www.merway.cn/" target="_blank">ERP条码系统</a></br>
								<a href="http://www.merway.cn/" target="_blank">GJP</a>
						</strong>
					</ul>
				</div>
>>>>>>> 201762bed1dd65891c41124006a4c485e77c7bb5
			</div>
		</div>
	</div>
	<a class="to-top"><i class="glyphicon glyphicon-triangle-top"></i><br>TOP</a>
	</footer>
	<!--/Footer-->
</body>
<script type="text/javascript">
function del(){
if(!confirm("确认要删除？")){
window.event.returnValue = false;
}
} 



//按类型进行查询
function type(){
}
</script>

</html>
