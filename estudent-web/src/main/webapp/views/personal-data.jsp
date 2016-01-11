<!DOCTYPE html>
<html>
	<head>
		<meta charset="Windows-1250" />
		<title>E-študent - osebni podatki</title>
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
				<a class="btn-link btn-link-curr" href="personal-data.jsp">Osebni Podatki</a>
				<a class="btn-link" href="cert-order.jsp">Naročilo potrdil</a>
				<a class="btn-link" href="std-index.jsp">Študentski indeks</a>
				<a class="btn-link" href="../index.jsp">Logout</a>
			</nav>

			<section id="content">
				<section class="main main-text-right">
					<h3>Osebni podatki:</h3>
					<form>	
						<span class="left">Ime:</span>
						<input class="input-small" type="text" name="firstname" />
						<br />
						<span class="left">Priimek:</span>
						<input class="input-small" type="text" name="surname" />
						<br />
						<span class="left">EMŠO:</span>
						<input class="input-small" type="text" name="emso" />
						<br />
						<span class="left">Email:</span>
						<input class="input-small" type="email" name="email" />
						<hr />

						<h5>Stalno prebivališče:</h5>
						<span class="left">Naslov:</span>
						<input class="input-small" type="text" name="address" />
						<br />
						<span class="left">Mesto:</span>
						<input class="input-small" type="text" name="city" />
						<br />
						<span class="left">Poštna številka:</span>
						<input class="input-small" type="text" name="post" />
						<br />
						<span class="left">Država:</span>
						<input class="input-small" type="text" name="country" />
						<hr />

						<h5>Začasno prebivališče</h5>
						<span class="left">Naslov:</span>
						<input class="input-small" type="text" name="tmp-address" />
						<br />
						<span class="left">Mesto:</span>
						<input class="input-small" type="text" name="tmp-city" />
						<br />
						<span class="left">Poštna številka:</span>
						<input class="input-small" type="text" name="tmp-post" />
						<br />
						<span class="left">Država:</span>
						<input class="input-small" type="text" name="tmp-country" />
						<br />

						<a class="btn btn-right" onclick="checkFields()" href="#">Shrani</a>
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
