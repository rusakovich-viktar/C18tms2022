<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Edit user</title>
</head>
<body>

<form:form action="profile" modelAttribute="userDto" method="post">

    name <form:input path="name"/>
    <br>
    <br>
    Surname <form:input path="surname"/>
    <br>
    <br>
    birthday <form:input path="birthday"/>
    <br>
    <br>
    gender <form:input path="gender"/>
    <br>
    <br>
    email <form:input path="email"/>
    <br>
    <br>
    <%--    id <form:input path="id" readonly="true" />--%>
    <%--    <br>--%>
    <%--    <br>--%>
    <%--    username <form:input path="username" readonly="true"/>--%>
    <%--    <br>--%>
    <%--    <br>--%>
    <%--    registrationDate <form:input path="registrationDate" readonly="true"/>--%>
    <%--    <br>--%>
    <%--    <br>--%>
    <input type="hidden" name="id" value="${userDto.id}"/>
    <input type="submit" value="Изменить">

</form:form>

</body>
</html>
