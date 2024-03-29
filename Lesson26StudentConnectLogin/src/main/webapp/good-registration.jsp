<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
    <link rel="stylesheet" type="text/css" href="<c:url value="/css/login.css"/>"/>
    <title>Страница авторизации</title>
</head>
<body>
<h1>Регистрация прошла успешно, авторизируйтесь с созданным логином и паролем</h1>
<div id="wrapper">
    <form id="signin" method="post" action="login" autocomplete="off">
        <input type="text" class="violet" id="user" name="requestUsername" placeholder="username"/>
        <input type="password" id="pass" name="requestPassword" placeholder="password"/>
        <button type="submit">&#xf0da;</button>
        <p>Нет аккаунта? <a href="/registration.jsp">Зарегистрироваться снова</a></p>
    </form>
</div>

</body>
</html>
