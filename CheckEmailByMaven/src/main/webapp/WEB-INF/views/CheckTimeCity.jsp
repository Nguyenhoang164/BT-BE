<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 23/12/2023
  Time: 1:13 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/checkTime">
    <p>Choose your city to check time</p>
    <select name="city" >
        <option value="HN">Ha Noi</option>
        <option value="London">London</option>
        <option value="US">Unite State</option>
    </select>
    <br>
    <input type="submit" value="check">
</form>
<span>
    <p>Time your choose : ${time}</p>
</span>
</body>
</html>
