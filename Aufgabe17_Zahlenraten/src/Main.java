import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static void main(String[] args) throws InterruptedException {
        //Guess the number
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        boolean repeatGame = true;
        //Repeat game
        do {
            System.out.println("\nHello and welcome to guess the number!\n---------------------------------------\n");

            int numberRange = 101;

            boolean repeatInput = true;
            //Query number range
            do {
                System.out.println("How big should be the number range?");
                if (scan.hasNextInt()) {
                    numberRange = scan.nextInt();
                    repeatInput = false;

                } else {
                    System.out.println(ANSI_RED + "\n-----------------");
                    System.out.println("No correct input!");
                    System.out.println("-----------------\n\n" + ANSI_RESET);
                    Thread.sleep(300);
                    scan.nextLine();
                }

            } while (repeatInput);

            /*--------------------------------------------------------------------------------------------------------*/

            int randomNumber = random.nextInt(numberRange);
            int inputNumber = 0;
            int trialCounter = 10;
            ArrayList<Integer> pastTips = new ArrayList<>();

            boolean inputCorrect = true;
            //Enter Number
            scan.nextLine();
            do {

                System.out.print("Please enter a number: ");

                if (scan.hasNextInt()) {
                    inputNumber = scan.nextInt();
                    if (inputNumber == randomNumber) {
                        System.out.println(ANSI_GREEN + "\nBOOHOO\n\nYou entered the correct number!\n" + ANSI_RESET);
                        System.out.printf("The number was: %d", randomNumber);
                        inputCorrect = false;
                    } else if (inputNumber < 0 || inputNumber > numberRange) {
                        System.out.println(ANSI_RED + "\nNumber out of range!\n" + ANSI_RESET);
                        trialCounter--;
                    } else if (inputNumber < (randomNumber * 1.2) && inputNumber > randomNumber) {
                        System.out.println(ANSI_RED + "\nThe secret number is little bit smaller!\n" + ANSI_RESET);
                        trialCounter--;
                    } else if (inputNumber > (randomNumber * 0.8) && inputNumber < randomNumber) {
                        System.out.println(ANSI_RED + "\nThe secret number is little bit larger!\n" + ANSI_RESET);
                        trialCounter--;
                    } else if (inputNumber > randomNumber) {
                        System.out.println(ANSI_RED + "\nThe secret number is way smaller!\n" + ANSI_RESET);
                        trialCounter--;
                    } else if (inputNumber < randomNumber) {
                        System.out.println(ANSI_RED + "\nThe secret number is way larger!\n" + ANSI_RESET);
                        trialCounter--;
                    }

                    //Trial Counter
                    pastTips.add(inputNumber);
                    System.out.printf("You have %d tries left.\n", trialCounter);
                    System.out.println("Your past tips:");
                    System.out.print(pastTips + "\n\n");

                    if (trialCounter == 0 && inputNumber != randomNumber) {
                        System.out.println(ANSI_RED + "GAME OVER\n\n" + ANSI_RESET);
                        System.out.printf("The searched number was %d!", randomNumber);
                        inputCorrect = false;
                        Thread.sleep(1000);
                    }

                } else if (scan.hasNext()) {
                    System.out.println(ANSI_RED + "\n-----------------");
                    System.out.println("No correct input!");
                    System.out.println("-----------------\n\n" + ANSI_RESET);
                    Thread.sleep(300);
                    scan.nextLine();
                }

            } while (inputCorrect);

            /*--------------------------------------------------------------------------------------------------------*/

            int gamePlay = 0;

            repeatInput = true;
            //Query play again
            scan.nextLine();
            do {
                System.out.println("Do you want to play again?\t(0 = No | 1 = Yes)");

                if (scan.hasNextInt()) {
                    gamePlay = scan.nextInt();

                    if (gamePlay == 0) {
                        repeatInput = false;
                        repeatGame = false;
                    } else if (gamePlay == 1) {
                        System.out.println(ANSI_GREEN + "Let's play again!\n\n" + ANSI_RESET);
                        Thread.sleep(1500);
                        scan.nextLine();
                        repeatInput = false;
                    } else {
                        System.out.println(ANSI_RED + "\n-----------------");
                        System.out.println("No correct input!");
                        System.out.println("-----------------\n\n" + ANSI_RESET);
                        Thread.sleep(300);
                        scan.nextLine();
                    }

                } else {
                    System.out.println(ANSI_RED + "\n-----------------");
                    System.out.println("No correct input!");
                    System.out.println("-----------------\n\n" + ANSI_RESET);
                    Thread.sleep(300);
                    scan.nextLine();
                }

            } while (repeatInput);
        } while (repeatGame);
    }
}
