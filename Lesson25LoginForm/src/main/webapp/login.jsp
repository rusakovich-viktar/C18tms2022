<%--
  Created by IntelliJ IDEA.
  User: Виктор
  Date: 10.02.2023
  Time: 12:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="utf-8" %>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="css/main.css"/>
    <title>Страница авторизации</title>
</head>
<body>
<h1>Sign In Form</h1>
<div id="wrapper">
    <form id="signin" method="post" action="login" autocomplete="off">
        <input type="text" id="user" name="user" placeholder="username"/>
        <input type="password" id="pass" name="pass" placeholder="password"/>
        <button type="submit">&#xf0da;</button>
        <p>forgot your password? <a href="#">click here</a></p>
    </form>
</div>

</body>
</html>
