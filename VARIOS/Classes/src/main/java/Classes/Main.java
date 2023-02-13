
package Classes;

import java.util.Scanner;

public class Main {
   
    public static void main(String[] args) {
       
        
        Pessoa objetoPessoa = new Pessoa(70.0f, 1.80f);
        Scanner leitor = new Scanner (System.in);
        
        System.out.println("Digite o peso da pessoa");
        objetoPessoa.setPeso(leitor.nextFloat());
        
        System.out.println("Digite a altura da pessoa");
        objetoPessoa.setAltura(leitor.nextFloat());
        
        System.out.println("IMC - " + objetoPessoa.calcularIMC());
       
    }
    
}
