package devoteam.training.javaoneforall.javacore.Bintroductionmethods.test;

import devoteam.training.javaoneforall.javacore.Bintroductionmethods.domain.Student;
import devoteam.training.javaoneforall.javacore.Bintroductionmethods.domain.StudentPrinter;

public class StudentTest01 {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        StudentPrinter printer = new StudentPrinter();

        student1.name = "Cartman";
        student1.gender = 'M';
        student1.age = 15;

        student2.name = "Kyle";
        student2.gender = 'M';
        student2.age = 28;

        printer.print(student1);
        printer.print(student2);
    }
}
