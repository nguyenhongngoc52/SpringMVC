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
    <script type="text/javascript">
        function validateUserName(){
         var userName  =  document.getElementById("yn").value;
         if(userName.length < 1){
             alert("nhap cho dung vao DMM ....")
             return false;
         }return true
        }
    </script>
    <style>
        .err{
            color: red;
            position: fixed;
            text-align: left;
            margin-left: 30px;
        }

    </style>
</head>
<body>
<h1 align="center"> Love Calculator</h1>
<hr>
<%--@elvariable id="userInfo" type=""--%>
<form:form action="process-homepage" method="get" modelAttribute="userInfo" onsubmit="return validateUserName()">
<div align="center">
    <p>
        <label for="yn">Your name :</label>
        <form:input  id="yn" path="userName" />
        <form:errors path="userName" cssClass="err"></form:errors>
    </p>
    <p>
        <label for="cn">Crush name :</label>
        <form:input  id="cn" path="crushName"/>
        <form:errors path="crushName" cssClass="err"></form:errors>
    </p>
    <p>
        <form:checkbox path="termAndCondition" id="check"></form:checkbox>
        <label>I am agreeing that this is for fun </label>
        <form:errors path="termAndCondition" cssClass="err"></form:errors>
    </p>
    <input type="submit" value="calculate">
</div>
</form:form>
</body>
</html>
