package devoteam.training.javaoneforall.javacore.Gassociation.test;

import devoteam.training.javaoneforall.javacore.Gassociation.domain.Place;
import devoteam.training.javaoneforall.javacore.Gassociation.domain.Professor;
import devoteam.training.javaoneforall.javacore.Gassociation.domain.Seminar;
import devoteam.training.javaoneforall.javacore.Gassociation.domain.Student;

public class ExerciseAssociationTest01 {
    public static void main(String[] args) {
        Place place = new Place("Reigersbek");
        Student student = new Student("Token", 8);
        Student[] seminarStudents = {student};
        Seminar seminar = new Seminar("Intro to tech", seminarStudents, place);
        Seminar[] availableSeminars = {seminar};
        Professor professor = new Professor("Mackey", "mkay", availableSeminars);
        professor.print();
    }
}
