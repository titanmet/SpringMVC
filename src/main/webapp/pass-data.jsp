<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 02.05.2020
  Time: 16:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>PassData</title>
</head>
<body>
<form id="user-form" action="/pass-data" method="post" modelAttribute="${user}">
    <p>Name: <input type="text" id="name"></p>
    <p>Surname: <input type="text" id="surname"></p>
    <p>Year: <input type="number" id="year"></p>
    <input type="submit" value="Pass data">
</form>
</body>
</html>
