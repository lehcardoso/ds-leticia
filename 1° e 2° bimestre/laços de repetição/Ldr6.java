import java.util.Scanner;

public class Ldr6 {
public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            double nota1 = lerNota(scanner, "Digite a nota da 1a avaliacao (0 a 10): ");
            double nota2 = lerNota(scanner, "Digite a nota da 2a avaliacao (0 a 10): ");

            double media = (nota1 + nota2) / 2;
            
            System.out.printf("A media do aluno vai ser: %.2f%n", media);
            
            System.out.print("NOVO CALCULO (S/N)? ");
            String resposta = scanner.next().trim().toUpperCase();
            if (!resposta.equals("S")) {
                continuar = false; 
            }
        }

        scanner.close();
        System.out.println("Programa encerrado.");
    }
    
    private static double lerNota(Scanner scanner, String mensagem) {
        double nota;
        while (true) {
            System.out.print(mensagem);
            nota = scanner.nextDouble();
            if (nota >= 0 && nota <= 10) {
                return nota;
            } else {
                System.out.println("Nota invalida! Por favor, insira um valor entre 0 e 10.");
            }
        }

    }
    
}
