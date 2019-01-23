<%-- 
    Document   : home
    Created on : 02-Dec-2018, 17:09:39
    Author     : cri_r
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="shortcut icon" type="image/x-icon"
	href="http://despirlogistics.com/wp-content/uploads/2015/02/Cont-icon-500-01.png" />
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
	integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
	crossorigin="anonymous"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"
	integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49"
	crossorigin="anonymous"></script>
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"
	integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy"
	crossorigin="anonymous"></script>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
	integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
	crossorigin="anonymous">
<title>CMS</title>
</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-light bg-light">
		<a class="navbar-brand" href="#">CMS</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarSupportedContent"
			aria-controls="navbarSupportedContent" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>

		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav mr-auto">
				<li class="nav-item active"><a class="nav-link"
					href="myShipment">My Shipment <span class="sr-only">(current)</span>
				</a></li>
				<li class="nav-item"><a class="nav-link" href="#">Profile</a></li>
				<li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
					role="button" data-toggle="dropdown" aria-haspopup="true"
					aria-expanded="false">Selection</a>
					<div class="dropdown-menu" aria-labelledby="navbarDropdown">
						<a class="dropdown-item" href="#">Receiver Address</a> <a
							class="dropdown-item" href="#">Receiver Name</a>
						<div class="dropdown-divider"></div>
						<a class="dropdown-item" href="#">Receiver Email</a>
					</div></li>

			</ul>
			<form class="form-inline my-2 my-lg-0" method="get"
				action="search/{searchItem}">
				<input class="form-control mr-sm-2" type="search" name="searchItem"
					placeholder="Search" aria-label="Search">
				<button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
			</form>
			&nbsp
			<form>
				<button class="btn btn-outline-success my-2 my-sm-0" type="submit">Log
					Out</button>
			</form>
		</div>
	</nav>
	<div style="margin-left: 2%; margin-right: 2%">
		<h4>Available Receiver List</h4>
		<c:if test="${! empty user}">
			<table border="1" class="table">
				<thead class="thead-dark">
					<tr>
						<th>Id</th>
						<th>FirstName</th>
						<th>LastName</th>
						<th>City</th>
						<th>Country</th>
						<th>Email</th>
						<th>State</th>
						<th>Phone</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${user}" var="user">
						<tr>
							<td><c:out value="${user.id}"></c:out></td>
							<td><c:out value="${user.firstName}"></c:out></td>
							<td><c:out value="${user.lastName}"></c:out></td>
							<td><c:out value="${user.city}"></c:out></td>
							<td><c:out value="${user.country}"></c:out></td>
							<td><c:out value="${user.email}"></c:out></td>
							<td><c:out value="${user.state}"></c:out></td>
							<td><c:out value="${user.phone}"></c:out></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</c:if>
	</div>

	<div style="margin-left: 2%; margin-right: 2%">
		<div>
			<h4>Enter Your Detail's to Confirm your Shipment</h4>
		</div>
		<form method="POST" action="saveReceipt">
			<div class="row" style="padding: 1">
				<div class="form-group col-xs-6">
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input class="form-control"
						type="text" name="receiverFirstname"
						placeholder="Receiver FirstName" /> <br /> <br />
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input class="form-control"
						type="number" name="receiverPhone" placeholder="Receiver Phone" />
					<br /> <br /> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input
						class="form-control" type="text" name="receiverCountry"
						placeholder="Receiver Country" />
				</div>
				<div class="form-group col-xs-6">
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input class="form-control"
						type="text" name="receiverLastname"
						placeholder="Receiver LastName" /> <br /> <br />
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input class="form-control"
						type="text" name="receiverCity" placeholder="Receiver City" /> <br />
					<br /> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input
						class="form-control" type="text" name="goods" placeholder="Goods" />
				</div>
				<div class="form-group col-xs-6">
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input class="form-control"
						type="email" name="receiverEmail" placeholder="Receiver Email" />
					<br /> <br /> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input
						class="form-control" type="text" name="receiverState"
						placeholder="Receiver State" /> <br /> <br />
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="submit"
						value="Submit" class="btn btn-primary" />
				</div>
			</div>
		</form>
	</div>
	<div style="margin-right: 2%; margin-left: 2%;">
		<c:if test="${!empty message}">
			<c:out value="${message}"></c:out>
		</c:if>
	</div>
</body>
</html>

