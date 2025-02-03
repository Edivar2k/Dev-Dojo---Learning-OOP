package academy.devdojo.maratona.java.javacore.heranca.teste;

import academy.devdojo.maratona.java.javacore.heranca.main.Endereco;
import academy.devdojo.maratona.java.javacore.heranca.main.Funcionario;

public class HerancaTeste1 {
    public static void main(String[] args) {
        Endereco enderecoFuncionario = new Endereco("12334-123", "Av placio castelo");
        Funcionario funcionario = new Funcionario("Edivar", "091279", enderecoFuncionario , 700.00);

        funcionario.Imprimir();
    }
}
