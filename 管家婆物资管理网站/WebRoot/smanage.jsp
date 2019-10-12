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

<title>My JSP 'smanage.jsp' starting page</title>

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
#divTwo{
	position: absolute;
	bottom: 100px;
	left: 0;
	right: 0;
	margin-left: auto;
	margin-right: auto;
}
/*
			用于设置分页的div参数
			绝对定位
			下边距7
			左右居中
			*/
#divThree {
	position: absolute;
	bottom: 150px;
	left: 0;
	right: 0;
	margin-left: auto;
	margin-right: auto;
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
	<!-- 页面div，id为divOne -->
	<div id="divOne">
		<!-- 表格，盛放数据库中的员工信息，文本居中 -->
		<table class="table table-striped text-center">
			<tr>
				<th class="text-center">员工工号</th>
				<th class="text-center">员工姓名</th>
				<th class="text-center">员工照片</th>
				<th class="text-center">员工电话</th>
				<th class="text-center">员工邮箱</th>
				<th class="text-center">员工离职</th>
			</tr>
			<tr>
				<td>19020001</td>
				<td>张三</td>
				<td><img src="img/pk1.jpg">
				</td>
				<td>123456789</td>
				<td>123456789@123.com</td>
				<td><button class="btn btn-danger">离职</button>
				</td>
			</tr>
			<tr>
				<td>19020001</td>
				<td>张三</td>
				<td><img src="img/pk1.jpg">
				</td>
				<td>123456789</td>
				<td>123456789@123.com</td>
				<td><button class="btn btn-danger">离职</button>
				</td>
			</tr>
			<tr>
				<td>19020001</td>
				<td>张三</td>
				<td><img src="img/pk1.jpg">
				</td>
				<td>123456789</td>
				<td>123456789@123.com</td>
				<td><button class="btn btn-danger">离职</button>
				</td>
			</tr>
			<tr>
				<td>19020001</td>
				<td>张三</td>
				<td><img src="img/pk1.jpg">
				</td>
				<td>123456789</td>
				<td>123456789@123.com</td>
				<td><button class="btn btn-danger">离职</button>
				</td>
			</tr>
		</table>
		<!-- 表格结束 -->
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
		<div id="divTwo">
		<center>
			<button class="btn btn-primary">刷新列表</button>
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			<button class="btn btn-default" data-toggle="modal"
					data-target="#myModal">生成工号</button>
					</center>
			<!-- 模态框（Modal） -->
			<div class="modal fade" id="myModal" tabindex="-1" role="dialog"
				aria-labelledby="myModalLabel" aria-hidden="true">
				<div class="modal-dialog">
					<div class="modal-content">
						<div class="modal-header">
							<button type="button" class="close" data-dismiss="modal"
								aria-hidden="true">&times;</button>
							<h4 class="modal-title" id="myModalLabel">生成工号</h4>
						</div>
						<div class="modal-body text-center">
							<!-- 物资异常说明模块 -->
							<div class="input-group" style="padding: 10px 140px 10px;">
								<span class="input-group-addon">员工性别</span> <input type="text"
									class="form-control">
							</div>
							<div class="input-group" style="padding: 10px 140px 10px;">
								<span class="input-group-addon">员工人数</span> <input type="text"
									class="form-control">
							</div>
							<!-- 物资异常模块结束 -->
						</div>
						<div class="modal-footer">
							<button type="button" class="btn btn-default"
								data-dismiss="modal">关闭</button>
							<button type="button" class="btn btn-primary">提交</button>
						</div>
					</div>
				</div>
			</div>
			<!--模态框结束-->
		</div>
	</div>
	<!--页面div结束-->
	<div>
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
	</div>
</body>

</html>
