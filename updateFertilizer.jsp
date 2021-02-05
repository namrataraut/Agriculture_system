<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.model.*"%>
    <%@page import="com.controller.*"%>
    <%@page import="com.pojo.*"%>
    <%@page import="java.util.*"%>
    
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
body{
background-image:url("img/f.jpg");
font-size:25px;
color:WHITE;

margin-left: 80px;
margin-top: 100px;
}
</style>
</head>
<body>


<center>

<form action="EditFertilizerServlet" method="post">
<h1 style="color:White">FERTILIZER INFORMATION
</h1>
<table border="2" width="30%" cellpadding="2">

<tr><td>FERTILIZER NAME:</td><td><input type="text" name="fername" value="${list.fername}"></td></tr>
<tr><td>FERTILIZER DESCRIPTION:</td><td><input type="text" name="ferdescription" value="${list.ferdescription}"></td></tr>
<tr><td>FERTILIZER RATE:</td><td><input type="text" name="ferrate" value="${list.ferrate}"></td></tr>
<tr><td>FERTILIZER QUANTITY:</td><td><input type="text" name="ferquantity" value="${list.ferquantity}"></td></tr>
<tr></tr>
<tr><td><input type="submit" value="Save"></td>
<td><input type="reset" value="Reset"></td></tr></table>
<br>
<input type="button" value="Go back!" onclick="history.back(-1)">

</form>
</center>



</body>
</html>