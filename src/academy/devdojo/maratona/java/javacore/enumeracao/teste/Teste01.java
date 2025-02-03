package academy.devdojo.maratona.java.javacore.enumeracao.teste;

import academy.devdojo.maratona.java.javacore.enumeracao.main.Cliente;
import academy.devdojo.maratona.java.javacore.enumeracao.main.TipoCliente;
import academy.devdojo.maratona.java.javacore.enumeracao.main.TipoPagamento;

public class Teste01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Edivar", TipoCliente.PESSOA_FISICA, TipoPagamento.CRETIDO);
        Cliente cliente2 = new Cliente("Fabio", TipoCliente.PESSOA_JURIDICA, TipoPagamento.DEBITO);
        Cliente cliente3 = new Cliente("Fabio", TipoCliente.PESSOA_FISICA, TipoPagamento.CRETIDO);
        Cliente cliente4 = new Cliente("Mesquita", TipoCliente.PESSOA_JURIDICA, TipoPagamento.DEBITO);
        Cliente cliente5 = new Cliente("Geronimo", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(cliente3);
        System.out.println(cliente4);
        System.out.println(cliente5);



        // inconsistencia de dados.
    }
}
