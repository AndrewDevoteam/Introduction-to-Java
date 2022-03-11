package devoteam.training.javaoneforall.javacore.Bintroductionmethods.test;

import devoteam.training.javaoneforall.javacore.Bintroductionmethods.domain.Calculator;

public class CalculatorTest03 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        double result = calculator.divideTwoNumbers(3, 5);
        System.out.println(result);
        System.out.println(calculator.divideTwoNumbers(9,5));
        System.out.println("-----------");

        calculator.printTwoNumbersDivided(20,0);
    }
}
