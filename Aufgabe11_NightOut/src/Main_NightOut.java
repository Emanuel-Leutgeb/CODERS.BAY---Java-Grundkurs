import java.util.Scanner;
import java.util.Random;

public class Main_NightOut  {
    public static void main(String[] args) throws InterruptedException {

        Scanner scan = new Scanner(System.in);
        Random rnd = new Random();

        //What kind of Drinks?
        String sel;
        int drinksCount = 0;
        boolean repeat = true;

        String drink = "empty";
        System.out.println("Hello! Welcome to Nights Out!");
        System.out.println("What did you want to Drink?");

        while (repeat) {

            System.out.println("Beer (B) or White wine splash (W)?");

            sel = scan.nextLine();

            if (sel.equals("B")) {
                System.out.println("Enjoy your Drink.");
                drink = "Beer";
                repeat = false;
            } else if (sel.equals("W")) {
                System.out.println("Enjoy your Drink.");
                drink = "White wine splash";
                repeat = false;
            } else {
                System.out.println("-----------------");
                System.out.println("No correct input!");
                System.out.println("-----------------\n");
                Thread.sleep(300);
            }
        }

        repeat = true;
        Thread.sleep(600);
        System.out.println("\n-----------------\n");

        //How much Drinks?
        while (repeat) {

            System.out.printf("How much %s did you drink today?\n", drink);

            if (scan.hasNextInt()) {
                repeat = false;
                drinksCount = scan.nextInt();
            } else if (repeat = scan.hasNext()) {
                System.out.println("\n-----------------");
                System.out.println("No correct input!");
                System.out.println("-----------------\n");
                Thread.sleep(300);
                scan.nextLine();
            }
        }
        System.out.println("Enjoy your evening!");
        Thread.sleep(600);
        System.out.println("\n-----------------");
        Thread.sleep(750);

        //Glass progress.(ml)
        int[] glassProgress = new int[3];
        glassProgress[0] = 250;
        glassProgress[1] = 249;
        glassProgress[2] = 20;

        for (int i = 0; i < drinksCount; i++) {
            System.out.println("\nDrinking is in progress");
            Thread.sleep(750);
            for (int j = 250; j >= 0; j--) {
                if (j == glassProgress[0]) {
                    System.out.println("\nYour glass is full!");
                    Thread.sleep(300);
                }
                else if (j == glassProgress[1]) {
                    System.out.print(".");
                    Thread.sleep(400);
                    System.out.print(".");
                    Thread.sleep(400);
                    System.out.print(".");
                    Thread.sleep(400);
                    System.out.print("\b\b\b");
                    Thread.sleep(300);
                    System.out.println("Your glass is not full anymore.");
                }
                else if (j < glassProgress[1] && j > glassProgress[1] - 3) {
                    System.out.print(".");
                    Thread.sleep(400);
                    System.out.print(".");
                    Thread.sleep(400);
                    System.out.print(".");
                    Thread.sleep(400);
                    System.out.print("\b\b\b");
                    Thread.sleep(300);
                }
                else if (j == glassProgress[2] && drinksCount != 1) {
                    System.out.println("Hey Waiter!");
                    Thread.sleep(1000);
                    System.out.printf("Please bring me a new %s.\n", drink);
                }
            }

            System.out.println("\n-----------------");
            Thread.sleep(2000);
        }

        //Bowling Time?
        System.out.println("\nLet's go out bowling\n");
        Thread.sleep(1000);


        repeat = true;
        System.out.println("Do you want to Play?");
        int answ = 0;

        while (repeat) {

            System.out.println("Yes (Y) or No (N)");

            sel = scan.next();


            if (sel.equals("Y") && drinksCount <= 4) {
                System.out.println("Enjoy your Game.");
                repeat = false;
            } else if (sel.equals("Y") && drinksCount >= 4) {
                System.out.println("You can not play you drank too much!");
                System.out.println("Good Bye.");
                answ = 1;
                repeat = false;
            } else if (sel.equals("N")) {
                System.out.println("Ok. Good Bye.");
                answ = 1;
                repeat = false;
            } else if (!sel.equals("Y") || !sel.equals("N")) {
                System.out.println("-----------------");
                System.out.println("No correct input!");
                System.out.println("-----------------\n");
                scan.nextLine();
                Thread.sleep(300);
            }
        }
        System.out.println("\n-----------------\n");

        //Bowling Game!
        String[] hitbar = new String[5];
        hitbar[0] = "X - STRIKE";
        hitbar[1] = "GOOD Hit";
        hitbar[2] = "NORMAL HIT";
        hitbar[3] = "WEAK HIT";
        hitbar[4] = "LOSER - NO HIT";

        int max = 20;
        int min = 10;
        int games = rnd.nextInt((max - min) + 1) + min;
        int k = 0;
        if (answ != 1) {
            System.out.printf("You play now %d rounds\n\n", games);
            Thread.sleep(1000);
        }
        while (k < games && answ != 1) {
            int r = rnd.nextInt(11);
            k++;
            switch (r) {
                case 0:
                    System.out.println(hitbar[4]);
                    System.out.printf("You hit %d Pins\n\n", r);
                    break;
                case 1, 2, 3:
                    System.out.println(hitbar[3]);
                    System.out.printf("You hit %d Pins\n\n", r);
                    break;
                case 4, 5, 6:
                    System.out.println(hitbar[2]);
                    System.out.printf("You hit %d Pins\n\n", r);
                    break;
                case 7, 8, 9:
                    System.out.println(hitbar[1]);
                    System.out.printf("You hit %d Pins\n\n", r);
                    break;
                case 10:
                    System.out.println(hitbar[0]);
                    System.out.printf("You hit %d Pins\n\n", r);
                    break;
            }
            Thread.sleep(750);
        }

        //Pull Ups in varius ways
        System.out.println("-----------------\n");
        //for Schleife
        Thread.sleep(750);
        System.out.println("Make some Pull-ups\n");
        Thread.sleep(750);

        for (int i = 1; i <= 20; i++) {
            if (i == 10 || i == 15 || i == 19 || i == 20) {
                System.out.print(i);
                Thread.sleep(250);
                switch (i) {
                    case 10:
                        System.out.println("\tI hope it is soon over!");
                        break;
                    case 15:
                        System.out.println("\tI think i can do this!");
                        break;
                    case 19:
                        System.out.println("\tI CAN DO THIS!");
                        break;
                    case 20:
                        System.out.println("\tOLEEEEE");
                        System.out.println("\tOLEEEOLEEEOLEEEEEEE");
                        break;
                }
            } else {
                System.out.println(i);
                Thread.sleep(250);
            }

        }

        //while schleife
        System.out.println("\nMake some Pull-ups\n");
        int i = 1;
        repeat = true;

        while (repeat) {

            if (i == 10 || i == 15 || i == 19 || i == 20) {
                System.out.print(i);
                Thread.sleep(250);
                switch (i) {
                    case 10:
                        System.out.println("\tI hope it is soon over!");
                        break;
                    case 15:
                        System.out.println("\tI think i can do this!");
                        break;
                    case 19:
                        System.out.println("\tI CAN DO THIS!");
                        break;
                    case 20:
                        System.out.println("\tOLEEEEE");
                        System.out.println("\tOLEEEOLEEEOLEEEEEEE");
                        repeat = false;
                        break;
                }
            } else {
                System.out.println(i);
                Thread.sleep(250);
            }
            i++;
        }

        //do-while schleife
        System.out.println("\nMake some Pull-ups\n");

        i = 1;
        repeat = true;

        do {
            if (i == 10 || i == 15 || i == 19 || i == 20) {
                System.out.print(i);
                Thread.sleep(250);
                switch (i) {
                    case 10:
                        System.out.println("\tI hope it is soon over!");
                        break;
                    case 15:
                        System.out.println("\tI think i can do this!");
                        break;
                    case 19:
                        System.out.println("\tI CAN DO THIS!");
                        break;
                    case 20:
                        System.out.println("\tOLEEEEE");
                        System.out.println("\tOLEEEOLEEEOLEEEEEEE");
                        repeat = false;
                        break;
                }
            } else {
                System.out.println(i);
                Thread.sleep(250);
            }
            i++;
        }
        while (repeat);


        Thread.sleep(750);
        System.out.println("\n-----------------\n");
        Thread.sleep(750);


        //Back Home from Night Out
        int stairs = 15;
        int left = stairs - drinksCount;

        if (drinksCount <= 1) {
            System.out.println("What a great evening!\n :)");
            Thread.sleep(400);
            System.out.println("Take a Shower!");
            System.out.println("Clean your teeth!");
            System.out.println("Put on your sleeping clothes");
        } else if (drinksCount > 1 && drinksCount < 3) {
            System.out.println("What a great evening!\n :)");
            Thread.sleep(400);
            System.out.println("Take a Shower!");
            System.out.println("Clean your teeth!");
            System.out.println("Put on your sleeping clothes\n");
            for (i = 1; i <= 6; i++) {
                Thread.sleep(250);
                System.out.printf("Cookie %d eaten\n", i);
            }
        } else if (drinksCount >= 3) {
            System.out.println("What a drunken night! :/ ");
            Thread.sleep(400);
            System.out.println("I'll go to bed!\n");
            if (left < 0) {
                left = 0;
                i = 1;
            }
            for (int l = 1; l <= left; l++) {
                Thread.sleep(250);
                System.out.printf("Stair %d!\n", l);
            }
            switch (i) {
                case 1:
                    System.out.println("I can't go up any Stairs!");
                    break;
                default:
                    System.out.println("\nI can't do it!");
                    break;
            }
            Thread.sleep(250);
            System.out.println("I have to sleep!\n\n");
        }
        System.out.println("Good Bye!");
        System.out.println("Thanks");

    }
}
