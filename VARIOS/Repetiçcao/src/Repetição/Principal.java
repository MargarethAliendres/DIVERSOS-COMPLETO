package Repetição;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

       Scanner leitor = new Scanner (System.in);
        
       String nomeProduto;           //essas variaveis fora do for é para a cada repetição nao criar novas variaveis e economizar memoria 
       float preçoCusto;
       float preçoVenda;
       
       float totalCusto = 0.0f;           //sempre valor incial antes de iniciar calculo
       float totalVenda = 0.0f;
       
        int i = 0;      // colocou essa variavel fora, para ser nao so do FOR, mas para ela ser de todo o metodo main.
                
        for (; i < 3; i++) {     // aqui inicia com ; pois o i ja foi iniciado acima
            
            System.out.println("Digite o nome do produto: ");
            nomeProduto = leitor.next();        // letra maiuscula aqui no Line
            
            System.out.println("Digite o preço de custo: ");  // letra maiuscula aqui no Float
            preçoCusto = leitor.nextFloat();
            
            System.out.println("Digite o preço de venda: "); //letra maiuscula aqui no Float
            preçoVenda = leitor.nextFloat();
            
            
            
            totalCusto = totalCusto + preçoCusto;         // sempre tem que ter um valor inicial antes de calcular
            totalVenda = totalVenda + preçoVenda;

                
            
            if(preçoCusto == preçoVenda){
                 System.out.println ("Empate");
                }else{  
                if(preçoCusto <preçoVenda){
                 System.out.println ("Lucro");
                }else{
                   System.out.println ("prejuizo");
               }   
            }
            
         System.out.println(nomeProduto + ", Preço de custo: " + preçoCusto + ", Valor de venda: " + preçoVenda );
            
        }
            
         System.out.println ("A média do preço de custo é de: " + (totalCusto / i ));                 //   fora do FOR
         System.out.println ("A média do preço de venda é de: " + (totalVenda / i ));                               
                  
        }
    }

      
    

