<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 15.05.2017
  Time: 10:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page session="true"%>
<html>
<head>

    <title>Login</title>
</head>
<body>


<form action  = "<c:url value='j_spring_security_check' />" method="post" style="display: inline">
    <input type = "text" name = "username"/>
    <input type="password" name = "password"/>
    <input type = "submit" class="login loginmodal-submit" value="login">

</form>
<input type="hidden" name="${_csrf.parameterName}"
       value="${_csrf.token}" />
</body>
</html>

