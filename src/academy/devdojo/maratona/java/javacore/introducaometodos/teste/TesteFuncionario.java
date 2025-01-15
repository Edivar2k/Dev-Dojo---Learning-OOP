package academy.devdojo.maratona.java.javacore.introducaometodos.teste;

import academy.devdojo.maratona.java.javacore.introducaometodos.dominio.Funcionario;

public class TesteFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Reginaldo");
        funcionario.setIdadade(19);
        funcionario.setSalario(new double[] {700, 800, 950});

        funcionario.Imprime();
    }
}
