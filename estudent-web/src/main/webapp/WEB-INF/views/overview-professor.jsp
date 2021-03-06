<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="Windows-1250" />
<title>E-�tudent - pregled</title>
<link rel="stylesheet" type="text/css"
	href="./resources/css/basic-style.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
<script src="./resources/js/main.js"></script>
</head>

<body>
	<div id="wraper">
		<header>
			<img src="./resources/images/ul.png" alt="UL - logo" />
			<h2>e-�tudent</h2>
		</header>

		<nav>
			<a class="btn-link btn-link-curr" href="overview-professor">Pregled</a>
			<a class="btn-link" href="personal-data">Osebni Podatki</a> <a
				class="btn-link" href="new-exam">Nov izpitni rok</a> <a
				class="btn-link" href="enter-mark">Vpis ocen</a> <a class="btn-link"
				href="index">Logout</a>
		</nav>

		<section id="content">
			<section class="main main-small-padding main-small-padding">
				<h2>Razpisani izpitni roki</h2>
				<table>
					<tr>
						<th class="course">Predmet</th>
						<th>Datum</th>
						<th>Ura</th>
						<th>Prostor</th>
						<th>Uredi</th>
						<th>Oceni</th>
					</tr>
					<c:if test="${user.courses!=null}">
						<c:forEach var="i" items="${user.courses}">
							<c:if test="${i.exams!=null}">
								<c:forEach var="j" items="${i.exams}">
									<tr>
										<td class="course">
											<c:out value="${i.ime}"></c:out>
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
										<td><a class="btn btn-small" href="#">Uredi</a></td>
										<td><a class="btn btn-small" href="#">Oceni</a></td>
									</tr>
								</c:forEach>
							</c:if>
						</c:forEach>
					</c:if>
					<tr>
						<td class="course">Predmet1</td>
						<td></td>
						<td></td>
						<td></td>
						<td><a class="btn btn-small" href="#">Uredi</a></td>
						<td><a class="btn btn-small" href="#">Oceni</a></td>
					</tr>
					<tr>
						<td class="course">Predmet2</td>
						<td></td>
						<td></td>
						<td></td>
						<td><a class="btn btn-small" href="#">Uredi</a></td>
						<td><a class="btn btn-small" href="#">Oceni</a></td>
					</tr>
					<tr>
						<td class="course">Predmet3</td>
						<td></td>
						<td></td>
						<td></td>
						<td><a class="btn btn-small" href="#">Uredi</a></td>
						<td><a class="btn btn-small" href="#">Oceni</a></td>
					</tr>
					<tr>
						<td class="course">Predmet4</td>
						<td></td>
						<td></td>
						<td></td>
						<td><a class="btn btn-small" href="#">Uredi</a></td>
						<td><a class="btn btn-small" href="#">Oceni</a></td>
					</tr>
					<tr>
						<td class="course">Predmet5</td>
						<td></td>
						<td></td>
						<td></td>
						<td><a class="btn btn-small" href="#">Uredi</a></td>
						<td><a class="btn btn-small" href="#">Oceni</a></td>
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
