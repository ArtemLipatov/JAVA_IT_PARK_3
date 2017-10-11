package ru.itpark;

public class Main {

    public static void main(String[] args) {
        Square square = new Square(8);
        Rectangle rectangle = new Rectangle(2, 12);
        Circle circle = new Circle(5);
        Oval oval = new Oval(15, 14); //a - длина большой полуоси, b - длина малой полуоси
        Triangle triangle = new Triangle(14, 3, 2, 5); //a, b, c, - стороны треугольника, h - высота
        Shapes shapes[] = {square, rectangle, circle, oval, triangle};
        for (int i = 0; i < shapes.length; i++) {
            shapes[i].figuresArea();
            shapes[i].figuresPerimeter();
        }
    }
}
