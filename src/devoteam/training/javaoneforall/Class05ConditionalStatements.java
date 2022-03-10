package devoteam.training.javaoneforall;

public class Class05ConditionalStatements {
    public static void main(String[] args) {
        int age = 10;
        boolean isAuthorizedToBuyAlcohol = age >= 18;
        if (isAuthorizedToBuyAlcohol) {
            System.out.println("Authorized to buy alcohol");
        }
        else {
            System.out.println("You are not allowed to buy Alcohol");
        }

        //!
        boolean c = false;

        if (c = false) {
            System.out.println("Weird Condition");
        }
    }
}
