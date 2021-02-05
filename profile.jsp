<%@page import="com.model.*"%>
    <%@page import="com.controller.*"%>
    <%@page import="com.pojo.*"%>
    <%@page import="java.util.*"%>
    
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
body{
background-color:wheat;
background-image:url("img/main-bg.jpg");
margin-top: 80px;
color:white;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<%  
BLManager blm=new BLManager();

String id=(String)session.getAttribute("fid");

int i=Integer.parseInt(id);

Farmer f=blm.getFarmer(i);  

%>  
  
<center><h1> FARMER PROFILE</h1></center>
<center>
<table border="1" width="30%" cellpadding="3">

    <tr>
    <th>FARMER ID</th>
    <th>FARMER NAME</th>
    <th>FARMER USERNAME</th>
	<th>FARMER GENDER</th>
	<th>FARMER EMAIL</th>
	<th>FARMER COUNTRY</th>
	
	</tr>  
<c:forEach items="${list}" var="m">
<tr><td>${m.getMid()}</td><td>${m.getMname()}</td><td>${m.getMdescription()}</td>  
<td><img alt="abc" src="images/${m.getMimage()}"></td>
<td><a href="DeleteMachineServlet?mid=${m.mid}" style="color:white;">DELETE</a></td>
<td><a href="EditMachineServlet?mid=${m.mid}" style="color:white;">EDIT</a></td>

</tr> 
</c:forEach>
<tr>
<td>
<input type="button" value="Go back!" onclick="history.back(-1)">
</td>
</tr>
</table>
</center>
</body>
</html>