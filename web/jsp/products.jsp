<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="../styles/main.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Product Management</title>
    </head>
    <body>
        <p>User
            <a href="login.jsp">Logout</a>
        </p>
        <h1>Products</h1>
        <table>
            <tr>
                <th class="leftAlign codeColumn">Code</th>
                <th class="leftAlign descriptionColumn">Description</th> 
                <th class="rightAlign priceColumn">Price</th> 
                <th class="editColumn"></th>
                <th class="deleteColumn"></th>
            </tr> 
            <tr>
                <td class="leftAlign codeColumn">8601</td>
                <td class="leftAlign descriptionColumn">86 (the band) - True Life Songs and Pictures</td>
                <td class="rightAlign priceColumn">$15.95</td>
                <td class="leftAlign editColumn">
                    <a href="">Edit</a>
                </td>
                <td class="leftAlign deleteColumn">
                    <a href="">Delete</a>
                </td>               
            </tr>
            <tr>
                <td class="leftAlign codeColumn">pf01</td>
                <td class="leftAlign descriptionColumn">Paddlefoot - The first CD</td>
                <td class="rightAlign priceColumn">$12.95</td>
                <td class="leftAlign editColumn">
                    <a href="">Edit</a>
                </td>
                <td class="leftAlign deleteColumn">
                    <a href="">Delete</a>
                </td> 
            </tr>
            <tr>
                <td class="leftAlign codeColumn">pf02</td>
                <td class="leftAlign descriptionColumn">Paddlefoot - The second CD</td>
                <td class="rightAlign priceColumn">$14.95</td>
                <td class="leftAlign editColumn">
                    <a href="">Edit</a>
                </td>
                <td class="leftAlign deleteColumn">
                    <a href="">Delete</a>
                </td>  
            </tr>
            <tr>
                <td class="leftAlign codeColumn">jr01</td>
                <td class="leftAlign descriptionColumn">Joe Rut - Genuine Wood Grained Finish</td>
                <td class="rightAlign priceColumn">$14.95</td>
                <td class="leftAlign editColumn">
                    <a href="">Edit</a>
                </td>
                <td class="leftAlign deleteColumn">
                    <a href="">Delete</a>
                </td> 
            </tr>
        </table>
        <button id="addProductButton" type="button">Add Product</button>
    </body>
</html>
