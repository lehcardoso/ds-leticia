 

package java19; 

  

public class Java19 { 

  

    public static void main(String[] args) { 

         

        int carrosVendidos = 10;   

        double valorTotalVendas = 200000.00;   

        double salarioFixo = 1500.00;   

        double comissaoPorCarro = 200.00;   

  

        double comissaoTotal = carrosVendidos * comissaoPorCarro; 

  

        double comissaoVendas = valorTotalVendas * 0.05; 

  

        double salarioFinal = salarioFixo + comissaoTotal + comissaoVendas; 

  

        System.out.println("Salário fixo: R$ " + salarioFixo); 

        System.out.println("Comissão por carro vendido: R$ " + comissaoTotal); 

        System.out.println("Comissão sobre o valor total das vendas: R$ " + comissaoVendas); 

        System.out.println("Salário final do vendedor: R$ " + salarioFinal); 

    } 

} 

 