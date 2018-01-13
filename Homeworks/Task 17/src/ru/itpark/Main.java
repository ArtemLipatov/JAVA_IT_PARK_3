package ru.itpark;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MatrixTask matrixTask = new MatrixTask();
        System.out.println("Введите число строк: ");
        int n = scanner.nextInt();
        System.out.println("Введите число столбцов: ");
        int m = scanner.nextInt();
        matrixTask.generateMatrix(n,m);
        System.out.println("Введи число, которое хотите найти: ");
        int number = scanner.nextInt();

        ThreadPool threadPool = new ThreadPool(3);
        threadPool.submitTask(()->{ matrixTask.findNumber(number);
        threadPool.shutdown();});


    }
}
