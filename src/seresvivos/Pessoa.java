package src.seresvivos;

import src.objeto.Comida;

public class Pessoa extends SerVivo implements SerVivoInterface{
    private double altura;

    public Pessoa(String nome, int idade, String sexo, double altura) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.altura = altura;
    };

    public double getAltura() {
        return altura;
    }

    @Override
    public void beberAgua() {
        System.out.printf("%s está bebendo água", this.nome);
    }

    // Polimorfismo e Agregação
    @Override
    public void comer(Comida comida) {
        System.out.printf("%s está comendo", this.nome);
        
    }

    @Override
    public void fazerNecessidades(int numNecessidade) {
        if (numNecessidade == 1) {
            System.out.println(this.nome + " fez xixi!");
        } else if (numNecessidade == 2) {
            System.out.println(this.nome + " fez cocô!");
        } else {
            System.out.println("Valor incorreto!");
        }
    }

    @Override
    public void fazerSom() {
        System.out.println(this.nome + " está emitindo algum som");
    }
}
