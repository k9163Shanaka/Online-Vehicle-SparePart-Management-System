<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="stylesheettwo.css">

</head>
<body>
  <div class="login-box">
<form action="./CustomerInsert" method="post">
<center><h3>Register</h3></center><br>
<br>
<input type="text" name="name" class="firstname" placeholder="Name"><br>
<br>
<input type="text" name="email" class="email"  placeholder="Email"><br>
<br>
<input type="text" name="uid" class="usernamew"  placeholder="User Name"><br>
<br>
 <input type="password" name="psw" class="password"  placeholder="Password"><br> 

<input type = "checkbox" id = "term1" onclick = "enableButton()"> I agree to the terms and conditions.<br><br> 
<br>
<br>
<input type="submit" name="submit" value ="create customer" class="a">


</form>
<br>
	<center>Already have an Account? <a href="login.jsp">Sign in </a> </center>
<br>
</div>


</body>
</html>