<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 8/25/2021
  Time: 3:20 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1 align="center">Add Student</h1>

<%--@elvariable id="student" type=""--%>
<div align="center">
    <form:form action="save-student" modelAttribute="student" method="post">
        <form:hidden path="id"></form:hidden>
        <label>Name : </label>
        <form:input path="name"></form:input>
        <br/>
        <label>Mobile : </label>
        <form:input path="mobile"></form:input>
        <br/>
        <label>Country : </label>
        <form:input path="country"></form:input>
        <br/>

        <input type="submit" value="Submit">

    </form:form>
</div>

</body>
</html>
