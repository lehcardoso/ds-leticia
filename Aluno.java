package javaatividade;

import java.util.Date;

public class Aluno extends Pessoa {
    public String matricula;

    public Aluno(String nome, String cpf, Date dataNascimento, String matricula) {
        super(nome, cpf, dataNascimento);
        this.matricula = matricula;
    }

    @Override
    public double tirarCopias(int qtd) {
        return 0.07 * qtd;
    }
}
