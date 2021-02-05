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
margin-top: 100px;
color:white;
background-image:url("img/vff.jpg")
}
table, th, td {
  
  border-collapse: collapse;
} 
 th, td {
  padding: 15px;
  text-align: center;
}
table#t01 {
     
  background-color:#dnklmsm;
}

</style>
<body>
<%  
BLManager blm=new BLManager();
List<Fertilizer> list=blm.getAllFertilizers();  
request.setAttribute("list",list);  
%>  
  
<center><h1 style="color:cyan;"> FERTILIZER LIST</h1></center>

<center><table border="1" width="30%" cellpadding="3">
    <tr><th>FERTILIZER ID</th><th>FERTILIZER NAME</th><th>FERTILIZER DESCRIPTION</th><th>FERTILIZER RATE</th>  
<th>FERTILIZER QUANTITY</th><th>DELETE</th><th>EDIT</th></tr>  
<c:forEach items="${list}" var="fer">
<tr><td>${fer.getFerid()}</td><td>${fer.getFername()}</td><td>${fer.getFerdescription()}</td>  
<td>${fer.getFerrate()}</td><td>${fer.getFerquantity()}</td>
<td ><a href="DeleteFertilizerServlet?ferid=${fer.ferid}" style="color:White;">DELETE</a></td>
<td><a href="EditFertilizerServlet?ferid=${fer.ferid}" style="color:White;">EDIT</a></td>
</tr> 
</c:forEach>
<tr>

</tr>
</table>
<br>
<input type="button" value="Go back!" onclick="history.back(-1)">
<br>
<br/><h2><a href="Fertilizer.jsp" style="color:#F1C40F;">ADD NEW FERTILIZER</h2></a> 

</center>




</body>
</html>