
public class Main_AutoFahren {

	public static void main(String[] args) {
	
	int car = 3;
	int driver = 4;
	int passenger = 6; 
	int people;
	int strap;
	
	//1.
	System.out.println("Number of cars: " + car);
	System.out.println("Number of drivers: " + driver);
	System.out.println("Number of passengers: " + passenger);
	
	//2.
	people = driver + passenger;
	System.out.println("There are " + people + " traveling.");
	
	//3.
	strap = car * 5;
	System.out.println("There are " + strap + " straps available.");
	
	//4.
	driver /= car;
	System.out.println("There is " + driver + " driver left.");
	
	//5.
	System.out.println("On average, " + (double)people / (double)car + " people travel with each car.");
	
	}

}
