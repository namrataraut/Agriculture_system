<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.model.BLManager" %>
<%@page import="com.pojo.Supplier" %>
<%@page import="java.util.*"%>
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<style>

body {
margin-top:100px;
background-color:lightgrey;
background-image:url("img/fgh.png");
font-size: 20px;
}
table, th, td {
  border: 1px solid black;
  border-collapse: collapse;
}
th, td {
  padding: 15px;
  text-align: center;
   
 
}
</style>


<%
BLManager bl=new BLManager();
Supplier s=new Supplier();
String semail=(String)session.getAttribute("semail");
System.out.print("Before ID:"+semail);
s=bl.searchbyemail(semail);
//System.out.print("After ID:"+r.getId());
request.setAttribute("s", s);

session.getAttribute("sname");
session.getAttribute("semail");
session.getAttribute("spassword");
session.getAttribute("saddress");
session.getAttribute("sphone");
session.getAttribute("scompany");

%>
<body>
<form action="UpdateSupplierServlet" method="post"> 

							 
								<center>
<table border="1" width="30%" cellpadding="5" bgcolor="#D2B4DE">
<thead>
<tr>
 <th colspan="2">Your Profile</th>
</tr>
</thead>

<tbody>
<tr>
		<td>Name:</td>
				<td><input type="text" name="fname"
					 value="${s.sname}" readonly="readonly"></td>
</tr>

<tr>
<td>Email:</td>
<td><input type="text" name="femail" value="${s.semail}" readonly="readonly"></td>
</tr>

<tr>
<td>Password:</td>
<td><input type="text" name="fpassword" value="${s.spassword}" readonly="readonly"></td>
</tr>


<tr>
<td>Address:</td>
<td><input type="text" name="fusername" value="${s.saddress}" readonly="readonly"></td>
</tr>

<tr>
<td>Phone:</td>
<td><input type="text" name="fusername" value="${s.saddress}" readonly="readonly"></td>
</tr>

<tr>
<td>Company:</td>
<td><input type="text" name="country" value="${s.scompany}" readonly="readonly"></td>
</tr>

</tbody>
</table>
<br>
						
<br>
<input type="button" value="Go back!" onclick="history.back(-1)">


</center>
</form>
</body>
</html>





