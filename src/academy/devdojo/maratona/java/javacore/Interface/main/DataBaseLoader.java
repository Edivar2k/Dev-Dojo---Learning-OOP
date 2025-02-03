package academy.devdojo.maratona.java.javacore.Interface.main;

public class DataBaseLoader implements CarregadorDeDadaos, DataBaseRemove{

    @Override
    public void load() {
        System.out.println("carregando dados do banco");
    }

    @Override
    public void DataRemove() {
        System.out.println("removendo dados");
    }

    @Override
    public void checkPermission() {
        System.out.println("checando permissoes no banco de dados");
    }
}
