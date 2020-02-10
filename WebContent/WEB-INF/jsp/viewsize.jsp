<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Tallas y Clientes</title>
</head>
<body>

	<table>
		<tr>
			<th>Zapato</th>
			<th>Cliente</th>
		</tr>
		
		<c:forEach var = "fretalla" items="${listFretalla}">
			<tr>
				<td>${fretalla.getZapato()}</td>
				<td>${fretalla.getCliente()}</td>
			</tr>
		</c:forEach>
		
		
	
	</table>

</body>
</html>