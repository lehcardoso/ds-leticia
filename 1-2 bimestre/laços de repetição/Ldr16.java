public class Ldr16 {

    public static void main(String[] args) {
        int a = 0, b = 1;

        System.out.print("Série de Fibonacci até que o valor seja maior que 500: ");
        while (a <= 500) {
            System.out.print(a + " ");
            int temp = a;
            a = b;
            b = temp + b;
        }
    }
}