<%@ page import="by.tms.Student " %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>StudentList</title>
</head>
<body>
<h1>Displaying student List</h1>
<table border="1">
    <caption>Таблица студентов</caption>
    <tr>
        <th>Имя</th>
        <th>Фамилия</th>
        <th>Курс</th>
        <th>Город</th>
    </tr>
    <%
        ArrayList<Student> students = (ArrayList<Student>) request.getAttribute("data");
        for (Student student : students) {
    %>
    <tr>
        <td><%=student.getName()%>
        </td>
        <td><%=student.getSurname()%>
        </td>
        <td><%=student.getCourse()%>
        </td>
        <td><%=student.getCity()%>
        </td>
    </tr>
    <%}%>
</table>

</body>
</html>
