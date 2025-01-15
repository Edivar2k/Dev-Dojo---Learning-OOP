package academy.devdojo.maratona.java.javacore.blocosinicializacao.teste;

import academy.devdojo.maratona.java.javacore.blocosinicializacao.main.Anime;

public class AnimeTeste {
    public static void main(String[] args) {
        Anime anime = new Anime();
        for (int episodio : anime.getEpisodios()) {
            System.out.print(episodio + " ");
        }

    }
}
