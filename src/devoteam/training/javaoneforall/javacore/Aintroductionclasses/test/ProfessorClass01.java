package devoteam.training.javaoneforall.javacore.Aintroductionclasses.test;

import devoteam.training.javaoneforall.javacore.Aintroductionclasses.domain.Professor;

public class ProfessorClass01 {
    public static void main(String[] args) {
        Professor professor = new Professor();

        professor.name = "Kami";
        professor.age = 55;
        professor.gender = 'M';

        System.out.println("Name " + professor.name + " Age " + professor.age + " Gender " + professor.gender );
    }
}
