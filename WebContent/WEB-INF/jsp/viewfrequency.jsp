<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Frecuentes</title>
</head>
<body>
	<h1>El mejor usado</h1>
	<h2>${frezapato.getMarca()} ${frezapato.getColor()} ${frezapato.getTipo()} ${frezapato.getTalla()}</h2>
</body>
</html>