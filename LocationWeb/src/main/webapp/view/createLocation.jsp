<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Location</title>
</head>
<body>
Welcome to this site:<br>

	<form action="saveLoc" method="post">
	<pre>
		Id: <input type="text" name="id"/><br><br>
		Code: <input type="text"name="code"/><br> <br>
		Name: <input type="text" name="name"/><br><br>
		Type: <br> 
		Urban:<input type="radio" name="type" value="URBAN"/><br><br>
		Rural:<input type="radio" name="type" value="RURAL"/><br> <br>
		<input type="submit" value="save"/>
		</pre>
	</form>
${msg}

<a href="displayLocations">View All</a>
</body>
</html>