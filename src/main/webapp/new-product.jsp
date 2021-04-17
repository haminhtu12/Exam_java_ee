<%--
  Created by IntelliJ IDEA.
  User: hamin
  Date: 4/17/2021
  Time: 1:20 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div class="container">
    <div class="row">
        <h2 class="col-8 offset-2 text-center font-weight-bold my-3">Create Product</h2>
        <a class="col-2 btn btn-primary align-self-center my-3" href="${pageContext.request.contextPath}/">Back</a>
        <form class="col-12" action="${pageContext.request.contextPath}/create-product" method="post">
            <div class="form-group">
                <label>Name :</label>
                <input class="form-control" type="text" name="name">
            </div>

            <select name="brand">
                <option value="Apple">Apple</option>
                <option value="Samsung">Samsung</option>
                <option value="Nokia">Nokia</option>
                <option value="Others">Others</option>
            </select>
            <div class="form-group">
                <label>Price :</label>
                <input class="form-control" type="text" name="price">
            </div>
            <div class="form-group">
                <label>Description :</label>
                <textarea class="form-control" type="text" name="description"> </textarea>
            </div>

            <button type="submit" class="btn btn-primary">Create</button>
            <a href="create-product" class="btn btn-primary">Reset</a>
        </form>
    </div>
</div>
</body>
</html>
