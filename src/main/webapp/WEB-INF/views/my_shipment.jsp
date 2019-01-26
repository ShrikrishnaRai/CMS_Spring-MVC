<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
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
<title>My Shipment Request</title>
</head>
<body>
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

	<div style="margin-right: 2%; margin-left: 2%;">
		<c:if test="${!empty message}">
			<c:out value="${message}"></c:out>
		</c:if>
	</div>
	<div style="margin-left: 2%; margin-right: 2%">
		<table>
			<thead>
				<tr>
					<th>Id</th>
					<th>Receiver Email</th>
					<th>Receiver Phone</th>
					<th>Receiver FirstName</th>
					<th>Receiver LastName</th>
					<th>Receiver City</th>
					<th>Receiver Country</th>
					<th>Receive State</th>
					<th>Goods</th>
				</tr>
			<tbody>
				<c:forEach items="sent" var="sent">
					<tr>
						<td><c:out value="${sent.id }"></c:out></td>
						<td><c:out value="${sent.receiverEmail }"></c:out></td>
						<td><c:out value="${sent.receiverPhone }"></c:out></td>
						<td><c:out value="${sent.receiverFirstname }"></c:out></td>
						<td><c:out value="${sent.receiverLastname }"></c:out></td>
						<td><c:out value="${sent.receiverCity }"></c:out></td>
						<td><c:out value="${sent.receiverCountry }"></c:out></td>
						<td><c:out value="${sent.receiverState }"></c:out></td>
						<td><c:out value="${sent.goods }"></c:out></td>
					</tr>
				</c:forEach>
			</tbody>

			</thead>
		</table>
	</div>
	<div style="margin-right: 2%; margin-left: 2%;">
		<c:if test="${!empty sentmessage}">
			<c:out value="${sentmessage}"></c:out>
		</c:if>
	</div>
</body>
</html>