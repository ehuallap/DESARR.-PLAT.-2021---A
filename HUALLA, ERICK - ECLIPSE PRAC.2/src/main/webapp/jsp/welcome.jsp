<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="css/estilosWelcome.css" type="text/css" rel="stylesheet" />
<title>Welcome page</title>
</head>
<body>
	<div class="title">
		<h1>Bienvenido a ecodeup (El blog de Java y Java Web)</h1>
	</div>
	<div class="content">
		<h2>
		<c:out value="${holaMundo.message}"/>
		</h2>
		<p class="p1">Esto es una expresion
		<br>
		<p>Valor de la variable de control:
		<c:out value="${holaMundo.numControl}" default="Mensaje de bienvenida"/>
		<br>
		<p class="p1">Fecha Actual:
		<c:out value="${fecha}"/>
		<p class="p1">Navegardor y Version del Sistema Operativo:
		<c:out value="${sistema}"/>
	</div>
</body>
</html>