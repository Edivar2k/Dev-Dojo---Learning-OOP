package academy.devdojo.maratona.java.javacore.introducaometodos.teste;
import java.util.Scanner;
import academy.devdojo.maratona.java.javacore.introducaometodos.dominio.Estudante;

import javax.print.attribute.standard.Destination;

public class TesteEstudante {
    public static void main(String[] args) {
        Estudante aluno = new Estudante();
        Estudante aluno2 = new Estudante();
        Scanner scanner = new Scanner(System.in);

        aluno.nome = scanner.nextLine();
        aluno.idade = scanner.nextInt();
        scanner.nextLine();
        aluno.sexo = scanner.next().charAt(0);
        scanner.nextLine();

        aluno2.nome = scanner.nextLine();
        aluno2.idade = scanner.nextInt();
        scanner.nextLine();
        aluno2.sexo = scanner.next().charAt(0);


        System.out.println("---------");
        // chamar funcao
        aluno.imprimir();
        aluno2.imprimir();
    }
}
