package ru.itpark;

public class Circle extends Shapes {
    private static final double PI = 3.14;
    private int radius;

    public Circle(int radius) {
        if (radius > 0) {
            this.radius = radius;
        } else {
            System.err.println("Не правильные данные!");
        }
    }

    public void figuresArea() {
        if (radius > 0) {
            this.radius = radius;
            double a;
            a = PI * (radius * radius);
            System.out.println("Площадь круга равна: " + a);
        } else {
            System.err.println("Не правильные данные!");
        }
    }

    public void figuresPerimeter() {
        if (radius > 0) {
            this.radius = radius;
            double a;
            a = 2 * PI * radius;
            System.out.println("Периметр круга равен: " + a);
        } else {
            System.err.println("Не правильные данные!");
        }

    }


}