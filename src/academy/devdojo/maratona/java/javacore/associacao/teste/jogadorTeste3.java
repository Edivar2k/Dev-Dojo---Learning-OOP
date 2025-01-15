package academy.devdojo.maratona.java.javacore.associacao.teste;

import academy.devdojo.maratona.java.javacore.associacao.main.Jogador;
import academy.devdojo.maratona.java.javacore.associacao.main.Time;

public class jogadorTeste3 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("cafu");
        Jogador jogador1 = new Jogador("Kaká");
        Jogador jogador2 = new Jogador("Messi");
        Time time = new Time("Brasil");
        Time time5 = new Time("Argentina");


        

        System.out.println("jogadores");
        jogador.imprimi();
        jogador1.imprimi();
        System.out.println();
        System.out.println("time");
        time.imprimir();
    }
}
