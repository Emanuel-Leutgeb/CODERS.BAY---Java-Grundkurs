import java.util.ArrayList;
import java.util.Random;

public class PlayerCom {
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static int randomNumber;
    public static boolean[] selectedNumbers;

    public static void setter(int rangeSetter, int randomSetter) {
        randomNumber = randomSetter;
        selectedNumbers = new boolean[rangeSetter];
        for (int i = 0; i < rangeSetter; i++){
            selectedNumbers[i] = true;
        }
    }

    public static int comGame(int KIMode, int inputNumberPlayerOne) throws InterruptedException {
        Random random = new Random(selectedNumbers.length);

        /*------------------------------------------------------------------------------------------------------------*/

        int computerNumber = 0;
        ArrayList<Integer> leftNumbers = new ArrayList<>();

        /*------------------------------------------------------------------------------------------------------------*/

        switch (KIMode) {
            case 0:
                //First Game
                /*----------------------------------------------------------------------------------------------------*/

                //Random Number Generator - First Game 50%
                computerNumber = (selectedNumbers.length / 2);

                /*----------------------------------------------------------------------------------------------------*/

                if (computerNumber == randomNumber) {
                    System.out.println(ANSI_GREEN + "\nBOOHOO\n\nComputer entered the correct number!\n" + ANSI_RESET);
                    System.out.printf("The number was: %d\n", randomNumber);
                    return 99;

                } else if (computerNumber < (int)(randomNumber * 1.2) && computerNumber > randomNumber) {
                    System.out.println(ANSI_RED + "\nComputer! The secret number is little smaller!\n" + ANSI_RESET);
                    for (int i = computerNumber; i < (selectedNumbers.length); i++){
                        selectedNumbers[i] = false;
                    }

                    for (int i = (int)(computerNumber * 0.8) - 1; i >= 0; i--){
                        selectedNumbers[i] = false;
                    }

                } else if (computerNumber > (int)(randomNumber * 0.8) && computerNumber < randomNumber) {
                    System.out.println(ANSI_RED + "\nComputer! The secret number is little larger!\n" + ANSI_RESET);
                    for (int i = computerNumber; i >= 0; i--){
                        selectedNumbers[i] = false;
                    }

                    for (int i = (int)(computerNumber * 1.2) + 1; i < (selectedNumbers.length); i++){
                        selectedNumbers[i] = false;
                    }

                } else if (computerNumber > randomNumber) {
                    System.out.println(ANSI_RED + "\nComputer! The secret number is way smaller!\n" + ANSI_RESET);
                    for (int i = (selectedNumbers.length) - 1; i >= computerNumber; i--){
                        selectedNumbers[i] = false;
                    }
                } else if (computerNumber < randomNumber) {
                    System.out.println(ANSI_RED + "\nComputer! The secret number is way larger!\n" + ANSI_RESET);
                    for (int i = 0; i <= ((computerNumber - (selectedNumbers.length)) + (selectedNumbers.length)); i++) {
                        selectedNumbers[i] = false;
                    }
                }

                return 10;

            /*--------------------------------------------------------------------------------------------------------*/

            case 1:
                //Mode One - little smaller (20%)
                /*----------------------------------------------------------------------------------------------------*/

                //Setting KI Mode to little smaller
                for (int i = inputNumberPlayerOne; i < (selectedNumbers.length); i++){
                    selectedNumbers[i] = false;
                }

                for (int i = (int)(inputNumberPlayerOne * 0.8) - 1; i >= 0; i--){
                    selectedNumbers[i] = false;
                }

                /*----------------------------------------------------------------------------------------------------*/

                //Random Number Generator
                for(int i = 0; i < selectedNumbers.length; i++){
                    if (selectedNumbers[i]){

                        leftNumbers.add(i);

                        computerNumber = random.nextInt(leftNumbers.size());
                    }
                }
                computerNumber = leftNumbers.get(computerNumber);

                /*----------------------------------------------------------------------------------------------------*/

                if (computerNumber == randomNumber) {
                    System.out.println(ANSI_GREEN + "\nBOOHOO\n\nComputer entered the correct number!\n" + ANSI_RESET);
                    System.out.printf("The number was: %d\n", randomNumber);
                    return 99;

                } else if (computerNumber < (int)(randomNumber * 1.2) && computerNumber > randomNumber) {
                    System.out.println(ANSI_RED + "\nComputer! The secret number is little smaller!\n" + ANSI_RESET);
                    for (int i = computerNumber; i < (selectedNumbers.length); i++){
                        selectedNumbers[i] = false;
                    }

                    for (int i = (int)(computerNumber * 0.8) - 1; i >= 0; i--){
                        selectedNumbers[i] = false;
                    }

                } else if (computerNumber > (int)(randomNumber * 0.8) && computerNumber < randomNumber) {
                    System.out.println(ANSI_RED + "\nComputer! The secret number is little larger!\n" + ANSI_RESET);
                    for (int i = computerNumber; i >= 0; i--){
                        selectedNumbers[i] = false;
                    }

                    for (int i = (int)(computerNumber * 1.2) + 1; i < (selectedNumbers.length); i++){
                        selectedNumbers[i] = false;
                    }

                } else if (computerNumber > randomNumber) {
                    System.out.println(ANSI_RED + "\nComputer! The secret number is way smaller!\n" + ANSI_RESET);
                    for (int i = (selectedNumbers.length) - 1; i >= computerNumber; i--){
                        selectedNumbers[i] = false;
                    }
                } else if (computerNumber < randomNumber) {
                    System.out.println(ANSI_RED + "\nComputer! The secret number is way larger!\n" + ANSI_RESET);
                    for (int i = 0; i <= ((computerNumber - (selectedNumbers.length)) + (selectedNumbers.length)); i++) {
                        selectedNumbers[i] = false;
                    }
                }

                return 10;

            case 2:
                //Mode Two - little larger (20%)
                /*----------------------------------------------------------------------------------------------------*/

                //Setting KI Mode to little larger
                for (int i = inputNumberPlayerOne; i >= 0; i--){
                    selectedNumbers[i] = false;
                }

                for (int i = (int)(inputNumberPlayerOne * 1.2) + 1; i < (selectedNumbers.length); i++){
                    selectedNumbers[i] = false;
                }

                /*----------------------------------------------------------------------------------------------------*/

                //Random Number Generator
                for(int i = 0; i < selectedNumbers.length; i++){
                    if (selectedNumbers[i]){

                        leftNumbers.add(i);

                        computerNumber = random.nextInt(leftNumbers.size());
                    }
                }
                computerNumber = leftNumbers.get(computerNumber);

                /*----------------------------------------------------------------------------------------------------*/

                if (computerNumber == randomNumber) {
                    System.out.println(ANSI_GREEN + "\nBOOHOO\n\nComputer entered the correct number!\n" + ANSI_RESET);
                    System.out.printf("The number was: %d\n", randomNumber);
                    return 99;

                } else if (computerNumber < (int)(randomNumber * 1.2) && computerNumber > randomNumber) {
                    System.out.println(ANSI_RED + "\nComputer! The secret number is little smaller!\n" + ANSI_RESET);
                    for (int i = computerNumber; i < (selectedNumbers.length); i++){
                        selectedNumbers[i] = false;
                    }

                    for (int i = (int)(computerNumber * 0.8) - 1; i >= 0; i--){
                        selectedNumbers[i] = false;
                    }

                } else if (computerNumber > (int)(randomNumber * 0.8) && computerNumber < randomNumber) {
                    System.out.println(ANSI_RED + "\nComputer! The secret number is little larger!\n" + ANSI_RESET);
                    for (int i = computerNumber; i >= 0; i--){
                        selectedNumbers[i] = false;
                    }

                    for (int i = (int)(computerNumber * 1.2) + 1; i < (selectedNumbers.length); i++){
                        selectedNumbers[i] = false;
                    }

                } else if (computerNumber > randomNumber) {
                    System.out.println(ANSI_RED + "\nComputer! The secret number is way smaller!\n" + ANSI_RESET);
                    for (int i = (selectedNumbers.length) - 1; i >= computerNumber; i--){
                        selectedNumbers[i] = false;
                    }
                } else if (computerNumber < randomNumber) {
                    System.out.println(ANSI_RED + "\nComputer! The secret number is way larger!\n" + ANSI_RESET);
                    for (int i = 0; i <= ((computerNumber - (selectedNumbers.length)) + (selectedNumbers.length)); i++) {
                        selectedNumbers[i] = false;
                    }
                }

                return 10;

            case 3:
                //Mode Three - way smaller
                /*----------------------------------------------------------------------------------------------------*/

                //Setting KI Mode to way smaller
                for (int i = (selectedNumbers.length) - 1; i >= inputNumberPlayerOne; i--){
                    selectedNumbers[i] = false;
                }

                /*----------------------------------------------------------------------------------------------------*/

                //Random Number Generator
                for(int i = 0; i < selectedNumbers.length; i++){
                    if (selectedNumbers[i]){

                        leftNumbers.add(i);

                        computerNumber = random.nextInt(leftNumbers.size());
                    }
                }
                computerNumber = leftNumbers.get(computerNumber);

                /*----------------------------------------------------------------------------------------------------*/

                if (computerNumber == randomNumber) {
                    System.out.println(ANSI_GREEN + "\nBOOHOO\n\nComputer entered the correct number!\n" + ANSI_RESET);
                    System.out.printf("The number was: %d\n", randomNumber);
                    return 99;

                } else if (computerNumber < (int)(randomNumber * 1.2) && computerNumber > randomNumber) {
                    System.out.println(ANSI_RED + "\nComputer! The secret number is little smaller!\n" + ANSI_RESET);
                    for (int i = computerNumber; i < (selectedNumbers.length); i++){
                        selectedNumbers[i] = false;
                    }

                    for (int i = (int)(computerNumber * 0.8) - 1; i >= 0; i--){
                        selectedNumbers[i] = false;
                    }

                } else if (computerNumber > (int)(randomNumber * 0.8) && computerNumber < randomNumber) {
                    System.out.println(ANSI_RED + "\nComputer! The secret number is little larger!\n" + ANSI_RESET);
                    for (int i = computerNumber; i >= 0; i--){
                        selectedNumbers[i] = false;
                    }

                    for (int i = (int)(computerNumber * 1.2) + 1; i < (selectedNumbers.length); i++){
                        selectedNumbers[i] = false;
                    }

                } else if (computerNumber > randomNumber) {
                    System.out.println(ANSI_RED + "\nComputer! The secret number is way smaller!\n" + ANSI_RESET);
                    for (int i = (selectedNumbers.length) - 1; i >= computerNumber; i--){
                        selectedNumbers[i] = false;
                    }
                } else if (computerNumber < randomNumber) {
                    System.out.println(ANSI_RED + "\nComputer! The secret number is way larger!\n" + ANSI_RESET);
                    for (int i = 0; i <= ((computerNumber - (selectedNumbers.length)) + (selectedNumbers.length)); i++) {
                        selectedNumbers[i] = false;
                    }
                }

                return 10;

            case 4:
                //Mode Four - way larger
                /*----------------------------------------------------------------------------------------------------*/

                //Setting KI Mode to way larger
                for (int i = 0; i <= ((inputNumberPlayerOne - (selectedNumbers.length)) + (selectedNumbers.length)); i++) {
                    selectedNumbers[i] = false;
                }

                /*----------------------------------------------------------------------------------------------------*/

                //Random Number Generator
                for(int i = 0; i < selectedNumbers.length; i++){
                    if (selectedNumbers[i]){

                        leftNumbers.add(i);

                        computerNumber = random.nextInt(leftNumbers.size());
                    }
                }
                computerNumber = leftNumbers.get(computerNumber);

                /*----------------------------------------------------------------------------------------------------*/


                if (computerNumber == randomNumber) {
                    System.out.println(ANSI_GREEN + "\nBOOHOO\n\nComputer entered the correct number!\n" + ANSI_RESET);
                    System.out.printf("The number was: %d\n", randomNumber);
                    return 99;

                } else if (computerNumber < (int)(randomNumber * 1.2) && computerNumber > randomNumber) {
                    System.out.println(ANSI_RED + "\nComputer! The secret number is little smaller!\n" + ANSI_RESET);
                    for (int i = computerNumber; i < (selectedNumbers.length); i++){
                        selectedNumbers[i] = false;
                    }

                    for (int i = (int)(computerNumber * 0.8) - 1; i >= 0; i--){
                        selectedNumbers[i] = false;
                    }

                } else if (computerNumber > (int)(randomNumber * 0.8) && computerNumber < randomNumber) {
                    System.out.println(ANSI_RED + "\nComputer! The secret number is little larger!\n" + ANSI_RESET);
                    for (int i = computerNumber; i >= 0; i--){
                        selectedNumbers[i] = false;
                    }

                    for (int i = (int)(computerNumber * 1.2) + 1; i < (selectedNumbers.length); i++){
                        selectedNumbers[i] = false;
                    }

                } else if (computerNumber > randomNumber) {
                    System.out.println(ANSI_RED + "\nComputer! The secret number is way smaller!\n" + ANSI_RESET);
                    for (int i = (selectedNumbers.length) - 1; i >= computerNumber; i--){
                        selectedNumbers[i] = false;
                    }
                } else if (computerNumber < randomNumber) {
                    System.out.println(ANSI_RED + "\nComputer! The secret number is way larger!\n" + ANSI_RESET);
                    for (int i = 0; i <= ((computerNumber - (selectedNumbers.length)) + (selectedNumbers.length)); i++) {
                        selectedNumbers[i] = false;
                    }
                }

                return 10;

            default:
                System.out.println("PlayerCom - Switch selector default!");
                break;
        }

        return 10;
    }
}


