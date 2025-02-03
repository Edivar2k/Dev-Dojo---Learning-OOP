package academy.devdojo.maratona.java.javacore.Polimosfismo.main;

public abstract class Produto implements TaxaProduto {
    protected String name;
    protected double value;

    public Produto(String name, double value){
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public double getValue() {
        return value;
    }

    @Override
    public double calculaTaxa() {
        return 0;
    }
}
