
package Heranca;

import java.util.Date;


public class Vendedor extends Funcionario{    // tem que colocar extends

    private int TotalitensVendidos;    //atributos exclusivos do vendedor
    private float comissaoPorItens;

              //metodo construtor//
    public Vendedor() {      
        super();             // tras tudo que o funcionario tem, se ´nao colocar o vendedor fica sem atriburo//
        
     } 
               //metodo de açao
     public float calcularSalario() {
         return super.getSalario() + (this.comissaoPorItens*TotalitensVendidos);
     }

           // metodo modificadores de acesso
    public int getTotalitensVendidos() {
        return TotalitensVendidos;
    }

    public void setTotalitensVendidos(int TotalitensVendidos) {
        this.TotalitensVendidos = TotalitensVendidos;
    }

    public float getComissaoPorItens() {
        return comissaoPorItens;
    }

    public void setComissaoPorItens(float comissaoPorItens) {
        this.comissaoPorItens = comissaoPorItens;
    }
    
     
     
}
    
