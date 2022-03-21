package devoteam.training.javaoneforall.javacore.Gassociation.test;

import devoteam.training.javaoneforall.javacore.Gassociation.domain.Professor;
import devoteam.training.javaoneforall.javacore.Gassociation.domain.School;

public class SchoolTest01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Butters");
        Professor professor2 = new Professor("Kyle");
        Professor[] professors = {professor1, professor2};
        School school = new School("South park elementary", professors);
        school.print();
    }
}
