<!DOCTYPE html>
<html>
	<head>
		<meta charset="Windows-1250" />
		<title>E-študent - vpis ocen</title>
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
				<a class="btn-link" href="overview-professor.jsp">Pregled</a>
				<a class="btn-link" href="personal-data.jsp">Osebni Podatki</a>
				<a class="btn-link" href="new-exam.jsp">Nov izpitni rok</a>
				<a class="btn-link btn-link-curr" href="enter-mark.jsp">Vpis ocen</a>
				<a class="btn-link" href="../index.jsp">Logout</a>
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
