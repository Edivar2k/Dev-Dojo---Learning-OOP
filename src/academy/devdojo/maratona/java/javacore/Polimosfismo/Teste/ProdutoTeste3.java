package academy.devdojo.maratona.java.javacore.Polimosfismo.Teste;

import academy.devdojo.maratona.java.javacore.Polimosfismo.main.Computador;
import academy.devdojo.maratona.java.javacore.Polimosfismo.main.Produto;
import academy.devdojo.maratona.java.javacore.Polimosfismo.main.Tomate;
import academy.devdojo.maratona.java.javacore.Polimosfismo.servico.CalculoImposto;

public class ProdutoTeste3 {
    public static void main(String[] args) {
        Produto produto = new Computador("zephyrus 16", 5879.89);
        Tomate tomate = new Tomate("tomate cereja", 9.99);
        tomate.setValidade("10/07/2025");

        CalculoImposto.calcularImposto(tomate);
        CalculoImposto.calcularImposto(produto);



    }
}
