<%@page import="com.f16.ftech.business.Clientes"%>
<%@page import="com.f16.ftech.dto.ClientesFtech"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<style type="text/css">
body {
	background-image:
		url('https://cdn.crunchify.com/wp-content/uploads/2013/03/Crunchify.bg_.300.png');
}
</style>
 
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Detalhes do Cliente</title>
	
	<%
	int clienteID = Integer.parseInt(request.getAttribute("clienteID").toString());
	Clientes clientes = new Clientes();
	ClientesFtech cliente = clientes.ListarClientesPorID(clienteID)[0];
	%>
</head>
<body>

<section style="text-align: center" style="margin-top: 50px;">
	<h3>Detalhes do Cliente</h3>
	<% if (clienteID != 0) { %>
		<table>
			<thead>
			<tr>
				<td>Cliente número ${clienteID}</td>
			</tr>
			</thead>
			<tbody>
			<tr id="CC">
				<td>CC</td>
				<td>${cliente.getNumeroCc()}</td>
			</tr>
			<tr id="Nome">
				<td>Nome</td>
				<td>${cliente.getNome()}</td>
			</tr>
			<tr id="Morada">
				<td>Morada</td>
				<td>${cliente.getMorada()}</td>
			</tr>
			<tr id="Genero">
				<td>Genero</td>
				<td>${cliente.getGenero()}</td>
			</tr>
			<tr id="Data Nascimento">
				<td>Data Nascimento</td>
				<td>${cliente.getDataNasc()}</td>
			</tr>
			</tbody>
		</table>
	<% } %>
	

</section>
 
</body>
</html>
