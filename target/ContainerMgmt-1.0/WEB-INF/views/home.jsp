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
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        <title>Container Management System</title>
    </head>
    <body>
        <div>
            <label>Available Receiver List's</label>
            <c:if test="${! empty user}">
                <table border="2">
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
                                <td>
                                    <c:out value="${user.id}"></c:out>
                                    </td>
                                    <td>
                                    <c:out value="${user.firstName}"></c:out>
                                    </td>
                                    <td>
                                    <c:out value="${user.lastName}"></c:out>
                                    </td>
                                    <td>
                                    <c:out value="${user.city}"></c:out>
                                    </td>
                                    <td>
                                    <c:out value="${user.country}"></c:out>
                                    </td>
                                    <td>
                                    <c:out value="${user.email}"></c:out>
                                    </td>
                                    <td>
                                    <c:out value="${user.state}"></c:out>
                                    </td>
                                    <td>
                                    <c:out value="${user.phone}"></c:out>
                                    </td>
                                </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </c:if>
        </div>
        <div>
            <label>Enter Your Detail's to Confirm your Courrier</label>
            <form style="text-align: center;display:inline-block" method="post" action="saveReceipt">
                <div>
                    <label>Receiver Firstname:</label>
                    <input type="text" name="receiverFirstname" placeholder="Receiver FirstName"/>
                </div>
                <div>
                    <label>Receiver Lastname</label>
                    <input type="text" name="receiverLastname" placeholder="Receiver LastName"/>
                </div>
                <div>
                    <label>Reciever Email</label>
                    <input type="email" name="receiverEmail" placeholder="Receiver Email"/>
                </div>
                <div>
                    <label>Reciever Phone</label>
                    <input type="number" name="receiverPhone" placeholder="Receiver Phone"/>
                </div>
                <div>
                    <label>Receiver City</label>
                    <input type="text" name="receiverCity" placeholder="Receiver City"/>
                </div>
                <div>
                    <label>Receiver State</label>
                    <input type="text" name="receiverState" placeholder="Receiver State"/>
                </div>
                <div>
                    <label>Receiver Country</label>
                    <input type="text" name="receiverCountry" placeholder="Receiver Country"/>
                </div>
                <div>
                    <label>Goods Detail's</label>
                    <input type="text" name="goods" placeholder="Goods"/>
                </div>
                <input type="submit" value="Submit"/>
            </form>
        </div>
        <div>
            <c:if test="${!empty message}">
                <c:out value="${message}"></c:out>
            </c:if>
        </div>
        <div>
            <a href="<c:url value="/logOut"/>">Log Out</a>
        </div>
    </body>
</html>
