package ru.itpark;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int a = 1;
        int b = 1000;
        int random_number1 = a + (int) (Math.random() * b);
        int random_number2 = a + (int) (Math.random() * b);
        int random_number3 = a + (int) (Math.random() * b);
        int random_number4 = a + (int) (Math.random() * b);
        System.out.println("Ваши случайные числа: ");
        System.out.println(random_number1);
        System.out.println(random_number2);
        System.out.println(random_number3);
        System.out.println(random_number4);
        int c = 1;
        int d = 4;
        int random_delete = c + (int) (Math.random() * d);
        if (random_delete == 1) {
            System.out.println("Ваше первое число: " + random_number1 + " удалено");
            System.out.println("У вас остались числа: ");
            System.out.println(random_number2);
            System.out.println(random_number3);
            System.out.println(random_number4);
        } else if (random_delete == 2) {
            System.out.println("Ваше второе число: " + random_number2 + " удалено");
            System.out.println("У вас остались числа: ");
            System.out.println(random_number1);
            System.out.println(random_number3);
            System.out.println(random_number4);
        } else if (random_delete == 3) {
            System.out.println("Ваше третье число: " + random_number3 + " удалено");
            System.out.println("У вас остались числа:");
            System.out.println(random_number1);
            System.out.println(random_number2);
            System.out.println(random_number4);
        } else {
            System.out.println("Ваше четвертое число: " + random_number4 + " удалено");
            System.out.println("У вас остались числа:");
            System.out.println(random_number1);
            System.out.println(random_number2);
            System.out.println(random_number3);
        }
    }
}
