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
<style>
body{
background-color:wheat;
background-image:url("img/fgh.png");
margin-top: 100px;
}
</style>
<body>
<%  
BLManager blm = new BLManager();
List<Farmer> l = blm.getAllFarmer();
session.setAttribute("list", l);
%>  
 <center>
<h1>Farmer list</h1>
<table border="1" width="30%" cellpadding="3">
    <tr><th>fid</th><th>fname</th><th>fgender</th><th>femail</th>  
<th>fusername</th><th>fpassword</th><th>country</th><th>delete</th><th>edit</th></tr>  

<c:forEach items="${sessionScope.list}" var="f">
<tr><td>${f.getFid()}</td><td>${f.getFname()}</td><td>${f.getFgender()}</td>  
<td>${f.getFemail()}</td><td>${f.getFusername()}</td><td>${f.getFpassword()}</td> <td>${f.getCountry()}</td>
<td><a href="DeleteFarmerServlet?fid=${f.fid}">delete</a></td>
<td><a href="EditFarmerServlet?fid=${f.fid}">edit</a></td>
</tr> 
</c:forEach>
<tr>

</tr>
</table>
<br>
<input type="button" value="Go back!" onclick="history.back(-1)">



<br/><h1><a href="reg.html">Add New Farmer</a></h1> 
</center>
</body>
</html>