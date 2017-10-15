package ru.itpark;

public class Human {
    public Human(String name, int height, int age, int weight) {
        this.name = name;
        if (age > 0) {
            this.age = age;
        } else {
            this.age = 1;
        }
        if (height > 0) {
            this.height = height;
        } else {
            this.height = 1;
        }

        if (weight > 0) {

            this.weight = weight;
        } else {
            this.weight = 1;
        }
    }

    private String name;
    private int height;
    private int age;
    private int weight;

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }
}


