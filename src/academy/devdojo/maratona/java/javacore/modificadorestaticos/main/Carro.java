package academy.devdojo.maratona.java.javacore.modificadorestaticos.main;

public class Carro {
    private String nome;
    private double veloMax;
    private static double veloLimite = 250;


    public Carro(String nome, double veloMax) {
        this.nome = nome;
        this.veloMax = veloMax;
    }

    public void imprime(){
        System.out.println("----------");
        System.out.println("nome " + this.nome);
        System.out.println("velocidade maxima " + this.veloMax);
        System.out.println("velocidade limite " + Carro.veloLimite);

    }

    public static void setVeloLimite(double veloLimite){
        Carro.veloLimite = veloLimite;
    }

    public static double getVeloLimite(){
        return Carro.veloLimite;
    }
    public double getVeloMax() {
        return veloMax;
    }

    public void setVeloMax(double veloMax) {
        this.veloMax = veloMax;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
