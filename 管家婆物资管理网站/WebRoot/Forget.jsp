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


<script type="text/javascript">

//增加手机号验证规则
 $.validator.addMethod("isMobile", function(value, element) {
     var length = value.length;
     var mobile = /^(13[0-9]{9})|(18[0-9]{9})|(14[0-9]{9})|(17[0-9]{9})|(15[0-9]{9})$/;
     return this.optional(element) || (length == 11 && mobile.test(value));
 }, "请输入正确格式");













	$(function() {
		$("#commentForm").validate({
			rules : {

				user_id : {
					required : true,
					minlength : 5,
				},
				user_name : {
					required : true,
					minlength : 2
				},
				user_phone:{
        required:true,
        isMobile:true,
        }
			},
			messages : {
				user_id : {
					required : "请输入ID",
					minlength : "请输入正确格式(5位以上)"
				},
				user_name : {
					required : "请输入用户名",
					minlength : "用户名必需由两个字母组成"
				},
				user_phone : {
					required : "请输入手机号",
					minlength : "请输入正确格式",
				},

			}
		})

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
			<form class="cmxform" id="commentForm" method="post" action="forget">
				<center>
					<fieldset>

						<p>
							<label for="user_id" style="width:50px;height: 30px">User_Id
								(账户)</label> <input id="user_id" name="user_id" minlength="5"
								type="text">
						</p>
						<p>
							<label for="user_name" style="width:50px;height: 30px">Name
								(姓名)</label> <input id="user_name" name="user_name"  minlength="2" type="text">
						</p>
						<p>
							<label for="user_phone" style="width:50px">Iphone (手机)</label> <input
								id="user_phone" name="user_phone" minlength="11" type="text">
						</p>


						<p>
							<input class="submit" type="submit" value="验证信息"> <a
								href="login.jsp"> <input type="button" value="返回登录" /> </a>
						</p>
					</fieldset>
			</form>
		</div>
	</div>
</body>
</html>
