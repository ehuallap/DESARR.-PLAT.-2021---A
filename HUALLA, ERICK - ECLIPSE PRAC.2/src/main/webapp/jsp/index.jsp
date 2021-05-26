<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="css/estilosIndex.css" type="text/css" rel="stylesheet" />
<title>Pre-registro</title>
</head>
<body>
	<form action="Servlet" method="post">
		<div class="title">
			<h2>PRE-REGISTRO</h2>
		</div>
		<div class="personal">
			<p class="p1">Mensaje para la pagina de bienvenida: <input type="text" name="message" size="25">
			<br>
			<p class="p1">Numero de control : <input type="text" name="number" size="5">
			<br><br>
			<input type="submit" value="Show welcome page">
		</div>
	
	</form>
</body>
</html>