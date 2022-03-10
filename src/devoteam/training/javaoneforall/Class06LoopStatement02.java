package devoteam.training.javaoneforall;

public class Class06LoopStatement02 {
    public static void main(String[] args) {
        for (int i = 0; i < 1000000; i++) {
            if(i%2 == 0)
            System.out.println("Even Numbers " + i);
        }
    }
}
