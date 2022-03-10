package devoteam.training.javaoneforall.introduction;

public class Class07Arrays02 {
    public static void main(String[] args) {
        String[] names = new String[5];
        //default values for primitive types
        //boolean[] = false
        //int short long double float[] == 0(.0)
        // char[] == ''
        //String[] == null
        names[0] = "Roy";
        names[1] = "Lisa";
        names[2] = "Nicole";
        for (int i = 0; i < names.length; i++) {
            System.out.println("Names "+ i + " is " + names[i]);
        }
    }
}
