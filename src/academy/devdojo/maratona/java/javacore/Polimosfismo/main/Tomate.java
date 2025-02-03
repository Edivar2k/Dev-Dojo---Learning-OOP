package academy.devdojo.maratona.java.javacore.Polimosfismo.main;

public class Tomate extends Produto {
    public static final double Imposto = 0.03;
    private String validade;
    public Tomate(String name, double value) {
        super(name, value);
    }

    @Override
    public double calculaTaxa() {
        System.out.println("imposto tomate");
        return this.value * Imposto;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    public String getValidade() {
        return validade;
    }
}
