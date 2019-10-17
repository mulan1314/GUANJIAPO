<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'sbox.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<link rel="stylesheet" href="css/bootstrap.min.css" type="text/css">
<script type="text/javascript" src="js/jquery-3.4.1.min.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
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
	width: 1200px;
	height: 580px;
	border: #999999 solid 1px;
	margin: 0px auto;
	background-color: rgba(255, 255, 255, 0.5);
}

/*
			用于设置按钮的div参数
			绝对定位
			下边距20
			左右居中
			*/
#divTwo {
	position: absolute;
	bottom: 20px;
	left: 0;
	right: 0;
	margin-left: auto;
	margin-right: auto;
}

/*
			用于设置分页的div参数
			绝对定位
			下边距50
			左右居中
			*/
#divThree {
	position: absolute;
	bottom: 50px;
	left: 0;
	right: 0;
	margin-left: auto;
	margin-right: auto;
}
</style>
</head>

<body>
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
				<li><a href="storehouseUser.jsp">仓库</a></li>
				<li><a href="sbox.jsp">口袋</a></li>
				<li class="dropdown" id="relogin" style="width: 200px"><a
					href="#" class="dropdown-toggle" data-toggle="dropdown">
						个人中心:&nbsp;&nbsp;${user.user_name} <b class="caret"></b> </a>
					<ul class="dropdown-menu" style="width: 200px">
						<li><a href="ShowMsg.jsp"><span
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
	<!-- 页面div，id为divOne -->
	<div id="divOne">
		<!-- 表格，接收数据库数据并显示在表格中，表格中文本居中 -->
		<table class="table table-striped text-center">
			<!-- 表头，表头文本居中 -->
			<tr>
				<th class="text-center">物资编号</th>
				<th class="text-center">物资名称</th>
				<th class="text-center">物资类型</th>
				<th class="text-center">物资价值</th>
				<th class="text-center">借出时间</th>
				<th class="text-center">物资操作</th>
			</tr>
			<tr>
				<td>01</td>
				<td>鼠标</td>
				<td>鼠标类</td>
				<td>10</td>
				<td>2019.10.11 10:30</td>
				<td><input type="checkbox" />
				</td>
			</tr>
			<tr>
				<td>01</td>
				<td>鼠标</td>
				<td>鼠标类</td>
				<td>10</td>
				<td>2019.10.11 10:30</td>
				<td><input type="checkbox" />
				</td>
			</tr>
			<tr>
				<td>01</td>
				<td>鼠标</td>
				<td>鼠标类</td>
				<td>10</td>
				<td>2019.10.11 10:30</td>
				<td><input type="checkbox" />
				</td>
			</tr>
			<tr>
				<td>01</td>
				<td>鼠标</td>
				<td>鼠标类</td>
				<td>10</td>
				<td>2019.10.11 10:30</td>
				<td><input type="checkbox" />
				</td>
			</tr>
			<tr>
				<td>01</td>
				<td>鼠标</td>
				<td>鼠标类</td>
				<td>10</td>
				<td>2019.10.11 10:30</td>
				<td><input type="checkbox" />
				</td>
			</tr>
			<tr>
				<td>01</td>
				<td>鼠标</td>
				<td>鼠标类</td>
				<td>10</td>
				<td>2019.10.11 10:30</td>
				<td><input type="checkbox" />
				</td>
			</tr>
			<tr>
				<td>01</td>
				<td>鼠标</td>
				<td>鼠标类</td>
				<td>10</td>
				<td>2019.10.11 10:30</td>
				<td><input type="checkbox" />
				</td>
			</tr>
			<tr>
				<td>01</td>
				<td>鼠标</td>
				<td>鼠标类</td>
				<td>10</td>
				<td>2019.10.11 10:30</td>
				<td><input type="checkbox" />
				</td>
			</tr>
			<tr>
				<td>01</td>
				<td>鼠标</td>
				<td>鼠标类</td>
				<td>10</td>
				<td>2019.10.11 10:30</td>
				<td><input type="checkbox" />
				</td>
			</tr>
			<tr>
				<td>01</td>
				<td>鼠标</td>
				<td>鼠标类</td>
				<td>10</td>
				<td>2019.10.11 10:30</td>
				<td><input type="checkbox" />
				</td>
			</tr>
		</table>
		<!-- 表格结束 -->
		<!-- 按钮div，id为divTwo -->
		<div id="divTwo">
			<center>
				<!-- 归还按钮，样式为蓝色 -->
				<a href="#" class="btn btn-primary">物资归还</a>
				<!-- 模态框按钮，样式为白色 -->
				<button class="btn btn-danger" data-toggle="modal"
					data-target="#myModal">物资异常</button>
			</center>
			<!-- 模态框（Modal） -->
			<div class="modal fade" id="myModal" tabindex="-1" role="dialog"
				aria-labelledby="myModalLabel" aria-hidden="true">
				<div class="modal-dialog">
					<div class="modal-content">
						<div class="modal-header">
							<button type="button" class="close" data-dismiss="modal"
								aria-hidden="true">&times;</button>
							<h4 class="modal-title" id="myModalLabel">物资异常</h4>
						</div>
						<div class="modal-body text-center">
							<!-- 物资异常说明模块 -->
							<div class="input-group" style="padding: 10px 140px 10px;">
								<span class="input-group-addon">物资编号</span> <input type="text"
									class="form-control">
							</div>
							<div class="input-group" style="padding: 10px 140px 10px;">
								<span class="input-group-addon">物资名称</span> <input type="text"
									class="form-control">
							</div>
							<div class="input-group" style="padding: 10px 140px 10px;">
								<span class="input-group-addon">异常说明</span> <input type="text"
									class="form-control" placeholder="描述申报原因">
							</div>
							<!-- 物资异常模块结束 -->
						</div>
						<div class="modal-footer">
							<button type="button" class="btn btn-default"
								data-dismiss="modal">关闭</button>
							<button type="button" class="btn btn-warning">报修</button>
							<button type="button" class="btn btn-danger">报失</button>
						</div>
					</div>
				</div>
			</div>
			<!--模态框结束-->
		</div>
		<!--按钮div结束-->
		<!-- 分页div，id为divThree -->
		<div id="divThree">
			<center>
				<ul class="pagination">
					<li><a href="#">上一页</a>
					</li>
					<li class="active"><a href="#">1</a>
					</li>
					<li><a href="#">2</a>
					</li>
					<li><a href="#">3</a>
					</li>
					<li><a href="#">4</a>
					</li>
					<li><a href="#">5</a>
					</li>
					<li><a href="#">下一页</a>
					</li>
				</ul>
			</center>
		</div>
		<!--分页div结束-->
	</div>
	<!--页面div结束-->
	
</body>


</html>









