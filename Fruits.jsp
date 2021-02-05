<!--A Design by W3layouts
Author: W3layout
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<!DOCTYPE html>
<head>
<title>Fruits Information</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Visitors Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- bootstrap-css -->
<link rel="stylesheet" href="dash/css/bootstrap.min.css" >
<!-- //bootstrap-css -->
<!-- Custom CSS -->
<link href="dash/css/style.css" rel='stylesheet' type='text/css' />
<link href="dash/css/style-responsive.css" rel="stylesheet"/>
<!-- font CSS -->
<link href='//dash/fonts.googleapis.com/css?family=Roboto:400,100,100italic,300,300italic,400italic,500,500italic,700,700italic,900,900italic' rel='stylesheet' type='text/css'>
<!-- font-awesome icons -->
<link rel="stylesheet" href="dash/css/font.css" type="text/css"/>
<link href="dash/css/font-awesome.css" rel="stylesheet"> 
<!-- //font-awesome icons -->
<script src="dash/js/jquery2.0.3.min.js"></script>
<style type="text/css">
body
{

margin-top:00px;
margin-left:00px;
background-image: url("img/f45.jpg");
font-size: 20px;
color:White;

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

</head>
<body>
<center><div class="log-w3">
<div class="w3layouts-main">


<form action="FruitServlet" method="post">
<table  width="350" height="280" cellpadding="1" bgcolor="peachpuff">
<tr> <th colspan="2" style="color: red;"><b><center>Fruit Information</center></b></th></tr>
<tr><td><b>Fruit Name:</b></td><td><input type="text" name="fruitname" required value=""></td></tr>
<tr><td><b>Fruit Quantity:</b></td><td><input type="text" name="fruitquantity" required required value=""></td></tr>
<tr><td><b>Fruit Price per kg:</b></td><td><input type="text" name="fruitpriceperkg" value=""></td></tr>
<tr><td><b>State:</b></td><td><input type="text" name="state" required value=""></td></tr>
<tr><td><b>City:</b></td><td><input type="text" name="city" required value=""></td></tr>
<tr><td><input type="submit" value="Go" ></td>
<td><input type="reset" value="reset"></td>
<!--<td><input type="button" value="Go back!" onclick="history.back(-1)"></td>-->
</tr>
</table>

</form>
</div>
</div>
</center>


<script src="dash/js/bootstrap.js"></script>
<script src="dash/js/jquery.dcjqaccordion.2.7.js"></script>
<script src="dash/js/scripts.js"></script>
<script src="dash/js/jquery.slimscroll.js"></script>
<script src="dash/js/jquery.nicescroll.js"></script>
<!--[if lte IE 8]><script language="javascript" type="text/javascript" src="js/flot-chart/excanvas.min.js"></script><![endif]-->
<script src="dash/js/jquery.scrollTo.js"></script>
</body>
</html>
