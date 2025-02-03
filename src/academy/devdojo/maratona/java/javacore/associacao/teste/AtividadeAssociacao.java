package academy.devdojo.maratona.java.javacore.associacao.teste;

import academy.devdojo.maratona.java.javacore.associacao.main.Aluno;
import academy.devdojo.maratona.java.javacore.associacao.main.Professor;
import academy.devdojo.maratona.java.javacore.associacao.main.Seminario;
public class AtividadeAssociacao {
    public static void main(String[] args) {





    Aluno a1 = new Aluno("jeffin", 20);
    Aluno a2 = new Aluno("maria", 20);
    Aluno a3 = new Aluno("ronald", 20);
    Aluno a4 = new Aluno("cabillo", 20);
    Aluno a5 = new Aluno("mosresta", 20);
    Aluno a6 = new Aluno("graff", 20);
    Aluno a7 = new Aluno("tomioka", 20);

    Aluno[] semi1 = {a1,a2,a4};
    Aluno[] semi2 = {a3,a5,a6};
    Aluno[] semi3 = {a7};

    Seminario s1 = new Seminario("Introducao a ml", semi1);
    Seminario s2 = new Seminario("evasao de dados", semi3);
    Seminario s3 = new Seminario("Estrutua de dados", semi2);

    Seminario[] s1p1 = {s1,s2};
    Seminario[] s2p2 = {s3};

    Professor p1 = new Professor("Jeff", s1p1);
    Professor p2 = new Professor("Rainara", s2p2);

        System.out.println("SEMINARIOS");
        s1.Imprimi();
        System.out.println("-----------");
        s2.Imprimi();
        System.out.println("-----------");
        s3.Imprimi();

        System.out.println("PROFESSORES");
        p1.imprimir();
        System.out.println("-----------");
        p2.imprimir();




    }
}
