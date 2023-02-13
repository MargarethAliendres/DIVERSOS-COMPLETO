import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import javax.swing.JOptionPane;

public class ArrayListCarros {
	
	public static void main(String[] args) {
        // construindo um arraylist para os carros
        ArrayList<String> carros = new ArrayList<>();
        
        // adicionando Carros ao arraylist        // fica na ordem da inserção, se inserir acima ou abaixo
        carros.add("KOMBI"); 
        carros.add("JAGUAR");
        carros.add("der");
        carros.add("MERCEDES");             
        carros.add("FUSCA");
        carros.add("VECTRA");
        // mostra array
        System.out.println(carros);
        
        // substituir FUSCA por MITSUBISHI          //resgata com base na posição
        carros.set(4,"MITSUBISHI");
        // mostra array
        System.out.println(carros);
        
        // remover VECTRA     
        carros.remove("VECTRA");             //remove com base no conteudo
        // mostra array
        System.out.println(carros);
        
        carros.add("FUSCA2");        //ADICIONANDO SEM INTERAÇÃO
        
        // adicionando Carros ao arraylist com JOPtionPane     // adiciona itens interativamente
        carros.add(JOptionPane.showInputDialog("Informe a marca do carro"));
        // mostra array
        System.out.println(carros);
        
        // esvaziando o array
        //carros.clear();
        // mostra array
        //System.out.println(carros);
        
        
        // verificar se o array est� vazio
        if (carros.isEmpty()) {
            System.out.println("O vetor est� vazio");
        }
            boolean achei = false;
        
        if (carros.contains("BMW")) {
            // substituindo quando n�o se sabe a posi��o
            for (int i = 0; i < carros.size(); i++) {   // VAI PERCORRER TODA A LISTA
                if ("BMW".equals(carros.get(i))) {      // VAI BUSCAR UM POR UM E SE FOR IGAUAL A BMW
                    carros.set(i, "BUGATTI");              // ELE VAI SUBSTITUIR POR BUGATTI
                    
                    break;                            //PARA PARAR.
                }
            }
                                   	
            } else {System.out.println("nao achei o argumento pesquisado");
        }
        System.out.println(carros);
	}
}
	
	
	
	

