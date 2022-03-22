package devoteam.training.javaoneforall.javacore.Minterfaces.domain;

public class FileLoader implements  DataLoader, DataRemover{
    @Override
    public void load() {
        System.out.println("Loading data from file...");
    }

    @Override
    public void remove() {
        System.out.println("Removing data from file...");
    }

    @Override
    public void checkPermissions() {
        System.out.println("checking permissions in file...");
    }
}
