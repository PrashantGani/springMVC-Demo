<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Details By ID</title>
</head>
<body>
	<h2>Employee Details By ID</h2>
	<table border="1">
		<tr>
			<th>Employee Name</th>
			<th>Employee Department</th>
			<th>Employee Mail</th>
			<th>Employee Number</th>
		</tr>

		<tr>
			<td>${employee.ename}</td>
			<td>${employee.dept}</td>
			<td>${employee.email}</td>
			<td>${employee.number}</td>
		</tr>

	</table>
</body>
</html>
