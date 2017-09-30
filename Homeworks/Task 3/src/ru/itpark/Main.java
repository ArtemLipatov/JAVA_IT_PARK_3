package ru.itpark;

public class Main {

    public static int power(int x) {
        int a = 1;
        for (int i = 0; i < x; i++) {
            a = a * 10;
        }
        return a;
    }

    public static int parse(char digits[]) {
        int result = 0;
        for (int i = 0; i < digits.length; i++) {
            int x = digits.length - 1 - i;
            int b = power(x);
            result = result + (digits[i] - 48) * b;
        }
        return result;
    }


    public static void main(String args[]) {
        char number[] = {'3', '2', '4', '1'};
        int numberAsInt = parse(number);
        System.out.println(numberAsInt);
    }
}


