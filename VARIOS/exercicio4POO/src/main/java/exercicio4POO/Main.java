
package exercicio4POO;

public class Main {
    
          
    public static void main(String[] args) {
        
       Invoice objetoInvoice = new Invoice(1, "mousepad", -10, 50.00f);  // depois que escrevo o segundo invoice segura o ctrl+espaco para vir o campo para colocar os valores nos caompos definico pelo construtor
       
        System.out.println("Valor total = " + objetoInvoice.getInvoiceAmount()); // depois que escrevo objetoInvoice. segura o ctrl+espaco e escolha o metodo acçao onde tem os calculos
        
       
        
    }
    
}
