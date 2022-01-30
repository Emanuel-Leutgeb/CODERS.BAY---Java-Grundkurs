import java.util.ArrayList;
import java.util.Random;

public class PlayerCom {
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static int comGame(int randomNumber, int numberRange, int KIMode, int inputNumber, int firstRoundtoArray) throws InterruptedException {
        Random random = new Random();
        int computerNumber;


        switch (KIMode) {

            case 0:
                //First Game
                System.out.println("Mode0 - First Game Computer");
                computerNumber = random.nextInt(NumberArray.numberArray(numberRange, firstRoundtoArray).size());

                if (computerNumber == randomNumber) {
                    System.out.println(ANSI_GREEN + "\nBOOHOO\n\nComputer entered the correct number!\n" + ANSI_RESET);
                    System.out.printf("The number was: %d\n", randomNumber);
                    return 0;
                } else if (computerNumber < (int)(randomNumber * 1.2) && computerNumber > randomNumber) {
                    System.out.println(ANSI_RED + "\nComputer! The secret number is little bit smaller!\n" + ANSI_RESET);
                    for (int i = computerNumber; i < (NumberArray.numberArray(numberRange, firstRoundtoArray).size()); i++){
                        NumberArray.numberArray(numberRange, firstRoundtoArray).remove(i);
                    }

                    for (int i = (int)(computerNumber * 0.8); i >= 0; i--){
                        NumberArray.numberArray(numberRange, firstRoundtoArray).remove(i);
                    }

                } else if (computerNumber > (int)(randomNumber * 0.8) && computerNumber < randomNumber) {
                    System.out.println(ANSI_RED + "\nComputer! The secret number is little bit larger!\n" + ANSI_RESET);
                    for (int i = computerNumber; i >= 0; i--){
                        NumberArray.numberArray(numberRange, firstRoundtoArray).remove(i);
                    }

                    for (int i = (int)(computerNumber * 1.2); i < (NumberArray.numberArray(numberRange, firstRoundtoArray).size()); i++){
                        NumberArray.numberArray(numberRange, firstRoundtoArray).remove(i);
                    }

                } else if (computerNumber > randomNumber) {
                    System.out.println(ANSI_RED + "\nComputer! The secret number is way smaller!\n" + ANSI_RESET);
                    for (int i = (NumberArray.numberArray(numberRange, firstRoundtoArray).size()) - 1; i >= computerNumber; i--){
                        NumberArray.numberArray(numberRange, firstRoundtoArray).remove(i);
                    }
                } else if (computerNumber < randomNumber) {
                    System.out.println(ANSI_RED + "\nComputer! The secret number is way larger!\n" + ANSI_RESET);
                    for (int i = 0; i <= ((computerNumber - (NumberArray.numberArray(numberRange, firstRoundtoArray).size())) + (NumberArray.numberArray(numberRange, firstRoundtoArray).size())); i++) {
                        NumberArray.numberArray(numberRange, firstRoundtoArray).remove(0);
                    }
                }
                System.out.println(computerNumber);
                for (int i = 0; i < (NumberArray.numberArray(numberRange, firstRoundtoArray).size()); i++) {
                    System.out.println(NumberArray.numberArray(numberRange, firstRoundtoArray).get(i));
                }
                return 10;
/*
            case 1:
                //Mode One - little bit smaller (20%)
                System.out.println("Mode1");
                computerNumber = randomNumber - 1 - random.nextInt((int) (randomNumber * 0.2));

                if (computerNumber == randomNumber) {
                    System.out.println(ANSI_GREEN + "\nBOOHOO\n\nComputer entered the correct number!\n" + ANSI_RESET);
                    System.out.printf("The number was: %d\n", randomNumber);
                    return 10000;
                } else if (computerNumber < (randomNumber * 1.2) && computerNumber > randomNumber) {
                    System.out.println(ANSI_RED + "\nComputer! The secret number is little bit smaller!\n" + ANSI_RESET);
                } else if (computerNumber > (randomNumber * 0.8) && computerNumber < randomNumber) {
                    System.out.println(ANSI_RED + "\nComputer! The secret number is little bit larger!\n" + ANSI_RESET);
                } else if (computerNumber > randomNumber) {
                    System.out.println(ANSI_RED + "\nComputer! The secret number is way smaller!\n" + ANSI_RESET);
                } else if (computerNumber < randomNumber) {
                    System.out.println(ANSI_RED + "\nComputer! The secret number is way larger!\n" + ANSI_RESET);
                }
                System.out.println(computerNumber);
                return 10;

            case 2:
                //Mode Two - little bit larger (20%)
                System.out.println("Mode2");
                computerNumber = random.nextInt((int) (randomNumber * 0.2)) + 1 + randomNumber;
                if (computerNumber == randomNumber) {
                    System.out.println(ANSI_GREEN + "\nBOOHOO\n\nComputer entered the correct number!\n" + ANSI_RESET);
                    System.out.printf("The number was: %d\n", randomNumber);
                    return 10000;
                } else if (computerNumber < (randomNumber * 1.2) && computerNumber > randomNumber) {
                    System.out.println(ANSI_RED + "\nComputer! The secret number is little bit smaller!\n" + ANSI_RESET);
                } else if (computerNumber > (randomNumber * 0.8) && computerNumber < randomNumber) {
                    System.out.println(ANSI_RED + "\nComputer! The secret number is little bit larger!\n" + ANSI_RESET);
                } else if (computerNumber > randomNumber) {
                    System.out.println(ANSI_RED + "\nComputer! The secret number is way smaller!\n" + ANSI_RESET);
                } else if (computerNumber < randomNumber) {
                    System.out.println(ANSI_RED + "\nComputer! The secret number is way larger!\n" + ANSI_RESET);
                }
                System.out.println(computerNumber);
                return 10;

            case 3:
                //Mode Three - way smaller
                System.out.println("Mode3");
                computerNumber = random.nextInt(inputNumber);

                if (computerNumber == randomNumber) {
                    System.out.println(ANSI_GREEN + "\nBOOHOO\n\nComputer entered the correct number!\n" + ANSI_RESET);
                    System.out.printf("The number was: %d\n", randomNumber);
                    return 10000;
                } else if (computerNumber < (randomNumber * 1.2) && computerNumber > randomNumber) {
                    System.out.println(ANSI_RED + "\nComputer! The secret number is little bit smaller!\n" + ANSI_RESET);
                } else if (computerNumber > (randomNumber * 0.8) && computerNumber < randomNumber) {
                    System.out.println(ANSI_RED + "\nComputer! The secret number is little bit larger!\n" + ANSI_RESET);
                } else if (computerNumber > randomNumber) {
                    System.out.println(ANSI_RED + "\nComputer! The secret number is way smaller!\n" + ANSI_RESET);
                } else if (computerNumber < randomNumber) {
                    System.out.println(ANSI_RED + "\nComputer! The secret number is way larger!\n" + ANSI_RESET);
                }
                System.out.println(computerNumber);
                return 10;

            case 4:
                //Mode Four - way larger
                System.out.println("Mode4");
                computerNumber = random.nextInt((numberRange - inputNumber) + inputNumber + 1);
                if (computerNumber == randomNumber) {
                    System.out.println(ANSI_GREEN + "\nBOOHOO\n\nComputer entered the correct number!\n" + ANSI_RESET);
                    System.out.printf("The number was: %d\n", randomNumber);
                    return 10000;
                } else if (computerNumber < (randomNumber * 1.2) && computerNumber > randomNumber) {
                    System.out.println(ANSI_RED + "\nComputer! The secret number is little bit smaller!\n" + ANSI_RESET);
                } else if (computerNumber > (randomNumber * 0.8) && computerNumber < randomNumber) {
                    System.out.println(ANSI_RED + "\nComputer! The secret number is little bit larger!\n" + ANSI_RESET);
                } else if (computerNumber > randomNumber) {
                    System.out.println(ANSI_RED + "\nComputer! The secret number is way smaller!\n" + ANSI_RESET);
                } else if (computerNumber < randomNumber) {
                    System.out.println(ANSI_RED + "\nComputer! The secret number is way larger!\n" + ANSI_RESET);
                }
                System.out.println(computerNumber);
                return 10;
*/
            default:
                System.out.println("PlayerCom - Switch selector default!");
        }
        System.out.println("return 10 PlayerCom");  //Helping Line
        return 10;
    }
}
