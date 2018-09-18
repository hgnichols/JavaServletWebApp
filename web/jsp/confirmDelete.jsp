<%-- 
    Document   : confirmDelete
    Created on : Sep 16, 2018, 3:52:36 PM
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
        <p> User <a href = "index.jsp" > Logout </a></p>
        <h1>Are you sure you want to delete this product?</h1>
        <form id ="form1">
        <div id="bold">    
        <p> Code: </p>
        <p> Description: </p>
        <p> Price: </p>
        </div>
        </form>
        <input type ="submit" name ="yes" value = "Yes" form = "form1" id = "submit">
        <input type ="submit" name ="no" value = "No" form = "form1" id = "submit">
       
    </body>
</html>
