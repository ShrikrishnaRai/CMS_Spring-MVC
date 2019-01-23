<%-- 
    Document   : admin_dash
    Created on : 10-Dec-2018, 15:25:42
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
<title>Admin Pannel</title>
<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script
	src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
</head>
<body>
	<h1>Welcome to Admin DashBoard</h1>
	<div>
		<label>Transaction List</label>
		<c:if test="${! empty transaction }">

			<table border="2" class="table table-striped"
				style="margin-right: 2%; margin-left: 2%;">
				<thead>
					<tr>
						<th>Id</th>
						<th>Receiver</th>
						<th>Receiver Email</th>
						<th>Receiver Phone</th>
						<th>Sender</th>
						<th>Sender Email</th>
						<th>Sender Phone</th>
						<th>Goods</th>
						<th>Received City</th>
						<th>Received State</th>
						<th>Received Country</th>
					</tr>
				</thead>
				<tbody>
					<c:if test="${! empty transaction}">
						<c:forEach items="${transaction}" var="transaction">
							<tr>
								<td><c:out value="${transaction.id}"></c:out></td>
								<td><c:out value="${transaction.receiverFirstName}"></c:out>
								</td>
								<td><c:out value="${transaction.receiverEmail}"></c:out></td>
								<td><c:out value="${transaction.receiverPhone}"></c:out></td>
								<td><c:out value="${transaction.senderFirstName}"></c:out>
								</td>
								<td><c:out value="${transaction.senderLastName}"></c:out></td>
								<td><c:out value="${transaction.senderEmail}"></c:out></td>
								<td><c:out value="${transaction.senderPhone}"></c:out></td>
								<td><c:out value="${transaction.goods }"></c:out></td>
								<td><c:out value="${transaction.receiverCity}"></c:out></td>
								<td><c:out value="${transaction.receiverState }"></c:out></td>
								<td><c:out value="${transaction.receiverCountry }"></c:out>
								</td>
							</tr>
						</c:forEach>
					</c:if>
				</tbody>
			</table>
		</c:if>
	</div>
	<div>
		<label>Available Receiver List's</label>
		<c:if test="${! empty user}">
			<table border="2" class="table table-striped"
				style="margin-right: 0.9; margin-left: 0.9;">
				<thead>
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
</body>
</html>
