<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<!--<meta charset="UTF-8" />-->
<meta charset="Windows-1250" />
<title>E-študent - pregled</title>
<link rel="stylesheet" type="text/css"
	href="./resources/css/basic-style.css" />
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
<script src="./resources/js/main.js"></script>
</head>

<body>
	<div id="wraper">
		<header>
			<img src="./resources/images/ul.png" alt="UL - logo" />
			<h2>e-Študent</h2>
		</header>

		<nav>
			<a class="btn-link btn-link-curr" href="overview-student">Pregled</a>
			<a class="btn-link" href="personal-data">Osebni Podatki</a> <a
				class="btn-link" href="cert-order">Naroèilo potrdil</a> <a
				class="btn-link" href="std-index">Študentski indeks</a> <a
				class="btn-link" href="index">Logout</a>
		</nav>

		<section id="content">
			<section class="main main-small-padding">
				<h2>Razpisani izpitni roki:</h2>
				<table class="tab">
					<tr>
						<th class="course">Predmet</th>
						<th>Datum</th>
						<th>Ura</th>
						<th>Prostor</th>
						<th>Prijava</th>
					</tr>
					<c:if test="${user.usercourses!=null}">
						<c:forEach var="i" items="${user.usercourses}">
							<c:if test="${i.cours.exams!=null}">
								<c:forEach var="j" items="${i.cours.exams}">
									<tr>
										<td class="course">
											<c:out value="${i.cours.ime}"></c:out>
										</td>
										<td>
											<fmt:formatDate value="${j.datumCas}" type="date" />
										</td>
										<td>
											<fmt:formatDate value="${j.datumCas}" type="time" pattern="HH:mm" />
										</td>
										<td>
											<c:out value="${j.prostor}"></c:out>
										</td>
										<td>
											<a class="btn btn-small" href="#">Prijava</a>
										</td>
									</tr>
								</c:forEach>
							</c:if>
						</c:forEach>
					</c:if>
					<tr>
						<td class="course">Ble ble</td>
						<td>1.1.2016</td>
						<td></td>
						<td></td>
						<td><a class="btn btn-small" href="#">Prijava</a></td>
					</tr>
					<tr>
						<td class="course">Hurr Durr</td>
						<td>1.1.2016</td>
						<td></td>
						<td></td>
						<td><a class="btn btn-small" href="#">Prijava</a></td>
					</tr>
					<tr>
						<td class="course">Trololo</td>
						<td>1.1.2016</td>
						<td></td>
						<td></td>
						<td><a class="btn btn-small" href="#">Prijava</a></td>
					</tr>
					<tr>
						<td class="course">Wow</td>
						<td>1.1.2016</td>
						<td></td>
						<td></td>
						<td><a class="btn btn-small" href="#">Prijava</a></td>
					</tr>
				</table>
				<br />
				<hr />
				<h2>Predmetnik:</h2>
				<table class="tab">
					<tr>
						<th class="course">Predmet</th>
						<th>Predavatelj/ica</th>
						<th>Sprotne obveznosti</th>
						<th>Toèke kolokvijev</th>
						<th>Toèke izpita</th>
						<th>Konèna ocena</th>
					</tr>
					<c:if test="${user.usercourses!=null}">
						<c:forEach var="i" items="${user.usercourses}">
							<tr>
								<td class="course">
									<c:out value="${i.cours.ime}"></c:out>
								</td>
								<td>
									
								</td>
								<td>
									<c:out value="${i.sprotneObveznosti}"></c:out>
								</td>
								<td>
									<c:out value="${i.kolokviji}"></c:out>
								</td>
								<td>
									<c:out value="${i.izpit}"></c:out>
								</td>
								<td>
									<c:out value="${i.ocena}"></c:out>
								</td>
							</tr>
						</c:forEach>
					</c:if>
					<tr>
						<td class="course">Predmet1</td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
					</tr>
					<tr>
						<td class="course">Predmet2</td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
					</tr>
					<tr>
						<td class="course">Predmet3</td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
					</tr>
					<tr>
						<td class="course">predmet4</td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
					</tr>
					<tr>
						<td class="course">predmet5</td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
					</tr>
				</table>
			</section>
		</section>

		<footer>
			<hr />
			<p>Avtor: Jaka Vute, 63110350</p>
			<p>
				Kontakt: <a href="mailto:jv5542@student.ui-lj.si">jv5542@student.uni-lj.si</a>
			</p>
		</footer>
	</div>
</body>
</html>
