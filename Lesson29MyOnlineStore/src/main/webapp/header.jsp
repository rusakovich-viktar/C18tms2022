<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<ul>
    <li><a class="active" href='${contextPath}/home'><i class="fa fa-lg fa-fw fa-home"></i> Главная</a></li>
    <li style="float:right"><a href='${contextPath}/logout'><i class="fa fa-lg fa-fw fa-sign-in"></i> Завершить
        сеанс, ${userDto.getUsername()}</a></li>
    <li style="float:right"><a href='${contextPath}/cart'><i class="fa fa-lg fa-fw fa-shopping-basket"></i> Корзина</a>
    </li>
    <li style="float:right"><a href='${contextPath}/profile'><i class="fa fa-lg fa-fw fa-user-circle-o"></i> Личный
        кабинет</a></li>
</ul>