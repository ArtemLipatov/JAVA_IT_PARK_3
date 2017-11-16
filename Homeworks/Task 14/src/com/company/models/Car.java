package com.company.models;

public class Car {
    private int id;
    private int number;
    private String color;
    private String model;
    private int owner_Id;

    public Car(int id, int number, String color, String model, int owner_Id) {
        this.id = id;
        this.number = number;
        this.color = color;
        this.model = model;
        this.owner_Id = owner_Id;
    }

    public Car(int number, String color, String model, int owner_Id) {
        this.number = number;
        this.color = color;
        this.model = model;
        this.owner_Id = owner_Id;
    }

    public Car(int number, String color, String model) {
        this.number = number;
        this.color = color;
        this.model = model;
    }

    public Car(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public int getNumber() {
        return number;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public int getOwner_Id() {
        return owner_Id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setOwner_Id(int owner_Id) {
        this.owner_Id = owner_Id;
    }

    @Override
    public String toString() {
        return "\n" + this.id + ") госномер " + this.number + ", цвет "
                + this.color + ", марка " + this.model + ", id владельца " + this.owner_Id;
    }
}