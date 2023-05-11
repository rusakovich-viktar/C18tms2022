<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>My Eshop</title>

    <jsp:include page="bootstrap.jsp"/>

    <!-- Дополнительные стили для страницы -->
    <style>
        <%@include file='resources/style.css' %>
    </style>

</head>
<body>
<jsp:include page="header.jsp"/>

<h1>Welcome to My Eshop</h1>

<c:if test="${not empty categories}">
    <ul class="list-group">
        <c:forEach items="${categories}" var="category">
            <li class="list-group-item">
                <a href="/category?categoryId=${category.getId()}&nameCategory=${category.getName()}">
                    <img class="category-image" src="${contextPath}/images/${category.imageName}"
                         alt="${category.name} image">
                        ${category.name}
                </a>
            </li>
        </c:forEach>
    </ul>
</c:if>

<c:if test="${empty sessionScope.userDto}">
    <p class="message">Please sign in to access the eshop</p>
</c:if>

<c:if test="${not empty sessionScope.userDto}">
    <p class="message">Welcome ${sessionScope.userDto.username}!</p>
</c:if>

</body>
</html>