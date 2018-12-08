<%-- 
    Document   : signUp
    Created on : 30-Nov-2018, 13:35:45
    Author     : cri_r
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sign Up</title>
    </head>
    <body>
        <form method="POST" action="Create/Users">
            <div>
                <label>Enter Your Detail's</label>
                <div>
                    <label>FirstName::</label>
                    <input type="text" name="firstName" placeholder="FirstName" />
                </div>   
                <div>
                    <label>LastName::</label>
                    <input type="text" name="lastName" placeholder="LastName"/>
                </div>
                <div>
                    <label>Email::</label>
                    <input type="email" name="email" placeholder="Email"/>
                </div>              
                <div>
                    <label>Phone::</label>
                    <input type="number" name="phone" placeholder="Phone No"/>
                </div>
                <br/>
                <div>
                    <label>Enter Your Address</label>
                    <div>
                        <label>Country</label>
                        <input type="text" name="country" placeholder="Country"/>
                    </div>
                    <div>
                        <label>State</label>
                        <input type="text" name="state" placeholder="State"/>
                    </div>
                    <div>
                        <label>City</label>
                        <input type="text" name="city" placeholder="City"/>
                    </div>
                </div>
                <div>
                    <select name="role">
                        <option value="">Select Your Role</option>
                        <option value="Sender">Sender</option>
                        <option value="Receiver">Receiver</option>
                    </select>
                </div>
            </div>
            <div>
                <label>Password:</label>
                <input type="password" name="password" placeholder="Password"/>
            </div>
            <input type='submit' value="SignUp" class="btn btn-primary"/>
        </form>

    </body>
</html>
