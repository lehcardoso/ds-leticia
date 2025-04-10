import java.util.Scanner;
public class Ldr17 {

    public static void main(String[] args) {

        Scanner scanner;
        scanner = new Scanner(System.in);
        
        System.out.print("Digite um numero inteiro para calcular o fatorial: ");
        int numero = scanner.nextInt();
        long fatorial = 1;

        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }

        System.out.println("Fatorial de " + numero + " é: " + fatorial);
        scanner.close();
    }
}
