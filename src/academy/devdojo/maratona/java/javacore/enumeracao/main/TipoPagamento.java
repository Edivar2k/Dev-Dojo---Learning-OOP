package academy.devdojo.maratona.java.javacore.enumeracao.main;

import javax.xml.validation.Validator;

public enum TipoPagamento {
    DEBITO {
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.2;
        }
    }
   ,CRETIDO {
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.1;
        }
    };


    public abstract double calcularDesconto (double valor);
}
