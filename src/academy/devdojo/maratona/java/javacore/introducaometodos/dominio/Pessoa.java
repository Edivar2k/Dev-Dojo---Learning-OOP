package academy.devdojo.maratona.java.javacore.introducaometodos.dominio;

public class Pessoa {
    private String nome;

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if(idade < 0){
            System.out.println("nao é possivel ter idade negativa");
            return;
        } else {
            this.idade = idade;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    private int idade;


    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.idade);
    }
}
