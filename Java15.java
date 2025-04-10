 

package java15; 

  

public class Java15 { 

  

    public static void main(String[] args) { 

  

        int totalEleitores = 10000;   

        int votosBrancos = 1500;     

        int votosNulos = 1000;        

        int votosValidos = 7500;     

  

        double percentualBrancos = (double) votosBrancos / totalEleitores * 100; 

        double percentualNulos = (double) votosNulos / totalEleitores * 100; 

        double percentualValidos = (double) votosValidos / totalEleitores * 100; 

  

        System.out.println("Percentual de votos brancos: " + percentualBrancos + "%"); 

        System.out.println("Percentual de votos nulos: " + percentualNulos + "%"); 

        System.out.println("Percentual de votos válidos: " + percentualValidos + "%"); 

         

    } 

     

} 

 