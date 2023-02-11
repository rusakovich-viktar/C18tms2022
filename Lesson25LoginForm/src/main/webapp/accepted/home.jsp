<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="<c:url value="/css/main.css"/>"/>
    <title>Home</title>
</head>
<body>
<h1> Welcome to personal page!</h1>
<div><p>
    <h2>your login is: ${sessionScope.user}</h2>
    <h2>your password is: ${sessionScope.pass} </h2></div>
<div id="wrapper">
    <form id="signin" method="get" action="<c:url value="/logout"/>" autocomplete="off">
        <p>do you want logout <a href="<c:url value="/logout"/>" id="logout">click here</a></p>
    </form>
</div>
</body>
</html>