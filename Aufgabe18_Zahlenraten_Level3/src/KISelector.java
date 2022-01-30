import java.util.ArrayList;

public class KISelector {
    public static int modeSelector(int randomNumber, int numberRange, int starter) throws InterruptedException {
        int gameWinner = 0;
        int firstRoundToArray = 0;

        ArrayList gameArray = new ArrayList();

        switch (starter) {
            case 0:
                //gameArray = PlayerOne.oneGame(randomNumber, numberRange);
                gameWinner = PlayerCom.comGame(randomNumber, numberRange, 0, 0, firstRoundToArray);
                firstRoundToArray += 1;
                break;
            case 1:
                gameWinner = PlayerCom.comGame(randomNumber, numberRange, 0, 0, firstRoundToArray);
                firstRoundToArray += 1;
                break;
        }

        boolean repeatTillWin = true;
        do {
            if (gameArray.size() > 0) {
                int gameMode = (int) gameArray.get(gameArray.size() - 1);
                switch (gameMode) {
                    case 0:
                        //PlayerOne win the Game
                        return 0;
                    case 1:
                        //Mode One little bit smaller (20%)
                        gameWinner = PlayerCom.comGame(randomNumber, numberRange, 0, (int) gameArray.get(0), firstRoundToArray);
                        break;
                    case 2:
                        //Mode Two - little bit larger (20%)
                        gameWinner = PlayerCom.comGame(randomNumber, numberRange, 0, (int) gameArray.get(0), firstRoundToArray);
                        break;
                    case 3:
                        //Mode Three - way smaller
                        gameWinner = PlayerCom.comGame(randomNumber, numberRange, 0, (int) gameArray.get(0), firstRoundToArray);
                        break;
                    case 4:
                        //Mode Four - way larger
                        gameWinner = PlayerCom.comGame(randomNumber, numberRange, 0, (int) gameArray.get(0), firstRoundToArray);
                        break;
                    default:
                        System.out.println("KISelector Mode - Switch selector default!");
                }

                gameArray.clear();
            }
            if (gameWinner == 10) {
                gameArray = PlayerOne.oneGame(randomNumber, numberRange);
            }
            firstRoundToArray += 1;
        } while(repeatTillWin);
        System.out.println("return gameWinner");  //Helping Line

        return gameWinner;
    }
}
/*
//Trial Counter

int trialCounter = 10;
ArrayList<Integer> pastTips = new ArrayList<>();
pastTips.add(inputNumber);
System.out.printf("You have %d tries left.\n", trialCounter);
System.out.println("Your past tips:");
System.out.printf(pastTips + "\n\n");

if (trialCounter == 0 && inputNumber != randomNumber) {
    System.out.println(ANSI_RED + "GAME OVER\n\n" + ANSI_RESET);
    System.out.printf("The searched number was %d!", randomNumber);
    inputCorrect = false;
    Thread.sleep(1000);
}

 */
