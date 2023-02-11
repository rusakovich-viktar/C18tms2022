<%--
  Created by IntelliJ IDEA.
  User: Виктор
  Date: 10.02.2023
  Time: 12:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="../css/main.css"/>
    <title>Home</title>
</head>
<body>
<h1> Welcome to personal page!</h1>
<div><p>
    <h2>your login is: ${username}</h2>
    <h2>your password is: ${password} </h2></div>
<div id="wrapper">
    <form id="signin" method="post" action="logout" autocomplete="off">
        <p>do you want logout <a href="/login.jsp" id="logout">click here</a></p>
    </form>
</div>
</body>
</html>
