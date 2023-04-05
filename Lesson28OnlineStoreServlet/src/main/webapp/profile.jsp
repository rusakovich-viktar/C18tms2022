<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>My profile</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="resources/style.css" type="text/css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    <style>
        <%@include file='resources/style.css' %>
    </style>
</head>
<body>
<ul>
    <li><a class="active" href='home'><i class="fa fa-fw fa-home"></i> Main</a></li>
    <li style="float:right"><a href='cart'><i class="fa fa-fw fa-shopping-cart"></i> Bin</a></li>
    <li style="float:right"><a href='profile'><i class="fa fa-fw fa-user"></i> User</a></li>
</ul>
<br>
<h3 class="text-center">Welcome, Dear buyer <b class="font-italic">${username.getName()}</b>!</h3>
<p class="text-center">Password: <b class="font-italic">${username.getPassword()}</b></p>

<button onclick="window.location.href = 'logout';" class="buttonQuit">
    <i class="fa fa-sign-out fa-lg" aria-hidden="true"></i> Exit
</button>

</body>
</html>
