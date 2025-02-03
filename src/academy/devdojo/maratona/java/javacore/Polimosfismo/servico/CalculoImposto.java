package academy.devdojo.maratona.java.javacore.Polimosfismo.servico;

import academy.devdojo.maratona.java.javacore.Polimosfismo.main.Computador;
import academy.devdojo.maratona.java.javacore.Polimosfismo.main.Produto;
import academy.devdojo.maratona.java.javacore.Polimosfismo.main.Tomate;

public class CalculoImposto {

    public static void calcularImposto(Produto produto){
        System.out.println("relatorio");
        double imposto = produto.calculaTaxa();
        System.out.println("id do produto: " + produto.getName());
        System.out.println("valor pago: " + produto.getValue());
        System.out.println("imposto do produto: " + imposto);
        if(produto instanceof Tomate tomate){
            System.out.println(tomate.getValidade());
        }
    }
}
