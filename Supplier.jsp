<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">

<!-- jQuery library -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

<!-- Popper JS -->
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>

<!-- Latest compiled JavaScript -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
<title>Simple Form Validation</title>
</head>
<style type="text/css">
span {
	color: #f00;
	font-weight: bold;
}

h1 {
	color: green;
}

.form-group {
	color: black;
	font-weight: bold; //
	background-color: #e6e6e6;
}

.form-control {
	color: black; //
	font-weight: bold;
}

.col-lg-8 {
	border: 2px solid #f2f2f2;
	background-color: #f2f2f2;
}

.btn {
	background-color: #009900;
	color: white;
	font-weight: bold;
}
</style>
<script>
	function Validation() {
		var user = document.myform.user.value;
		if (user == '') {
			document.getElementById('user_error').innerHTML = "** Please fill the Username field";
			return false;
		} else {
			document.getElementById("user_error").innerHTML = "";
		}

		var pass = document.myform.pass.value;
		if (pass == '') {
			document.getElementById('pass_error').innerHTML = "** Please enter a new Password";
			return false;
		} else {
			document.getElementById("pass_error").innerHTML = "";
			return true;
		}

	}
</script>

<body>
	<div class="container">
		<h1>
			<center>Supplier Login</center>
		</h1>
		<div class="col-lg-8 m-auto d-block">
			<form action="SupplierServlet" method="post">

				<div class="form-group">
					<label> Supplier Email:</label> <input type="email" name="semail"
						class="form-control" id="user" autocomplete="off"> <span
						id="user_error"></span>
				</div>


				<div class="form-group">
					<label> Password:</label> <input type="password" name="spassword"
						class="form-control" id="pass" autocomplete="off"> <span
						id="pass_error"></span>
				</div>

				<center><input type="submit" value="Login" class="btn" name="Login">
				<input type="submit" value="Reset" class="btn" name="Reset">
				<input type="submit" value="Go Back" class="btn" name="Go Back"  onclick="index.html"></center>
			
				<tr>

<td colspan="2"><b>Not Yet registered!!</b> <a href="SupplierRegistration.jsp">Register Here</a></td>
</tr>	
			</form>
		</div>
	</div>

</body>
</html>