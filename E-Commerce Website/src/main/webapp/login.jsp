<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html lang="en">
<head>
<title>Login V14</title>
<meta charset="UTF-8">
</head>
<body>
	<form action="user-login" method="post">

		<div class="form-group">
			<label> Email Address </label> <input type="email"
				class="form-control" name="email" placeholder="Enter Email" required>
		</div>
		<div class="form-group">

			<label>Password</label> <input type="password" class="form-control"
				name="password" placeholder="********" required>
		</div>
		<div class="text-center">
			<button type="submit" class="btn btn-primary">Login</button>
		</div>

		<div class="container" style="background-color: #f1f1f1">
			<button type="button" class="cancelbtn">Cancel</button>
			<span class="psw">Forgot <a href="#">password?</a></span>
		</div>
	</form>
</body>
</html>
