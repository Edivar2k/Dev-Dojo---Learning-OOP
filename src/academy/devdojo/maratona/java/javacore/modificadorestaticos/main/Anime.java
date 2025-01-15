package academy.devdojo.maratona.java.javacore.modificadorestaticos.main;

public class Anime {
    private String nome;
    private static int[] episodios;
    static {
        episodios = new int[100];
        for (int a = 0; a < episodios.length; a++) {
            episodios[a] = a + 1;
        }
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime(){
        for(int ep: Anime.episodios){
            System.out.print(ep + " ");
        }
        System.out.println();
    }

    public int[] getEpisodios() {
        return episodios;
    }

    public String getNome() {
        return nome;
    }
}


