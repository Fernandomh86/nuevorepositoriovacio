<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
	<html>
		<head>
			<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
			<title>Crear tarea</title>
		</head>
		<body>
			<header>Crear tarea</header>
			<main>	
				<form method="get" action="bananatoriohome.html" id="formulario">
					<table >
						  <tr>
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
					<input type="submit" name="creartarea" value="crear tarea">
				</form>
			</main>
		</body>
	</html>