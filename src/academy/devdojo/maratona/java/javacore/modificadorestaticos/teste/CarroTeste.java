package academy.devdojo.maratona.java.javacore.modificadorestaticos.teste;

import academy.devdojo.maratona.java.javacore.modificadorestaticos.main.Carro;

public class CarroTeste {
    public static void main(String[] args) {
        Carro c1 = new Carro("BMW", 250);
        Carro c2 = new Carro("Mercedes", 275);
        Carro c3 = new Carro("Audi", 290);

        Carro.setVeloLimite(180);
        c1.imprime();
        c2.imprime();
        c3.imprime();
    }
}
