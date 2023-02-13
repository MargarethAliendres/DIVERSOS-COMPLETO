
package exercicios20;

import java.util.Scanner;


public class Main {
  
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner (System.in);
        
        int anoFabricacao = 0;
        float valorCarro = 0.0f;
        float porcentagemDesconto = 0.0f;
        float valorDesconto = 0.0f;
        float valorPagar = 0.0f;
        
        int totalCarrosSeminovos = 0;
        int totalCarros = 0;
        
        char desejaRepetir = 'S';
        
        while (desejaRepetir == 's' || desejaRepetir == 'S' ){
            
            System.out.println("Digite o nao de fabricaçao:");
            anoFabricacao = leitor.nextInt();
            
            System.out.println("Digite o nao de fabricaçao:");
            valorCarro = leitor.nextFloat();
            
            if (anoFabricacao <= 2000) {
              porcentagemDesconto = 0.12f;

            }else { 
              porcentagemDesconto = 0.07f;
              totalCarrosSeminovos++;
            }
            
           totalCarros++;  
            
           valorDesconto = valorCarro * porcentagemDesconto; 
           valorPagar = valorCarro - valorDesconto;
           
           System.out.println("Valor a pagar" + valorPagar);
           System.out.println("Valor do desconto" + valorDesconto);
           
           System.out.println("Deseja fazer mais cadatros S-sim / N-Nao");
           desejaRepetir = leitor.next().charAt(0);  //pega so a primeira palavra//
                      
            } 
            
      System.out.println("Total de carros seminovos" + totalCarrosSeminovos);
      System.out.println("Total de carros " + totalCarros);
            
        }        
    }
    

