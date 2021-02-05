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
</head>
<body>


<center>

<form action="EditSupplierServlet" method="post">
<table border="1" width="20%" cellpadding="2">
<thead> <tr> <th colspan="2">Supplier Information</th></tr></thead>


<tr><td> Name:</td><td><input type="text" name="sname" value="${list.sname}"></td></tr>
<tr><td>Email:</td><td><input type="email" name="semail" value="${list.semail}"></td></tr>
<tr><td>Password:</td><td><input type="password" name="spassword" value="${list.spassword}"></td></tr>
<tr><td>Address:</td><td><input type="text" name="saddress" value="${list.saddress}"></td></tr>
<tr><td>Phone:</td><td><input type="text" name="sphone" value="${list.sphone}"></td></tr>
<tr><td>Company:</td><td><input type="text" name="scompany" value="${list.scompany}"></td></tr>
 
<tr><td><input type="submit" value="Save"></td>
<td><input type="reset" value="Reset"></td>
<td><input type="button" value="Go back!" onclick="history.back(-1)"></td></tr></table>

</form>
</center>



</body>
</html>