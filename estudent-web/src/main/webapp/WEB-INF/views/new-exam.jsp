<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="Windows-1250" />
		<title>E-študent - vpis</title>
		<link rel="stylesheet" type="text/css" href="./resources/css/basic-style.css">
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
		<script src="./resources/js/main.js"></script>
	</head>

	<body>
		<div id="wraper">
			<header>
				<img src="./resources/images/ul.png" alt="UL - logo" />
				<h2>e-Študent</h2>
			</header>

			<nav>
				<a class="btn-link" href="overview-professor">Pregled</a>
				<a class="btn-link" href="personal-data">Osebni Podatki</a>
				<a class="btn-link btn-link-curr" href="new-exam">Nov izpitni rok</a>
				<a class="btn-link" href="enter-mark">Vpis ocen</a>
				<a class="btn-link" href="index">Logout</a>
			</nav>
			
			<section id="content">
				<section class="main main-small-padding main-text-right">
					<h2>Razpis novega izpitnega roka:</h2>
					<form>
						<span class="left">Predmet:</span>
						<select name="course">
							<option value="none" selected>Izberi</option>
							<option value="pr1">Predmet1</option>
							<option value="pr3">Predmet3</option>
							<option value="pr4">Predmet4</option>
							<option value="pr5">Predmet5</option>
						</select>
						<br />
						<span class="left">Datum:</span>
						<input class="input-small" type="text" name="date" placeholder="format: dd.mm.yyyy" />
						<br />
						<span class="left">Ura:</span>
						<input class="input-small" type="text" name="time" placeholder="format: hh:mm" />
						<br />
						<span class="left">Prostor:</span>
						<input class="input-small" type="text" name="room" />
						<br />
						<span class="left">Komentarji:</span>
						<textarea cols=30 rows=5 class="input-small"></textarea>
						<br />
						<a class="btn btn-right" onclick="submit_form()" href="#">Shrani</a>
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
