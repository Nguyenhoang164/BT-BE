<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 23/12/2023
  Time: 2:21 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Ứng dụng Gia vị Sandwich</title>
</head>
<body>
<h1>Gia vị Sandwich</h1>
<img src="https://cdn.nhathuoclongchau.com.vn/unsafe/800x0/filters:quality(95)/https://cms-prod.s3-sgn09.fptcloud.com/mach_ban_6_cach_lam_banh_mi_sandwich_day_du_dinh_duong_1_8756a3e8e2.png">
<form action="/cook">
    <input type="checkbox" name="spices" value="Muối"> Muối<br>
    <input type="checkbox" name="spices" value="Tiêu"> Tiêu<br>
    <input type="checkbox" name="spices" value="Ớt"> Ớt<br>
    <input type="checkbox" name="spices" value="Mayonnaise"> Mayonnaise<br>
    <input type="checkbox" name="spices" value="Hành tây"> Hành tây<br>
    <input type="submit" value="Chọn gia vị">
</form>
<p>DANH SÁCH NGUYÊN LIỆU BẠN CHỌN</p>
<c:forEach items="${list}" var="c">
    <p> nguyên liệu : ${c}</p>
</c:forEach>
</body>
</html>
