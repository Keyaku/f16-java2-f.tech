<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<style type="text/css">
body {
    background-image:
        url('https://cdn.crunchify.com/wp-content/uploads/2013/03/Crunchify.bg_.300.png');
}
input {
	size: 20px;
}
input.genero:first {
	margin-right: 10px;
}
</style>
 
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Java Avançado JSP Servlet Example</title>
</head>
<body>

<div align="center" style="margin-top: 50px;">
					
    <form id="addOrUpdate" action="InsertServlet" method="post">
		Please enter the ID:  <input type="text" name="ID" required> <br>
		Please enter CC number:  <input type="text" name="CCnumber" required> <br><br>
		Please enter your name:  <input type="text" name="name"> <br><br>
		Please enter the address:  <input type="text" name="morada"> <br><br>
		Please enter your date of birth:  <input type="text" name="birthdate"> <br><br>
		Please enter today's date:  <input type="text" name="dateInsert"> <br><br>
		Please enter your gender:
        <input type="radio" class="genero" name="genero" value="M">Male
		<input type="radio" class="genero" name="genero" value="F">Female<br><br>
    <input type="submit" name="add" value="Adicionar">
    <input type="submit" name="update" value="Atualizar">
    <input type="submit" name="delete" value="Apagar">
    </form>
    
    <form action="ShowServlet" method="post">
	<input type="submit" value="Listagem de Clientes">
    </form>
</div>

<script type="text/javascript" src="scripts/default.js"></script>
<script type="text/javascript">
	
</script>
</body>
</html>
