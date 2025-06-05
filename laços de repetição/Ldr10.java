import java.util.Scanner;
public class Ldr10 {

    public static void main(String[] args) {

        Scanner scanner;
        scanner = new Scanner(System.in);
        
        System.out.print("Digite um valor N (maior que 0): ");
        int N = scanner.nextInt();

        for (int i = 1; i <= N; i++) {
            System.out.println(i);
        }
        
        scanner.close();
    }
}
