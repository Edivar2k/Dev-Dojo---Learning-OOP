package academy.devdojo.maratona.java.javacore.heranca.main;

public class Pessoa {
    private String nome;
    private String cpf;
    private Endereco endereco;

    public Pessoa(String nome, String cpf, Endereco endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void Imprimir(){
        System.out.println(nome);
        System.out.println(cpf);
        System.out.println(endereco.getCep());
        System.out.println(endereco.getRua());
    }

}
