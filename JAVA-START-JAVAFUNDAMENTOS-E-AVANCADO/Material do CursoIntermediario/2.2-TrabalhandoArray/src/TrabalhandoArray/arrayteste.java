package TrabalhandoArray;

import javax.swing.JOptionPane;

public class arrayteste {

	public static void main(String[] args) {

        int [] numeros = new int [10];
		
		for (int i = 0; i < 10; i++) {
			numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero"));
		}   
		//o Integer.parseInt acima é para transfomar os valores colocados na caixa que é string em numero)
	             
	   for (int listaNumeros : numeros) {
		System.out.println(listaNumeros);
	}
			
		}
	}                
