package javaatividade;

import java.util.Date;

public class Pessoa {
    public String nome;
    public String cpf;
    public Date dataNascimento;

    public Pessoa(String nome, String cpf, Date dataNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

    public double tirarCopias(int qtd) {
        return 0.10 * qtd;
    }
}
