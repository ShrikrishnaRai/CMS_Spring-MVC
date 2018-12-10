<%-- 
    Document   : admin_dash
    Created on : 10-Dec-2018, 15:25:42
    Author     : cri_r
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Welcome to Admin DashBoard</h1>

        <div>
            <label>Available Receiver List's</label>
            <c:if test="${! empty user}">
                <table border="2" class="table table-striped" style="margin-right: 0.9; margin-left: 0.9;">
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
    </body>
</html>
