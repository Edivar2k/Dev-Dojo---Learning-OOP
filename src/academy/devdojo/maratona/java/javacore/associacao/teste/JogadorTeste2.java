package academy.devdojo.maratona.java.javacore.associacao.teste;

import academy.devdojo.maratona.java.javacore.associacao.main.Jogador;
import academy.devdojo.maratona.java.javacore.associacao.main.Time;

public class JogadorTeste2 {
    public static void main(String[] args) {
        Jogador j1 = new Jogador("messi");
        Time time = new Time("barcelona");
        j1.setTime(time);
        j1.imprimi();
    }
}
