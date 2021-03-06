<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 8/5/2021
  Time: 11:51 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Register</title>
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
<h1 align="center"> Please Register here</h1>
<div align="center">
    <%--@elvariable id="userReg" type=""--%>
    <form:form action="registration-success" method="get" modelAttribute="userReg">
        <label> User :</label>
        <form:input path="name"/>
        <form:errors path="name" cssClass="err"></form:errors>
        <br/>
        <label>User Name :</label>
        <form:input path="userName"></form:input>
        <form:errors path="userName" cssClass="err"></form:errors>
        <br/>
        <label>Password :</label>
        <form:password path="password"></form:password>
        <br/>
        <label>CountryName :</label>
        <form:select path="countryName">
            <form:option value="VNI" label="VietNam"></form:option>
            <form:option value="USA" label="America"></form:option>
            <form:option value="MAS" label="Malaysia"></form:option>
        </form:select>
        <br/>
        <label>Hobby : </label>
        Cricket : <form:checkbox path="hobby" value="cricket"/>
        Soccer : <form:checkbox path="hobby" value="soccer"/>
        Music : <form:checkbox path="hobby" value="music"/>
        <br/>
        <label> Gender :</label>
        Male <form:radiobutton path="gender" value="male"/>
        Female <form:radiobutton path="gender" value="female"/>
        <br/>
        <label>Age</label>
        <form:input path="age"></form:input>
        <form:errors path="age" cssClass="err"></form:errors>



<div align="center">
    <h3>Communication</h3>
    <label>Email :</label>
    <form:input path="communicationDTO.email"></form:input>
    <form:errors path="communicationDTO.email" cssClass="err"></form:errors>
    <br/>
    <label>Phone :</label>
    <form:input path="communicationDTO.phone"></form:input>

</div>
        <br/>
<input  type="submit" value="register">
</form:form>
</div>
</body>
</html>
