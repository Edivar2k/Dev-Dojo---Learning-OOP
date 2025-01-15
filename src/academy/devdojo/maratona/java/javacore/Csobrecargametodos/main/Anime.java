package academy.devdojo.maratona.java.javacore.Csobrecargametodos.main;

public class Anime {
    private String tipo;
    private int ep;
    private String nome;
    private String genero;


    public void init (String tipo, int ep, String nome, String genero){ // sobrecarga de metodos!
        this.init(tipo ,ep, nome);
        this.genero = genero;
    }

    public void init (String tipo, int ep, String nome){
        this.nome = nome;
        this.ep = ep;
        this.tipo = tipo;
    }

    public void imprimi(){
        System.out.println(this.tipo);
        System.out.println(this.ep);
        System.out.println(this.nome);
        System.out.println(this.genero);
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
