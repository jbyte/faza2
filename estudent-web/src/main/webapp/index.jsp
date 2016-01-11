<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="Windows-1250" />
		<title>E-Študent - vpis</title>
		<link rel="stylesheet" type="text/css" href="./css/basic-style.css">
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
		<script src="./js/main.js"></script>
	</head>

	<body>
		<div id="wraper">
			<header>
				<img src="./images/ul.png" alt="UL - logo" />
				<h2>e-Štundet</h2>
			</header>

			<section id="content">
				<section class="main">
					<form method="post" action="login">
						<span class="form-title">Vpis v sistem</span>
						<br />
						<br />
						<input type="email" name="email" placeholder="email" />
						<br />
						<input type="password" name="password" placeholder="password"/>
						<br />
						<a class="btn btn-right" onclick="login" href="#">LOGIN</a>
						<button>test</button>
					</form>
				</section>
			</section>
			<footer>
				<hr />
				<p>Avtor: Jaka Vute, 63110350</p>
				<p>Kontakt: <a href="mailto:jv5542@student.ui-lj.si">jv5542@student.uni-lj.si</a></p>
			</footer>
		</div>
	</body>
</html>
