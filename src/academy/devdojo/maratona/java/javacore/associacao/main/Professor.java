package academy.devdojo.maratona.java.javacore.associacao.main;

public class Professor {
    private String nome;
    private Seminario[] seminarios;

    public Professor(String nome, Seminario[] seminarios){
        this.nome = nome;
        this.seminarios = seminarios;
    }
    public void imprimir(){
        System.out.println(nome);
        if(seminarios != null){
            for (int i = 0; i < seminarios.length; i++) {
                System.out.println(seminarios[i].getTitulo());
            }
        }
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
