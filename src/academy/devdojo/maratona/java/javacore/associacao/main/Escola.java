package academy.devdojo.maratona.java.javacore.associacao.main;

public class Escola {
    private String nome;
    private Professor[] professores;



    public void imprime(){
        System.out.println(this.nome);
        if(professores == null){
            return;
        } else {
            for (Professor professore : professores) {
                System.out.println(professore.getNome());
            }

        }
    }


    public Escola(String nome) {
        this.nome = nome;
    }

    public Escola(String nome, Professor[] professores) {
        this.nome = nome;
        this.professores = professores;
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
