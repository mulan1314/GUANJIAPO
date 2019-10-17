<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css" />
<script src="js/jquery-3.4.1.min.js" type="text/javascript"
	charset="utf-8"></script>
<script src="js/bootstrap.min.js" type="text/javascript" charset="utf-8"></script>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

</head>

<body background="img/01.jpg">

	<!-- 导航栏 -->
	<nav class="navbar navbar-default" role="navigation"
		style="height: 70px">

	<div class="container-fluid" style="margin-top: 10px">
		<div class="navbar-header">
			<a class="navbar-brand" href="User.jsp">管家婆管理系统</a>
		</div>
		<div>
			<ul class="nav navbar-nav navbar-right">
				<li><a href="storehouseUser.jsp">仓库</a>
				</li>
				<li><a href="sbox.jsp">口袋</a>
				</li>
				<li class="dropdown" id="relogin" style="width: 200px"><a
					href="#" class="dropdown-toggle" data-toggle="dropdown">
						个人中心:&nbsp;&nbsp;${user.user_name} <b class="caret"></b> </a>
					<ul class="dropdown-menu" style="width: 200px">
						<li><a href="ShowMsg.jsp"><span
								class="glyphicon glyphicon-user">&nbsp;</span>个人信息</a></li>
						<li><a href="messageinit"><span
								class="glyphicon glyphicon-bell">&nbsp;</span>消息 <span
								class="badge pull-right">${message_count}</span> </a>
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
	<div class="container">





		<div class="row clearfix">
			<div class="col-md-4 column">
				<ul class="list-unstyled"
					style="margin-left: 150px;margin-top: 100px;">
					<li>Lorem ipsum dolor sit amet</li>
					<li>Consectetur adipiscing elit</li>
					<li>Integer molestie lorem at massa</li>
					<li>Facilisis in pretium nisl aliquet</li>
					<li>Nulla volutpat aliquam velit</li>
					<li>Faucibus porta lacus fringilla vel</li>
					<li>Aenean sit amet erat nunc</li>
					<li>Eget porttitor lorem</li>
				</ul>
			</div>

			<div class="col-md-8 column">
				<div class="row clearfix">
					<div class="col-md-12 column" style="margin-left: 200px;">

						<form class="navbar-form navbar-left" role="search">
							<div class="form-group">
								<input type="text" class="form-control" />
							</div>
							<button type="submit" class="btn btn-default">查询</button>
						</form>

					</div>

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

								</tr>
							</thead>
							<tbody>
								<tr>
									<td>1</td>
									<td>TB - Monthly</td>

									<td>Default</td>

									<td><span class="glyphicon glyphicon-share-alt"> </span></td>
									<td><span class="glyphicon glyphicon-trash"> </span></td>
								</tr>
								<tr class="success">
									<td>1</td>
									<td>TB - Monthly</td>

									<td>Approved</td>
									<td><span class="glyphicon glyphicon-share-alt"> </span></td>

								</tr>
								<tr class="error">
									<td>2</td>
									<td>TB - Monthly</td>

									<td>Declined</td>
									<td><span class="glyphicon glyphicon-share-alt"> </span></td>

								</tr>
								<tr class="warning">
									<td>3</td>
									<td>TB - Monthly</td>

									<td>Pending</td>
									<td><span class="glyphicon glyphicon-share-alt"> </span></td>

								</tr>
								<tr class="info">
									<td>4</td>
									<td>TB - Monthly</td>

									<td>Call in to confirm</td>
									<td><span class="glyphicon glyphicon-share-alt"> </span></td>

								</tr>
							</tbody>
						</table>
					</div>
				</div>
				<br>
				<br>
				<br>
				<br>
				<br>
				<br>
				<br>
				<br>
				<br>
				<br>
				<br>
				<br>
				<div class="row clearfix">
					<div class="col-md-4 column"></div>

					<center>

						<div class="col-md-8 column">

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

						</div>
					</center>
				</div>
			</div>
		</div>
	</div>
	<div></div>
</body>
</html>
