package ru.itpark;


public class Car {
    private int age;
    private String model;
    private double lenght;
    private double height;
    private int sizeOfFuelTank;
    private double fuelConsuption;
    private double mileage;
    private double engineCapacity;
    private boolean gearbox;

    private Car(Builder builder) {
        this.age = builder.age;
        this.model = builder.model;
        this.lenght = builder.lenght;
        this.height = builder.height;
        this.sizeOfFuelTank = builder.sizeOfFuelTank;
        this.fuelConsuption = builder.fuelConsuption;
        this.mileage = builder.mileage;
        this.engineCapacity = builder.engineCapacity;
        this.gearbox = builder.gearbox;

    }

    public static class Builder {
        private int age;
        private String model;
        private double lenght;
        private double height;
        private int sizeOfFuelTank;
        private double fuelConsuption;
        private double mileage;
        private double engineCapacity;
        private boolean gearbox;

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder model(String model) {
            this.model = model;
            return this;

        }

        public Builder lenght(double lenght) {
            this.lenght = lenght;
            return this;
        }

        public Builder height(double height) {
            this.height = height;
            return this;
        }

        public Builder sizeOfFuelTank(int sizeOfFuelTank) {
            this.sizeOfFuelTank = sizeOfFuelTank;
            return this;
        }

        public Builder fuelConsuption(double fuelConsuption) {
            this.fuelConsuption = fuelConsuption;
            return this;
        }

        public Builder mileage(int mileage) {
            this.mileage = mileage;
            return this;
        }

        public Builder engineCapacity(double engineCapacity) {
            this.engineCapacity = engineCapacity;
            return this;
        }

        public Builder gearbox(boolean gearbox) {
            this.gearbox = gearbox;
            return this;
        }

        public Car build() {
            return new Car(this);
        }

    }

    public static Builder builder() {
        return new Builder();
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getSizeOfFuelTank() {
        return sizeOfFuelTank;
    }

    public void setSizeOfFuelTank(int sizeOfFuelTank) {
        this.sizeOfFuelTank = sizeOfFuelTank;
    }

    public double getFuelConsuption() {
        return fuelConsuption;
    }

    public void setFuelConsuption(int fuelConsuption) {
        this.fuelConsuption = fuelConsuption;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public boolean isGearbox() {
        return gearbox;
    }

    public void setGearbox(boolean gearbox) {
        this.gearbox = gearbox;
    }
}
