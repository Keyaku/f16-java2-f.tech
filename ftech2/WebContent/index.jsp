<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<style type="text/css">
body {
    background-image:
        url('https://cdn.crunchify.com/wp-content/uploads/2013/03/Crunchify.bg_.300.png');
}
</style>
 
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Java Avançado JSP Servlet Example</title>
</head>
<body>

<div align="center" style="margin-top: 50px;">

    <form action="InsertServlet">
        Please enter the ID:  <input type="text" name="ID" size="20px"> <br>
        Please enter CC number:  <input type="text" name="CCnumber" size="20px"> <br><br>
        Please enter your name:  <input type="text" name="name" size="20px"> <br><br>
        Please enter the address:  <input type="text" name="morada" size="20px"> <br><br>
        Please enter your date of birth:  <input type="text" name="birthdate" size="20px"> <br><br>
        Please enter today's date:  <input type="text" name="dateInsert" size="20px"> <br><br>
        Please enter your gender:  <input type="text" name="genero" size="20px"> <br><br>
    <input type="submit" value="submit">
    </form>

</div>
 
</body>
</html>
