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
        <title>JSP Page</title>
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
        <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    </head>
    <body>
        <section class="login-block">
            <div class="container">
                <div class="row">
                    <div class="col-md-4 login-sec">
                        <h2 class="text-center">Admin Pannel</h2>
                        <form class="login-form" method="post" action="loginAdmin">
                            <div class="form-group">
                                <label for="exampleInputEmail1" class="text-uppercase">Username</label>
                                <input type="text" class="form-control" placeholder="Email" name="email">

                            </div>
                            <div class="form-group">
                                <label for="exampleInputPassword1" class="text-uppercase">Password</label>
                                <input type="password" class="form-control" placeholder="Password" name="password">
                            </div>
                            <div class="form-check">
                                <c:if test="${!empty message}">
                                    <c:out value="${message}"></c:out>
                                </c:if>
                                <button type="submit" class="btn btn-login float-right">Submit</button>
                            </div>
                            <br/>
                            <br/>
                        </form>
                    </div>

                </div>
        </section>
    </body>
</html>
