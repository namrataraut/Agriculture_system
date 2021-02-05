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

margin-top: 50px;
}
</style>
<body>
<%  
BLManager blm=new BLManager();
List<Supplier> list=blm.getAllSuppliers();  
request.setAttribute("list",list);  
%>  
<center>  
<h1> Supplier list</h1>

<table border="1" width="30%" cellpadding="3">
    <tr><th>sid</th><th>sname</th><th>semail</th><th>spassword</th>  
<th>saddress</th><th>sphone</th><th>scompany</th><th>delete</th><th>edit</th></tr>  
<c:forEach items="${list}" var="s">
<tr><td>${s.getSid()}</td><td>${s.getSname()}</td><td>${s.getSemail()}</td>  
<td>${s.getSpassword()}</td><td>${s.getSaddress()}</td><td>${s.getSphone()}</td> <td>${s.getScompany()}</td>
<td><a href="DeleteSupplierServlet?sid=${s.sid}">delete</a></td>
<td><a href="EditSupplierServlet?sid=${s.sid}">edit</a></td></tr> 
</c:forEach>
<tr>

</tr>
</table>
<br>
<input type="button" value="Go back!" onclick="history.back(-1)">



<br/>
<br><h1><a href="SupplierRegistration.jsp">Add New Supplier</a></h1> 
</center>
</body>
</html>