<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix= "c"  uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Listar Telefono</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>

</head>
<body>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <a class="navbar-brand" href="#">Bienvenido</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="navbarNav">
    <ul class="navbar-nav">
      <li class="nav-item active">
        <a class="nav-link" href="/Examen-Recuperacion/ListarLibro?accion=Registrar" >Insertar Telefono</a>
      </li>
       </ul>
</nav>
<form action="/Examen-Recuperacion/ListTelefonoServlet"  method="post">
 <input class="btn btn-danger btn block" type="submit" name="accion" value="Listar"> 
 <input id="cedula" name="cedula" type="hidden" value="${nombre}">
 </form>
 	<div >
 		<table class="table table-hover">
 		<thead>
 			<tr>
 			    <th> Nombre</th>
 				<th> ISBN</th>
				<th> Numero Paginas </th>
				<th> Numero Capitulo </th>
				<th> Titulo Capitulo </th>
				<th> Nombre Autor</th>
				<th> Nacionalidad Autor </th>
				  </tr>
  </thead>  
  <tbody>  
  <c:forEach var="tel" items="${telefono}">  
  <tr>
  <td>${tel.getCodigo()}</td>
  	<td>${tel.getNumero()}</td>
 	<td>${tel.getTipo()}</td>
 	<td>${tel.getOperadora()}</td> 
 	 	<td>${tel.cedula.cedula}</td> 
 
  </tr>
 
  </c:forEach>
  
  
  </tbody>
 
 </table>
 
 </div>
</body>
</html>