package academy.devdojo.maratona.java.javacore.construtores.testes;


import academy.devdojo.maratona.java.javacore.construtores.main.Anime;

public class TesteAnime {
    public static void main(String[] args) {
        Anime anime = new Anime("tv", "shounem", "jujutsu", 12, "mappa");
        //anime.init("shounem", 12, "boku no hero", "tv");
        anime.imprimi();
    }
}
