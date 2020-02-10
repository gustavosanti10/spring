<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Clientes</title>
</head>
<body>
	
	<h2>Lista de clientes</h2>
	
	<table border="2" width="70%" cellpadding="2">
		<tr><th>Nombre</th> <th>Apellido</th> <th>Edad</th> </tr>
		<c:forEach var="cliente" items="${listClient}">
			<tr> 
				<td>${cliente.getNombre()}</td>
				<td>${cliente.getApellido()}</td>
				<td>${cliente.getEdad()}</td>
			</tr>
		</c:forEach>
	</table>
	
</body>
</html>