package devoteam.training.javaoneforall.javacore.Jfinalmodifier.test;

import devoteam.training.javaoneforall.javacore.Ioverriding.domain.Ferrari;
import devoteam.training.javaoneforall.javacore.Jfinalmodifier.domain.Car;

public class CarTest01 {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(Car.SPEED_LIMIT);
        System.out.println(car.BUYER);
        car.BUYER.setName("Andrew");
        System.out.println(car.BUYER);
        Ferrari ferrari = new Ferrari();
        ferrari.setName("Enzo");
        ferrari.print();
    }
}
