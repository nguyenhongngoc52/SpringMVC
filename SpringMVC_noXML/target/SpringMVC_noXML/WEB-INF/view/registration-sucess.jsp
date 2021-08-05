<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 8/6/2021
  Time: 12:32 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Register Success</title>
</head>
<body>
<h1>Your registration is successful </h1>
<h2>the Detail entered by you are :</h2>
Name : ${userReg.name}<br/>
UserName : ${userReg.userName}<br/>
Password : ${userReg.password}<br/>
Country : ${userReg.countryName}<br/>
Hobby :
<c:forEach var="temp" items="${userReg.hobby}">
    ${temp}
</c:forEach>
<br/>
Gender : ${userReg.gender}

</body>
</html>
