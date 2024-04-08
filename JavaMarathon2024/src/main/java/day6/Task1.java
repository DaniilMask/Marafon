package day6;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        MotorBike bike = new MotorBike("Suzuki", "Green", 2010);
        bike.info();
        int i = bike.yearDifference(2040);
        System.out.println(i);
        Car car = new Car();
        car.setYear(2000);
        car.setColor("White");
        car.setModel("Ford Kuga");
        car.info();
        int j = car.yearDifference(2040);
        System.out.println(j);

    }
}
