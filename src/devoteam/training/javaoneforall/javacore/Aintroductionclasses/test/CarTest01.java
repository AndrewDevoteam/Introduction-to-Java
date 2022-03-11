package devoteam.training.javaoneforall.javacore.Aintroductionclasses.test;

import devoteam.training.javaoneforall.javacore.Aintroductionclasses.domain.Car;

public class CarTest01 {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();

        car1.name = "Ferrari";
        car1.model = "Enzo";
        car1.year = 2002;

        car2.name = "Mercedes";
        car2.model = "S-Class";
        car2.year = 2002;

        System.out.println(car1.name);
        System.out.println(car1.model);
        System.out.println(car1.year);
        System.out.println("---------");
        System.out.println(car2.name);
        System.out.println(car2.model);
        System.out.println(car2.year);
    }
}
