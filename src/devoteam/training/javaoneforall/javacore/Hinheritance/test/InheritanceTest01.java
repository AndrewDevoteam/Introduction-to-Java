package devoteam.training.javaoneforall.javacore.Hinheritance.test;

import devoteam.training.javaoneforall.javacore.Hinheritance.domain.Address;
import devoteam.training.javaoneforall.javacore.Hinheritance.domain.Employee;
import devoteam.training.javaoneforall.javacore.Hinheritance.domain.Manager;

public class InheritanceTest01 {
    public static void main(String[] args) {
        Address address = new Address();
        address.setStreet("12th avenue");
        address.setZipcode("123462");
        Employee employee = new Employee();
        employee.setName("Jimmy");
        employee.setSocialSecurityNumber("253262");
        employee.setSalary(12000);
        employee.setAddress(address);
        employee.print();
        System.out.println("---------");
        Manager manager = new Manager();
        manager.setName("Kyle");
        manager.setSocialSecurityNumber("345467");
        manager.setSalary(22000);
        manager.setAddress(address);
        manager.setDepartment("Retail");
        manager.print();
        manager.paymentReport();
    }
}
