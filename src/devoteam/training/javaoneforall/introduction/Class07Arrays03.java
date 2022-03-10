package devoteam.training.javaoneforall.introduction;

public class Class07Arrays03 {
    public static void main(String[] args) {
        //3 ways to initialize an array
        int[] numbers = new int[3];
        int[] numbersTwo = {1,2,3,4,5};
        int[] numbersThree = new int[]{5,4,3,2,1};
//        for (int i = 0; i < numbersThree.length; i++) {
//            System.out.println(numbersThree[i]);
//        }
        for(int num: numbersThree){
            System.out.println(num);
        }
        //what is happening in the for each loop. see below
        int num = numbersThree[0];
        System.out.println(num);
        num = numbersThree[1];
        System.out.println(num);

    }
}
