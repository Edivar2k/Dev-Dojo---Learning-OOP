package academy.devdojo.maratona.java.javacore.Polimosfismo.Teste;

import academy.devdojo.maratona.java.javacore.Polimosfismo.main.Computador;
import academy.devdojo.maratona.java.javacore.Polimosfismo.main.Tomate;
import academy.devdojo.maratona.java.javacore.Polimosfismo.servico.CalculoImposto;

public class ProduoTeste {
    public static void main(String[] args) {
        Tomate tomate = new Tomate("id1233", 7.89);
        Computador computador = new Computador("id1235", 2500.99);

        CalculoImposto.calcularImposto(computador);
        System.out.println("------------");
        CalculoImposto.calcularImposto(tomate);

    }
}
