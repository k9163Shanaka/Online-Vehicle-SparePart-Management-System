
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="stylesheetfor.css">
</head>
<body>
<div class="containertwo">
<h1>Update User Details</h1>
	<%
		String id=request.getParameter("id");
	String name =request.getParameter("name");
	String email=request.getParameter("email");
	String userName=request.getParameter("uname");
	String password=request.getParameter("pass");
	
	%>
	<form action="./UpdateCustomerServlet" method="post">
	Customer ID:	<input type="text" name="cusid" value="<%= id %>" readonly><br>
	<br>
	Name : <input type="text" name="name" value="<%= name %>"><br>
	<br>
	Email:<input type="text" name="email" value="<%= email %>"><br>
	<br>
	User name :<input type="text" name="uname" value="<%= userName %>"><br>
	<br>
	Password :<input type="password" name="pass" value="<%= password %>"><br>
	<br>
	<input type="submit" name="submit" value="Save New Data" class="a">
	
	
	
	</form>
	</div>
</body>
</html>