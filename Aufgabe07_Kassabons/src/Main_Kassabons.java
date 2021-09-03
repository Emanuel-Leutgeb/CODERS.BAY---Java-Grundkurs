import java.util.Scanner;

public class Main_Kassabons {

	public static void main(String[] args) {
		//Usereingabe erstellen
		Scanner scan = new Scanner(System.in);
		
		//Erstellung Stückzahl
		int pis1;
		int pis2;
		int pis3;
		int pis4;
		
		//Erstellung der Brieftasche (Geld)
		double money;
		
		//Abfragen vom User
		System.out.println("How much money did you have?:");
		money = scan.nextInt();
		
		System.out.println("How much Sausage(s) did you buy?:");
		pis1 = scan.nextInt();
		
		System.out.println("How much Cheese(s) did you buy?:");
		pis2 = scan.nextInt();
		
		System.out.println("How much Bread(s) did you buy?:");
		pis3 = scan.nextInt();
		
		System.out.println("How much DVD(s) did you buy?:");
		pis4 = scan.nextInt();
		
		System.out.println();
		System.out.println();
		
		//Erstellung der Produkte
		String prod1 = "Sausages(s)";
		String prod2 = "Cheese(s)";
		String prod3 = "Bread(s)";
		String prod4 = "DVD(s)";
		
		//Erstellung der Produktpreise
		double prodP1 = 4.20;
		double prodP2 = 2.30;
		double prodP3 = 2.11;
		double prodP4 = 12.00;
		
		//Erstellung Gesamtpreises
		double res1 = pis1 * prodP1;
		double res2 = pis2 * prodP2;
		double res3 = pis3 * prodP3;
		double res4 = pis4 * prodP4;
		
		//Erstellung Summe Einkauf
		double sum = (res1 + res2 + res3 + res4);

	
		//Ausgabe Kassabon
		System.out.format("%-12s %4d x %6.2f EUR \n", prod1, pis1, prodP1);
		System.out.printf("\t\t %19.2f EUR\n", res1);
		
		System.out.format("%-12s %4d x %6.2f EUR \n", prod2, pis2, prodP2);
		System.out.printf("\t\t %19.2f EUR", res2);
		System.out.println();
		
		System.out.format("%-12s %4d x %6.2f EUR \n", prod3, pis3, prodP3);
		System.out.printf("\t\t %19.2f EUR", res3);
		System.out.println();
		
		System.out.format("%-12s %4d x %6.2f EUR \n", prod4, pis4, prodP4);
		System.out.printf("\t\t %19.2f EUR", res4);
		System.out.println();
		
		System.out.println("----------------------------------------");
		
		System.out.printf("Total\t\t %19.2f EUR", sum);
		System.out.println();
		System.out.printf("Given\t\t %19.2f EUR", money);

		System.out.println();
		System.out.println();
		
		//Abfage Restgeld
		if(money > sum) {
			System.out.printf("Back\t\t %19.2f EUR \n\n", (money - sum));
			System.out.println("Thanks for your purchase");
		}
		else {
			System.out.println("Not enough Money!");
			System.out.format("Please insert the amount of %6.2f EUR", (money - sum));
		}
			
	}

}
