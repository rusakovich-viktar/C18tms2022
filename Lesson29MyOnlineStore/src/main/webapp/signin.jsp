<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Login form</title>
    <meta charset="utf-8">
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/login.css"/>"/>
</head>
<body>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<div id="wrapper">
    <h1>Sign In Form</h1>
    <%--    <form method="post" action='${contextPath}/signin' id="signin" autocomplete="on">--%>
    <form method="post" action='/eshop?command=signin-post' id="signin" autocomplete="on">
        <input type="text" class="violet" id="user" name="username" placeholder="username" required/>
        <input type="password" id="pass" name="password" placeholder="password" required/>
        <button type="submit">&#xf0da;</button>
        <p>Нет аккаунта? <a href='${pageContext.request.contextPath}/signup'>Зарегистрироваться</a></p>
    </form>
</div>

</body>
</html>