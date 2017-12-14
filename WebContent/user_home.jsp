<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
	<html>
		<head>
			<meta charset="UTF-8">
			<title>Home | Banana Gest</title>
			<link rel="stylesheet" type="text/css" href="css/user_homeCSS.css">
		</head>
		<body>
			<header>
				<div>
					<b style="font-size:50px"> Banana GEST</b>
					<img src="img_css/banana.png" style="width: 15%">
					<div id="sesion">
						<a href="login.jsp"><button>Cerrar Sesión</button></a>
					</div>
				</div>
			</header>
			<div id="tareas">
				<h1>Mis Tareas</h1>
				<table id= "misTareas" style="width:100%">
					  <tr id="Cabecera tabla">
					    <th>Tarea</th>
					    <th>Estado</th> 
					    <th>Fecha limite</th>
					    <th>Acciones</th>
					  </tr>
					  <tr id="tarea1">
					    <td id="T1">Subir a produccion</td>
					    <td>Pendiente</td>
					    <td>10/11/2017</td>
					    <td>
					    	<a href="Task.jsp"><button onclick="editarTarea()">Editar</button></a><button onclick="borrarTarea()">Borrar</button>
					    </td>
					  </tr>
					  <tr id="tarea2">
					    <td id="T2">Limpiar codigo fuente</td>
					    <td>Terminada</td>
					    <td>08/11/2017</td>
					    <td>
					    	<a href="Task.jsp"><button onclick="editarTarea()">Editar</button></a><button onclick="borrarTarea2()">Borrar</button>
					    </td>
					  </tr>
					  <tr id="tarea3">
					    <td id="T3">Presentar el proyecto</td>
					    <td>En proceso</td>
					    <td>09/11/2017</td>
					   	<td>
					   		<a href="Task.jsp"><button onclick="editarTarea()">Editar</button></a><button onclick="borrarTarea3()">Borrar</button>
					   	</td>
					  </tr>
					  <tr id="tarea4">
					    <td id="T4">Hacer la colada</td>
					    <td>Nunca</td>
					    <td>32/11/2017</td>
					    <td>
					    	<a href="Task.jsp"><button onclick="editarTarea()">Editar</button></a><button onclick="borrarTarea4()">Borrar</button>
					    </td>
					  </tr>
				</table>
			</div>	
			<div id="botones">
				<div class="boton1">
					<a href="bananatorioproyectos.html"><button>Mis proyectos</button></a>
				</div>
				<div class="boton2">
					<a href="Task.jsp"><button>Nueva tarea</button></a>
				</div>
			</div>
			<div id="completo">
				<div id="perfil">
					<img src="img_css/Persona.jpg" width="120" height="160">
					<br>
					<div id="editar">
					<a href="editarcuenta.html"><button>Editar perfil</button></a>
					</div>
				</div>
				<div id="nombre">
					<h1>Miguel de Castro Garcia</h1>
					<p>Product Owner - Scrum Master</p>
					<br><br>
				</div>
				<div id="redes">
					<img src="img_css/email.png" width="10%"><a href="https://login.live.com/login.srf?wa=wsignin1.0&rpsnv=13&ct=1510152488&rver=6.7.6643.0&wp=MBI_SSL_SHARED&wreply=https:%2F%2Fmail.live.com%2Fdefault.aspx%3Fmkt%3Des-es&lc=3082&id=64855&mkt=es-es&cbcxt=mai ">Miguelcg@bananas.com</a>
					<img src="img_css/linkedin.png" width="10%"><a href="https://es.linkedin.com/in/migueldecastroasesorfiscal">Linkedin</a>
					<img src="img_css/facebook.png" width="10%"><a href="https://es-es.facebook.com/djmikecportugal">Facebook</a>
					<img src="img_css/twitter.png" width="10%"><a href="https://twitter.com/miguelcastrogra?lang=es">Twitter</a>
				</div>
			</div>
			<script type="text/javascript">
	
				function borrarTarea() {
					    var txt;
						    var r = confirm("¿Seguro que quieres borrar " + document.getElementById("T1").innerHTML + "?");
						    if (r == true) {
						    document.getElementById("tarea1").innerHTML = "";    
						    } 
				
			}
	
				function borrarTarea2() {
					    var txt;
						    var r = confirm("¿Seguro que quieres borrar " + document.getElementById("T2").innerHTML + "?");
						    if (r == true) {
						    document.getElementById("tarea4").innerHTML = "";    
						    } 
				
			}			
	
				function borrarTarea3() {
					    var txt;
						    var r = confirm("¿Seguro que quieres borrar " + document.getElementById("T3").innerHTML + "?");
						    if (r == true) {
						    document.getElementById("tarea3").innerHTML = "";    
						    } 
			}
	
				function borrarTarea4() {
					    var txt;
						    var r = confirm("¿Seguro que quieres borrar " + document.getElementById("T4").innerHTML + "?");
						    if (r == true) {
						    document.getElementById("tarea4").innerHTML = "";    
						    } 
			}
	
			</script>	
		<footer>
			<hr>
			<p>Copyright Banana Gest 2017 - All rights reserved</p>
		</footer>	
	</body>
</html>