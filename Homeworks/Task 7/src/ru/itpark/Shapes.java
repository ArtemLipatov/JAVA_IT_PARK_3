package ru.itpark;

public class Shapes {
    protected String name;
    protected int lenght;
    protected int width;

    public Shapes() {
        if (lenght > 0 && width > 0) {
            this.lenght = lenght;
            this.width = width;
        } else {
            this.lenght = 1;
            this.width = 1;
        }

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void figuresArea() {
        if (lenght > 0 && width > 0) {
            int a;
            a = lenght * width;
            System.out.println("Площадь фигуры равна: " + a);
        } else {
            System.out.println("Ты что-то сделал не так.");
        }
    }

    public void figuresPerimeter() {
        if (lenght > 0 && width > 0) {
            int a;
            a = (lenght + width) * 2;
            System.out.println("Периметр фигуры равен: " + a);
        } else {
            System.out.println("Ты что-то сделал не так.");
        }
    }
}
