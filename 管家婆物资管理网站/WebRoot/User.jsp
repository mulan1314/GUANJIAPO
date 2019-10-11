<%--
  Created by IntelliJ IDEA.
  User: 鱼鱼鱼
  Date: 2019/10/10
  Time: 14:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <head>
        <title>管家婆</title>
        <link rel="stylesheet" href="css/bootstrap.min.css" type="text/css">
        <script type="text/javascript" src="js/jquery-3.4.1.min.js"></script>
        <script type="text/javascript" src="js/bootstrap.min.js"></script>
    </head>
</head>
<body style="background: url(img/f.png);">
<nav class="navbar navbar-default" role="navigation" style="height: 70px">

    <div class="container-fluid" style="margin-top: 10px">
        <div class="navbar-header">
            <a class="navbar-brand" href="Nms.jsp">管家婆管理系统</a>
        </div>
        <div>
            <ul class="nav navbar-nav navbar-right">
                <li ><a href="Nms.jsp">仓库</a></li>
                <li><a href="#">口袋</a></li>
                <li class="dropdown" id="relogin" style="width: 200px">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                        个人中心:&nbsp;&nbsp;${user.user_name}
                        <b class="caret"></b>
                    </a>
                    <ul class="dropdown-menu" style="width: 200px" >
                        <li><a href="UserInfo.jsp" ><span class="glyphicon glyphicon-user">&nbsp;</span>个人信息</a>
                        </li>
                        <li ><a href="messageinit" ><span class="glyphicon glyphicon-bell">&nbsp;</span>消息 <span
                                class="badge pull-right">${message_count}</span></a></li>
                        <li><a href="index.jsp"><span class="glyphicon glyphicon-off">&nbsp;</span>重新登陆 </a></li>
                    </ul>
                </li>
            </ul>
        </div>
    </div>
</nav>

<div class="container">
    <center>
    <div id="myCarousel" class="carousel slide">
        <!-- 轮播（Carousel）指标 -->
        <ol class="carousel-indicators">
            <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
            <li data-target="#myCarousel" data-slide-to="1"></li>
            <li data-target="#myCarousel" data-slide-to="2"></li>
        </ol>
        <!-- 轮播（Carousel）项目 -->
        <div class="carousel-inner">
            <div class="item active" style="width: 1500px" >
                <img src="img/2.png" alt="First slide">
                <div class="carousel-caption">标题 1</div>
            </div>
            <div class="item" style="width: 1470px">
                <img src="img/3.png" alt="Second slide">
                <div class="carousel-caption">标题 2</div>
            </div>
            <div class="item" style="width: 680px">
                <img src="img/a.jpg" alt="Third slide">
                <div class="carousel-caption">标题 3</div>
            </div>
        </div>
        <!-- 轮播（Carousel）导航 -->
        <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
            <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
            <span class="sr-only">Previous</span>
        </a>
        <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
            <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
            <span class="sr-only">Next</span>
        </a>
    </div>
    </center>
    <div class="row clearfix" style="margin-top: 40px">
        <div class="col-md-7 column">
            <div class="media well">
                
                <div class="media-body">
                    <div class="media">
                        <div class="media-left">
                            <img src="img/1.png" class="media-object" style="width:120px;height: 160px">
                        </div>
                        <div class="media-body">
                            <h4 class="media-heading">左对齐</h4>
                            <p>这是一些示例文本...</p>
                        </div>
                    </div>
                </div>
            </div>
            <div class="panel panel-success">
                <div class="panel-heading">
                    <h3 class="panel-title">
                        我口袋里的小东西<a href="#" style="margin-left: 40px">更多>></a>
                    </h3>

                </div>
                <div class="panel-body">
                    Panel content
                </div>
                <div class="panel-footer">
                    Panel footer
                </div>
            </div>
        </div>
        <div class="col-md-5 column">
            <div class="panel panel-primary">
                <div class="panel-heading">
                    <h3 class="panel-title">
                        我的信箱
                    </h3>
                </div>
                <div class="panel-body">
                    Panel content
                </div>
                <div class="panel-footer">
                    Panel footer
                </div>
                <div class="panel-body">
                    Panel content
                </div>
                <div class="panel-footer">
                    Panel footer
                </div>
                <div class="panel-body">
                    Panel content
                </div>
                <div class="panel-footer">
                    Panel footer
                </div>
                <div class="panel-body">
                    Panel content
                </div>

            </div>
        </div>
    </div>
</div>
<!--Footer-->
		<footer class="inner-footer" style="background: #269ABC;">
			<div class="container" >
				<p class="text-muted footer-nav" style="color: #FFFFFF;margin-top:38px">
					<a href="" style="color: #FFFFFF;">联系我们|</a>
					<a href="#" style="color: #FFFFFF;">|新闻中心|</a>
					<a href="#" style="color: #FFFFFF;">|网站地图|</a>
					<a href="#" style="color: #FFFFFF;">|站长统计|</a>
				</p>
				<HR style="FILTER: alpha(opacity=100,finishopacity=0,style=1)" width="100%" color=#987cb9 SIZE=3>
			</div>
			<div class="line"></div>
			<div class="container">
				<div class="text-muted copyright">
					<span style="color: #FFFFFF;"> Copyright &copy; 2016&nbsp;&nbsp;亚洲管家婆技术有限公司 <a href="# target=" _blank" style="color: #FFFFFF;">粤ICP备09131601号-3</a>
					</span>
					<div class="dropdown pull-right hidden-xs hidden-sm">
						<button id="dLabel" type="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
							友情链接/Links
							<span class="caret"></span>
						</button>
						<ul class="dropdown-menu" aria-labelledby="dLabel">
							&nbsp;<strong><a href="http://www.merway.cn/" target="_blank">仓库管理软件</a> <a href="http://www.merway.cn/" target="_blank">ERP条码系统</a>
								<a href="http://www.merway.cn/" target="_blank">GJP</a></strong>
						</ul>
					</div>
				</div>
			</div>
			<a class="to-top"><i class="glyphicon glyphicon-triangle-top"></i><br>TOP</a>
		</footer>
		<!--/Footer-->
</body>
</html>
