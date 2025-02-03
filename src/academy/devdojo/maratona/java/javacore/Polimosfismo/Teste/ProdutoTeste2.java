package academy.devdojo.maratona.java.javacore.Polimosfismo.Teste;

import academy.devdojo.maratona.java.javacore.Polimosfismo.main.Computador;
import academy.devdojo.maratona.java.javacore.Polimosfismo.main.Produto;
import academy.devdojo.maratona.java.javacore.Polimosfismo.main.Tomate;
import academy.devdojo.maratona.java.javacore.Polimosfismo.servico.CalculoImposto;

public class ProdutoTeste2 {
    public static void main(String[] args) {
        Produto computado = new Computador("zephyrus 16", 5879.89);
        Produto alimento = new Tomate("tomate cereja", 9.99);

        CalculoImposto.calcularImposto(alimento);
        System.out.println("--------");
        CalculoImposto.calcularImposto(computado);
    }
}
