import java.util.Scanner;
public class Ldr1 {

    public static void main(String[] args) {

        Scanner scanner;
        scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        double primeiroValor = scanner.nextDouble();

        double segundoValor;

        while (true) {
            System.out.print("Digite o segundo valor (nao pode ser zero): ");
            segundoValor = scanner.nextDouble();

            if (segundoValor != 0) {
                break;
            } else {
                System.out.println("O segundo valor nao pode ser zero. Tente novamente.");
            }
        }

        double resultado = primeiroValor / segundoValor;
        System.out.println("Resultado da divisao: " + resultado);

        scanner.close(); 
    }
}
