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
<style>
body{
background-color:wheat;
margin-top: 100px;
color:white;
background-image:url("img/main-bg.jpg")
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


<center>

<form action="EditMachineServlet" method="post" enctype="multipart/form-data">
<table border="1" width="20%" cellpadding="2">
<thead> <tr> <th colspan="2">MACHINE INFORMATION</th></tr></thead>


<tr><td>Name:</td><td><input type="text" name="mname" value="${list.mname}"></td></tr>
<tr><td>Description:</td><td><input type="text" name="mdescription" value="${list.mdescription}"></td></tr>
<tr><td>Image:</td><td><input type="file" name="mimage" placeholder="image" value="${list.mimage}"></td></tr>
<tr><td><input type="submit" value="Save"></td>
<td><input type="reset" value="Reset"></td>
</tr>
</table>
<br>
<input type="button" value="Go back!" onclick="history.back(-1)">

</form>
</center>



</body>
</html>