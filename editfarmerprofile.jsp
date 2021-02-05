<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.model.BLManager"%>
<%@page import="com.pojo.Farmer"%>
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
background-image:url("img/bcki.jpg");
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
	BLManager bl = new BLManager();
	Farmer f = new Farmer();
	String femail = (String) session.getAttribute("femail");
	System.out.print("Before ID:" + femail);
	f = bl.serachbyemail(femail);
	//System.out.print("After ID:"+r.getId());
	request.setAttribute("f", f);

	session.getAttribute("fname");
	session.getAttribute("fgender");
	session.getAttribute("femail");
	session.getAttribute("fusername");
	session.getAttribute("fpassword");
	session.getAttribute("country");
%>
<body>
<form action="UpdateFarmerServlet" method="post">
<center>
<table border="1" width="30%" cellpadding="5" bgcolor="#FBEEE6    ">
<thead>
<tr>
 <th colspan="2">Edit Farmer</th>
</tr>
</thead>

<tbody>
							
<tr>
		<td>Name:</td>
				<td><input type="text" name="fname"
					 value="${f.fname}"></td>
</tr>
<tr>
		<td>Gender:</td>
				<td><input type="text" name="fgender"
					 value="${f.fgender}"></td>
</tr>
<tr>
<td>Email:</td>
<td><input type="text" name="femail" value="${f.femail}"></td>
</tr>

<tr>
<td>username:</td>
<td><input type="text" name="fusername" value="${f.fusername}"></td>
</tr>

<tr>
<td>password:</td>
<td><input type="text" name="fpassword" value="${f.fpassword}"></td>
</tr>

<tr>
<td>country:</td>
<td><input type="text" name="country" value="${f.country}"></td>
</tr>
<tr><td><input type="submit" value="Update"></a>
<td><input type="button" value="Go back!" onclick="history.back(-1)"></td></tr>
</tbody>
</table>
</center>
</form>
</body>
</html>






