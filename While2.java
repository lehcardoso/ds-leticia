package while2;

public class While2 {

    public static void main(String[] args) {

        System.out.println("Numeros pares de 1 a 100:");

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}