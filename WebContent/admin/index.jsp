<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Evergreen Bookstore Administration</title>
</head>
<body>

		<jsp:directive.include file="header.jsp" />		
		<div align="center">
			<h2>Administrative Dashboard</h2>
		</div>
		<hr width="60%">
		<div align="center">
				<h2>Quick Actions:</h2>
				<a href="create_book">New Book</a> &nbsp;
				<a href="create_user">New User</a>	&nbsp;
				<a href="create_category">New Category</a> &nbsp;
				<a href="create_customer">New Customer</a> &nbsp;
		</div>
		<hr width="60%">
		<div align="center">
			<h2>Recent Sales:</h2>
		</div>
		<hr width="60%">
		
		<div align="center">
			<h2>Recent Reviews:</h2>
		</div>
		<hr width="60%">
		
		<div align="center">
			<h2>Statistics:</h2>
		</div>
		<hr width="60%">
		
		<jsp:directive.include file="footer.jsp"/>
</body>
</html>