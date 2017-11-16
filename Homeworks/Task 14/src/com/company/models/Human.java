package com.company.models;

public class Human {
    private int id;
    private int height;
    private int age;
    private String name;

    public Human(int id, int height, int age, String name) {
        this.id = id;
        this.height = height;
        this.age = age;
        this.name = name;
    }

    public Human(int height, int age, String name) {
        this.height = height;
        this.age = age;
        this.name = name;
    }

    public Human(int id) {
        this.id = id;
    }

    public Human() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "\n" + this.id + ") " + this.name + ", рост "
                + this.height + ", возраст " + this.age;
    }
}