/*--------------------------------------------------------------------------------------------------------------------*/

//OLD STUFF

/*
switch (KIMode) {
    case 0:
        //First Game
        System.out.println("Mode0 - First Game Computer");
    case 1:
        //Mode One - little smaller (20%)
        System.out.println("Mode1");
        computerNumber = randomNumber - 1 - random.nextInt((int) (randomNumber * 0.2));

        if (computerNumber == randomNumber) {
            System.out.println(ANSI_GREEN + "\nBOOHOO\n\nComputer entered the correct number!\n" + ANSI_RESET);
            System.out.printf("The number was: %d\n", randomNumber);
            return 10000;
        } else if (computerNumber < (randomNumber * 1.2) && computerNumber > randomNumber) {
            System.out.println(ANSI_RED + "\nComputer! The secret number is little smaller!\n" + ANSI_RESET);
        } else if (computerNumber > (randomNumber * 0.8) && computerNumber < randomNumber) {
            System.out.println(ANSI_RED + "\nComputer! The secret number is little larger!\n" + ANSI_RESET);
        } else if (computerNumber > randomNumber) {
            System.out.println(ANSI_RED + "\nComputer! The secret number is way smaller!\n" + ANSI_RESET);
        } else if (computerNumber < randomNumber) {
            System.out.println(ANSI_RED + "\nComputer! The secret number is way larger!\n" + ANSI_RESET);
        }
        System.out.println(computerNumber);
        return 10;

    case 2:
        //Mode Two - little larger (20%)
        System.out.println("Mode2");
        computerNumber = random.nextInt((int) (randomNumber * 0.2)) + 1 + randomNumber;
        if (computerNumber == randomNumber) {
            System.out.println(ANSI_GREEN + "\nBOOHOO\n\nComputer entered the correct number!\n" + ANSI_RESET);
            System.out.printf("The number was: %d\n", randomNumber);
            return 10000;
        } else if (computerNumber < (randomNumber * 1.2) && computerNumber > randomNumber) {
            System.out.println(ANSI_RED + "\nComputer! The secret number is little smaller!\n" + ANSI_RESET);
        } else if (computerNumber > (randomNumber * 0.8) && computerNumber < randomNumber) {
            System.out.println(ANSI_RED + "\nComputer! The secret number is little larger!\n" + ANSI_RESET);
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
            System.out.println(ANSI_RED + "\nComputer! The secret number is little smaller!\n" + ANSI_RESET);
        } else if (computerNumber > (randomNumber * 0.8) && computerNumber < randomNumber) {
            System.out.println(ANSI_RED + "\nComputer! The secret number is little larger!\n" + ANSI_RESET);
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
            System.out.println(ANSI_RED + "\nComputer! The secret number is little smaller!\n" + ANSI_RESET);
        } else if (computerNumber > (randomNumber * 0.8) && computerNumber < randomNumber) {
            System.out.println(ANSI_RED + "\nComputer! The secret number is little larger!\n" + ANSI_RESET);
        } else if (computerNumber > randomNumber) {
            System.out.println(ANSI_RED + "\nComputer! The secret number is way smaller!\n" + ANSI_RESET);
        } else if (computerNumber < randomNumber) {
            System.out.println(ANSI_RED + "\nComputer! The secret number is way larger!\n" + ANSI_RESET);
        }
        System.out.println(computerNumber);
        return 10;

    default:
        System.out.println("PlayerCom - Switch selector default!");
        break;
}
*/





