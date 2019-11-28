<%@page import="com.f16.ftech.business.Clientes"%>
<%@page import="com.f16.ftech.dto.ClientesFtech"%>
<%@page import="com.f16.ftech.dao.ClientesFtechDao"%>
<%@page import="com.f16.ftech.factory.ClientesFtechDaoFactory"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Lista Global de Clientes</title>
<link rel="stylesheet" type="text/css" href="css/default.css">

	<% ClientesFtech[] cliente = null;
	ClientesFtechDao clienteDao = ClientesFtechDaoFactory.create();
	cliente = clienteDao.findAll(); %>
</head>
<body>
<section style="text-align: center" style="margin-top: 50px;">
	<h3>Lista de Clientes</h3>
		<% for(int i = 0; i<cliente.length ;i++){ %>
		<table>
			<tr id="ID">
				<td>ID</td>
				<td><%= cliente[i].getIdCliente() %></td>
				</tr>
			<tr id="CC">
				<td>CC</td>
				<td><%= cliente[i].getNumeroCc() %></td>
			</tr>
			<tr id="Nome">
				<td>Nome</td>
				<td><%= cliente[i].getNome() %></td>
			</tr>
			<tr id="Morada">
				<td>Morada</td>
				<td><%= cliente[i].getMorada() %></td>
			</tr>
			<tr id="Genero">
				<td>Genero</td>
				<td><%= cliente[i].getGenero() %></td>
			</tr>
			<tr id="Data Nascimento">
				<td>Data Nascimento</td>
				<td><%= cliente[i].getDataNascimento() %></td>
			</tr>
		</table>
	<% } %>
	</section>
</body>
</html>