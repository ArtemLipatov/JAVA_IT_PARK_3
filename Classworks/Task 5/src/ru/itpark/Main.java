package ru.itpark;

import java.util.Scanner;

public class Main {


    public static void reverse(int array[]){

        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }

    }
    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int arraySize = scanner.nextInt();
        int array[] = new int[arraySize];
        int i = 0;
        System.out.println("Введите значение элементов массива: ");
        for (i = 0; i < arraySize; i++) {
            array[i] = scanner.nextInt();
        }
        reverse();
        System.out.println();




    }
}
