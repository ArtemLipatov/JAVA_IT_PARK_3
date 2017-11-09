package com.company;

import java.sql.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            Menu.mainMenu();
            int command = scanner.nextInt();
            switch (command) {
                case 1: {
                    Add.addHuman();
                }
                break;
                case 2: {
                    Add.addCar();
                }
                break;
                case 3: {
                    Show.showHumans();
                }
                break;
                case 4: {
                    Show.showCars();
                }
                break;
                case 5: {
                    Show.showOwnersWithoutCars();

                }
                break;
                case 6: {
                    Show.showCarsWithoutOwnrs();
                }
                break;
                case 7: {
                    System.exit(0);
                }
            }
        }
    }
}
