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
            System.out.println("\nHello and welcome to guess the number!\nThis Time you will Play against the Computer---------------------------------------\n");

            int numberRange = 0;

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
            int gameWinner;
randomNumber = 10;
            boolean firstPlayer = random.nextBoolean();
            if (firstPlayer) {
                System.out.println("You will start to Play");
                gameWinner = KISelector.modeSelector(randomNumber, numberRange, 0);
            } else {
                System.out.println("Computer will start to Play");
                gameWinner = KISelector.modeSelector(randomNumber, numberRange, 1);
            }
            System.out.println("before gameWinner Switch - MAIN");  //Helping Line
            switch (gameWinner) {
                case 0:
                    System.out.println("The Player Win the Game");
                    break;
                case 1:
                    System.out.println("The Computer Win the Game");
                    break;
                default:
                    System.out.println("MAIN - Switch selector default!");
            }

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
