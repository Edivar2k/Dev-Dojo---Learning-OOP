package academy.devdojo.maratona.java.javacore.introducaometodos.teste;

import academy.devdojo.maratona.java.javacore.introducaometodos.dominio.Calculadora;

public class CalculadoraTeste01
{
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int[] numeros = {1,2,3,4 };
        calculadora.somaArray(numeros);
        calculadora.somaVarArgs(1,2,3,4,5); // posso passar somente numeros, coisa que o somaArray nao faz.
    }
}
