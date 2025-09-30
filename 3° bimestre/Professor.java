package javaatividade;

import java.util.Date;

public class Professor extends Pessoa {
    public double salario;
    public String disciplina;

    public Professor(String nome, String cpf, Date dataNascimento, double salario, String disciplina) {
        super(nome, cpf, dataNascimento);
        this.salario = salario;
        this.disciplina = disciplina;
    }
}
