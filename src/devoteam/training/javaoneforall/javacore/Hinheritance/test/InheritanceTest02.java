package devoteam.training.javaoneforall.javacore.Hinheritance.test;

import devoteam.training.javaoneforall.javacore.Hinheritance.domain.Manager;

public class InheritanceTest02 {
    // 0 - Static init block from the superclass (Employee) is executed (only once)
    // 1 - Static init block manager from the subclass (Manager) is executed (only once)
    // 2 - Memory allocated from superclass
    // 3 - Each class attribute from the superclass is initialized
    // 4 - Init block from the superclass is executed in order they appear
    // 5 - Constructor from the superclass is executed
    // 6 - Memory allocated from subclass
    // 7 - Each class attribute from the subclass is initialized
    // 8 - Init block from the subclass is executed in order they appear
    // 9 - Constructor from the subclass is executed
    public static void main(String[] args) {
        new Manager("Stan");
    }
}
