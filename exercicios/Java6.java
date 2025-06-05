package java6; 

  

public class Java6 { 

  

    public static void main(String[] args) { 

   

  

        int a = 10;   

        int b = 20;   

  

        System.out.println("Antes da troca:"); 

        System.out.println("a = " + a); 

        System.out.println("b = " + b); 

  

        int temp = a; 

        a = b; 

        b = temp; 

  

        System.out.println("Após a troca:"); 

        System.out.println("a = " + a); 

        System.out.println("b = " + b); 

    } 

} 