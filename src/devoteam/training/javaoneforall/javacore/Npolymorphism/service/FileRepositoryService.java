package devoteam.training.javaoneforall.javacore.Npolymorphism.service;

import devoteam.training.javaoneforall.javacore.Npolymorphism.repository.Repository;

public class FileRepositoryService implements Repository {
    @Override
    public void save() {
        System.out.println("Saving in file ");
    }
}
