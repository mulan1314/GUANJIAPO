<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<link type="text/css" href="css/bootstrap.min.css" />
		<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css" />
		<script type="text/javascript" src="css/jquery-3.4.1.min.js"></script>
		<script type="text/javascript" src="css/bootstrap.min.js"></script>
		<link rel="stylesheet" href="css/bootstrap.min.css" />
<script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
<script
	src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link rel="shortcut icon" href="/favicon.ico" />
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  <style type="text/css">
			/*
			用于设置页面的div参数
			宽550
			高400
			边框1像素灰色实线
			上下边距100左右居中
			背景颜色白色透明度50%
			*/
			#divAll {
				width: 550px;
				height: 400px;
				border: #999999 solid 1px;
				margin: 100px auto;
				background-color: rgba(255, 255, 255, 0.5);
			}
		</style>
  </head>
  
 <body background="img/01.jpg">
		<!-- 导航栏 -->
		<nav class="navbar navbar-default" role="navigation">
			<div class="container-fluid">
				<div class="navbar-header">
					<center>
						<a class="navbar-brand" href="#">管家婆</a>
				</div>
				<div>
					<ul class="nav navbar-nav navbar-right">
						<li><a href="official.html">首页</a></li>
						<li class="dropdown">
							<a href="#" class="dropdown-toggle" data-toggle="dropdown">
								关于
								<b class="caret"></b>
							</a>
							<ul class="dropdown-menu">
								<li><a href="solve.html">企业简介</a></li>
								<li class="divider"></li>
								<li><a href="#">发展历程</a></li>
								<li class="divider"></li>
								<li><a href="#">荣誉资质</a></li>
								<li class="divider"></li>
								<li><a href="#">企业环境</a></li>
							</ul>
						</li>
						<li><a href="GJP.html">解决方案</a></li>
						<li><a href="technology.html">技术服务</a></li>
						<li><a href="myhet.html">联系我们</a></li>
						<li class="active"><a href="login.jsp">工作</a></li>
					</ul>
				</div>
			</div>
			</center>
		</nav>
		<!-- 导航栏结束 -->
		<!-- 页面div -->
		<div id="divAll">
			<!-- 2级标题，提示页面功能 -->
			<div style="padding: 40px 0px 10px 210px" class="input-group">
				<h2><i>用户登录</i></h2>
			</div>
			<!-- 2级标题结束 -->
			<!-- 用户名文本框div -->
			<div style="padding: 20px 80px" class="input-group">
				<span class="input-group-addon">用户名</span>
				<input type="text" class="form-control" placeholder="请输入您的工号">
			</div>
			<!-- 用户名文本框结束 -->
			<!-- 密码框div -->
			<div style="padding: 20px 80px" class="input-group">
				<span class="input-group-addon">密&nbsp;&nbsp;&nbsp;&nbsp;码</span>
				<input type="text" class="form-control" placeholder="请输入您的密码">
			</div>
			<!-- 密码框结束 -->
			<!-- 按钮div -->
			<div style="padding: 20px 0px 20px 180px">
				<a href="#" class="btn btn-primary">登录</a>
				&nbsp;&nbsp;&nbsp;&nbsp;
				<button class="btn btn-default" data-toggle="modal" data-target="#myModal">
					忘记密码
				</button>
				<!-- 模态框（Modal） -->
				<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
					<div class="modal-dialog">
						<div class="modal-content">
							<div class="modal-header">
								<button type="button" class="close" data-dismiss="modal" aria-hidden="true">×
								</button>
								<h4 class="modal-title text-center" id="myModalLabel">
									用户信息验证
								</h4>
							</div>
							<div class="modal-body text-center">
								<!-- 模态框找回密码模块 -->
								<div class="input-group" style="padding: 10px 140px 10px;">
									<span class="input-group-addon">用&nbsp;&nbsp;户&nbsp;&nbsp;名</span>
									<input type="text" class="form-control" placeholder="请输入您的工号">
								</div>
								<div class="input-group" style="padding: 10px 140px 10px;">
									<span class="input-group-addon">姓&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;名</span>
									<input type="text" class="form-control" placeholder="请输入您的姓名">
								</div>
								<div class="input-group" style="padding: 10px 140px 10px;">
									<span class="input-group-addon">联系方式</span>
									<input type="text" class="form-control" placeholder="请输入您的电话">
								</div>
								<!-- 找回密码模块结束 -->
							</div>
							<div class="modal-footer">
								<button type="button" class="btn btn-default" data-dismiss="modal">
									关闭
								</button>
								<button type="button" class="btn btn-primary" data-dismiss="modal">
									提交更改
								</button>
							</div>
						</div>
					</div>
				</div>
				<!--模态框div结束-->
			</div>
			<!--按钮div结束-->
		</div>
		<!--页面div结束-->
		
	</body>
</html>
