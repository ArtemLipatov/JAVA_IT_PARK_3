package ru.itpark;

public class Square extends Shapes {
    public Square(int lenght) {
        this.lenght = lenght;
    }

    public void figuresArea() {
        if (lenght > 0) {
            int a;
            a = lenght * lenght;
            System.out.println("Площадь квадрата равна: " + a);
        } else {
            System.out.println("Ты что-то сделал не так.");
        }
    }

    public void figuresPerimeter() {
        if (lenght > 0) {
            int a;
            a = lenght * 4;
            System.out.println("Периметр квадрата равен: " + a);
        } else {
            System.out.println("Ты что-то сделал не так.");
        }
    }
}

