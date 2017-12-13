<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%> 
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
	<html>
		<head>
			<meta charset="UTF-8">
			<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
			<title>Banana GEST</title>
			<link rel="stylesheet" type="text/css" href="stylebanana.css">
		</head>
		<body>
		<header>
			<b style="font-size:50px">Banana GEST</b>
			<img src="banana.png" style="width: 15%">
		</header>
		<main>
			<form method="get" action="bananatoriohome.html">
				<img src="name.png" style="width: 2%"> 
				<input type= "text" name= "nombre" placeholder="Usuario/a" required autofocus/>
				<br/>
				<img src="padlock.png" style="width: 2%"> 
				<input type= "password" name= "password" minlength="8" placeholder="Contraseña" required/>
				<br/>
				<input type= "checkbox" name= "recordar"/>Recordar en este equipo 
				<br/>
				<br/>
				<input type="submit" name="submit" value="Iniciar Sesión">
				<br/>
			</form>
			<a href="crearcuenta.html">Crear una cuenta</a>
		</main>
		<footer>
			<hr>
			<p>Copyright Banana Gest 2017 - All rights reserved</p>
		</footer>
	</body>
</html>