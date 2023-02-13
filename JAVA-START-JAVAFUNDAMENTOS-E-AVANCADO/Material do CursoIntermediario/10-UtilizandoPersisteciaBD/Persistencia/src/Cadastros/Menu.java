package Cadastros;

import java.util.List;

public class Menu {
			public static void main(String[] args) {
				PessoaDao pd = new PessoaDao();
				try {
					 //Incluir uma pessoa
					      
					  
		//crio os objetos/instancias, quantos for preciso//       //esse é o contrutor criado na classe pessoa, preencher na ordem que está la no construtor.//
				/*	Pessoa p1 = new Pessoa(11,"mar", "jose@gmail.com");
					Pessoa p2 = new Pessoa(12,"han", "jose@gmail.com");
					Pessoa p3 = new Pessoa(13,"reb", "jose@gmail.com");  
					
					//dai chamo o metodo que está na classe pessoaDao para incluir os dados do objeto//
					pd.incluirPessoa(p1);
					pd.incluirPessoa(p2);
					pd.incluirPessoa(p3);
				*/	
					// Alterar uma pessoa
					// - Alterar a informa��o desejada usando o set(Classe encapsulada)
					try {
						Pessoa pes = pd.consultarPessoaIndividual(1);
						// se o resultado da consulta a pessoa retornar null � porque n�o encontrou
						// a pessoa
							pes.setEmail("derlon.aliendres@gmail.com");
						// chamar o m�todo de cont�m o comando update
						if (pd.alterarPessoa(pes)){
						    System.out.println("Pessoa alterada com sucesso");
						};
					
						// Listando todas as pessoas
						List<Pessoa> listaPessoas = pd.ListarPessoas();
						for(Pessoa p : listaPessoas){
							System.out.println("Id.: " + p.getIdPessoa());
							System.out.println("Nome : "  +p.getNomePessoa());
							System.out.println("Email : " +p.getEmail());
						}
					}
					
						catch (Exception e) {
							System.out.println("Error:  " + e.getMessage());
						}
					
				
					//Excluir uma pessoa    
					// verificar se a pessoa existe por c�digo
					Pessoa pessoa1 = pd.consultarPessoaIndividual(3);
				     pd.excluirPessoa(pessoa1);// chamar o m�todo que cont�m o comando delete
					
				
					// Listando todas as pessoas
					List<Pessoa> listaPessoas = pd.ListarPessoas();
					for(Pessoa p: listaPessoas){
						System.out.println("Id.: " + p.getIdPessoa());
						System.out.println("Nome : "  +p.getNomePessoa());
						System.out.println("Email : " +p.getEmail());
					}
					
				
			}catch (Exception e) {
					System.out.println("Error:  " + e.getMessage());
				}
			}
}
				  
				 
				
			
				



