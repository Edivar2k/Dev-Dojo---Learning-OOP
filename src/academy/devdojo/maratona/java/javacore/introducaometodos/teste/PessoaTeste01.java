package academy.devdojo.maratona.java.javacore.introducaometodos.teste;

import academy.devdojo.maratona.java.javacore.introducaometodos.dominio.Pessoa;

public class PessoaTeste01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setIdade(-5);
        pessoa.setNome("dudu");

        pessoa.imprime();


    }
}
