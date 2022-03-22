package devoteam.training.javaoneforall.javacore.Labstractclasses.test;

import devoteam.training.javaoneforall.javacore.Labstractclasses.domain.Developer;
import devoteam.training.javaoneforall.javacore.Labstractclasses.domain.Employee;
import devoteam.training.javaoneforall.javacore.Labstractclasses.domain.Manager;

public class EmployeeTest01 {
    public static void main(String[] args) {

        Manager manager = new Manager("Kyle", 12000);
        System.out.println(manager);
        Developer developer = new Developer("Zoro", 8000);
        System.out.println(developer);
        manager.print();
        developer.print();
    }
}
