g<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
body {
margin-top:60px;
background-image: url("img/den.jpg");
color:White;
}
table, th, td {
  border: 1px solid white;
  border-collapse: collapse;
  font-size: 30px;
}
th, td {
  padding: 15px;
  text-align: center;
}
table#t01 {
  width: 100%;    
  
}
</style>
<body><center>
<form action="FertilizerServlet" method="post">
<h1 style="color:Tomato">FERTILIZER INFORMATION</h1>
<table border="1" width="20%" cellpadding="2">
<tr><td>Fertilizer Name:</td><td><input type="text" name="fername" required value=""></td></tr>
<tr><td>Fertilizer Description:</td><td><input type="text" name="ferdescription" required value=""></td></tr>
<tr><td>Fertilizer rate:</td><td><input type="text" name="ferrate" required value=""></td></tr>
<tr><td>Fertilizer quantity:</td><td><input type="text" name="ferquantity" required value=""></td></tr>

<tr><td><input type="submit" value="Save"></td>
<td><input type="reset" value="Reset"></td></tr>
</table>
</br>
<input type="button" value="Go back!" onclick="history.back(-1)">
</form>
</center>
</body>
</body>
</html>