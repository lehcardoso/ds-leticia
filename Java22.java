 

package java22; 

  

  

public class Java22 { 

  

    public static void main(String[] args) throws Exception { 

        double precoAlcool = 2.90; 

        double precoGasolina = 3.30; 

  

        byte[] buffer = new byte[100]; 

  

        System.out.print("Digite o tipo de combustível (A para Álcool, G para Gasolina): "); 

        System.in.read(buffer); 

        char tipoCombustivel = (char) buffer[0]; 

  

        System.out.print("Digite o número de litros vendidos: "); 

        System.in.read(buffer); 

        double litros = Double.parseDouble(new String(buffer).trim()); 

  

        double valorAPagar = 0; 

  

        if (tipoCombustivel == 'A' || tipoCombustivel == 'a') { 

            valorAPagar = litros * precoAlcool; 

        } else if (tipoCombustivel == 'G' || tipoCombustivel == 'g') { 

            valorAPagar = litros * precoGasolina; 

        } else { 

            System.out.println("Tipo de combustível inválido. Por favor, digite 'A' para Álcool ou 'G' para Gasolina."); 

            return; 

        } 

  

        System.out.printf("Valor a ser pago: R$ %.2f%n", valorAPagar); 

    } 

} 

 