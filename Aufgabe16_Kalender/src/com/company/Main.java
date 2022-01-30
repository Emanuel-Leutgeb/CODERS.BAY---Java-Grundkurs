package com.company;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static void main(String[] args) throws InterruptedException {
        Scanner scan = new Scanner(System.in);

        System.out.println("Hello!\nWelcome to calender from Emanuel Leutgeb by JAVA.");

        boolean repeat = true;

        do {

            //Query about Year.
            int year = 0;

            boolean leapyear = false;

            do {
                System.out.println("Please give me a year.\t(1 - 9999)");

                if (scan.hasNextInt()) {
                    year = scan.nextInt();

                    if (year <= 9999 && year > 0) {
                        repeat = false;

                        if (year % 4 == 0 || year % 100 == 0 || year % 400 == 0) {
                            leapyear = true;
                        } else {
                            leapyear = false;
                        }

                    } else {
                        System.out.println("\n-----------------");
                        System.out.println("No correct year!");
                        System.out.println("-----------------\n");
                        Thread.sleep(300);
                        scan.nextLine();
                    }

                } else {
                    System.out.println("\n-----------------");
                    System.out.println("No correct input!");
                    System.out.println("-----------------\n");
                    Thread.sleep(300);
                    scan.nextLine();
                }

            } while (repeat);

            //Query about Month.
            int month = 0;
            repeat = true;
            int monthday = 0;

            scan.nextLine();
            do {
                System.out.println("Please give me a month.\t(1 - 12)");

                if (scan.hasNextInt()) {
                    month = scan.nextInt();

                    if (month <= 12 && month > 0) {
                        repeat = false;

                        switch (month) {
                            case 1, 3, 5, 7, 8, 10, 12:
                                monthday = 31;
                                break;
                            case 4, 6, 9, 11:
                                monthday = 30;
                                break;
                            case 2:

                                if (leapyear) {
                                    monthday = 29;
                                } else {
                                    monthday = 28;
                                }
                                break;
                        }

                    } else {
                        System.out.println("\n-----------------");
                        System.out.println("No correct month!");
                        System.out.println("-----------------\n");
                        Thread.sleep(300);
                        scan.nextLine();
                    }

                } else {
                    System.out.println("\n-----------------");
                    System.out.println("No correct input!");
                    System.out.println("-----------------\n");
                    Thread.sleep(300);
                    scan.nextLine();
                }

            } while (repeat);

            //Query about Day
            int day = 0;
            repeat = true;

            scan.nextLine();
            do {
                System.out.printf("Please give me a day.\t(1 - %d)", monthday);

                if (scan.hasNextInt()) {
                    day = scan.nextInt();

                    if (day <= 0 || day > monthday) {
                        System.out.println("\n-----------------");
                        System.out.println("No correct day!");
                        System.out.println("Your month has only " + monthday + " days in your year ");
                        System.out.println("-----------------\n");
                        Thread.sleep(300);
                        scan.nextLine();
                    } else {
                        repeat = false;
                    }

                } else {
                    System.out.println("\n-----------------");
                    System.out.println("No correct input!");
                    System.out.println("-----------------\n");
                    Thread.sleep(300);
                    scan.nextLine();
                }

            } while (repeat);


            //Query about start Day.
            int startDay = 0;
            repeat = true;

            scan.nextLine();
            do {
                System.out.println("Please give me a start day.\t(1 - 7)");

                if (scan.hasNextInt()) {
                    startDay = scan.nextInt();

                    if (startDay <= 7 && startDay > 0) {
                        repeat = false;
                    } else {
                        System.out.println("\n-----------------");
                        System.out.println("No correct start day!");
                        System.out.println("-----------------\n");
                        Thread.sleep(300);
                        scan.nextLine();
                    }

                } else {
                    System.out.println("\n-----------------");
                    System.out.println("No correct input!");
                    System.out.println("-----------------\n");
                    Thread.sleep(300);
                    scan.nextLine();
                }

            } while (repeat);

            System.out.println("--------------------------");
            System.out.printf("Your entered date is %d.%d.%d!\n", day, month, year);
            System.out.println("--------------------------");

            if (leapyear) {
                System.out.printf("The year %s is a leap year\n", year);
            } else {
                System.out.printf("The year %s is not a leap year\n", year);
            }

            System.out.println("--------------------------");
            System.out.println("Mo\tTu\tWe\tTh\tFr\tSa\tSu");
            System.out.println("--------------------------");

            for (int j = 1; j <= monthday; j++) {

                if (j < 10) {

                    if (j == 1) {
                        for (int k = 1; k < startDay; k++) {
                            System.out.print("  " + "\t");
                        }
                    }

                    System.out.print(" ");
                }

                if (j == day) {
                    System.out.print(ANSI_RED + j + ANSI_RESET + "\t");
                } else {
                    System.out.print(j + "\t");
                }


                if ((j + startDay - 1) % 7 == 0) {
                    System.out.println("\n");
                }

            }

            /*--------------------------------------------------------------------------------------------------------*/

            LocalDate checkDate = LocalDate.of(year, month, day);
            System.out.println("\n\n\nHere is the correct date and month!");
            System.out.print("The entered day was a: ");
            System.out.print(checkDate.getDayOfWeek());

            System.out.println("\n--------------------------");
            System.out.println("Mo\tTu\tWe\tTh\tFr\tSa\tSu");
            System.out.println("--------------------------");


            for (int j = 1; j <= checkDate.lengthOfMonth(); j++) {

                if (j < 10) {

                    if (j == 1) {
                        for (int k = 1; k < checkDate.withDayOfMonth(1).getDayOfWeek().getValue(); k++) {
                            System.out.print("  " + "\t");
                        }
                    }

                    System.out.print(" ");
                }

                if (j == checkDate.getDayOfMonth()) {
                    System.out.print(ANSI_RED + j + ANSI_RESET + "\t");
                } else {
                    System.out.print(j + "\t");
                }

                if ((j + checkDate.withDayOfMonth(1).getDayOfWeek().getValue() - 1) % 7 == 0) {
                    System.out.println("\n");
                }

            }

            System.out.println("\n\n\n");

            repeat = true;
            boolean gameRepeat = true;
            int gamePlay;

            scan.nextLine();
            do {
                System.out.println("Do you want to play again?\t(0 = No | 1 = Yes)");

                if (scan.hasNextInt()) {
                    gamePlay = scan.nextInt();

                    if (gamePlay == 0) {
                        gameRepeat = false;
                        repeat = false;
                    } else if (gamePlay == 1) {
                        System.out.println("Let's play again!\n\n");
                        Thread.sleep(1500);
                        scan.nextLine();
                        gameRepeat = false;
                    } else {
                        System.out.println("\n-----------------");
                        System.out.println("No correct number!");
                        System.out.println("-----------------\n");
                        Thread.sleep(300);
                        scan.nextLine();
                    }

                } else {
                    System.out.println("\n-----------------");
                    System.out.println("No correct input!");
                    System.out.println("-----------------\n");
                    Thread.sleep(300);
                    scan.nextLine();
                }

            } while (gameRepeat);

        } while (repeat);
    }
}