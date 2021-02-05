<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<style>
body {
margin-top:150px;
margin-left:200px;
background-image: url("img/vvg.png");
font-size: 20px;
color:white;

}
 table, th, td {
  
  border-collapse: collapse;
} 
 th, td {
  padding: 15px;
  text-align: center;
}
table#t01 {
  width: 100%;    
  background-color:red;
}
 </style>

</head>
<body>
<center>

<form action="VegetableServlet" method="post">
<table  width="350" height="280" cellpadding="1" bgcolor="Coral">
<tr> <th colspan="2" style="color: Blue;"><b><center>Vegetable Information</center></b></th></tr>

<tr><td>Vegetable Name:</td><td><input type="text" name="vegname" value=""></td></tr>
<tr><td>Vegetable Quantity:</td><td><input type="text" name="vegquantity" value=""></td></tr>
<tr><td>Vegetable Price per kg:</td><td><input type="text" name="vegpriceperkg" value=""></td></tr>
<tr><td>State:</td><td><input type="text" name="state" value=""></td></tr>
<tr><td>City:</td><td><input type="text" name="city" value=""></td></tr>
<tr><td><input type="submit" value="Go"></td>
<td><input type="reset" value="Reset"></td>
<td><input type="button" value="Go back!" onclick="history.back(-1)"></td></tr></table>

</form>
</center>
</body>
</html>