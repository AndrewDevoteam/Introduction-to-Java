package devoteam.training.javaoneforall.javacore.Bintroductionmethods.test;

import devoteam.training.javaoneforall.javacore.Bintroductionmethods.domain.Employee;

public class EmployeeTest01 {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.name = "Kenny";
        employee.age = 12;
        employee.salaries = new double[]{1500,3000,4000};
        employee.print();
    }
}
