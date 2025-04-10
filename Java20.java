 

package java20; 

  

public class Java20 { 

  

    public static void main(String[] args) throws Exception { 

      

        byte[] buffer = new byte[100]; 

  

        System.out.print("Digite seu nome: "); 

        int nomeLength = System.in.read(buffer); 

        String nome = new String(buffer, 0, nomeLength - 2);  

  

        System.out.print("Digite sua altura (em metros): "); 

        nomeLength = System.in.read(buffer); 

        double altura = Double.parseDouble(new String(buffer, 0, nomeLength - 2));  

  

        System.out.print("Digite seu sexo (M/F): "); 

        nomeLength = System.in.read(buffer); 

        char sexo = (char) buffer[0];  

  

        double pesoIdeal; 

        if (sexo == 'M' || sexo == 'm') { 

            pesoIdeal = (72.7 * altura) - 58; 

        } else if (sexo == 'F' || sexo == 'f') { 

            pesoIdeal = (62.1 * altura) - 44.7; 

        } else { 

            System.out.println("Sexo inválido. Por favor, digite 'M' para masculino ou 'F' para feminino."); 

            return; 

        } 

  

        System.out.printf("O peso ideal de %s é: %.2f kg%n", nome, pesoIdeal); 

    } 

} 

 