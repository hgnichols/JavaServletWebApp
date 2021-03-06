<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="../styles/main.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Product Management</title>
    </head>
    <body>
        <p>${UserData.firstName}
            <a href="">Logout</a>
        </p>
        <h1>Product</h1>
        <div class="container">
        <form class="productForm" method="post" action="productManagement?action=addProduct">
            <label class="productFormLabel">Code:</label> <input  id="productFormTextArea" class="productFormInput" type="text" name="code"><br>
            <label class="productFormLabel productFormLabelDescription">Description:</label> <textarea class="productFormInput" rows="2" cols="20" name = "description"></textarea><br>
            <label class="productFormLabel">Price:</label> <input class="productFormInput productFormLabelPrice" type="text" name="price"><br>
        </form>
        </div>
        <button id="productUpdateButton" class="productButtons" type="button">Update Product</button><button class="productButtons" type="button">View Products</button>
    </body>
</html>
