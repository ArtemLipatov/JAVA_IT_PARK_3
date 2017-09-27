package ru.itpark;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Введите сумму, которую хотите снять с карты.");
        Scanner scanner = new Scanner(System.in);
        int money = scanner.nextInt();
        int a = money / 5000;
        money = money - a * 5000;
        int b = money / 1000;
        money = money - b * 1000;
        int c = money / 500;
        money = money - c * 500;
        int d = money / 100;
        money = money - d * 100;
        int e = money / 50;
        money = money - e * 50;
        int f = money / 10;
        money = money - f * 10;
        int j = money / 5;
        money = money - j * 5;
        int k = money / 2;
        money = money - k * 2;
        int l = money / 1;

        System.out.println("Вы получите деньги следующими купюрами:");
        System.out.println("5000р. - " + a + " шт.");
        System.out.println("1000р. - " + b + " шт.");
        System.out.println("500р. - " + c + " шт.");
        System.out.println("100р. - " + d + " шт.");
        System.out.println("50р. - " + e + " шт.");
        System.out.println("10р. - " + f + " шт.");
        System.out.println("5р. - " + j + " шт.");
        System.out.println("2р. - " + k + " шт.");
        System.out.println("1р. - " + l + " шт.");
    }
}
