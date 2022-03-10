package devoteam.training.javaoneforall.introduction;

public class Class06LoopStatement01 {
    public static void main(String[] args) {
        //while, do-while and for loops
        int counter = 12;
        while (counter < 10){
            System.out.println(counter);
            counter++;
        }
        counter = 20;
        do {
            System.out.println(("inside do while loop" + counter++));
        }while (counter < 10);

        for (int i = 0; i < 10; i+=2) {
            System.out.println("inside for " + i);
        }
    }
}
