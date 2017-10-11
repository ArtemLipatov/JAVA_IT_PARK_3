package ru.itpark;

public class Oval extends Shapes {
    private static final double PI = 3.14;
    private int a, b;

    public Oval(int a, int b) {
        if (a > 0 && b > 0) {
            this.a = a;
            this.b = b;
        } else {
            System.err.println("Не правильные данные!");
        }
    }

    public void figuresArea() {
        if (a > 0 && b > 0) {
            this.a = a;
            this.b = b;
            double c;
            c = PI * a * b;
            System.out.println("Площадь овала равна: " + c);
        } else {
            System.err.println("Не правильные данные!");
        }
    }

    public void figuresPerimeter() {
        if (a > 0 && b > 0) {
            this.a = a;
            this.b = b;
            double c;
            double numerator;
            double denominator;
            numerator = PI * a * b + (a - b);
            denominator = a + b;
            c = 4 * (numerator / denominator);
            System.out.println("Периметр овала равен: " + c);
        } else {
            System.err.println("Не правильные данные!");
        }

    }


}

