import java.util.Scanner;

public class Main_Festival {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//Person
		byte age = 0;
		
		//Festival bracelet
		boolean green;	//über 18 
		boolean yellow;	//unter 18
		boolean red;	//Begleitperson 
		boolean gold;	//VIP
		
		//Abfragen
		System.out.println("How old are you?");
		if (scan.hasNextInt()) {	
			age = scan.nextByte();
		}
		
		else {			
			System.out.println("No currect input!");
			
			System.exit(0);
		};
		
		//Erweiterte Abfrage Alter
		if (age >= 18) {		
			System.out.println("You have a green bracelet!");
			green = true;
		}
		
		else if (age <= 18 && age >= 16) {
			yellow = true;
		}
		
		else if (age <= 15 && age >= 4) {
			System.out.println("Are your Parents with you? (Y/N)");
			String ans2 = scan.next();
			
			if (ans2.equals("Y")) {		
				red = true;
				System.out.println("You have a red bracelet!");
			}
			else if (ans2.equals("N")) {
				red = false;
				System.out.println("You are terminated");
				System.exit(0);
			}
			else {
				System.out.println("No currect input!");
				System.out.println("You are terminated");
				System.exit(0);
			};
		}
		else if (age <= 3) {
			System.out.println("You are terminated");
			System.exit(0);
		}
		
		//Zusätzliche Abfrage VIP
		System.out.println("Are you an VIP? (Y/N)");
		String ans1 = scan.next();
		if (ans1.equals("Y")) {		
			gold = true;
			System.out.println("You have a second gold bracelet!");
			System.out.println("Have fun!");
		}
		else if (ans1.equals("N")) {
			gold = false;
			System.out.println("Have fun!");
		}
		else {
			System.out.println("No currect input!");
			System.out.println("You are terminated");
			System.exit(0);
		}	
		
	}

}
