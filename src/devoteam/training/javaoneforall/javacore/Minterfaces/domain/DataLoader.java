package devoteam.training.javaoneforall.javacore.Minterfaces.domain;

public interface DataLoader {
    public static final int MAX_DATA_SIZE = 10;
    public abstract void load();
    public default void checkPermissions(){
        System.out.println("Checking permissions....");
    };
    public static void retrieveMaxDataSize(){
        System.out.println("Inside retrieve maxDataSize in the interface");
    }
}
