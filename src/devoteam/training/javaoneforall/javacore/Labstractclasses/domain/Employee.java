package devoteam.training.javaoneforall.javacore.Labstractclasses.domain;

public abstract class Employee extends Person {
    protected  String name;
    protected  double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        this.calculateBonusSalary();
    }

    @Override
    public void print() {
        System.out.println("Printing...");
    }

    public abstract void calculateBonusSalary();

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
