package java21; 

  

public class Java21 { 

  

    public static void main(String[] args) throws Exception { 

        double precoAlcool = 4.90; 

        double precoGasolina = 5.50; 

  

        byte[] buffer = new byte[100]; 

  

        System.out.print("Digite o tipo de combustível (A para Álcool, G para Gasolina): "); 

        System.in.read(buffer); 

        char tipoCombustivel = (char) buffer[0]; 

  

        System.out.print("Digite a quantidade de litros: "); 

        System.in.read(buffer); 

        double litros = Double.parseDouble(new String(buffer).trim()); 

  

        double desconto = 0; 

        double precoPorLitro = 0; 

  

        if (tipoCombustivel == 'A' || tipoCombustivel == 'a') { 

            precoPorLitro = precoAlcool; 

            if (litros <= 20) { 

                desconto = 0.03; 

            } else { 

                desconto = 0.05; 

            } 

        } else if (tipoCombustivel == 'G' || tipoCombustivel == 'g') { 

            precoPorLitro = precoGasolina; 

            if (litros <= 20) { 

                desconto = 0.04; 

            } else { 

                desconto = 0.06; 

            } 

        } else { 

            System.out.println("Tipo de combustível inválido. Por favor, digite 'A' para Álcool ou 'G' para Gasolina."); 

            return; 

        } 

  

        double precoTotalSemDesconto = litros * precoPorLitro; 

        double valorDesconto = precoTotalSemDesconto * desconto; 

        double precoTotalComDesconto = precoTotalSemDesconto - valorDesconto; 

  

        System.out.printf("Preço total sem desconto: R$ %.2f%n", precoTotalSemDesconto); 

        System.out.printf("Valor do desconto: R$ %.2f%n", valorDesconto); 

        System.out.printf("Preço total com desconto: R$ %.2f%n", precoTotalComDesconto); 

    } 

} 