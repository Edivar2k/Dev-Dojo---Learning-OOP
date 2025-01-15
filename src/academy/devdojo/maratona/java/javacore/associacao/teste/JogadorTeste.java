package academy.devdojo.maratona.java.javacore.associacao.teste;

import academy.devdojo.maratona.java.javacore.associacao.main.Jogador;
    public class JogadorTeste {
        public static void main(String[] args) {
        Jogador j1 = new Jogador("pilé");
        Jogador j2 = new Jogador("romerio");
        Jogador j3 = new Jogador("cifu");
        Jogador[] jogadores = {j1,j2,j3}; // preciso passar as referencias
            for (Jogador jogador : jogadores) {
                jogador.imprimi();
            }

        }
    }