//ORIGINAL WITHOUT ADDED KI
//SWITCH
/*
        if (computerNumber == randomNumber) {
                System.out.println(ANSI_GREEN + "\nBOOHOO\n\nComputer entered the correct number!\n" + ANSI_RESET);
                System.out.printf("The number was: %d\n", randomNumber);
                return 99;

                } else if (computerNumber < (int)(randomNumber * 1.2) && computerNumber > randomNumber) {
        System.out.println(ANSI_RED + "\nComputer! The secret number is little smaller!\n" + ANSI_RESET);
        for (int i = computerNumber; i < (selectedNumbers.length); i++){
        selectedNumbers[i] = false;
        }

        for (int i = (int)(computerNumber * 0.8); i >= 0; i--){
        selectedNumbers[i] = false;
        }

        } else if (computerNumber > (int)(randomNumber * 0.8) && computerNumber < randomNumber) {
        System.out.println(ANSI_RED + "\nComputer! The secret number is little larger!\n" + ANSI_RESET);
        for (int i = computerNumber; i >= 0; i--){
        selectedNumbers[i] = false;
        }

        for (int i = (int)(computerNumber * 1.2); i < (selectedNumbers.length); i++){
        selectedNumbers[i] = false;
        }

        } else if (computerNumber > randomNumber) {
        System.out.println(ANSI_RED + "\nComputer! The secret number is way smaller!\n" + ANSI_RESET);
        for (int i = (selectedNumbers.length) - 1; i >= computerNumber; i--){
        selectedNumbers[i] = false;
        }
        } else if (computerNumber < randomNumber) {
        System.out.println(ANSI_RED + "\nComputer! The secret number is way larger!\n" + ANSI_RESET);
        for (int i = 0; i <= ((computerNumber - (selectedNumbers.length)) + (selectedNumbers.length)); i++) {
        selectedNumbers[i] = false;
        }
        }
*/