 

package java16; 

  

public class Java16 { 

  

    public static void main(String[] args) { 

    

        double salarioAtual = 2000.00;  

        double percentualReajuste = 10.0;  

  

        double reajuste = salarioAtual * (percentualReajuste / 100); 

  

        double novoSalario = salarioAtual + reajuste; 

  

         

        System.out.println("O salário atual é: R$ " + salarioAtual); 

        System.out.println("O percentual de reajuste é: " + percentualReajuste + "%"); 

        System.out.println("O valor do novo salário é: R$ " + novoSalario); 

  

    } 

     

} 