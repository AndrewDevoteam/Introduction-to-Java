package devoteam.training.javaoneforall.javacore.Bintroductionmethods.domain;

public class Calculator {

    public void sumTwoNumbers() {
        System.out.println(10 + 10);
    }

    public void subtractTwoNumbers() {
        System.out.println(20 - 10);
    }

    public void multiplyTwoNumbers(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    public double divideTwoNumbers(double num1, double num2){
        return num1 / num2;
    }
    public double divideTwoNumbers02(double num1, double num2){
        if(num2 == 0){
            return 0;
        }
        return num1/num2;
    }
    public void printTwoNumbersDivided (double num1, double num2){
        if(num2 == 0){
            System.out.println("cant divide by 0");
            return;
        }
    }
    public void  changeTwoNumbers(int nbr1, int nbr2){
        nbr1 = 99;
        nbr2 = 33;
        System.out.println("change inside two numbers");
        System.out.println("num2 " + nbr1);
        System.out.println("num2 "+ nbr2);
    }
    public void sumArray(int[] numbers){
        int sum = 0;
        for(int num: numbers){
            sum += num;
        }
        System.out.println(sum);
    }
    public void sumVarArgs(int... numbers){
        int sum = 0;
        for(int num: numbers){
            sum += num;
        }
        System.out.println(sum);
    }
}
