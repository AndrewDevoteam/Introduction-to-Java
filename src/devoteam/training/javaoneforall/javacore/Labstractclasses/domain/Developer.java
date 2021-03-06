package devoteam.training.javaoneforall.javacore.Labstractclasses.domain;

public class Developer extends Employee {
    public Developer(String name, double salary) {
        super(name, salary);
    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public void calculateBonusSalary() {
        this.salary = this.salary + this.salary * 0.05;
    }
}
