package javaatividade;

import java.util.Date;

public class Funcionario extends Pessoa {
    public double salario;
    public Date dataAdmissao;
    public String cargo;

    public Funcionario(String nome, String cpf, Date dataNascimento, double salario, Date dataAdmissao, String cargo) {
        super(nome, cpf, dataNascimento);
        this.salario = salario;
        this.dataAdmissao = dataAdmissao;
        this.cargo = cargo;
    }
}
