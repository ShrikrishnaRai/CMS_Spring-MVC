<%-- 
    Document   : signUp
    Created on : 30-Nov-2018, 13:35:45
    Author     : cri_r
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
    <head>
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="shortcut icon" type="image/x-icon" href="http://despirlogistics.com/wp-content/uploads/2015/02/Cont-icon-500-01.png" />
        <title>Sign Up</title>
    </head>
    <body>
        <nav class="navbar navbar-expand-lg navbar-light bg-light">
            <a class="navbar-brand" href="#">CMS</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarText" aria-controls="navbarText" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarText">
                <ul class="navbar-nav mr-auto">
                    <li class="nav-item active">
                        <a class="nav-link" href="#"><span class="sr-only">(current)</span></a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">Features</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">Pricing</a>
                    </li>
                </ul>
                <span class="navbar-text">
                    <div>
                        <a href="<c:url value="/logOut"/>">Log Out</a>
                    </div>
                </span>
            </div>
        </nav>
        <section class="login-block">
            <div class="container">
                <div class="col-md-4 login-sec">
                    <h2 class="text-center">Sign Up</h2>
                    <form method="POST" action="Create/Users">
                        <div class="wrapper">
                            <div class='card'>
                                <div class="form-group">
                                    <label for="exampleInputEmail" class="text-uppercase"> FirstName::</label>
                                    <input type="text" class="form-control"  name="firstName" placeholder="FirstName" />
                                </div>
                                <div class="form-group">
                                    <label class="text-uppercase">LastName::</label>
                                    <input type="text" class="form-control" name="lastName" placeholder="LastName"/>
                                </div>
                                <div class="form-group">
                                    <label class="text-uppercase">Email::</label>
                                    <input type="email" name="email" class="form-control" placeholder="Email"/>
                                </div>              
                                <div>
                                    <label class="text-uppercase">Phone::</label>
                                    <input type="number" class="form-control" name="phone" placeholder="Phone No"/>
                                </div>
                            </div>
                            <div class='card'>
                                <label class="text-center">Enter Your Address</label>
                                <div class="form-group">
                                    <label>Country</label>
                                    <input type="text" name="country" class="form-control" placeholder="Country"/>
                                </div>
                                <div class="form-group">
                                    <label>State</label>
                                    <input type="text" name="state" class="form-control" placeholder="State"/>
                                </div>
                                <div class="form-group">
                                    <label>City</label>
                                    <input type="text" name="city" class="form-control" placeholder="City"/>
                                </div>
                                <div>
                                    <select name="role">
                                        <option value="">Select Your Role</option>
                                        <option value="Sender">Sender</option>
                                        <option value="Receiver">Receiver</option>
                                    </select>
                                </div>
                                <div>
                                    <label>Password:</label>
                                    <input type="password" class="form-control" name="password" placeholder="Password"/>
                                </div>
                                <input type='submit' value="SignUp" class="btn btn-primary"/>
                            </div>
                        </div>
                    </form>
                </div>
            </div></section>
    </body>
</html>
