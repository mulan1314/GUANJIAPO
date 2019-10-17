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
<<<<<<< HEAD
<head>
<script type="text/javascript">
function edit1() {
   //修改
  //alert(event.srcElement.id);
  // 获取td 
  var row = $(event.srcElement).parent().parent();
  var tbId = row.find("td").eq(0).text();
  var tbImg = row.find("td").eq(1).text();
  var tbName = row.find("td").eq(2).text();
  var tbIntro = row.find("td").eq(3).text();

  $("#material_id").val(tbId);
  $("#material_name").val(tbImg);
  $("#status").val(tbName);
  $("#record_reason").val(tbIntro);

 }
 
 function sure() {
  var flag = window.confirm("是否要借？");
  if (flag) {
 
   location.href = " status?material_id= "+ $("#material_id").val() + "&material_name="+$("#material_name").val()+"&status="+$("#status").val()+"&record_reason="+$("#record_reason").val();
  }

 }
 
 
</script>


















=======
<<<<<<< HEAD
<head>
>>>>>>> 7aae61af061f9b2d2d5818c28e6bcc1706e52159

</head>

<body background="img/01.jpg">

<<<<<<< HEAD
=======
=======
  <head>
   <style type="text/css">
   		body {background: #E8E8E8} 定义网页背景色为灰色；
   </style>
  </head>
  
 <body>
		
>>>>>>> 201762bed1dd65891c41124006a4c485e77c7bb5
>>>>>>> 7aae61af061f9b2d2d5818c28e6bcc1706e52159
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
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 7aae61af061f9b2d2d5818c28e6bcc1706e52159
					<div class="col-md-12 column" style="margin-left: 200px;">

						<form class="navbar-form navbar-left" role="search">
							<div class="form-group">
								<input type="text" class="form-control" />
<<<<<<< HEAD
=======
=======
					<div class="col-md-4 column">
						<ul class="list-unstyled"  style="margin-left: 80px;margin-top: 100px;">
							<li>
								Lorem ipsum dolor sit amet
							</li>
							<li>
								Consectetur adipiscing elit
							</li>
							<li>
								Integer molestie lorem at massa
							</li>
							<li>
								Facilisis in pretium nisl aliquet
							</li>
							<li>
								Nulla volutpat aliquam velit
							</li>
							<li>
								Faucibus porta lacus fringilla vel
							</li>
							<li>
								Aenean sit amet erat nunc
							</li>
							<li>
								Eget porttitor lorem
							</li>
						</ul>
					</div>
					
					<div class="col-md-8 column">
						<div class="row clearfix">
							<div class="col-md-12 column"style="margin-left: 200px;">
							
								<form class="navbar-form navbar-left" role="search">
									<div class="form-group">
										<input type="text" class="form-control" />
									</div> <button type="submit" class="btn btn-default">查询</button>
								</form>
								
>>>>>>> 201762bed1dd65891c41124006a4c485e77c7bb5
>>>>>>> 7aae61af061f9b2d2d5818c28e6bcc1706e52159
							</div>
							<button type="submit" class="btn btn-default">查询</button>
						</form>

					</div>

				</div>
<<<<<<< HEAD
				<!-- 数据显示表格 -->
=======
<<<<<<< HEAD

=======
			</div>
			<br>
>>>>>>> 201762bed1dd65891c41124006a4c485e77c7bb5
>>>>>>> 7aae61af061f9b2d2d5818c28e6bcc1706e52159
				<div class="row clearfix">
					<div class="col-md-12 column">
						<table class="table">
							<thead>
								<tr>
									<th>编号</th>
									<th>产品</th>
<<<<<<< HEAD
=======

>>>>>>> 7aae61af061f9b2d2d5818c28e6bcc1706e52159
									<th>状态</th>
									<th>借</th>

								</tr>
							</thead>
							<tbody>
<<<<<<< HEAD
								<c:forEach items="${MList }" var="ml">
									<tr>
										<td>${ml.material_id }</td>
										<td>${ml.material_name }</td>
										<td>${ml.status }</td>
										<td><button class="glyphicon glyphicon-share-alt"
												data-toggle="modal" data-target="#myModal" onclick="edit2()"></button>
										</td>

										<!-- 修改    模态框修改 -->
										<div class="modal fade" id="myModal" tabindex="-1"
											role="dialog" aria-labelledby="myModalLabel"
											aria-hidden="true">
											<form action="updateservlet" method="post" id="okupdate">
												<div class="modal-dialog">
													<div class="modal-content">
														<div class="modal-header">
															<button type="button" class="close" data-dismiss="modal"
																aria-hidden="true">&times;</button>
															<h4 class="modal-title" id="myModalLabel">修改案例标题</h4>
														</div>
														<div class="modal-body">
															<div class="form-group">
																<label for="name">编号</label> <input type="text"
																	id="material_id" class="form-control" placeholder="文本输入"
																	name="material_id" readonly="readonly">
															</div>
														</div>
														<div class="modal-body">
															<div class="form-group">
																<label for="name">产品 </label> <input type="text"
																	id="material_name" class="form-control" placeholder="文本输入"
																	name="material_name">
															</div>
														</div>
														<div class="modal-body">
															<div class="form-group">
																<label for="name">状态</label> <input type="text"
																	id="status" class="form-control" placeholder="文本输入"
																	name="status">
															</div>
														</div>
														<div class="modal-body">
															<div class="form-group">
																<label for="name">借出理由</label> <input type="text" style="width: 500px;height: 200px"
																	id="record_reason" class="form-control" placeholder="文本输入"
																	name="record_reason">
															</div>
														</div>
														<div class="modal-footer">
															<button type="button" class="btn btn-default"
																data-dismiss="modal">关闭</button>
															<button type="button" class="btn btn-primary"
																onclick="sure()">提交更改</button>
														</div>
													</div>
													<!-- /.modal-content -->
												</div>
											</form>
											<!-- /.modal -->
										</div>



									</tr>
								</c:forEach>
=======
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
>>>>>>> 7aae61af061f9b2d2d5818c28e6bcc1706e52159
							</tbody>
						</table>
					</div>
				</div>
<<<<<<< HEAD
				<!-- 数据显示表格结束 -->
				<br> <br> <br> <br> <br> <br> <br>
				<br> <br> <br> <br> <br>
=======
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
>>>>>>> 7aae61af061f9b2d2d5818c28e6bcc1706e52159
				<div class="row clearfix">
					<div class="col-md-4 column"></div>

					<center>
<<<<<<< HEAD

						<div class="col-md-8 column">
							<a href="#">首页</a> <a href="#">尾页</a>
						</div>
=======
<<<<<<< HEAD

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
=======
						
					<div class="col-md-3 column">
						<a href="#">首页</a>
						<a href="#">尾页</a>
					</div>
>>>>>>> 201762bed1dd65891c41124006a4c485e77c7bb5
>>>>>>> 7aae61af061f9b2d2d5818c28e6bcc1706e52159
					</center>
				</div>
			</div>
		</div>
	</div>
	<div></div>
</body>
</html>
