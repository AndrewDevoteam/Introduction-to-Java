package devoteam.training.javaoneforall.javacore.Npolymorphism.test;

import devoteam.training.javaoneforall.javacore.Npolymorphism.domain.Computer;
import devoteam.training.javaoneforall.javacore.Npolymorphism.domain.Product;
import devoteam.training.javaoneforall.javacore.Npolymorphism.domain.Tomato;
import devoteam.training.javaoneforall.javacore.Npolymorphism.service.ProductTaxReportService;

public class ProductTest03 {
    public static void main(String[] args) {
        Product product1 = new Computer("Hp-Pavileon", 2000);

        Tomato tomato = new Tomato("cherry", 2);
        tomato.setBestConsumedBefore("11/12/4222");

        ProductTaxReportService.generateTaxReport(tomato);
        System.out.println("-------------------------");
        ProductTaxReportService.generateTaxReport(product1);


    }
}
