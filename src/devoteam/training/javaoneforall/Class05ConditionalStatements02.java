package devoteam.training.javaoneforall;

public class Class05ConditionalStatements02 {
    public static void main(String[] args) {
        // age < 15 category is junior
        // age >= 15  && age <18 category is senior
        // age >= 18 category is Master
        int age = 15;
        String category;
        if(age < 15){
            category = "Junior";
        }
        else if (age >= 15 && age < 18){
            category = "Senior";
        }
        else{
            category = "Master";
        }
        category = age < 15 ? "Junior" : age >= 15 && age < 18 ? "Senior": "Master";
        System.out.println(category);
    }
}

