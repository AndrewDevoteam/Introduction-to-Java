package devoteam.training.javaoneforall;

public class Class05ConditionalStatements06 {
    public static void main(String[] args) {
        byte day = 7;
        switch (day){
            case 1,2,3,4,5 : {
                System.out.println("Weekday");
            }
            break;
            case 6,7: {
                System.out.println("Weekend");
            }
            break;
            default:{
                System.out.println("Invalid option");
            }
            break;
        }
    }
}
