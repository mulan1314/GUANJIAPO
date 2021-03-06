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
<!-- 表单验证 -->
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<script type="text/javascript">
	$(function() {
		$("#commentForm").validate({
			rules : {
				user_id : {
					required : true,
					minlength : 5,
				},
				user_password : {
					required : true,
					minlength : 3,
				}
			},
			messages : {
				user_id : {
					required : "请输入用户名",
					minlength : "用户名必需由五位个字母或数字组成"
				},
				user_password : {
					required : "请输入密码",
					minlength : "请输入一个正确的密码",

				}

			}
		})

	});
</script>

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
				<li><a href="official.html">首页</a>
				</li>
				<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown"> 关于 <b class="caret"></b> </a>
					<ul class="dropdown-menu">
						<li><a href="solve.html">企业简介</a>
						</li>
						<li class="divider"></li>
						<li><a href="#">发展历程</a>
						</li>
						<li class="divider"></li>
						<li><a href="#">荣誉资质</a>
						</li>
						<li class="divider"></li>
						<li><a href="#">企业环境</a>
						</li>
					</ul></li>
				<li><a href="GJP.html">解决方案</a>
				</li>
				<li><a href="technology.html">技术服务</a>
				</li>
				<li><a href="myhet.html">联系我们</a>
				</li>
				<li class="active"><a href="login.jsp">工作</a>
				</li>
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
			<form class="cmxform" id="commentForm" method="post" action="login">
				<center>
					<fieldset>
						<p>
							<label></label>
						</p>
						<p>
							<label for="cname" style="width:50px;height: 30px">Name
								(ID)</label> <input id="cname" name="user_id" minlength="6" type="text">
						</p>
						<p>
							<label for="cpass" style="width:50px">Pass (密码)</label> <input
								id="cpass" name="user_password" minlength="3" type="text">
						</p>
						<p>
							<input class="submit" type="submit" value="登录"> <a
								href="Forget.jsp"> <input type="button" value="修改密码" /> </a>
						</p>
					</fieldset>
			</form>
		</div>
	</div>
</body>
</html>

