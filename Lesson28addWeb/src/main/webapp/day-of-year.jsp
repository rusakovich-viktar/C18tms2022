<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link rel="stylesheet" type="text/css" href="<c:url value="/css/main.css"/>"/>
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Amatic+SC:wght@700&display=swap" rel="stylesheet">
<html>

<head>
    <meta content="width=device-width, initial-scale=1.0" name="viewport">
    <title>Day of year</title>
</head>
<body class="backgroundColorBlack">
<div class="timeNow">
    <h4>Дата: <%= request.getAttribute("dayOfYearFromDate") %>
        <br>
        <h1>-> это <%= request.getAttribute("dayOfYear") %> день <-</h1>
        <h4>(если считать с начала, конечно)
        </h4>
</div>
</body>
</html>
