package ru.itpark;

import java.util.Random;
import java.util.Scanner;

public class MatrixTask {
    int lines = 1000;
    int columns = 1000;
    int[][] matrix = new int[lines][columns];

    public void generateMatrix(int lines, int columns)  {
        Random random = new Random();

        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = random.nextInt(100);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void findNumber(int number)  {
        int count = 0;
        if (count < 1) {
            for (int i = 0; i < lines; i++) {
                for (int j = 0; j < columns; j++) {
                    if (matrix[i][j] == (number)) {
                        System.out.println("Число находиться на позиции: " + (i + 1) + " " + (j + 1));
                        count++;
                    }
                }
            }
        }
        try {
            wait();
        } catch (InterruptedException e) {
            throw new IllegalArgumentException(e);
        }
    }

}


