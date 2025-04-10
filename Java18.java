 

package java18; 

  

public class Java18 { 

  

    public static void main(String[] args) { 

  

        double custoFabrica = 30000.00;   

  

        double percentualDistribuidor = 28.0;   

        double percentualImpostos = 45.0;   

  

        double valorDistribuidor = custoFabrica * (percentualDistribuidor / 100); 

        double valorImpostos = custoFabrica * (percentualImpostos / 100); 

         

        double custoFinal = custoFabrica + valorDistribuidor + valorImpostos; 

         

        System.out.println("Custo de fábrica: R$ " + custoFabrica); 

        System.out.println("Valor do distribuidor: R$ " + valorDistribuidor); 

        System.out.println("Valor dos impostos: R$ " + valorImpostos); 

        System.out.println("Custo final ao consumidor: R$ " + custoFinal); 

    } 

} 