package academy.devdojo.maratona.java.javacore.Interface.main;

public class FileLoader implements CarregadorDeDadaos, DataBaseRemove{
    @Override
    public void load() {
        System.out.println("carregando essa marmota");
    }

    @Override
    public void DataRemove() {
        System.out.println("removendo esssa marmota");
    }
}
