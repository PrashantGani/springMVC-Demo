<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>create new employee</title>
</head>
<body>
	<h2>create new employee</h2>
	<form action="save" method="post">
		<pre>
			Employee Name <input type="text" name="Ename"/>
			Employee Dept <input type="text" name="dept"/>
			Employee Email <input type="text" name="email"/>
			Employee Number <input type="text" name="number"/>
			
			<input type="submit" value="save"/>
		</pre>
	</form>	
	${status}
</body>
</html>