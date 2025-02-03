package academy.devdojo.maratona.java.javacore.enumeracao.main;

public enum TipoCliente {
    PESSOA_JURIDICA(1),
    PESSOA_FISICA(2);

    public final int valor;
    public String nomeRelatorio;

    TipoCliente(int valor){
        this.valor = valor;
        this.nomeRelatorio = nomeRelatorio;
    }


    public int getValor() {
        return valor;
    }
}

