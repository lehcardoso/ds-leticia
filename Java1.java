package java1; 

import java.util.Scanner; 

public class Java1 { 

  

public static void main(String[] args) { 

 

  

Scanner entrada = new Scanner(System.in); 

double soma = 0;  

int contador = 0; 

 

System.out.print("Digite um número (ou 0 para sair): "); 

double numero = entrada.nextDouble();  

while (numero != 0) 

{ soma += numero; contador++; 

System.out.print("Digite outro número (ou 0 para sair): ");  

numero = entrada.nextDouble(); }  

if (contador == 0){ 

System.out.println("Não foi informado nenhum valor!"); } 

else { double media = soma / contador;  

System.out.println("A soma dos valores é: " + soma+ ". A media é: "+media); 

} 

} 

} 
