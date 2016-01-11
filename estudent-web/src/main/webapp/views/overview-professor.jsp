<!DOCTYPE html>
<html>
	<head>
		<meta charset="Windows-1250" />
		<title>E-študent - pregled</title>
		<link rel="stylesheet" type="text/css" href="../css/basic-style.css">
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
		<script src="../js/main.js"></script>
	</head>

	<body>
		<div id="wraper">
			<header>
				<img src="../images/ul.png" alt="UL - logo" />
				<h2>e-Študent</h2>
			</header>

			<nav>
				<a class="btn-link btn-link-curr" href="overview-professor.jsp">Pregled</a>
				<a class="btn-link" href="personal-data.jsp">Osebni Podatki</a>
				<a class="btn-link" href="new-exam.jsp">Nov izpitni rok</a>
				<a class="btn-link" href="enter-mark.jsp">Vpis ocen</a>
				<a class="btn-link" href="../index.jsp">Logout</a>
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
						<tr>
							<td class="course">Predmet1</td>
							<td></td>
							<td></td>
							<td></td>
							<td>
								<a class="btn btn-small" href="#">Uredi</a>
							</td>
							<td>
								<a class="btn btn-small" href="#">Oceni</a>
							</td>
						</tr>
						<tr>
							<td class="course">Predmet2</td>
							<td></td>
							<td></td>
							<td></td>
							<td>
								<a class="btn btn-small" href="#">Uredi</a>
							</td>
							<td>
								<a class="btn btn-small" href="#">Oceni</a>
							</td>
						</tr>
						<tr>
							<td class="course">Predmet3</td>
							<td></td>
							<td></td>
							<td></td>
							<td>
								<a class="btn btn-small" href="#">Uredi</a>
							</td>
							<td>
								<a class="btn btn-small" href="#">Oceni</a>
							</td>
						</tr>
						<tr>
							<td class="course">Predmet4</td>
							<td></td>
							<td></td>
							<td></td>
							<td>
								<a class="btn btn-small" href="#">Uredi</a>
							</td>
							<td>
								<a class="btn btn-small" href="#">Oceni</a>
							</td>
						</tr>
						<tr>
							<td class="course">Predmet5</td>
							<td></td>
							<td></td>
							<td></td>
							<td>
								<a class="btn btn-small" href="#">Uredi</a>
							</td>
							<td>
								<a class="btn btn-small" href="#">Oceni</a>
							</td>
						</tr>
					</table>
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
