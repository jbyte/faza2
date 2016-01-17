<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="Windows-1250" />
		<title>E-študent - vpis ocen</title>
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
				<a class="btn-link" href="<c:url>overview-professor</c:url>">Pregled</a>
				<a class="btn-link" href="<c:url>personal-data</c:url>">Osebni Podatki</a>
				<a class="btn-link" href="<c:url>new-exam</c:url>">Nov izpitni rok</a>
				<a class="btn-link btn-link-curr" href="<c:url>enter-mark</c:url>">Vpis ocen</a>
				<a class="btn-link" href="<c:url>index</c:url>">Logout</a>
			</nav>

			<section id="content">
				<section class="main main-small-padding">
					<form>
						<select name="exam">
							<option value="none" selected>Izberi izpitni rok</option>
							<option value="pr1-1-1">Predmet1 1.1.2015</option>
							<option value="pr2-1-2">Predmet2 1.2.2015</option>
							<option value="pr3-2-3">Predmet3 2.3.2015</option>
						</select>
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
