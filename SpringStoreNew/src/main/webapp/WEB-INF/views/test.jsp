<%--
  Created by IntelliJ IDEA.
  User: Виктор
  Date: 1/05/2023
  Time: 01:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<jsp:include page="header.jsp"/>
<c:forEach items="${categories}" var="category">
    <li>${category.name}</li>
</c:forEach>
</body>
</html>
