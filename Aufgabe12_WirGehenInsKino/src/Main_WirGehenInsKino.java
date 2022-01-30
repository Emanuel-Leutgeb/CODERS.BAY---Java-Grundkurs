import java.time.Clock;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Main_WirGehenInsKino {
    public static void main(String[] args) throws InterruptedException {

        Scanner scan = new Scanner(System.in);
        Random rnd = new Random();
        int r;


        //Cinema Movies
        System.out.println("Today's Movies are...\n");

        //Movies
        ArrayList<String> movies = new ArrayList<>();
        movies.add("Dune");
        movies.add("Don´t Breathe 2");
        movies.add("Fast & Furious 9");
        movies.add("Shang-Chi");
        movies.add("Tom & Jerry");

        //Start Time LocalTime
        ArrayList<LocalTime> startTime = new ArrayList<>();

        LocalTime fiveMinutesLater = LocalTime.now(Clock.tickMinutes(ZoneId.systemDefault())).plusMinutes(5);
        LocalTime fifteenMinutesLater = LocalTime.now(Clock.tickMinutes(ZoneId.systemDefault())).plusMinutes(15);
        LocalTime hourLater = LocalTime.now(Clock.tickMinutes(ZoneId.systemDefault())).plusMinutes(60);
        LocalTime nowTime = LocalTime.now(Clock.tickMinutes(ZoneId.systemDefault()));

        for (int i = 0; i < movies.size(); i++) {
            r = rnd.nextInt(5) + 1;

            if (r == 1) {
                startTime.add(fiveMinutesLater);
            } else if (r == 2 || r == 3) {
                startTime.add(fifteenMinutesLater);
            } else if (r == 4) {
                startTime.add(hourLater);
            } else {
                startTime.add(nowTime);
            }
        }

        //Special
        ArrayList<String> special = new ArrayList<>();
        special.add("2D");
        special.add("3D");
        special.add("3D");
        special.add("3D");
        special.add("2D");

        //Cinema Screen
        ArrayList<String> screen = new ArrayList<>();
        screen.add("Screen 1");
        screen.add("Screen 4");
        screen.add("Screen 2");
        screen.add("Screen 5");
        screen.add("Screen 3");

        //Movie available

        ArrayList<String> avail = new ArrayList<>();
        boolean avbl;
        for (int i = 0; i < movies.size(); i++) {
            avbl = rnd.nextBoolean();

            if (avbl) {
                avail.add("available\t");
            } else {
                avail.add("not available");
            }
            if (i == 4) {
                if (avail.get(i).equals("not available")) {
                    avail.remove(i);
                    avail.add("available\t");
                }
            }
        }


        //Movie Display
        int movieSel = 0;

        for (int i = 0; i < movies.size(); i++) {
            System.out.printf("Nr. %d | %s \t|\t %s \t|\t %s \t|\t %s \t|\t %s \n", movieSel, avail.get(i), startTime.get(i), screen.get(i), special.get(i), movies.get(i));
            movieSel++;
        }

        movieSel = movies.size();
        int ticket = 0;
        //What Movie
        boolean repeat = true;

        while (repeat) {

            System.out.println("\nWhat movie do you want to watch? (Nr. ?)");

            if (scan.hasNextInt()) {
                ticket = scan.nextInt();

                if (ticket > movieSel) {
                    System.out.println("\n-----------------");
                    System.out.println("No correct movie number!");
                    System.out.println("-----------------\n");
                    Thread.sleep(300);
                    scan.nextLine();
                } else if (ticket < movieSel && ticket >= 0) {
                    if (avail.get(ticket).equals("available\t")) {
                        System.out.println("Your movie is available and selected.\n");
                        repeat = false;
                    } else if (avail.get(ticket).equals("not available")) {
                        System.out.println("Your movie is not available, you can't select it.\n");
                    }

                } else {
                    System.out.println("\n-----------------");
                    System.out.println("No correct movie number!");
                    System.out.println("-----------------\n");
                    Thread.sleep(300);
                    scan.nextLine();
                }

            } else if (scan.hasNext()) {
                System.out.println("\n-----------------");
                System.out.println("No correct input!");
                System.out.println("-----------------\n");
                Thread.sleep(300);
                scan.nextLine();
            }
        }

        System.out.printf("You select the Movie %s\nIt's in %s will start at %s and is at %s.\n\n", movies.get(ticket), special.get(ticket), startTime.get(ticket), screen.get(ticket));


        //Snack bar
        ArrayList<String> snackTyp = new ArrayList<>();
        snackTyp.add("Movie Mix");
        snackTyp.add("Popcorn");
        snackTyp.add("Nachos");
        snackTyp.add("Chips");
        snackTyp.add("Nic Nacs");
        snackTyp.add("M&Ms");
        snackTyp.add("Ben & Jerrys");
        snackTyp.add("Coca-Cola");
        snackTyp.add("Sprite");
        snackTyp.add("Eistee");
        snackTyp.add("Red Bull");
        snackTyp.add("Orangensaft");

        ArrayList<Double> snackMoney = new ArrayList<>();
        snackMoney.add(3.20);
        snackMoney.add(4.10);
        snackMoney.add(5.50);
        snackMoney.add(2.70);
        snackMoney.add(3.20);
        snackMoney.add(2.90);
        snackMoney.add(3.20);
        snackMoney.add(3.40);
        snackMoney.add(3.40);
        snackMoney.add(3.40);
        snackMoney.add(3.50);
        snackMoney.add(3.10);

        //Time Check
        System.out.print("It's ");
        System.out.print(LocalTime.now(Clock.tickMinutes(ZoneId.systemDefault())));
        System.out.println(" o'Clock");

        nowTime = LocalTime.now(Clock.tickMinutes(ZoneId.systemDefault()));
        int time = (startTime.get(ticket).getHour() * 60 + startTime.get(ticket).getMinute()) - (nowTime.getHour() * 60 + nowTime.getMinute());
        double moneyBar = 0.00;

        int menu = 0;

        int snackSel = 0;

        if (time > 10) {
            System.out.println("You still have over 10 minutes until the film starts.");
            System.out.println("You can still easily go to the toilet.");
            System.out.println("Do you want to buy some Snacks?\n");
            for (int i = 0; i < snackTyp.size(); i++) {
                System.out.printf("Nr. %s \t| %4.2f \t|\t %s\n", snackSel, snackMoney.get(i), snackTyp.get(i));
                snackSel++;
            }

            repeat = true;
            scan.nextLine();
            while (repeat) {
                System.out.println("\nHow much money do you have? 10€ 20€ 30€?");

                if (scan.hasNextDouble()) {
                    moneyBar = scan.nextDouble();
                    repeat = false;
                } else if (scan.hasNext()) {
                    System.out.println("\n-----------------");
                    System.out.println("No correct input!");
                    System.out.println("-----------------\n");
                    Thread.sleep(300);
                    scan.nextLine();
                }

            }

            scan.nextLine();
            repeat = true;
            while (repeat) {

                System.out.println("Please select something out of the menu or press 'N'");

                if (scan.hasNextInt()) {
                    menu = scan.nextInt();

                    if (menu < snackTyp.size() && (moneyBar - snackMoney.get(menu)) >= 0) {
                        moneyBar = (moneyBar - snackMoney.get(menu));
                        System.out.printf("You have still %4.2f€ in your pocket.\n", moneyBar);
                    } else if (menu > snackTyp.size()) {
                        System.out.println("\n-----------------");
                        System.out.println("No correct snack number!");
                        System.out.println("-----------------\n");
                        Thread.sleep(300);
                        scan.nextLine();
                    } else if (moneyBar < 0 || (moneyBar - snackMoney.get(menu)) < 0) {
                        System.out.println("\nYou have not enough money in your pocket.");
                        System.out.println("Thanks for purchasing");

                        System.out.print("\nToday we have a special surprise for you.\n\nSpin and you can enter everything for free if you have a\nround number (10, 20, 30,...) or a\nprime number (2, 3, 5,...)\n\n");
                        //Cinema Surprise
                        r = rnd.nextInt(1001);

                        System.out.println(r);
                        if (r == 0 || r == 1) {
                            System.out.println("Sorry!\nIt is not a prime number.");
                        } else if (r % 10 == 0) {
                            System.out.println("Congratulations!\nIt is a round number.");
                            System.out.println("Everything is for free!");
                        } else {
                            int result = 0;
                            for (int i = 2; i <= r; i++) {

                                result = r % i;

                                if (result == 0 && r != i) {
                                    System.out.println("Sorry!\nIt is not a prime number.");
                                    break;
                                } else if (i == r) {
                                    System.out.println("Congratulations!\nIt is a prime number.");
                                    System.out.println("Everything is for free!");
                                    break;
                                }
                            }
                        }

                        System.out.println("Go to the Movie and have fun.");
                        repeat = false;
                    }

                } else if (scan.hasNext("N")) {
                    System.out.println("Today we have a special surprise for you.");
                    System.out.println("Spin and you can enter everything for free if you have a\nround number (10, 20, 30,...) or a\nprime number (2, 3, 5,...)");
                    //Cinema Surprise
                    r = rnd.nextInt(1001);

                    System.out.println(r);
                    if (r == 0 || r == 1) {
                        System.out.println("Sorry!\nIt is not a prime number.");
                    } else if (r % 10 == 0) {
                        System.out.println("Congratulations!\nIt is a round number.");
                        System.out.println("Everything is for free!");
                    } else {
                        int result = 0;
                        for (int i = 2; i <= r; i++) {

                            result = r % i;

                            if (result == 0 && r != i) {
                                System.out.println("Sorry!\nIt is not a prime number.");
                                break;
                            } else if (i == r) {
                                System.out.println("Congratulations!\nIt is a prime number.");
                                System.out.println("Everything is for free!");
                                break;
                            }
                        }
                    }

                    System.out.println("Go to the Movie and have fun.");
                    repeat = false;
                } else if (scan.hasNext()) {
                    System.out.println("\n-----------------");
                    System.out.println("No correct input!");
                    System.out.println("-----------------\n");
                    Thread.sleep(300);
                    scan.nextLine();

                }
            }
        } else {
            System.out.println("You have no time left you can only go to the toilet.");
        }
    }
}
