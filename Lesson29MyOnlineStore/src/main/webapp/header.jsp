<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<ul>
    <li><a class="active" href='${contextPath}/home'><i class="fa fa-fw fa-home"></i> Главная</a></li>
    <li style="float:right"><a href='${contextPath}/logout'><i class="fa fa-fw fa-user"></i> Завершить сеанс, ${userDto.getUsername()}</a></li>
    <li style="float:right"><a href='${contextPath}/cart'><i class="fa fa-fw fa-shopping-cart"></i> Корзина</a></li>
    <li style="float:right"><a href='${contextPath}/profile'><i class="fa fa-fw fa-user"></i> Личный кабинет</a></li>
</ul>