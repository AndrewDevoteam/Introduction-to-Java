package devoteam.training.javaoneforall.javacore.Bintroductionmethods.test;

import devoteam.training.javaoneforall.javacore.Bintroductionmethods.domain.Student;

public class StudentTest02 {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();

        student1.name = "Cartman";
        student1.gender = 'M';
        student1.age = 15;

        student2.name = "Kyle";
        student2.gender = 'M';
        student2.age = 28;

        student1.print();
        student2.print();    }
}
