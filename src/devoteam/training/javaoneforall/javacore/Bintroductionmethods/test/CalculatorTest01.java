package devoteam.training.javaoneforall.javacore.Bintroductionmethods.test;

import devoteam.training.javaoneforall.javacore.Bintroductionmethods.domain.Calculator;

public class CalculatorTest01 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.sumTwoNumbers();
        calculator.subtractTwoNumbers();
        calculator.multiplyTwoNumbers(5,9);
        System.out.println("Finishing class calculatorTest01");
    }

}
