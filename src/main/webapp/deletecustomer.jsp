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

<%
		String id=request.getParameter("id");
	String name =request.getParameter("name");
	String email=request.getParameter("email");
	String userName=request.getParameter("uname");
	String password=request.getParameter("pass");
	
	%>
<h1>Customer Account Delete</h1>

<form action="./DeleteCustomerServlet" method="post">
	Customer ID:	<input type="text" name="cusid" value="<%= id %>" readonly><br>
	<br>
	Name : <input type="text" name="name" value="<%= name %>"	readonly><br>
	<br>
	Email:<input type="text" name="email" value="<%= email %>"	readonly><br>
	<br>
	User name :<input type="text" name="uname" value="<%= userName %>"	readonly><br>
	<br>
	
	<input type="submit" name="submit" value="Delete My Account" class="a">
	
	
	
	</form>


</div>
</body>
</html>