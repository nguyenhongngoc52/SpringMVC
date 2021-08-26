<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 8/24/2021
  Time: 11:46 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<h1 align="center">Manage Student</h1>
<div align="center">
    <form:form action="showAddStudentPage" method="get">
        <input type="submit" value="ADD STUDENT">
    </form:form>
    <table align="center" border="1">
        <thead>
        <tr>
            <td>id</td>
            <td>name</td>
            <td>mobile</td>
            <td>country</td>
        </tr>
        </thead>
        <c:forEach var="student" items="${students}">
            <tr>
                <td>${student.id}</td>
                <td>${student.name}</td>
                <td>${student.mobile}</td>
                <td>${student.country}</td>
                <td><a href="/updateStudent?userID=${student.id}">Update</a></td>
                <td><a href="/deleteStudent?userID=${student.id}" onclick="if(!(confirm('Bạn có chắc chắn muốn xóa sinh viên này !!!!')))return false">Delete</a></td>
            </tr>
        </c:forEach>
    </table>
</div>

</body>
</html>
