import java.util.Scanner;
public class Ldr19 {

    public static void main(String[] args) {

        Scanner scanner;
        scanner = new Scanner(System.in);
        
        System.out.print("Digite a quantidade de numeros (N): ");
        int N = scanner.nextInt();
        
        int menor = Integer.MAX_VALUE;
        int maior = Integer.MIN_VALUE;
        int soma = 0;

        for (int i = 0; i < N; i++) {
            int numero;
            do {
                System.out.print("Digite o numero " + (i + 1) + " (entre 0 e 1000): ");
                numero = scanner.nextInt();
                if (numero < 0 || numero > 1000) {
                    System.out.println("Numero invalido. Tente novamente.");
                }
            } while (numero < 0 || numero > 1000);
            
            soma += numero;

            if (numero < menor) {
                menor = numero;
            }
            if (numero > maior) {
                maior = numero;
            }
        }

        System.out.println("Menor valor: " + menor);
        System.out.println("Maior valor: " + maior);
        System.out.println("Soma dos valores: " + soma);
        
        scanner.close();
    }
}