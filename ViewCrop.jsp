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
body{
background-color:wheat;
background-image:url("img/fl.jpg");

}
</style>
<body>
<%  
BLManager blm=new BLManager();
List<Crop> list=blm.getAllCrops();  
request.setAttribute("list",list);  
%>  
  

<center>
<h1 style="color:Yellow;"> Crops and Seeds list</h1>
<table border="1" width="30%" cellpadding="3">
<tr><th>CROP ID</th><th>CROP NAME</th><th>CROP PRICE</th><th>CROP QUANTITY</th><th>CROP TYPE</th><th>DELETE</th><th>EDIT</th>  
</tr>  
<c:forEach items="${list}" var="c">
<tr><td>${c.getCid()}</td>
<td>${c.getCname()}</td>
<td>${c.getCprice()}</td>
<td>${c.getCquantity()}</td>  
<td>${c.getCtype()}</td>
<td><a href="DeleteServlet?cid=${c.cid}">delete</a></td>
<td><a href="EditServlet?cid=${c.cid}">edit</a></td>
</tr> 
</c:forEach>
</table>
<br>
<br>
<input type="button" value="Go back!" onclick="history.back(-1)">
<br/>
<br>
<br>
<a href="Crop.jsp">Add New Crop and Seed</a> 

</center>



</body>
</html>