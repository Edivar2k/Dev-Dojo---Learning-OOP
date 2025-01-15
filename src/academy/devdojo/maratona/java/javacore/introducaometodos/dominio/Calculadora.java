package academy.devdojo.maratona.java.javacore.introducaometodos.dominio;

public class Calculadora {
    public void somarNumeros(){
        System.out.println(10+40);
    }
    public int subtrairNumeros(int n, int y){
       return n - y;
    }

    public int multNumeros(int n, int y){
        return n * y;
    }

    public void alteraDoisNumeros (int n, int y){ // esses parametros nao estao sendo usados
        n = 9;
        y = 33;
        System.out.println( "Calucalora");
        System.out.println(n);
        System.out.println(y);
    }

    public void somaArray(int[] numeros){
        int soma = 0;
        for (int num: numeros) {
            soma += num;
        }
        System.out.println(soma);
    }

    public void somaVarArgs (int... numeros){
        int soma = 0;
        for (int num: numeros) {
            soma += num;
        }
        System.out.println(soma);
    }

}
