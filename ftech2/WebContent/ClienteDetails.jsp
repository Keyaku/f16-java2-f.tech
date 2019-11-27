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
	
	<% int clienteID = (int)request.getAttribute("clienteID"); %>
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
	<% } %>
			</tbody>
		</table>
	

</section>
 
</body>
</html>
