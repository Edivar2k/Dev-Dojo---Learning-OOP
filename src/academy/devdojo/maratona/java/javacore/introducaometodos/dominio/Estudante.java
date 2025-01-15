package academy.devdojo.maratona.java.javacore.introducaometodos.dominio;

public class Estudante {
    public String nome;
    public char sexo;
    public int idade;

    public void imprimir () { // eu tava passando parametro, mas no teste eu nao coloquei, por isso estava dando erro

        // estudante.nome = "Sasuke" --> ele vai imprimir o nomme sasuke, pois eu passei a referencia dentro do metodo
        System.out.println( this.nome);
        System.out.println( this.idade);
        System.out.println(this.sexo); // --> o this serve para referenciar ao proprio objeto em questao
    }
}
