<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 8/16/2021
  Time: 9:55 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Hello Ngoc</h1>

FirstName : ${firstName}
<br/>
LastName : ${lastName}
<br/>
<br/>
<%--firstName from Model Request : ${requestScope.firstName}--%>
<%--<br/>--%>
<%--firstName from Model Session : ${sessionScope.firstName}--%>
Address : ${address}
<br/>
<a href="/${next}">Click/${next}</a>
</body>
</html>
