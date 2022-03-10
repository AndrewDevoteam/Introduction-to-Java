package devoteam.training.javaoneforall.introduction;


public class Class05ConditionalStatements03 {
    public static void main(String[] args) {
        //if salary > 2000 buy ps5
        double salary = 3500D;
        String shouldBuy = "Buy ps5";
        String dontBuy = "Dont buy ps5";

        //(condition) ? <true> : <false>
        String displayMessage;
        displayMessage = salary > 2000 ? shouldBuy : dontBuy;

//        if(salary > 500){
//            displayMessage = shouldBuy;
//        }
//        else{
//            displayMessage = dontBuy;
//        }


        System.out.println(displayMessage);
    }
}
