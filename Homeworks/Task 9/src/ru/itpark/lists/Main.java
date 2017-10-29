package ru.itpark.lists;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Menu.showMenu();
        int command = scanner.nextInt();

        switch (command) {
            case 1: {
                Menu.arrayMenu();
            }
            break;
            case 2: {
                Menu.linkedMenu();
            }
            break;
            case 3:
                System.out.println("Увидимся");
                System.exit(0);
        }
    }
}