<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 8/12/2021
  Time: 2:44 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<h1>HI ${userInfo.userName}</h1>
<h2>Send Result To Your Email</h2>
<body>
<%--@elvariable id="emailDTO" type=""--%>
<form:form action="/process-email" method="get" modelAttribute="emailDTO">
    <label>your email id :</label>
    <form:input path="userEmail"></form:input>
    <input type="submit" value="send">


</form:form>

</body>
</html>
