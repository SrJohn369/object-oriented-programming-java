package src.seresvivos;

public class Aluno {
    private String nome;
    private double mediaNotas;

    public String getNome() {
        return nome;
    }

    public double getMediaNotas() {
        return mediaNotas;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void calculaMedia(double nota1, double nota2, double nota3) {
        mediaNotas = (nota1 + nota2 + nota3) / 3;
    }
}
