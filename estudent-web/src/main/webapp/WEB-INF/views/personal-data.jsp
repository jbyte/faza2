<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="Windows-1250" />
		<title>E-študent - osebni podatki</title>
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
				<c:if test="${user.tip==0}">
					<a class="btn-link" href="overview-student">Pregled</a>
					<a class="btn-link btn-link-curr" href="personal-data">Osebni Podatki</a>
					<a class="btn-link" href="cert-order">Naročilo potrdil</a>
					<a class="btn-link" href="std-index">Študentski indeks</a>
				</c:if>
				<c:if test="${user.tip==1}">
					<a class="btn-link" href="overview-professor">Pregled</a>
					<a class="btn-link btn-link-curr" href="personal-data">Osebni Podatki</a>
					<a class="btn-link" href="new-exam">Nov izpitni rok</a>
					<a class="btn-link" href="enter-mark">Vpis ocen</a>
				</c:if>
				<c:if test="${user.tip==2}">
					<a class="btn-link" href="overview-referat">Pregled</a>
					<a class="btn-link btn-link-curr" href="personal-data">Osebni Podatki</a>
				</c:if>
				<a class="btn-link" href="index">Logout</a>
			</nav>

			<section id="content">
				<section class="main main-text-right">
					<h3>Osebni podatki:</h3>
					<form id="form" action="updateUser" method="post">	
						<span class="left">Ime:</span>
						<input class="input-small" type="text" name="ime" value="${user.ime}" />
						<br />
						<span class="left">Priimek:</span>
						<input class="input-small" type="text" name="priimek" value="${user.priimek}" />
						<br />
						<span class="left">EMŠO:</span>
						<input class="input-small" type="text" name="emso" value="${user.emso}" />
						<br />
						<span class="left">Email:</span>
						<input class="input-small" type="email" name="email" value="${user.email}" />
						<hr />

						<h5>Stalno prebivališče:</h5>
						<span class="left">Naslov:</span>
						<input class="input-small" type="text" name="naslov" value="${user.naslov}" />
						<br />
						<span class="left">Mesto:</span>
						<input class="input-small" type="text" name="mesto" value="${user.mesto}" />
						<br />
						<span class="left">Poštna številka:</span>
						<input class="input-small" type="text" name="postnum" value="${user.postnum}" />
						<br />
						<span class="left">Država:</span>
						<input class="input-small" type="text" name="drzava" value="${user.drzava}" />
						<hr />

						<h5>Začasno prebivališče</h5>
						<span class="left">Naslov:</span>
						<input class="input-small" type="text" name="zcNaslov" value="${user.zcNaslov}" />
						<br />
						<span class="left">Mesto:</span>
						<input class="input-small" type="text" name="zcMesto" value="${user.zcMesto}" />
						<br />
						<span class="left">Poštna številka:</span>
						<input class="input-small" type="text" name="zcPostnum" value="${user.zcPostnum}" />
						<br />
						<span class="left">Država:</span>
						<input class="input-small" type="text" name="zcDrzava" value="${user.zcDrzava}" />
						<br />

						<a class="btn btn-right" onclick="checkFields();submit_form();" href="#">Shrani</a>
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
