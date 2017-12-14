<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
	<html>
		<head>
			<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
			<title>Crear tarea</title>
			<link rel="stylesheet" type="text/css" href="css/stylebanana.css">
		</head>
		<body>
			<header>
				<div>
					<b style="font-size:50px"> Banana GEST</b>
					<img src="img_css/banana.png" style="width: 15%">
					<div id="sesion">
					<a href="login.jsp"><button>Cerrar Sesi�n</button></a>
					</div>
				</div>
			</header>
			<main>
				<h1>Mis Tareas</h1>	
				<form method="post" action="/taskServlet" id="formulario">
					<table >
						<tr>
							<td>
								<p>Name</p>
								<textarea rows="4" cols="20" name="coment" form="formulario">Name</textarea>
							<td>
							   	<p>Descripcion</p>
								<textarea rows="4" cols="50" name="comment" form="formulario">
								Enter text here...</textarea>
							</td>
							<td>
							   	<p>Fecha inicio</p>
							   	<input type="date" name="fecha1"  required >
							</td> 
							<td>
							   	<p>Fecha fin</p>
							   	<input type="date" name="fecha2"  required >
							</td>
						  </tr>
						  <tr>
							<td>
								<p>Notas</p>
								<textarea rows="4" cols="50" name="comment" form="formulario">
							 	Enter text here...</textarea>
							</td>
							<td>
							   	<p>Responsable</p>
								<input type="text" name="responsable"  required >
							</td>
							<td>
							 	<p>Estado</p>
								<datalist id="tareas">
								<option value="Pendiente">
								<option value="En proceso">
								<option value="Terminada">
								</datalist>
								<input type="text" list="tareas">
							<td>
						 </tr>
					</table>
					<input type="submit" name="crear tarea" value="crear tarea">
				</form>
			</main>
		</body>
	</html>