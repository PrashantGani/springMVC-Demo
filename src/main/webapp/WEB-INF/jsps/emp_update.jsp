<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>update employee</title>
</head>
<body>
	<h2>update employee</h2>
	<form action="updateEmp" method="post">
		<pre>
			
			EmployeeName<input type="text" name="Ename" value="${list.ename}"/>
			EmployeeDept<input type="text" name="dept" value="${list.dept}"/>
			EmployeeEmail<input type="text" name="email" value="${list.email}"/>
			EmployeeNumber<input type="text" name="number" value="${list.number}"/>
			<input type="submit" value="update"/>
		</pre>
	</form>
	
</body>
</html>