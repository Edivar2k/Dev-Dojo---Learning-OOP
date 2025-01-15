package academy.devdojo.maratona.java.javacore.associacao.teste;

import academy.devdojo.maratona.java.javacore.associacao.main.Escola;
import academy.devdojo.maratona.java.javacore.associacao.main.Professor;

public class EscolaTest {
    public static void main(String[] args) {
        Professor professor = new Professor("jefferson");
        Professor professor2 = new Professor("rainara");

        Professor[] professores = {professor,professor2};

        Escola escola = new Escola("UFC", professores);
        escola.imprime();
    }
}
