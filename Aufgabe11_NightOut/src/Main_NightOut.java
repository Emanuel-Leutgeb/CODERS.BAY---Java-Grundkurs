import java.util.Scanner;

public class Main_NightOut {

	public static void main(String[] args) throws InterruptedException {
		
		Scanner scan = new Scanner(System.in);
		
		//What kind of Drinks?
		int glass = 0;
		String sel = "X";
		int drinks = 0;
		boolean repeat = true;
		
		System.out.println("Hello! Welcome to Nights Out!");
		System.out.println("What did you want to Drink??");
		/*
		while (repeat) {
			
			System.out.println("Beer (B) or White wine splash (W)?");
			
			sel = scan.nextLine();
			
			if (sel.equals("B")) {		
				System.out.println("Enjoy your Drink.");
				repeat = false;				
			}			
			else if (sel.equals("W")) {
				System.out.println("Enjoy your Drink.");
				repeat = false;
			}
			else {	
				System.out.println("-----------------");
				System.out.println("No currect input!");
				System.out.println("-----------------");
				System.out.println();
				Thread.sleep(300);
			}				
		}
	
		repeat = true;
		System.out.println();
		Thread.sleep(1000);
		
		//How much Drinks?
		while (repeat) {
			
			System.out.println("How much did you drink today?");
			
			if (scan.hasNextInt()) {		
				repeat = false;
				drinks = scan.nextInt();
				System.out.println();
			}
			else if (repeat = scan.hasNext()) {
				repeat = true;
				System.out.println();
				System.out.println("-----------------");
				System.out.println("No currect input!");
				System.out.println("-----------------");
				System.out.println();
				Thread.sleep(300);
				scan.nextLine();
			}
		}
		*/
		/*
		 * Nr.01
		 * =250ml voll
		 * >250ml nicht mehr voll
		 * >20ml kellner
		 */
		
		//Glass progress.(ml)
		int[] glassProgress = new int[3];
		glassProgress[0] = 250;
		glassProgress[1] = 249;
		glassProgress[2] = 20;
		
		for (int i = 0; i <= drinks; i ++) {
			for (int j = 250; j >= 0; j --) {
				if (j == glassProgress[0]) {
					System.out.println("Your glass is full!");
				}
				else if (j == glassProgress[1]) {
					System.out.println("Your glass is not full");	
				}
				else if (j < glassProgress[1] && j > glassProgress[1] -30) {
					System.out.print(".");
					Thread.sleep(300);
					System.out.print(".");
					Thread.sleep(300);
					System.out.print(".");
					Thread.sleep(300);
					System.out.print("\b\b\b\b\b\b\b");


				}
				else if (j == glassProgress[2]){
					System.out.println("Hey Waiter!");
					System.out.println("Please bring me a new glass");
				}
			}
		}
	}
}
