import java.util.Random;


public class Main_Pyramide {
    public static void main(String[] args) throws InterruptedException {

        Random rnd = new Random();
        int rndNumber = rnd.nextInt(50);

        System.out.println("Hello and Welcome to Pyramid");
        System.out.printf("Your random number is %d\n\n", rndNumber);

        int symbol = (rndNumber * 2 - 1);
        int spaces = 0;
        for (int i = 0; i < rndNumber; i++) {

            for (int k = 0; k < spaces; k++) {
                System.out.print(" ");
            }
            spaces += 2;

            for (int j = 0; j < symbol; j++) {
                System.out.print("X ");
            }
            System.out.println();
            symbol -= 2;
        }

/*====================================================================================================================*/
        System.out.println("\nAnd now flip it with #\n");
        Thread.sleep(1000);
/*====================================================================================================================*/

        symbol = 1;
        spaces = (rndNumber * 2 - 1);

        for (int i = 0; i < rndNumber; i++) {

            for (int k = 1; k < spaces; k++) {
                System.out.print(" ");
            }
            spaces -= 2;

            for (int j = 0; j < symbol; j++) {
                System.out.print("# ");
            }
            System.out.println();
            symbol += 2;
        }
    }
}