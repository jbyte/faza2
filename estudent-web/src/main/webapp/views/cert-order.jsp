<!DOCTYPE html>
<html>
	<head>
		<meta charset="Windows-1250" />
		<title>E-študent - naročilo potrdil</title>
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
				<a class="btn-link" href="overview-student.jsp">Pregled</a>
				<a class="btn-link" href="personal-data.jsp">Osebni Podatki</a>
				<a class="btn-link btn-link-curr" href="cert-order.jsp">Naročilo potrdil</a>
				<a class="btn-link" href="std-index.jsp">Študentski indeks</a>
				<a class="btn-link" href="../index.jsp">Logout</a>
			</nav>

			<section id="content">
				<section class="main main-small-padding main-text-right">
					<h2>Potrdilo o šolanju:</h2>
					<form id="cert-form">
						<span class="left">Število potrdil:</span>
						<input class="input-small" name="count" type="text" placeholder="vrednost od 1 do 10" />
						<br />
						<span class="left">Način prevzema:</span>
						<select name="type">
							<option value="none" selected>Izberi</option>
							<option value="post">Po pošti</option>
							<option value="personal">Osebno</option>
						</select>
						<br />
						<span class="left">Jezik Izdaje:</span>
						<select name="lang">
							<option value="none" selected>Izberi</option>
							<option value="slo">Slovenščina</option>
							<option value="eng">English</option>
						</select>
						<br />
						<a class="btn btn-right" href="#">Naroči</a>
					</form>
				</section>
				<section class="main main-small-padding main-text-right">
					<h2>Potrdilo o opravljenih izpitih:</h2>
					<form id="course-form">
						<span class="left">Število potrdil:</span>
						<input class="input-small" name="count" type="text" placeholder="vrednost od 1 do 10" />
						<br />
						<span class="left">Način prevzema:</span>
						<select name="type">
							<option value="none" selected>Izberi</option>
							<option value="post">Po pošti</option>
							<option value="personal">Osebno</option>
						</select>
						<br />
						<span class="left">Jezik izdaje:</span>
						<select name="lang">
							<option value="none" selected>Izberi</option>
							<option value="post">Po pošti</option>
							<option value="personal">Osebno</option>
						</select>
						<br />
						<a class="btn btn-right" href="#">Naroči</a>
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
