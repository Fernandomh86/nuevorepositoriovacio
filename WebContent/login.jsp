<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Banana GEST</title>
		<link rel="stylesheet" type="text/css" href="css/stylebanana.css">
	</head>
	<body>
		<span>${error}</span>
		<header class="container">
				<div class="row">
					<div id="h1" class="col-xs-8 col-sm-8 col-md-8 col-lg-8">
						Banana GEST
					</div>
					<div id="logo" class="col-xs-4 col-sm-4 col-md-4 col-lg-4">
						<img src="img_css/banana.png" style="width: 15%">
					</div>
				</div>
		</header>
		<main>
			<article class="container">
				<div class="row">
			<form method="post"  action="ServletLogin.java">
				<img src="img_css/name.png" style="width: 2%"> 
				<input type= "text" name= "nombre" placeholder="Usuario/a" required autofocus/>
				<br/>
				<img src="img_css/padlock.png" style="width: 2%"> 
				<input type= "password" name= "password" minlength="8" placeholder="Contraseña" required/>
				<br/>
				<input type= "checkbox" name= "recordar"/>Recordar en este equipo 
				<br/>
				<br/>
				<input type="submit" name="submit" value="Iniciar Sesión">
				<br/>
			</form>
			</article> 
			<footer>
				<hr/>
				<p>Copyright Banana Gest 2017 - All rights reserved</p>
			</footer>
		</main>
	</body>
<html>