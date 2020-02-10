<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Zapatos</title>
</head>
<body>
<h2>Lista de Zapatos</h2>

	<table border="2" width="70%" cellpadding="2">
	<tr><th>Marca</th><th>Color</th><th>Tipo</th><th>Talla</th></tr>
		<c:forEach var="zapatos" items="${listShoes}">
		  <tr>
		  	<td>${zapatos.getMarca()}</td>
		  	<td>${zapatos.getColor()}</td>
		  	<td>${zapatos.getTipo()}</td>
		  	<td>${zapatos.getTalla()}</td>
		  </tr>	
		</c:forEach>
	</table>




</body>
</html>