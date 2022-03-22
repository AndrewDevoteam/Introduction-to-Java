package devoteam.training.javaoneforall.javacore.Npolymorphism.service;

import devoteam.training.javaoneforall.javacore.Npolymorphism.domain.Product;
import devoteam.training.javaoneforall.javacore.Npolymorphism.domain.Tomato;

public class ProductTaxReportService {


    public static void generateTaxReport(Product product) {
        System.out.println("Starting tax report ");
        double taxValue = product.calculateTaxValue();
        System.out.println("Product " + product.getName());
        System.out.println("Price " + product.getPrice());
        System.out.println("Tax Value " + product.calculateTaxValue());
        if (product instanceof Tomato) {
            Tomato tomato = (Tomato) product;
            System.out.println(tomato.getBestConsumedBefore());
        }
    }
}
