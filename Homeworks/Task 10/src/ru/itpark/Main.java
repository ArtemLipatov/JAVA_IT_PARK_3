package ru.itpark;

public class Main {

    public static void main(String[] args) {
	Car car = Car.builder()
            .age(2017) .engineCapacity(1.6) .fuelConsuption(7.2)
            .gearbox(true) //if true - механика
        .mileage(60000) .model("Kia RIO") .build();
     //   System.out.println(car);
    }
}
