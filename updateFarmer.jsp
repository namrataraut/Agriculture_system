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

<form action="EditFarmerServlet" method="post">
<table border="1" width="20%" cellpadding="2">
<thead> <tr> <th colspan="2">Farmer Information</th></tr></thead>


<tr><td>Farmer Name:</td><td><input type="text" name="fname" value="${list.fname}"></td></tr>
<tr><td>Farmer Gender:</td><td><input type="text" name="fgender" value="${list.fgender}"></td></tr>
<tr><td>Farmer Email:</td><td><input type="email" name="femail" value="${list.femail}"></td></tr>
<tr><td>Farmer Username:</td><td><input type="text" name="fusername" value="${list.fusername}"></td></tr>
<tr><td>Farmer password:</td><td><input type="password" name="fpassword" value="${list.fpassword}"></td></tr>
<tr><td>country:</td><td>
 <select name="ctype" style="width:155px"> 
 <option>       </option> 
<option>India</option>  
<option>Pakistan</option>  
<option>Afghanistan</option>  
<option>Berma</option>  
<option>UK</option>
<option>Srilanka</option>
<option>Bengal</option>
<option>other</option>  
</select>  
</tr>
<tr><td><input type="submit" value="Save"></td>
<td><input type="reset" value="Reset"></td>
<td><input type="button" value="Go back!" onclick="history.back(-1)"></td></tr></table>

</form>
</center>



</body>
</html>