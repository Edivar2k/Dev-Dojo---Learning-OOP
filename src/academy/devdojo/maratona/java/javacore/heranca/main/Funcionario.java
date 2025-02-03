package academy.devdojo.maratona.java.javacore.heranca.main;

public class Funcionario extends Pessoa{
    private double salario;


   public Funcionario(String nome , String cpf, Endereco endereco, double salario){
       super(nome,cpf,endereco);
       this.salario = salario;
   }

    @Override
    public void Imprimir() {
        super.Imprimir();
        System.out.println(salario);
    }
}
