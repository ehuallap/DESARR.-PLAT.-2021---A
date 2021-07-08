<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Pagina de bienvenida</title>
</head>
<body>
<jsp:useBean id="person" type="pe.unsa.epcc.Person" scope="request"></jsp:useBean>
Bienvenido, <jsp:getProperty property="name" name="person"/>, tienes <jsp:getProperty property="age" name="person"/>
</body>
</html>