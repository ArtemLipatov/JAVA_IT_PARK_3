package ru.itpark;

public class Triangle extends Shapes {
    private int a, b, c, h;

    public Triangle(int a, int b, int c, int h) {
        this.a = a;
        this.h = h;
        this.b = b;
        this.c = c;
    }

    public void figuresArea() {
        if (a > 0 && h > 0) {
            double s;
            s = 0.5 * a * h;
            System.out.println("Площадь треульника равна: " + s);
        } else {
            System.out.println("Ты что-то сделал не так.");
        }
    }

    public void figuresPerimeter() {
        if (a > 0 && h > 0 && b > 0 && c > 0) {
            double s;
            s = a + b + c;
            System.out.println("Периметр треугольника равен: " + s);
        } else {
            System.out.println("Ты что-то сделал не так.");
        }
    }
}
