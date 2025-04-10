import java.util.Scanner;
public class Ldr13 {

    public static void main(String[] args) {

        Scanner scanner;
        scanner = new Scanner(System.in);
        int valor;

        do {
            System.out.print("Digite um valor entre 1 e 10: ");
            valor = scanner.nextInt();
            if (valor < 1 || valor > 10) {
                System.out.println("Valor inválido. Tente novamente.");
            }
        } while (valor < 1 || valor > 10);

        System.out.println("Tabuada do " + valor + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(valor + " x " + i + " = " + (valor * i));
        }

        scanner.close();
    }
}