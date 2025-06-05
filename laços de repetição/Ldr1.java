import java.util.Scanner;
public class Ldr1 {

    public static void main(String[] args) {

        Scanner scanner;
        scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        double primeiroValor = scanner.nextDouble();

        double segundoValor;

        while (true) {
            System.out.print("Digite o segundo valor: ");
            segundoValor = scanner.nextDouble();

            if (segundoValor != 0) {
                break;
            } 
        }

        double resultado = primeiroValor / segundoValor;
        System.out.println("Resultado da divisao: " + resultado);

        scanner.close(); 
    }
}
