package src.seresvivos;

public class Pessoa {
    private String nome;
    private int idade;
    private String sexo;
    private double altura;

    public Pessoa(String nome, int idade, String sexo, double altura) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
    public String getSexo() {
        return sexo;
    }
    public double getAltura() {
        return altura;
    }
    
}
