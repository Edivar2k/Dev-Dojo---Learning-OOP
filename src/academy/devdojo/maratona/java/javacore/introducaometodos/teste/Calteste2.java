package academy.devdojo.maratona.java.javacore.introducaometodos.teste;

import academy.devdojo.maratona.java.javacore.introducaometodos.dominio.Calculadora;

public class Calteste2 {
    public static void main(String[] args) {
        Calculadora cal = new Calculadora();
        int n = 1 , y = 2;
        cal.alteraDoisNumeros(n,y);
        System.out.println("CALCULADORA2");
        System.out.println(n +" "+ y);
    }
}
