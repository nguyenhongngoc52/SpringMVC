<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 8/5/2021
  Time: 4:19 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Love Calculator</title>
</head>
<body>
<h1 align="center">Love Calculator</h1>
<hr>
<h2>The Love Calculator Predicts :</h2>
<br/>
<p>  ${userInfo.userName} and ${userInfo.crushName} are FRIEND </p>
<br/>
<a href="/sendEmail"> Send result to your Email </a>

</body>
</html>
