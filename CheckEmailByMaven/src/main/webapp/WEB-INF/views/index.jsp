<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<form action="/checkEmail">
    <p>Enter your email for checking</p>
    <input type="text" name="email" placeholder="enter your email here">
    <input type="submit" value="Check Email">
</form>
<c:if test="${result != null}">
    <span>
    <p>${result}</p>
</span>
</c:if>

</body>
</html>