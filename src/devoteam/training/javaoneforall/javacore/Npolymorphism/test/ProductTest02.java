package devoteam.training.javaoneforall.javacore.Npolymorphism.test;

import devoteam.training.javaoneforall.javacore.Npolymorphism.domain.Computer;
import devoteam.training.javaoneforall.javacore.Npolymorphism.domain.Product;
import devoteam.training.javaoneforall.javacore.Npolymorphism.domain.Tomato;

public class ProductTest02 {
    public static void main(String[] args) {
        Product product1 = new Computer("Hp-Pavileon", 2000);
        Product product2 = new Tomato("cherry", 2);
        System.out.println(product1.getName());
        System.out.println(product1.getPrice());
        System.out.println(product1.calculateTaxValue());
        System.out.println("------------------------------");
        System.out.println(product2.getName());
        System.out.println(product2.getPrice());
        System.out.println(product2.calculateTaxValue());
    }
}
