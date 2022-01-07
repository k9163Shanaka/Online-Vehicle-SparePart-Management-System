<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="stylesheetone.css">
</head>
<body>
  <div class="login-box">
<form action="./Loginservlet" method="post">

<center>	<h2>Login </h2></center>

	User Name<input type="text" name="uid" class="usernames"><br>
	<br>
	Password <input type="password" name="pass" class="passe"><br>
	
	<input type="submit" name="submit" value="login" class="a">
	
</form>
</div>

</body>
</html>