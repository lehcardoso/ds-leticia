package javaatividade;

import java.util.Date;

public class EscolaMain {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("José Francisco", "123.456.789-00", new Date(), "A12345");
        Professor professor = new Professor("Maria Silva", "987.654.321-00", new Date(), 2500.00, "Matemática");
        Funcionario funcionario = new Funcionario("Carlos Souza", "111.222.333-44", new Date(), 1500.00, new Date(), "Secretário");

        System.out.println("Aluno: " + aluno.nome);
        System.out.println("Valor das cópias (100): R$ " + aluno.tirarCopias(100));

        System.out.println("\nProfessor: " + professor.nome);
        System.out.println("Valor das cópias (100): R$ " + professor.tirarCopias(100));

        System.out.println("\nFuncionário: " + funcionario.nome);
        System.out.println("Valor das cópias (100): R$ " + funcionario.tirarCopias(100));
    }
}
