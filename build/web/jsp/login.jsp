<%-- 
    Document   : login
    Created on : Sep 16, 2018, 5:10:34 PM
    Author     : Justin Wright
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="../styles/main.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Product Management</title>
    </head>
    <body>
        <h1>Login</h1>
        <form id="form1">
         <div id="bold">  
         <p> Username: <input type ="text" </p>
         <p> Password: <input type ="text" </p>
        </form>
        </div>
        <input type ="submit" name ="yes" value = "Login" form = "form1" id = "submit">
        <p> <a href = "signup.jsp" > New user? Click here to register </a></p>
    </body>
</html>
