 

package java8; 

  

public class Java8 { 

     

    public static void main(String[] args) { 

        

        double distancia = 300.0;  

        double consumoGasolina = 12.0;  

        double consumoAlcool = 9.0;  

        double precoGasolina = 5.50; 

        double precoAlcool = 4.00;  

  

        String tipoCombustivel = "gasolina"; // Pode ser "gasolina" ou "alcool" 

  

        double litrosNecessarios = 0.0; 

        double custo = 0.0; 

  

        if (tipoCombustivel.equals("gasolina")) { 

            litrosNecessarios = distancia / consumoGasolina; 

            custo = litrosNecessarios * precoGasolina; 

        } else if (tipoCombustivel.equals("alcool")) { 

            litrosNecessarios = distancia / consumoAlcool; 

            custo = litrosNecessarios * precoAlcool; 

        } 

  

        System.out.println("Distância a percorrer: " + distancia + " km"); 

        System.out.println("Tipo de combustível: " + tipoCombustivel); 

        System.out.println("Quantidade de combustível necessária: " + litrosNecessarios + " litros"); 

        System.out.println("Custo total: R$ " + custo); 

         

    } 

     

} 