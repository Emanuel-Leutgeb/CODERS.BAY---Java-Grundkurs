import java.util.ArrayList;

public class KISelector {
    public static int modeSelector(int randomNumber, int numberRange, int starter) throws InterruptedException {
        int gameWinner = 0;
        int inputNumberPlayerOne = 0;
        ArrayList<Integer> gameArray = new ArrayList<>();

        switch (starter) {
            case 0:
                gameArray = PlayerOne.oneGame(randomNumber, numberRange);
                break;

            case 1:
                gameWinner = PlayerCom.comGame(0, 0);
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
                        //Mode One little smaller (20%)
                        gameWinner = PlayerCom.comGame(1, inputNumberPlayerOne = gameArray.get(gameArray.size() - 2));
                        break;

                    case 2:
                        //Mode Two - little larger (20%)
                        gameWinner = PlayerCom.comGame(2, inputNumberPlayerOne = gameArray.get(gameArray.size() - 2));
                        break;

                    case 3:
                        //Mode Three - way smaller
                        gameWinner = PlayerCom.comGame(3, inputNumberPlayerOne = gameArray.get(gameArray.size() - 2));
                        break;

                    case 4:
                        //Mode Four - way larger
                        gameWinner = PlayerCom.comGame(4, inputNumberPlayerOne = gameArray.get(gameArray.size() - 2));
                        break;
                }

                gameArray.clear();
            }
            if (gameWinner == 99) {
                repeatTillWin =  false;
            } else {
                gameArray = PlayerOne.oneGame(randomNumber, numberRange);
            }

        } while(repeatTillWin);

        return gameWinner;
    }
}
