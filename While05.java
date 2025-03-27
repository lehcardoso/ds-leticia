import java.util.Scanner;
public class While05 {

    public static void main(String[] args) {

        Scanner scanner;
        scanner = new Scanner(System.in);

        int contador = 0;
        int maior = Integer.MIN_VALUE; 

        System.out.println("Digite 10 números:");

        while (contador < 10) {
            System.out.print("Número " + (contador + 1) + ": ");
            int numero = scanner.nextInt();

            if (numero > maior) {
                maior = numero;
            }

            contador++; 
        }

        System.out.println("O maior número digitado é: " + maior);

        scanner.close(); 
    }
}