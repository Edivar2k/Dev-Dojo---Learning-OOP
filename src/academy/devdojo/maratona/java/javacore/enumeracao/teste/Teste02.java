package academy.devdojo.maratona.java.javacore.enumeracao.teste;

import academy.devdojo.maratona.java.javacore.enumeracao.main.Cliente;
import academy.devdojo.maratona.java.javacore.enumeracao.main.TipoCliente;
import academy.devdojo.maratona.java.javacore.enumeracao.main.TipoPagamento;

public class Teste02 {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("jose", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
        Cliente cliente2 = new Cliente("maria", TipoCliente.PESSOA_JURIDICA, TipoPagamento.DEBITO);
        Cliente cliente3 = new Cliente("astolfo", TipoCliente.PESSOA_FISICA, TipoPagamento.CRETIDO);

        System.out.println(cliente.getTipoPagamento(TipoPagamento.DEBITO.calcularDesconto(600)));
        System.out.println(cliente2);
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(300.50));

    }
}
