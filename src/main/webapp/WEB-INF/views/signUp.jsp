<%-- 
    Document   : signUp
    Created on : 30-Nov-2018, 13:35:45
    Author     : cri_r
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sign Up</title>
    </head>
    <body>
        <form method="POST" action="Create/Users">
            <div>
                <label>Enter Your Detail's</label>
                <div>
                    <label>FirstName::</label>
                    <input type="text" name="firstName" placeholder="FirstName"/>
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
            <input type='submit' value="SignUp"/>
        </form>


    </body>
</html>
