import java.util.ArrayList;
import java.util.Scanner;

public class PlayerOne {
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static ArrayList oneGame(int randomNumber, int numberRange) throws InterruptedException {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> pastTips = new ArrayList<>();

        int inputNumber = 0;

        boolean inputCorrect = true;
        //Enter Number

        do {
            System.out.print("Please enter a number: ");

            if (scan.hasNextInt()) {
                ArrayList<Integer> lastTwoPastTips = new ArrayList<>();
                inputNumber = scan.nextInt();
                pastTips.add(inputNumber);
                if (inputNumber == randomNumber) {
                    System.out.println(ANSI_GREEN + "\nWOOHOOO\n\nYou entered the correct number!\n" + ANSI_RESET);
                    System.out.printf("The number was: %d", randomNumber);
                    lastTwoPastTips.add(pastTips.get(pastTips.size() - 1));
                    lastTwoPastTips.add(0);
                    return lastTwoPastTips;
                } else if (inputNumber < 0 || inputNumber > numberRange) {
                    System.out.println(ANSI_RED + "\nNumber out of range!\n" + ANSI_RESET);
                } else if (inputNumber < (randomNumber * 1.2) && inputNumber > randomNumber) {
                    System.out.println(ANSI_RED + "\nThe secret number is little bit smaller!\n" + ANSI_RESET);
                    lastTwoPastTips.add(pastTips.get(pastTips.size() - 1));
                    lastTwoPastTips.add(1);
                    return lastTwoPastTips;
                } else if (inputNumber > (randomNumber * 0.8) && inputNumber < randomNumber) {
                    System.out.println(ANSI_RED + "\nThe secret number is little bit larger!\n" + ANSI_RESET);
                    lastTwoPastTips.add(pastTips.get(pastTips.size() - 1));
                    lastTwoPastTips.add(2);
                    return lastTwoPastTips;
                } else if (inputNumber > randomNumber) {
                    System.out.println(ANSI_RED + "\nThe secret number is way smaller!\n" + ANSI_RESET);
                    lastTwoPastTips.add(pastTips.get(pastTips.size() - 1));
                    lastTwoPastTips.add(3);
                    return lastTwoPastTips;
                } else if (inputNumber < randomNumber) {
                    System.out.println(ANSI_RED + "\nThe secret number is way larger!\n" + ANSI_RESET);
                    lastTwoPastTips.add(pastTips.get(pastTips.size() - 1));
                    lastTwoPastTips.add(4);
                    return lastTwoPastTips;
                }

            } else if (scan.hasNext()) {
                System.out.println(ANSI_RED + "\n-----------------");
                System.out.println("No correct input!");
                System.out.println("-----------------\n\n" + ANSI_RESET);
                Thread.sleep(300);
                scan.nextLine();
            }

        } while (inputCorrect);

        System.out.println("return pastTips PlayerOne KEINE AHNUNG");  //Helping Line
        return pastTips;
    }
}
