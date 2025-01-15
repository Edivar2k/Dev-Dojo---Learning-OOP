package academy.devdojo.maratona.java.javacore.introducaometodos.dominio;

public class Funcionario {
    private String nome;
    private int idadade;
    private double[] salario;
    private double media;

    public double getMedia() {
        return media;
    }
    public double[] getSalario() {
        return salario;
    }
    public void setSalario(double[] salario) {
        this.salario = salario;
    }
    public int getIdadade() {
        return idadade;
    }
    public void setIdadade(int idadade) {
        this.idadade = idadade;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }


    public void Imprime(){
        System.out.println("nome: "+nome);
        System.out.println("idade: "+idadade);
        System.out.println("salario:");
        for (int i = 0; i < 3; i++) {
            System.out.println(salario[i]);
        }
        MediaSalario();
    }

    public void MediaSalario (){
        double media = 0;
        for (int i = 0; i < 3; i++) {
            media += salario[i];
        }
        System.out.println("a media é: " + media/ salario.length);
    }
}
