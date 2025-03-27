  import java.util.Scanner;

public class While4 {

    public static void main(String[] args) {

        Scanner scanner;
        scanner = new Scanner(System.in);

        System.out.print("Quantos alunos tem na sala? ");
        int numeroAlunos = scanner.nextInt();

        double somaNotas = 0.0;
        int contador = 0;

        while (contador < numeroAlunos) {
            System.out.print("Digite a nota do aluno " + (contador + 1) + ": ");
            double nota = scanner.nextDouble();
            somaNotas += nota; 
            contador++; 
        }

        
        double media = somaNotas / numeroAlunos;

        System.out.println("A media das notas da turma é: " + media);

        scanner.close();
    }
}