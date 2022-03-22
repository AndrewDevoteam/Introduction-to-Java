package devoteam.training.javaoneforall.javacore.Npolymorphism.test;

import devoteam.training.javaoneforall.javacore.Npolymorphism.domain.Computer;
import devoteam.training.javaoneforall.javacore.Npolymorphism.domain.Television;
import devoteam.training.javaoneforall.javacore.Npolymorphism.domain.Tomato;
import devoteam.training.javaoneforall.javacore.Npolymorphism.service.ProductTaxReportService;

public class ProductTest01 {
    public static void main(String[] args) {
        Computer computer = new Computer("HP-Omen", 1200);
        Tomato tomato = new Tomato("Cherry tomato", 4.5);
        Television television = new Television("Samsung 50\"", 500);
        ProductTaxReportService.generateTaxReport(computer);
        System.out.println("---------------------------");
        ProductTaxReportService.generateTaxReport(tomato);
        System.out.println("---------------------------");
        ProductTaxReportService.generateTaxReport(television);
    }
}
