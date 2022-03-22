package devoteam.training.javaoneforall.javacore.Minterfaces.domain;

public class DataBaseLoader implements DataLoader, DataRemover {
    @Override
    public void load() {
        System.out.println("Loading data from database...");
    }

    @Override
    public void remove() {
        System.out.println("Removing Data from database");
    }

    @Override
    public void checkPermissions() {
        System.out.println("checking permissions in file...");
    }

    public static void retrieveMaxDataSize(){
        System.out.println("Inside retrieve maxDataSize in the class DatabaseLoader");
    }
}
