import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class formCar {

	public static void main(String[] args) {
		welcome();
		if (filterSortMenu () <= 6 )
		{
			System.out.println("OK");
		}
		else if (filterSortMenu () > 6 )
		{
			System.out.println("OK2");
		}
		else
		{
			System.out.println("Wrong Number");
		}

	}
	public static void welcome()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Search Car");
		System.out.println("Program use JAVA LIST");
		System.out.println("Create by Maternicki Patryk");
		System.out.println("Indeks: s14216");
		System.out.println("Please, write nametag Car");
		String nameTagCar = input.nextLine();
		System.out.println("Please write a prize");
		float prize = input.nextFloat();
		System.out.println("Please write year Car");
		int year = input.nextInt();
		System.out.println("Please write how much miles cars drove");
		float kmCar = input.nextFloat();
		System.out.println("Please write date off add Car");
		String dateAddCar = input.nextLine();
		Car car1 = new Car(prize, nameTagCar, dateAddCar, year, kmCar);
		Car car2 = new Car(90000, "BMW", "12.10.2013", 6, 1000000);
		Car car3 = new Car(90000, "BMW", "12.10.2013", 6, 1000000);
		List<Car> carList = new ArrayList<Car>();
		carList.add(car1);
		carList.add(car2);
		carList.add(car3);
		System.out.println(carList.get(0).getPrize());
	}
	public static int filterSortMenu ()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("----MENU---");
		System.out.println("Filters");
		System.out.println("1. Prize");
		System.out.println("2. NameTag");
		System.out.println("3. date Add Car");
		System.out.println("4. Year Car");
		System.out.println("6. How much miles cars drove ");
		System.out.println("Sorts");
		System.out.println("7.Prize");
		System.out.println("8.Year Car");
		System.out.println("9.date of add Car");
		System.out.println("---------");
		int number = input.nextInt();
		return number;
	}
	
	}
