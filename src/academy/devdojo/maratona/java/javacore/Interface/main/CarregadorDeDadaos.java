package academy.devdojo.maratona.java.javacore.Interface.main;

public interface CarregadorDeDadaos {
    void load();
    default void checkPermission(){ // com defalt eu posso adiconar esse metodo na classe sem que outras que estejam com a msm implementação necessitem adiciona-la.
        System.out.println("checando permissoes");
    }
}
