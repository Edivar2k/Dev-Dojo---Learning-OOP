package academy.devdojo.maratona.java.javacore.associacao.main;

public class Escola {
    private String nome;
    private Professor[] professores;
    private Escola[] escola;



    public void imprime(){
        if(professores == null){
            return;
        } else {
            for (Professor professore : professores) {
                System.out.println(professore.getNome());
            }
        }

        if (nome != null) {
            System.out.println(nome);
        }
    }


    public Escola(String nome) {
        this.nome = nome;
    }

    public Escola(String nome, Professor[] professores) {
        this.nome = nome;
        this.professores = professores;
    }

    public Escola[] getEscola() {
        return escola;
    }

    public void setEscola(Escola[] escola) {
        this.escola = escola;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor[] getProfessores() {
        return professores;
    }

    public void setProfessores(Professor[] professores) {
        this.professores = professores;
    }
}
