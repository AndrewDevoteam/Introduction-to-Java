package devoteam.training.javaoneforall.introduction;

/*
Given a cars total price for example 20000
I want to find how much and for how long ill have to pay monhtly
condition: the monthly payment cannot be lower than 1000
*/
public class Class06LoopStatement04 {
    public static void main(String[] args) {
        double totalPrice = 20000;
        for (int monthlyCount = 1; monthlyCount <= 20000; monthlyCount++) {
            double monthlyPrice = totalPrice / monthlyCount;
            if (monthlyPrice < 1000) {
                break;
            }
            System.out.println("Months " + monthlyCount + " Price " + monthlyPrice);

        }
    }
}
