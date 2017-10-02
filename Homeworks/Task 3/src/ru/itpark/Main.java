package ru.itpark;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int arraySize = scanner.nextInt();
        int array[] = new int[arraySize];
        int i = 0;
        System.out.println("Введите значение элементов массива: ");
        for (i = 0; i < arraySize; i++) {
            array[i] = scanner.nextInt();
        }
        int sumEven = 0;
        int sumUneven = 0;
        int sumEvenPos = 0;
        int sumUnevenPos = 0;
        int maxPos = 0;
        System.out.println("Ваш массив: ");
        for (i = 0; i < arraySize; i++) {
            System.out.println("[" + i + "] = " + array[i]);

            int d = array[i] % 2;
            if (d == 0) {
                sumEven = sumEven + array[i];
            } else {
                sumUneven = sumUneven + array[i];
            }
            d = i % 2;
            if (d == 0) {
                sumEvenPos = sumEvenPos + array[i];
            } else {
                sumUnevenPos = sumUnevenPos + array[i];
            }
        }
        int localMax = 0;
        for (i = 1; i < (arraySize - 1); i++) {
            if (array[i] > array[i - 1] && array[i] > array[i + 1]) {
                localMax = localMax + 1;
            }
        }
        int count = 1;
        for (i = 0; i < array.length - 1; i++) {
            if (array[i] < array[i + 1]) {
                count++;
            }
            if (array[i] >= array[i + 1] && count > maxPos) {
                maxPos = count;
                count = 1;
            }
        }
        if (count > maxPos) {
            maxPos = count;
        }

        System.out.println("1. Сумма четных элементов равна: " + sumEven);
        System.out.println("2. Сумма нечетных элементов равна: " + sumUneven);
        System.out.println("3. Сумма элементов, стоящих на четных позициях равна: " + sumEvenPos);
        System.out.println("4. Сумма элементов, стоящих на нечетных позициях равна: " + sumUnevenPos);
        System.out.println("5. Количество локальных максимумов: " + localMax);
        System.out.println("6. Максимальная длина подпоследовательности из возрастающих чисел: " + maxPos);
        System.out.print("7. Замена нулей отрицательным числом: ");
        for (i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = array[i + 1] * -1;
            }
            System.out.print(array[i] + " ");
        }
    }
}
