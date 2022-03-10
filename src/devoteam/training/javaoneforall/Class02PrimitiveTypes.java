package devoteam.training.javaoneforall;

public class Class02PrimitiveTypes {
    public static void main(String[] args) {
        // int, double, char, boolean, byte, short, long, float
        // cast
        int age = (int) 100000000000L;
        long bigNumber = (long) 155.35;
        float salaryFloat = (float) 2500.0F;
        double salaryDouble = 5000;
        boolean trueValue = true;
        boolean falseValue = false;
        short ageShort = 29;
        byte agebyte = 39;
        char character = '\u0004';
        String name = "Andrew";
//        var address = "439 East District";
        System.out.println("The kid is " + age + " years old");
        System.out.println(character);
        System.out.println(salaryFloat);
        System.out.println(bigNumber);
        System.out.println("My name is "+name);

    }
}
