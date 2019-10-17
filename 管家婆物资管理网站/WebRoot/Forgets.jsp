<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- 导航栏 -->
<link rel="stylesheet" href="css/bootstrap.min.css" />
<script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
<script
	src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
<!-- 导航栏 -->

<!-- 表单验证 -->
<script type="text/javascript" src="js/jquery-1.8.3.js"></script>
<script type="text/javascript" src="js/jquery.validate.min.js"></script>
<script type="text/javascript" src="js/messages_zh.js"></script>

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


<script>

	$(function() {
		// 在键盘按下并释放及提交后验证提交表单
	$("#signupForm").validate({
			rules : {

				user_password : {
					required : true,
					minlength : 5
				},
				user_passwords : {
					required : true,
					minlength : 5,
					equalTo : "#user_password"
				},

				agree : "required"
			},
			messages : {
				user_password : {
					required : "请输入密码",
					minlength : "密码长度不能小于 5 个字母"
				},
				user_passwords : {
					required : "请输入密码",
					minlength : "密码长度不能小于 5 个字母",
					equalTo : "两次密码输入不一致"
				},

			}
		});
	});
</script>




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
				<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown"> 关于 <b class="caret"></b> </a>
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





	<div id="divAll">

		<div style="padding: 40px 0px 10px 210px" class="input-group">
			<h2>
				<i>用户登录</i>
			</h2>
		</div>

		<div>
			<form class="cmxform" id="signupForm" method="post" action="forgets">
			<center>
				<fieldset>
				
					<p>
						<label for="user_password" style="width:50px;height: 30px">新密码(pass)</label> <input id="user_password"
							name="user_password" type="password">
					</p>
					<p>
						<label for="user_passwords" style="width:50px;height: 30px">验证密码(pass)</label> <input
							id="user_passwords" name="user_passwords" type="password">
					</p>
					<p>
					<input class="submit" type="submit" value="修改"> 
					<a href="login.jsp"> <input type="button" value="返回登录" /> </a>
				</p>
				</fieldset>
				</center>
			</form>
</body>
</div>
</div>
</body>
</html>
