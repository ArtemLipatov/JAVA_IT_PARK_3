package ru.itpark;

public class Rectangle extends Shapes {
    public Rectangle(int lenght, int width) {
        this.lenght = lenght;
        this.width = width;
    }

    public void figuresArea() {
        if (lenght > 0 && width > 0) {
            int a;
            a = lenght * width;
            System.out.println("Площадь прямоугольника равна: " + a);
        } else {
            System.out.println("Ты что-то сделал не так.");
        }
    }

    public void figuresPerimeter() {
        if (lenght > 0 && width > 0) {
            int a;
            a = (lenght + width) * 2;
            System.out.println("Периметр прямоугольника равен: " + a);
        } else {
            System.out.println("Ты что-то сделал не так.");
        }
    }
}
