<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Manage Users</title>
</head>
<body>

		<jsp:directive.include file="header.jsp" />		
		<div align="center">
			<h2>User Management</h2>
			<h3><a href="">Create New User</a></h3>
		</div>
		<hr width="60%">
		<br>
		<br>
		<div align="center">
			<table border="1" cellpadding="5">
				<tr>
					<th>Index</th>
					<th>ID</th>
					<th>Email</th>
					<th>Full Name</th>
					<th>Actions</th>
				</tr>
				<c:forEach var="user" items="${ listUsers }" varStatus="status">
				<tr>
					<td>${status.index + 1}</td>
					<td>${ user.userId}</td>
					<td>${ user.email}</td>
					<td>${ user.fullName }</td>
					<td><a href="delete_user">Edit</a> &nbsp; <a href="update_user">Delete</a></td>
				</tr>
				</c:forEach>
			</table>
		</div>
		

		<jsp:directive.include file="footer.jsp"/>
</body>
</html>