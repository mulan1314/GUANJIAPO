<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width-device-width,initial-scacle-1,user-scalable-no" />
<link rel="stylesheet" href="/css/bootstrap.min.css"/>

<!-- 
		<link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css"> -->
<script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
<script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
           <link rel="shortcut icon" href="/favicon.ico" />
<title>GJP仓库管理系统</title>
</head>




<body>
	<!--导航栏 -->
	<nav class="navbar navbar-default" role="navigation">

		<div class="container-fluid">
			<div class="navbar-header">
				<center>
					<a class="navbar-brand" href="#">管家婆</a>
			</div>
			<div>
				<ul class="nav navbar-nav navbar-right">
					<li><a href="new_file.html">首页</a>
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
					<li class="active"><a href="myhet.html">联系我们</a>
					</li>
					<li><a href="index.html">工作</a>
					</li>
				</ul>

			</div>
		</div>
		</center>
	</nav>
	<!--导航栏 -->
	<!--Banner-->
	<div class="container-fluid banner">
		<img src="img/one.png" alt="" class="img-responsive" />
	</div>
	<!--/Banner-->
	<!--Container-->
	<div class="container">
		<div class="row">
			<div class="col-md-2 col-md-offset-1 hidden-xs hidden-sm about-1">
				<ul class="list-group">
					<li class="list-group-item">
						<h3>
							关于我们<br> <small>About us</small>
						</h3></li>
					<li class="list-group-item "><a
						href="slove.html">企业简介</a>
					</li>
					<li class="list-group-item "><a
						href="#">发展历程</a>
					</li>
					<li class="list-group-item "><a
						href="#">荣誉资质</a>
					</li>
					<li class="list-group-item "><a
						href="/l">企业环境</a>
					</li>
				</ul>
			</div>
			<div class="col-md-9 about-2">
				<div class="page-header">
					<h4>
						联系我们
						<ol class="my-breadcrumb pull-right hidden-xs hidden-sm"></ol>
					</h4>
				</div>
				<h4 style="margin:5pt 0em;mso-pagination:widow-orphan;">
					<b><span
						style="font-family:宋体;font-size:16pt;font-weight:bold;mso-spacerun:&quot;mso-font-kerning:0.0000pt;"><span
							style="font-family:宋体;"></span> </span> </b>&nbsp;
				</h4>
				<h4 style="margin:5pt 0em;mso-pagination:widow-orphan;">
					<b><span
						style="font-family:宋体;font-size:16pt;font-weight:bold;mso-spacerun:&quot;mso-font-kerning:0.0000pt;"><span
							style="font-family:宋体;">亚洲管家婆技术有限公司</span> </span> </b><b><span
						style="font-family:宋体;font-size:16pt;font-weight:bold;mso-spacerun:&quot;mso-font-kerning:0.0000pt;">
					</span> </b>
				</h4>

				<p style="margin:5pt 0em;mso-pagination:widow-orphan;">&nbsp;</p>
				<p style="margin:3.75pt 0pt;mso-pagination:widow-orphan;" class="p">
					<span
						style="font-family:Calibri;font-size:14pt;mso-spacerun:&quot;mso-font-kerning:0.0000pt;mso-fareast-font-family:宋体;mso-bidi-font-family:&quot;;"><span
						style="font-family:宋体;">管家婆咨询热线：</span>020-999999</span><span
						style="font-family:Calibri;font-size:14pt;mso-spacerun:&quot;mso-font-kerning:0.0000pt;mso-fareast-font-family:宋体;mso-bidi-font-family:&quot;;"><o:p></o:p>
					</span>
				</p>
				<p style="margin:3.75pt 0pt;mso-pagination:widow-orphan;" class="p">
					<span
						style="font-family:Calibri;font-size:14pt;mso-spacerun:&quot;mso-font-kerning:0.0000pt;mso-fareast-font-family:宋体;mso-bidi-font-family:&quot;;"><span
						style="font-family:宋体;">手机：</span>15999999999</span><span
						style="font-family:Calibri;font-size:14pt;mso-spacerun:&quot;mso-font-kerning:0.0000pt;mso-fareast-font-family:宋体;mso-bidi-font-family:&quot;;"><o:p></o:p>
					</span>
				</p>
				<p style="margin:3.75pt 0pt;mso-pagination:widow-orphan;" class="p">
					<span
						style="font-family:Calibri;font-size:14pt;mso-spacerun:&quot;mso-font-kerning:0.0000pt;mso-fareast-font-family:宋体;mso-bidi-font-family:&quot;;"><span
						style="font-family:宋体;">客服</span>QQ<span style="font-family:宋体;">：</span><span
						style="font-family:Calibri;">3282310250</span> </span><span
						style="font-family:Calibri;font-size:14pt;mso-spacerun:&quot;mso-font-kerning:0.0000pt;mso-fareast-font-family:宋体;mso-bidi-font-family:&quot;;"><o:p></o:p>
					</span>
				</p>
				<p style="margin:3.75pt 0pt;mso-pagination:widow-orphan;" class="p">
					<span
						style="font-family:Calibri;font-size:14pt;mso-spacerun:&quot;mso-font-kerning:0.0000pt;mso-fareast-font-family:宋体;mso-bidi-font-family:&quot;;"><span
						style="font-family:宋体;">公司：</span>020-000000 </span><span
						style="font-family:Calibri;font-size:14pt;mso-spacerun:&quot;mso-font-kerning:0.0000pt;mso-fareast-font-family:宋体;mso-bidi-font-family:&quot;;"><o:p></o:p>
					</span>
				</p>
				<p style="margin:3.75pt 0pt;mso-pagination:widow-orphan;" class="p">
					<span
						style="font-family:Calibri;font-size:14pt;mso-spacerun:&quot;mso-font-kerning:0.0000pt;mso-fareast-font-family:宋体;mso-bidi-font-family:&quot;;"><span
						style="font-family:宋体;">地址：西安市长安区管家大厦</span>3<span
						style="font-family:宋体;">号据点创意园</span><span
						style="font-family:Calibri;">304</span><span
						style="font-family:宋体;">房</span> </span><span
						style="font-family:Calibri;font-size:14pt;mso-spacerun:&quot;mso-font-kerning:0.0000pt;mso-fareast-font-family:宋体;mso-bidi-font-family:&quot;;"><o:p></o:p>
					</span>
				</p>
				<p style="margin:3.75pt 0pt;mso-pagination:widow-orphan;" class="p">
					<span
						style="font-family:Calibri;font-size:14pt;mso-spacerun:&quot;mso-font-kerning:0.0000pt;mso-fareast-font-family:宋体;mso-bidi-font-family:&quot;;"><span
						style="font-family:宋体;">公司邮编：<span
							style="font-family:宋体;font-size:14pt;mso-spacerun:&quot;mso-font-kerning:1.0000pt;">712101</span>
					</span> </span>
				</p>
				<!--EndFragment-->
				<p style="margin:3.75pt 0pt;mso-pagination:widow-orphan;" class="p">
					<span
						style="font-family:Calibri;font-size:14pt;mso-spacerun:&quot;mso-font-kerning:0.0000pt;mso-fareast-font-family:宋体;mso-bidi-font-family:&quot;;"><span
						style="font-family:宋体;">微信公众号：</span>GUANJIAPO-YZ</span><span
						style="font-family:Calibri;font-size:14pt;mso-spacerun:&quot;mso-font-kerning:0.0000pt;mso-fareast-font-family:宋体;mso-bidi-font-family:&quot;;"><o:p></o:p>
					</span>
				</p>
				<p>
					<!--EndFragment-->
					<img alt="" src="img/5.png" style="width:250px;" />

				</p>
			</div>
		</div>
	</div>
	<!--/Container-->
	<!--Footer-->
	<footer class="inner-footer" style="background: #269ABC;">
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
				</div>
			</div>
		</div>
		<a class="to-top"><i class="glyphicon glyphicon-triangle-top"></i><br>TOP</a>
	</footer>
	<!--/Footer-->

</body>
</html>

