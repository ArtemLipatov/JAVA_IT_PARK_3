package ru.itpark;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int a = scanner.nextInt();
        int b[] = new int[a];
        int c = 0;
        System.out.println("Введите значение элементов массива: ");
        for (c = 0; c < a; c++) {
            b[c] = scanner.nextInt();
        }
        int e = 0;
        int f = 0;
        int g = 0;
        int h = 0;

        System.out.println("Ваш массив: ");
        for (c = 0; c < a; c++) {
            System.out.println("[" + c + "] = " + b[c]);

            int d = b[c] % 2;
            if (d == 0) {
                e = e + b[c];
            } else {
                f = f + b[c];
            }
            d = c % 2;
            if (d == 0) {
                g = g + b[c];
            } else {
                h = h + b[c];
            }
        }
        System.out.println("Сумма четных элементов равна: " + e);
        System.out.println("Сумма нечетных элементов равна: " + f);
        System.out.println("Сумма элементов, стоящих на четных позициях равна: " + g);
        System.out.println("Сумма элементов, стоящих на нечетных позициях равна: " + h);

    }
}
