package academy.devdojo.maratona.java.javacore.associacao.main;

public class Jogador {
    private String nome;
    private Time time;

    public void imprimi(){
        System.out.println(this.nome);
        if (time != null){
            System.out.println(time.getNome());
        } else {
            System.out.println("ainda nao assinou com nenhum clube");
        }
    }
    public Jogador(String nome){
        this.nome = nome;
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }
}
