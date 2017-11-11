package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Show show = new Show();
        Add add = new Add();
        while (true) {
            Menu.mainMenu();
            int command = scanner.nextInt();
            switch (command) {
                case 1: {
                    add.addHuman();
                }
                break;
                case 2: {
                    add.addCar();
                }
                break;
                case 3: {
                    show.showHumans();
                }
                break;
                case 4: {
                    show.showAllCars();
                }
                break;
                case 5: {
                    show.showOwnersWithoutCars();

                }
                break;
                case 6: {
                    show.showCarsWithoutOwnrs();
                }
                break;
                case 7: {
                    show.showCarsWithOwners();
                }
                case 8: {
                    show.showWhiteCars();
                }
                case 9: {
                    System.exit(0);
                }
            }
        }
    }
}
