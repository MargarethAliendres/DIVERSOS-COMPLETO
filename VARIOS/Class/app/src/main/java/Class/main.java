
package Class;

import java.util.Scanner;

public class App {
  
   
    public static void main(String[] args) {
        
       Scanner leitor = new Scanner(System.in); 
       pessoa objetoPessoa = new pessoa();
        
              
        System.out.println("Digite o peso da pessoa: ")
        objetoPessoa.peso = leitor.nextfloat(); 
        
        System.out.println("Digite o peso da pessoa: ")
        objetoPessoa.altura = leitor.nextfloat(); 
        
        System.out.println(" IMC =" + objetoPessoa.calcularIMC());
       
          
    }
}
