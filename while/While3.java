import java.util.Scanner;

public class While3 {

    public static void main(String[] args) {

        Scanner scanner;
        scanner = new Scanner(System.in);

        System.out.print("Digite um numero inteiro: ");
        int numero = scanner.nextInt();

        System.out.println("Numeros pares de 1 a " + numero + ":");
        for (int i = 1; i <= numero; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        System.out.println("Numeros impares de 1 a " + numero + ":");
        for (int i = 1; i <= numero; i++) {
            if (i % 2 != 0) { 
                System.out.println(i);
            }
        }

        scanner.close(); 
    }
    
}