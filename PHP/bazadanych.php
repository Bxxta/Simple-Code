// web aplikacja weryfikujaca zgodnosc danych

<?php

	$Imie= $_POST['Imie'];       	// Deklaracja zmiennej IMIE oraz nadanie jej wartosci z strumienia wejsciowego 'Imie'
	$Nazwisko=$_POST['Nazwisko'];  // Deklaracja zmiennej Nazwisko oraz nadanie jej wartosci z struminia wejsciowego 'Nazwisko'
	
?>

	<!DOCTYPE html>												<!-- Deklaracja rodzaju dokumentu -->
		<html>													<!-- Otwieranie naglowka Html -->
			<head>												<!-- Otwieranie elementu HTML Head -->
				<meta charset="UTF-8">							<!-- Deklarowanie jezyka kodowania UTF-8 -->		
				<link href="patrykstyl.css" rel="stylesheet" >	<!-- Deklarowanie importu CSS z pliku patrykstyl -->
			</head>												<!-- Zamknięcie nagłówka Head -->
				<body>											<!-- Otwieranie nagłówka body -->
				<br>											<!--ENTER -->
				<br>
				<br>
				<br>
				<br>
				<br>
					<div id="ramka1">						<!-- Otwieranie ramki -->					
						
						<?php
							if( ($Imie === Patryk) && ($Nazwisko === Maternicki) ){ //Sprawdzanie zgonosci strumieni wejsciowych
								
								echo "<form action='id.html' method='post'>";					//jesli tak, deklarujemy wejscie danych do pliku id.html
								echo "<div class='ramka2'>";									// Otwieranie ramki
								echo "Zalogowanie przebieglo poprawnie";						// Potwierdzenia powyzszego warunku
								echo "<input type='submit' value='przejdz do bazy danych'/>";	// Przycisk potwierdzajacy przejscie na nastepna podstrone
								echo "</div>";
								echo "</form>";
							}	
								else
									echo "ACCESS DENIED";										//Jesli nie, to nie mamy dostepu						
						?>

					</div>			
				</body>				
</html>	
		

