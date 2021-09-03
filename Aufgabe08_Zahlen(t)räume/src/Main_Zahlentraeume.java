import java.util.Random;
import java.util.Scanner;

public class Main_Zahlentraeume {

	public static void main(String[] args) {
		
		
		Random dice = new Random();
		Scanner scan = new Scanner(System.in);
		
		int randomNum = 1 + dice.nextInt(10);
		int customerNum = 0;

		System.out.println("Please give me a number between 1 and 10");
		
		/*
		//Abfrage via if
		
		if (scan.hasNextInt()) {
			customerNum = scan.nextInt();
			
			if (randomNum == customerNum) {
				System.out.println("Jackpot");
			}
			else if (customerNum == 0) {
				System.out.println("Number cannot be 0");
			}
			else if (customerNum > 10 || customerNum < 0) {
			System.out.println("Number is too high or too low");
			}
			else if (randomNum <= 5 && randomNum >= 0) {
				System.out.println("Number between 1 and 5");
			}
			else if(randomNum >= 6 && randomNum <= 10) {
				System.out.println("Number between 6 and 10");
			}
			else {
				System.out.println("No correct Input");
			};
		}
		else {	
			System.out.println("No currect number!");				
		};
		*/
		
		///*
		//Abfrage via switch
		
		boolean inputb = scan.hasNextInt();
		
		int input = inputb ? 1 : 0;
		
		switch (input) {
		
		case 0:
			System.out.println("No currect Input");
			System.exit(0);
			break;
			
		case 1:
			customerNum = scan.nextInt();
		}
		
		boolean winb = customerNum == randomNum;
		
		int win = winb ? 1 : 0;
		
		switch (win) {
		
		case 0:
			
			switch (customerNum) {
			
			case 0:
				System.out.println("Number cannot be 0");
				break;

			case 1, 2, 3, 4, 5:
				System.out.println("Number between 1 and 5");
				break;
			
			case 6, 7, 8, 9, 10:
				System.out.println("Number between 6 and 10");
				break;
		
			case 11:
				System.out.println("Number is too high or too low");
				break;
			}
			break;
			
		case 1:
			
		System.out.println("Jackpot");
			break;
			
		}
		//*/
		
	}
	
}
