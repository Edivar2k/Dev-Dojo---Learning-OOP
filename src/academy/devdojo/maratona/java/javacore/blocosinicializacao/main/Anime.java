package academy.devdojo.maratona.java.javacore.blocosinicializacao.main;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Anime {
    private String nome;
    private int[] episodios;
    {
        episodios = new int[100];
        for (int a = 0; a < episodios.length; a++) {
            episodios[a] = a + 1;
        }
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime(){
        for(int ep: this.episodios){
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


