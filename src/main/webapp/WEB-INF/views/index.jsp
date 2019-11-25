<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page session="false" %>



<!DOCTYPE html>
	<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<title>Bayilik Formu</title>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta name="description" content="açıklama" />
	<meta name="keywords" content="arama kelimeleri" />
	<meta name="author" content="İpek" />



	<!-- Place favicon.ico and apple-touch-icon.png in the root directory -->
	<link rel="shortcut icon" href="favicon.ico">
	<!-- Google Fonts -->
	<link href='http://fonts.googleapis.com/css?family=Playfair+Display:400,700,400italic|Roboto:400,300,700' rel='stylesheet' type='text/css'>
	<!-- Animate -->
	<link rel="stylesheet" href="css/animate.css">
	<!-- Icomoon -->
	<link rel="stylesheet" href="css/icomoon.css">
	<!-- Bootstrap  -->
	<link rel="stylesheet" href="css/bootstrap.css">

	<link rel="stylesheet" href="css/style.css">


	<!-- Modernizr JS -->
	<script src="js/modernizr-2.6.2.min.js"></script>

	</head>
	<body>
	

	
	<!-- END #fh5co-offcanvas -->
	<header id="fh5co-header">
		
		<div class="container-fluid">

			<div class="row">
			
				<div class="col-lg-12 col-md-12 text-center">
					<h1 id="fh5co-logo"><a href="index.html">BAYİLİK ÖN BAŞVURU FORMU	</a></h1>
				</div>

			</div>
		
		</div>

	</header>
	<!-- END #fh5co-header -->
	<div class="container-fluid">
		<div class="row fh5co-post-entry"> 
			<article class="col-lg-3 col-md-3 col-sm-3 col-xs-6 col-xxs-12 animate-box">
			
  isim Soyisim: <input type="text" width="400px" id="isimsoyisim"><br>
  Tc Kimlikno: <input type="text" id="tcno"><br>
   Adres: <input type="text" id="adres"><br>
  Telefon: <input type="text" id="tel"><br>
   E-posta: <input type="text" id="eposta"><br>
  Doğum Tarihi: <textarea  id="dtarih"></textarea><br>
   Parakende Ticareti ile uğraştınız mı? <textarea  id="soru1"></textarea><br>
  Lokumcu babayı tercih etmenizin sebebi nedir?: <textarea id="soru2""></textarea><br>
   Hangi il/ilçe/semt için Lokumcu baba işletmeciliği düşünüyorsunuz: <textarea type="textarea" id="soru3"></textarea><br>
   Yatırım miktarınız nedir: <textarea type="textarea" id="soru4"></textarea><br>
  Eklemek istedikleriniz: <textarea type="textarea" id="soru5"></textarea><br>
  <button onclick ="addForm()">Kaydet</button>
	</article>
			
			
		</div>
	</div>

	<footer id="fh5co-footer">
		<p><small>&copy; İpek Nil Şahin</small></p>
	</footer>


	
	<!-- jQuery -->
	<script src="js/jquery.min.js"></script>
	<!-- jQuery Easing -->
	<script src="js/jquery.easing.1.3.js"></script>
	<!-- Bootstrap -->
	<script src="js/bootstrap.min.js"></script>
	<!-- Waypoints -->
	<script src="js/jquery.waypoints.min.js"></script>
	<!-- Main JS -->
	<script src="js/main.js"></script>
	<script src="custom/addForm.js"> </script>
	

	</body>
</html>

