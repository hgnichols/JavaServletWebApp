<%-- 
    Document   : signup
    Created on : Sep 16, 2018, 5:52:33 PM
    Author     : Justin Wright
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="../styles/main.css">
        <title>Product Management</title>
    </head>
    <body>
        <h1>Sign-up form</h1>
        <form id="form1">
         <div id="bold">  
         <p> First Name: <input type ="text" </p>
         <p> Last Name: <input type ="text" </p>
         <p> Email: <input type ="email" required size = "30" </p>
         <p> Username: <input type ="text" required size = "25" </p>
         <p> Password: <input type ="password" required size = "25" </p>
        </form>
        </div>
        <input type ="submit" name ="signup" value = "Sign up" form = "form1" id = "submit">
          
    </body>
</html>
