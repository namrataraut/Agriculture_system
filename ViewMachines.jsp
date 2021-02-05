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
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
body{
background-color:wheat;
background-image:url("img/main-bg.jpg");
margin-top: 80px;
color:white;
}
</style>
<body>
<%  
BLManager blm=new BLManager();
List<Machine> list=blm.getAllMachines();  
request.setAttribute("list",list);  
%>  
  
<center><h1> MACHINERIES LIST</h1></center>
<center>
<table border="1" width="30%" cellpadding="3">

    <tr>
    <th>MACHINE ID</th>
    <th>MACHINE NAME</th>
	<th>MACHINE DESCRIPTION</th>
	<th>MACHINE IMAGE</th>
	<th>DELETE</th>
	<th>EDIT</th>
	</tr>  
<c:forEach items="${list}" var="m">
<tr><td>${m.getMid()}</td><td>${m.getMname()}</td><td>${m.getMdescription()}</td>  
<td><img alt="abc" src="img/${m.getMimage()}"></td>
<td><a href="DeleteMachineServlet?mid=${m.mid}" style="color:white;">DELETE</a></td>
<td><a href="EditMachineServlet?mid=${m.mid}" style="color:white;">EDIT</a></td>

</tr> 
</c:forEach>
<tr>

</tr>
</table>
<br>
<input type="button" value="Go back!" onclick="history.back(-1)">

<br/><h1><a href="Machine.jsp" style="color:white;">ADD NEW MACHINE</a></h1> 

</center>



</body>
</html>