package academy.devdojo.maratona.java.javacore.construtores.main;

public class  Anime {
    private String tipo;
    private int ep;
    private String nome;
    private String genero;
    private String produtora;

    public Anime(String tipo, String genero, String nome, int ep) {
        this.tipo = tipo;
        this.genero = genero;
        this.nome = nome;
        this.ep = ep;
    }

    public Anime (String tipo, String genero, String nome, int ep, String produtora){
        this(tipo, genero, nome, ep);
        this.produtora = produtora;
    }

    public void imprimi(){
        System.out.println(this.tipo);
        System.out.println(this.ep);
        System.out.println(this.nome);
        System.out.println(this.genero);
        System.out.println(this.produtora);
    }


    public int getEp() {
        return ep;
    }

    public void setEp(int ep) {
        if (this.ep < 0){
            System.out.println("invalido");
            return;
        } this.ep = ep;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
