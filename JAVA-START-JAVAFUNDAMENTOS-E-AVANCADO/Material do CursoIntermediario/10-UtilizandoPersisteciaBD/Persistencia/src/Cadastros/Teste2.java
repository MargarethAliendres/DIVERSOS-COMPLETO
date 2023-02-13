package Cadastros;

import java.util.List;

public class Teste2 {

	public static void main(String[] args) throws Exception {   //o metodo consultarPessoaIndividual obigou a colocar esse throws aqui//
		                                                        //se usou dentro do metodo tem que colocar aqui na main//
		
		
		//CONSULTA DE UM REGISTRO - RETORNANDO UM OBJETO
		
		 
		 PessoaDao pd = new PessoaDao();    //tem que instanciar/criar objeto o pessoa Dao tambem, pois ele que tem os metodos.
		                                            //ESSE É O ID QUE QUERO CONSULTAR
		 Pessoa pess1 = pd.consultarPessoaIndividual(2);     //teve que instanciar/criar objeto da classe pessoa para acessar os atributos pelo get e set  
		 System.out.println("ID ------->:" + pess1.getIdPessoa() );
		 System.out.println("Nome ----->:" + pess1.getNomePessoa() );
		 System.out.println("Email ---->:" + pess1.getEmail() );
		
		 
	  //CONSULTA UMA LISTA DE REGISTRO - ELEMENTOS
		 
		 PessoaDao po = new PessoaDao();     //tem que instanciar pois ele que tem os metodos
		 
           List<Pessoa> ListarDados = po.ListarPessoas();   
           
           for (Pessoa pu : ListarDados) {            //insancio u
        	   
        	   System.out.println("Codigo: " + pu.getIdPessoa() );   //uso a nova instancia pu
        	   System.out.println("Nome: " + pu.getNomePessoa() );
        	   System.out.println("email: " + pu.getEmail() );
        	   System.out.println("**********************");       //isso separa a tabelo 
		}
           
         
		 
	}

}
