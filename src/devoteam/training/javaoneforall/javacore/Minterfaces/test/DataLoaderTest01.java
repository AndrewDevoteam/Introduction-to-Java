package devoteam.training.javaoneforall.javacore.Minterfaces.test;

import devoteam.training.javaoneforall.javacore.Minterfaces.domain.DataBaseLoader;
import devoteam.training.javaoneforall.javacore.Minterfaces.domain.DataLoader;
import devoteam.training.javaoneforall.javacore.Minterfaces.domain.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DataBaseLoader dataBaseLoader = new DataBaseLoader();
        FileLoader fileLoader = new FileLoader();
        dataBaseLoader.load();
        dataBaseLoader.remove();
        fileLoader.load();
        fileLoader.remove();
        dataBaseLoader.checkPermissions();
        fileLoader.checkPermissions();
        DataLoader.retrieveMaxDataSize();
        DataBaseLoader.retrieveMaxDataSize();

    }
}
