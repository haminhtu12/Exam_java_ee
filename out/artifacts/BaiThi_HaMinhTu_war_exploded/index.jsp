<%--
  Created by IntelliJ IDEA.
  User: anhtran
  Date: 4/3/21
  Time: 2:43 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Home</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
</head>
<body>

<div class="w3-container">

    <table class="w3-table w3-striped">
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Brand</th>
            <th>Price</th>
            <th>Description</th>
            <th><a href="create-product">Create new</a></th>
        </tr>
        <c:forEach var="p" items="${requestScope.products}">
            <tr>
                <td>${p.id}</td>
                <td>${p.name}</td>
                <td>${p.brand}</td>
                <td>${p.price}</td>
                <td>${p.description}</td>
            </tr>
        </c:forEach>

    </table>
</div>

</body>
</html>
