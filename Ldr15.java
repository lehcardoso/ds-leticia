import java.util.Scanner;
public class Ldr15 {

    public static void main(String[] args) {

        Scanner scanner;
        scanner = new Scanner(System.in);
        
        System.out.print("Digite o valor de n (n-esimo termo da série de Fibonacci): ");
        int n = scanner.nextInt();
        
        int a = 1, b = 1;
        
        System.out.print("Serie de Fibonacci até o " + n + "º termo: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int temp = a;
            a = b;
            b = temp + b;
        }
        
        scanner.close();
    }
}
