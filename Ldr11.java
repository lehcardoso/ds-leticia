import java.util.Scanner;
public class Ldr11 {

    public static void main(String[] args) {

        Scanner scanner;
        scanner = new Scanner(System.in);
        int N;

        do {
            System.out.print("Digite um valor N (maior que 0): ");
            N = scanner.nextInt();
            if (N <= 0) {
                System.out.println("Valor invalido. Tente novamente.");
            }
        } while (N <= 0);

        for (int i = 1; i <= N; i++) {
            System.out.println(i);
        }
        
        scanner.close();
    }
}