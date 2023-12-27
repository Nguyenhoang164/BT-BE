<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 23/12/2023
  Time: 2:32 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/check">
    <p>input numer 1</p>
    <input type="number" placeholder="0" value="0" name="number1">
    <p>input numer 2</p>
    <input type="number" placeholder="0" value="0" name="number2">
    <select name="option">
        <option value="+">+</option>
        <option value="-">-</option>
        <option value="x">x</option>
        <option value="/">/</option>
    </select>
    <input type="submit" value="tinh">
</form>
<span>
    ket qua : ${result}
</span>
</body>
</html>
