package src;

import src.seresvivos.Aluno;
import src.seresvivos.Pessoa;

public class Principal {
    public static void main(String[] args) {
        // Iniciando classes
        Pessoa cleiton = new Pessoa("Cleiton", 12, "Masculino", 1.30);
        Aluno aluno1 = new Aluno();

        aluno1.cadastraAluno(cleiton, 3, 23);
        System.out.println(aluno1);
    }
}
