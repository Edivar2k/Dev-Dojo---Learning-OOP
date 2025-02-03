package academy.devdojo.maratona.java.javacore.Interface.teste;

import academy.devdojo.maratona.java.javacore.Interface.main.DataBaseLoader;
import academy.devdojo.maratona.java.javacore.Interface.main.FileLoader;

public class TesteInterfac {
    public static void main(String[] args) {
        DataBaseLoader dataBaseLoader = new DataBaseLoader();
        FileLoader fileLoader = new FileLoader();

        dataBaseLoader.load();
        dataBaseLoader.DataRemove();
        fileLoader.load();
        fileLoader.DataRemove();
        dataBaseLoader.checkPermission(); // foi sobrescrito
    }
}
