<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" %>

<html>
<head>
    <meta charset="UTF-8">
    <title>Edit Student</title>
</head>
<body>
<h1 class="violet">СТРАНИЦА НЕ РАБОТАЕТ</h1>
<form method="post">
    <input type="hidden" value="${student.id}" name="id"/>
    <label>Name</label><br>
    <input name="name" value="${student.name}"/><br><br>
    <label>Surname</label><br>
    <input name="surname" value="${student.surname}"/><br><br>
    <label>Course</label><br>
    <input name="course" value="${student.course}" type="number"/><br><br>
    <label>CityId</label><br>
    <input name="cityId" value="${student.cityId}" type="number"/><br><br>
    <input type="submit" value="Send"/>
</form>
</body>
</html>