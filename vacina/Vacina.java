
package vacina;
import java.util.Scanner;

public class Vacina {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Insira o tamanho do seu arranjo. ");
        
        int tamanho = entrada.nextInt();
        int[] n = new int[tamanho];
                
        for (int i = 0; i < tamanho; i++) {
            n[i] = (int)(Math.random() * tamanho);
        }
        
        int ultimoN = n[tamanho - 1];
        
        int c = 0;
        for (int i = 0; i < tamanho - 1; i++) {
            if (n[i] == ultimoN) {
                c++;
        }
        }
        
        System.out.println("Genes analisados: ");
        for (int num : n) {
            System.out.print(num + " ");
        }
        System.out.println();
        if (c > 1) {
            System.out.println("Achei o danado!");
        } else if (c == 1) {
            System.out.println("Ainda nao é o suficiente!");
        } else {
            System.out.println("Sumiu");
        }
    }
}
