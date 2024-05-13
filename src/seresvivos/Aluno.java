package src.seresvivos;

import src.seresvivos.Pessoa;

public class Aluno{
    private double mediaNotas;
    private String nome;
    private int idade;
    private int ano;
    private int numeroSala;

    @Override
    public String toString() {
        return String.format("""
                Aluno(a): %s
                Idade: %d
                Ano: %d
                Número da sala: %d""", this.nome, this.idade, this.ano, this.numeroSala);
    }

    public double getMediaNotas() {
        return mediaNotas;
    }

    // AGREGAÇÃO
    public void cadastraAluno(Pessoa pessoa, int ano, int numeroSala){
        this.nome = pessoa.nome;
        this.idade = pessoa.idade;
        this.ano = ano;
        this.numeroSala = numeroSala;
    }

    public void calculaMedia(double nota1, double nota2, double nota3) {
        mediaNotas = (nota1 + nota2 + nota3) / 3;
    }
}
