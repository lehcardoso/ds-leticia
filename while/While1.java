package while1;

public class While1 {

    public static void main(String[] args) {
     
        System.out.println("Numeros impares de 1 a 100:");

        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) { 
                System.out.println(i);
            }
        }
    }
}
