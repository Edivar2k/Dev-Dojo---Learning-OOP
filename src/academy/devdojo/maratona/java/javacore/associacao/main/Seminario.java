package academy.devdojo.maratona.java.javacore.associacao.main;

import academy.devdojo.maratona.java.javacore.introducaometodos.dominio.Pessoa;

public class Seminario {
    private String titulo;
    private Aluno[] alunos;

    public Seminario(String titulo, Aluno[] alunos) {
        this.titulo = titulo;
        this.alunos = alunos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;

    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }


    public void Imprimi(){
        System.out.println(getTitulo());
        if(alunos != null){
            for (int i = 0; i < alunos.length; i++) {
                System.out.println("nome: " + alunos[i].getNome() + " " + "idade: " + alunos[i].getIdade());
            }
        } else {
            System.out.println("nenhum aluno se cadastrou");
        }
    }
}
