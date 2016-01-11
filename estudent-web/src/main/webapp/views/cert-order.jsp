<!DOCTYPE html>
<html>
	<head>
		<meta charset="Windows-1250" />
		<title>E-�tudent - naro�ilo potrdil</title>
		<link rel="stylesheet" type="text/css" href="../css/basic-style.css">
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
		<script src="../js/main.js"></script>
	</head>

	<body>
		<div id="wraper">
			<header>
				<img src="../images/ul.png" alt="UL - logo" />
				<h2>e-�tudent</h2>
			</header>
			
			<nav>
				<a class="btn-link" href="overview-student.jsp">Pregled</a>
				<a class="btn-link" href="personal-data.jsp">Osebni Podatki</a>
				<a class="btn-link btn-link-curr" href="cert-order.jsp">Naro�ilo potrdil</a>
				<a class="btn-link" href="std-index.jsp">�tudentski indeks</a>
				<a class="btn-link" href="../index.jsp">Logout</a>
			</nav>

			<section id="content">
				<section class="main main-small-padding main-text-right">
					<h2>Potrdilo o �olanju:</h2>
					<form id="cert-form">
						<span class="left">�tevilo potrdil:</span>
						<input class="input-small" name="count" type="text" placeholder="vrednost od 1 do 10" />
						<br />
						<span class="left">Na�in prevzema:</span>
						<select name="type">
							<option value="none" selected>Izberi</option>
							<option value="post">Po po�ti</option>
							<option value="personal">Osebno</option>
						</select>
						<br />
						<span class="left">Jezik Izdaje:</span>
						<select name="lang">
							<option value="none" selected>Izberi</option>
							<option value="slo">Sloven��ina</option>
							<option value="eng">English</option>
						</select>
						<br />
						<a class="btn btn-right" href="#">Naro�i</a>
					</form>
				</section>
				<section class="main main-small-padding main-text-right">
					<h2>Potrdilo o opravljenih izpitih:</h2>
					<form id="course-form">
						<span class="left">�tevilo potrdil:</span>
						<input class="input-small" name="count" type="text" placeholder="vrednost od 1 do 10" />
						<br />
						<span class="left">Na�in prevzema:</span>
						<select name="type">
							<option value="none" selected>Izberi</option>
							<option value="post">Po po�ti</option>
							<option value="personal">Osebno</option>
						</select>
						<br />
						<span class="left">Jezik izdaje:</span>
						<select name="lang">
							<option value="none" selected>Izberi</option>
							<option value="post">Po po�ti</option>
							<option value="personal">Osebno</option>
						</select>
						<br />
						<a class="btn btn-right" href="#">Naro�i</a>
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
