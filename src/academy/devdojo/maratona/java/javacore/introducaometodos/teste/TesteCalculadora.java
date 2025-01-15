package academy.devdojo.maratona.java.javacore.introducaometodos.teste;
import academy.devdojo.maratona.java.javacore.introducaometodos.dominio.Calculadora;
import java.util.Scanner;

public class TesteCalculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int y = scanner.nextInt();
        Calculadora calcular = new Calculadora();
        int mult = calcular.multNumeros(n,y); // ele vai lá dentro e busca a referencia para o calculo
        calcular.somarNumeros(); // obedece a sequencia
        int result = calcular.subtrairNumeros(n,y);
        System.out.println(result + mult);
        // agora com return
    }
}
