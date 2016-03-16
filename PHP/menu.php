// Baza danych 
<?php>

	$ID= $_POST ['ID']; //Nadawanie wartosci zmiennej ID z strumienia wejsciowego id
	
	
?>	
	<!DOCTYPE html>												<!-- Deklaracja rodzaju dokumentu -->
		<html>													<!-- Otwieranie naglowka Html -->
			<head>												<!-- Otwieranie elementu HTML Head -->
				<meta charset="UTF-8">							<!-- Deklarowanie jezyka kodowania UTF-8 -->
				<link href="patrykstyl.css" rel="stylesheet" >	<!-- Deklarowanie imporstu CSS z pliku patrykstyl -->

			</head>												<!-- Zamknięcie nagłówka Head -->
				<body>											<!-- Otwieranie nagłówka body -->
				<br>											<!--ENTER -->
				<br>
				<br>
				<br>
				<br>
				<br>
					<?php 
						if ($ID == 1) {								// Sprawdzenie warunku z strumieniem wejsciowym ID, jesli ma wartosc 1 moze isc dalej
							
							$GodzinyPracy= 80+$DodatkoweGodziny;	// Jesli tak, to niech stworzy kolejna zmienna godziny pracy, ktora bedzie suma stalejliczby i dodatkowych godzin
							$ObecneGodziny=80;						// Jesli tak, to niech stworzy zmienna obecnegodziny i nada wartosc 80;
							$MaxGodzin=160;							// Jeslli tak, to niech stworzy zmienna maxgodzin i nada wartosc 160;
							Define ('Imie', Mieczyslaw);			// Jesli tak to niech zadeklaruje zmienna stala Imie o wartosci Imie
							Define ('Nazwisko', Raczka);			// jesli tak to niech zadeklaruje zmienna stala Nazwisko o wartosci Raczka;
							Define ('Lat' , 43);					// Jesli tak to niech zadeklaruje zmienna stala lat o wartosci 43
							Define ('MiejscePracy', SITO.SA);		// Jeśli tak, to niech zadeklaruje zmienna stala MiejscePracy o watyosci SITO.SA
								
								echo "<div id='ramka1'>";
								echo "<br>";
								echo "$ID";
								echo "<br>";
								echo Imie;
								echo "<br>";
								echo Nazwisko;
								echo "<br>";
								echo Lat;
								echo "<br>";
								echo MiejscePracy;
								echo "<br>";
								echo "Ilosc przepracowanych godzin: ' $GodzinyPracy '. ";
								echo "<form action='menu.php' method='post' />";
								echo "<br>";
								echo "Dodaj godziny pracy";
								echo "<input type='text' name='godziny' />";
								echo "<input type='submit' value='dodaj' />";
								echo "</form>";
								echo"</div>";
								
								
									$DodatkoweGodziny = $_POST['godziny'];
									$ProcentGodzin= 	(	(	(80+$DodatkoweGodziny)/$MaxGodzin)*100)/100;
							
								}
								
									if ($ID == 2) {
												
													$GodzinyPracy= 20+$DodatkoweGodziny;
													$MaxGodzin=160;
													$ObecneGodziny=20;
													Define ('Imie', Daniel);
													Define ('Nazwisko', Kasprewicz);
													Define ('Lat' , 23);
													Define ('MiejscePracy', MadKom);
								
														echo "<div id='ramka1'>";
														echo "<br>";
														echo "$ID";
														echo "<br>";
														echo Imie;
														echo "<br>";
														echo Nazwisko;
														echo "<br>";
														echo Lat;
														echo "<br>";
														echo MiejscePracy;
														echo "<br>";
														echo "Ilosc przepracowanych godzin: ' $GodzinyPracy '. ";
														echo "<form action='menu.php' method='post' />";
														echo "<br>";
														echo "Dodaj godziny pracy";
														echo "<input type='text' name='godziny' />";
														echo "<input type='submit' value='dodaj' />";
														echo "</form>";
														echo"</div>";
								
								
														$DodatkoweGodziny = $_POST['godziny'];
														$ProcentGodzin= 	(	(	(20+$DodatkoweGodziny)/$MaxGodzin)*100)/100;
														$signal=1;
											}
											
											if ($ID == 3) {
																$GodzinyPracy= 40+$DodatkoweGodziny;
																$MaxGodzin=160;
																$ObecneGodziny=40;
																Define ('Imie', Marcin);
																Define ('Nazwisko', Dyszkant);
																Define ('Lat' , 33);
																Define ('MiejscePracy', MadKom);
								
																	echo "<div id=ramka1'>";
																	echo "<br>";
																	echo "$ID";
																	echo "<br>";
																	echo Imie;
																	echo "<br>";
																	echo Nazwisko;
																	echo "<br>";
																	echo Lat;
																	echo "<br>";
																	echo MiejscePracy;
																	echo "<br>";
																	echo "Ilosc przepracowanych godzin: ' $GodzinyPracy '. ";
																	echo "<form action='menu.php' method='post' />";
																	echo "<br>";
																	echo "Dodaj godziny pracy";
																	echo "<input type='text' name='godziny' />";
																	echo "<input type='submit' value='dodaj' />";
																	echo "</form>";
																	echo"</div>";
								
																		$DodatkoweGodziny = $_POST['godziny'];
																		$ProcentGodzin= 	(	(	(40+$DodatkoweGodziny)/$MaxGodzin)*100)/100;
															
							}
					
					?>	
				</body>
	</html>
							
							