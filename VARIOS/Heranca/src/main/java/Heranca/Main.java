
package Heranca;

import java.util.Date;


public class Main {
    
    public static void main(String[] args) {
        
        Vendedor ObjetoVendedor = new Vendedor();
             ObjetoVendedor.setCpf("20202020");
             ObjetoVendedor.setDataNascimento(new Date());   // tras a data de hoje//
             ObjetoVendedor.setSalario(100.00f);
             ObjetoVendedor.setNome("Margareth");
             ObjetoVendedor.setComissaoPorItens(10.0f);
             ObjetoVendedor.setTotalitensVendidos(10);
             
            System.out.println("O salario do Vendedor é: " + ObjetoVendedor.calcularSalario());
            
        
        Motorista ObjetoMotorista = new Motorista();
     
           
    }
    
}
