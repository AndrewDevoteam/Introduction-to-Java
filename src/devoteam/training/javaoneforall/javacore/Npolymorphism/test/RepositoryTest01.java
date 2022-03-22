package devoteam.training.javaoneforall.javacore.Npolymorphism.test;

import devoteam.training.javaoneforall.javacore.Npolymorphism.repository.Repository;
import devoteam.training.javaoneforall.javacore.Npolymorphism.service.DatabaseRepositoryService;
import devoteam.training.javaoneforall.javacore.Npolymorphism.service.InMemoryRepositoryService;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class RepositoryTest01 {
    public static void main(String[] args) {
        Repository dbservice = new InMemoryRepositoryService();
        dbservice.save();
        List<String> list = new LinkedList<>();
        list.add("Goku");
        list.add("Gohan");
        list.add("Vegeta");
        System.out.println(list);

    }
}
