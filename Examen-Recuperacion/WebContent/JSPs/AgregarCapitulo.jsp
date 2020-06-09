<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registrar Libro</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
	integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
	crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
	integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
	crossorigin="anonymous"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"
	integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49"
	crossorigin="anonymous"></script>
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"
	integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy"
	crossorigin="anonymous"></script>
<script type="text/javascript" src="../css/Validar Formularios.js" ></script>
</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-light bg-light">
		<a class="navbar-brand" href="#">Bienvenido</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarNav" aria-controls="navbarNav"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
	
	</nav>
	<br>
	<div class="container col-lg-3">
	<h1>Formulario</h1>
	<form action="/Examen-Recuperacion/AgregarCap" method="post"
		role="form">
		<div class="form-group">
		   <b><% String cod= request.getParameter("codigolibro"); %></b>!
 
        <b><% String au= request.getParameter("autorlibro"); %></b>!
  
    <input type="hidden" name="cod" value=<%=  cod %>>
    <input type="hidden" name="au" value=<%=  au %>>
     
    
 	<label for="operadora">Numero Capitulo:</label> 
		<input type="text" id="capitulo" name="capitulo" class="form-control"/> <br> 
 		
 		<label for="operadora">Titulo:</label> 
		<input type="text" id="titulo" name="titulo" class="form-control"/> <br> 
 		
 		
 		
 		<input	type="submit" id="crear" value="Ingresar" name="accion" class="btn btn-default"/>
		
		</div>
		
	</form>
	
	</div>
</body>
</html>