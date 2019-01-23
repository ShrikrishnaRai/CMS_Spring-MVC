<%-- 
    Document   : admin
    Created on : 08-Dec-2018, 17:39:35
    Author     : cri_r
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="shortcut icon" type="image/x-icon"
	href="http://despirlogistics.com/wp-content/uploads/2015/02/Cont-icon-500-01.png" />
<title>Admin Login</title>
<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script
	src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
</head>
<body>
	<div class="container" align="center">
		<h2>CMS LOGIN</h2>
		<h2 class="text-center">Admin Pannel</h2>
		<form class="login-form" method="post" action="loginAdmin">
			<div class="form-group">
				<label for="exampleInputEmail1" class="text-uppercase">Username</label>
				<input type="text" class="form-control" placeholder="Email"
					name="email">

			</div>
			<div class="form-group">
				<label for="exampleInputPassword1" class="text-uppercase">Password</label>
				<input type="password" class="form-control" placeholder="Password"
					name="password">
			</div>
			<div class="form-check">
				<c:if test="${!empty message}">
					<c:out value="${message}"></c:out>
				</c:if>
				<button type="submit" class="btn btn-login float-right">Submit</button>
			</div>
			<br /> <br />
		</form>
	</div>
</body>
</html>
