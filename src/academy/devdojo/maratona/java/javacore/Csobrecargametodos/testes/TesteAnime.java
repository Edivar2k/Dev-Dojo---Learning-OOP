package academy.devdojo.maratona.java.javacore.Csobrecargametodos.testes;

import academy.devdojo.maratona.java.javacore.Csobrecargametodos.main.Anime;

public class TesteAnime {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("shounem", 12, "boku no hero", "tv");
        anime.imprimi();
    }
}
