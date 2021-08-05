<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 8/5/2021
  Time: 3:45 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Home Page</title>
</head>
<body>
<h1 align="center"> Love Calculator</h1>
<hr>
<%--@elvariable id="userInfo" type=""--%>
<form:form action="process-homepage" method="get" modelAttribute="userInfo">
<div align="center">
    <p>
        <label for="yn">Your name :</label>
        <form:input type="text" id="yn" path="userName"/>
    </p>
    <p>
        <label for="cn">Crush name :</label>
        <form:input type="text" id="cn" path="crushName"/>
    </p>
    <input type="submit" value="calculate">
</div>
</form:form>
</body>
</html>
