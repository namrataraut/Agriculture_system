<!--A Design by W3layouts
Author: W3layout
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<!DOCTYPE html>
<head>
<title>Crop Information</title>
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
body{
background-image:url("img/cornfield-background-hd-1920x1200-165974.jpg");
 background-size: 2000px 1200px;
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
<div class="log-w3">
<div class="w3layouts-main" >
	<h2>Crop Information</h2>
		<center>

<form action="CropServlet" method="post" >
<table border="0" width="350" height="280" cellpadding="2" bgcolor="Coral">
<tr><td>Crop Name:</td><td><input type="text" name="cname" required value=""></td></tr>
<tr></tr>
<tr></tr>
<tr><td>Crop Price:</td><td><input type="text" name="cprice" required value=""></td></tr>
<tr></tr>
<tr><td>Crop Quantity:</td><td><input type="text" name="cquantity" required value=""></td></tr>
<tr></tr>
<tr><td>Crop Type:</td><td>
 <select name="ctype" required style="width:155px"> 
 <option>       </option> 
<option>Cereals</option>  
<option>fruits</option>  
<option>Vegetables</option>  
<option>Oilseeds</option>  
<option>Pulses</option>  
</select>  
</tr>
<tr><td><input type="submit" value="Save"></td>

<td><input type="reset" value="Reset"></td>
</tr>
<tr>
<td></td>
<td><input type="button" value="Go back!" onclick="history.back(-1)"></td>
</tr>
</table>

</form>
</center>
		</div>
</div>
<script src="dash/js/bootstrap.js"></script>
<script src="dash/js/jquery.dcjqaccordion.2.7.js"></script>
<script src="dash/js/scripts.js"></script>
<script src="dash/js/jquery.slimscroll.js"></script>
<script src="dash/js/jquery.nicescroll.js"></script>
<!--[if lte IE 8]><script language="javascript" type="text/javascript" src="js/flot-chart/excanvas.min.js"></script><![endif]-->
<script src="dash/js/jquery.scrollTo.js"></script>
</body>
</html>
