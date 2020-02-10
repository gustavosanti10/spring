<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registro</title>
</head>
<body>
	<form:form action="tallas" method="POST">
	
		<h1>Cliente</h1>
		<select name="cliente">
			<c:forEach var="cliente" items="${listClient}">
				<option value="${cliente.getId()}">${cliente.getNombre()} ${cliente.getApellido()} 
				Edad: ${cliente.getEdad()}
				</option>
			</c:forEach>
		</select>
				
		<h1>Zapato</h1>
		<select name="zapato" >
		<c:forEach var="zapato" items="${listShoe}">
				<option value="${zapato.getId()}">${zapato.getMarca()} ${zapato.getColor()} ${zapato.getTipo()} ${zapato.getTalla()}</option>
		</c:forEach>
		</select>
		<input type="submit" value="Guardar">
	</form:form>
	

	
</body>
</html>