package academy.devdojo.maratona.java.javacore.Polimosfismo.main;

public class Computador extends Produto {
    public static final double Imposto = 0.21;
    public Computador(String name, double value) {
        super(name, value);
    }

    @Override
    public double calculaTaxa() {
        System.out.println("imposto computador");
        return this.value * Imposto;
    }

}
