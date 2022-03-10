package devoteam.training.javaoneforall;
/*
 **
 */

public class Class04Operators {
    public static void main(String[] args) {
        // + - * '/
        int numberOne = 10;
        int numberTwo = 20;
        double result = numberOne / (double) numberTwo;
        System.out.println(result);

        // %
        int modulo = 21 % 7;
        System.out.println(modulo);

        // < > <= >= != ==
        boolean isTenLowerThanTwenty = 10 < 20;
        boolean isTenGreaterThanTwenty = 10 > 20;
        boolean isTenLowerOrEqualToTwenty = 10 <= 20;
        boolean isTenGreaterOrEqualToTwenty = 10 >= 20;
        boolean isTenEqualToTwenty = 10 == 20;
        boolean isTenNotEqualToTwenty = 10 != 20;
        System.out.println(isTenLowerThanTwenty);
        System.out.println(isTenGreaterThanTwenty);
        System.out.println(isTenLowerOrEqualToTwenty);
        System.out.println(isTenGreaterOrEqualToTwenty);
        System.out.println(isTenEqualToTwenty);
        System.out.println(isTenNotEqualToTwenty);


        // && AND || OR

        int age = 29;
        float salary = 3500F;
        boolean isLegalOlderThanThirty = age >= 30 && salary >= 4612;
        boolean isLegalYoungerThanThirty = age < 30 && salary >= 3381;

        System.out.println("isLegalOlderThanThirty" + isLegalOlderThanThirty);
        System.out.println("isLegalYoungerThanThirty" + isLegalYoungerThanThirty);

        double currentAccount = 299;
        double savingsAccount = 3000;
        int ps5 = 500;
        boolean canBeBought = currentAccount > ps5 || savingsAccount > ps5;
        System.out.println(canBeBought);

        // =  += -= /= %= *=
        double bonus = 1800;
        bonus += 1800; // bonus = bonus + 1800
        bonus -= 1800; //bonus = bonus - 1800
        bonus *= 1800; //bonus = bonus * 1800
        bonus /= 1800; //bonus =bonus / 1800
        bonus %= 1800; //bonus =bonus % 1800
        System.out.println(bonus);

        // Unary ++ --
        int count = 0;
        count++;
        count--;
        System.out.println(count);
        System.out.println(++count);


    }
}
