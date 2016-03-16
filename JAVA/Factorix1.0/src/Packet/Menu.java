
package Packet;
import java.util.Scanner;
public class Menu {


	
	
	public static void main(String[] args) {
	
	do
	{
		welcomeMenu();
	}
	while (welcomeMenu() == true);
	}
	public static boolean welcomeMenu ()
	{
	
		Scanner input = new Scanner(System.in);
		System.out.println("BankJavs");
		System.out.println("Twórca: Maternicki Patryk");
		System.out.println("indeks:s14216");
		System.out.println("Podaj dane klienta");
		System.out.println("Podaj imie");
		String firstName = input.nextLine();
		System.out.println("Podaj nazwisko");
		String surName = input.nextLine();
		if (!validatePersonal(firstName,surName))
		{
			do
			{
		
			errorLog(0);
			System.out.println("Podaj imie");
			firstName = input.nextLine();
			System.out.println("Podaj nazwisko");
			surName = input.nextLine();
			validatePersonal(firstName, surName);
			}while(!validatePersonal(firstName, surName));
		}
		System.out.println("Podaj pesel");
		String pesel = input.nextLine();
		System.out.println("Podaj date urodzenia");
		String dateOfBirth = input.nextLine();
		System.out.println("Podaj swoja plec");
		System.out.println("1,3,5,7,9 - męska");
		System.out.println("0,2,4,6,8- - damska");
			String gender = input.nextLine();
			if ( !validateDateOfBirth(pesel, dateOfBirth))
			{
			do 
			{
				errorLog(1);
				System.out.println("Podaj pesel");
				pesel = input.nextLine();
				System.out.println("Podaj date urodzenia");
				dateOfBirth = input.nextLine();
				validateDateOfBirth(pesel, dateOfBirth);
			}
			while (!validateDateOfBirth(pesel, dateOfBirth));
		}
			if (!validateGender(pesel,gender))
				do{
			{
			errorLog(2);
			System.out.println("Podaj plec");
			System.out.println("1,3,5,7,9 - męska");
			System.out.println("0,2,4,6,8- - damska");
			gender = input.nextLine();
			}

		}
				while(!validateGender(pesel,gender));
			System.out.println("Podaj nip");
			String nip = input.nextLine();
			System.out.println("Podaj konto bankowe");
			String bankAccount = input.nextLine();
		System.out.println("Twoje podane dane");
		System.out.println("Imię: " + firstName);
		System.out.println("Nazwisko: " + surName);
		System.out.println("PESEL: " + pesel);
		System.out.println("Data urodzenia: " + dateOfBirth);
		System.out.println("NIP: "+ nip);
		System.out.println("Konto bankowe: " + bankAccount);
		System.out.println("Plec" + gender);
		System.out.println("Czy chcesz powtórzyć program?");
		String Char = input.nextLine();
		if (Char == "T" || Char =="t")
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
	public static boolean validatePersonal (String paramName, String paramSurName){
	String lengthName = new String (paramName);
	String lengthSurName = new String (paramSurName);
	if (lengthName.length() == 0 || lengthSurName.length() == 0 )
	{
		
		return false;
		
	}
	else if (lengthName.length() < 2 || lengthSurName.length() < 2)
	{
		errorLog(3);
		return false;
		
	}
	else
	{
		String numAndSpecialChar = "!@#$%^&*()_+-=<>/?;:[]{}123456789";
		if (lengthName.startsWith(numAndSpecialChar) || lengthSurName.startsWith(numAndSpecialChar))
		{
		errorLog(4);
		return false;
		}
		else
		{
		return true;
		}
	}
}
	public static boolean validateDateOfBirth (String paramPesel, String paramDate)
	{
		String findString = new String(paramPesel);
		if (findString.startsWith(paramDate) )
		{
			return true;
		}
		else
			
			
		{
			return false;
		}
	
	}
	public static boolean validateGender (String paramPesel, String paramGender)
	{
		String cuttingString = new String(paramPesel);
		String cutString = (cuttingString.substring(6,10));
		String findString = new String (cutString);
			if (findString.startsWith(paramGender))
			{
			return true;
			}
			else
			{
				return false;
			}
			
	}
	public static void errorLog (int paramError)
	{
		switch (paramError)
		{
		case 0:
		{
			System.out.println("Brak imienia lub nazwiska");
			break;
		}
		case 1:
		{
			System.out.println("Podałeś zły wiek lub pesel");
			break;
		}
		case 2:
		{
			System.out.println("Plec sie nie zgadza");
			break;
		}
		case 3:
		{
			System.out.println("Nazwisko lub Imie jest za krotkie");
			break;
		}
		case 4:
		{
			System.out.println("Nazwisko lub imie posiada znaki specjalne");
			break;
		}
		}
	}
	
}
