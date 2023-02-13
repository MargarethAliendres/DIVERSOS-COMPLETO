package Classes;

public class Pessoa {
	
	private int idPessoa;
	private String nomePessoa;
	private String email;
        
        
        
        
        
        
	
	
	public Pessoa() {
		
		
	}
	                              /*esse construtor que vamos fazer opercao*/
	public Pessoa(String nomePessoa, String email) {      
		super();       /*usa quando tem heranca, vai ter heranca no classe pessoaDao*/
		this.nomePessoa = nomePessoa;
		this.email = email;
	}
		
	                              /**esse construtor que vamos fazer inclusao**/
	public Pessoa(int idPessoa, String nomePessoa, String email) {
		super();         /*usa quando tem heranca, vai ter heranca no classe pessoaDao*/     
        this.idPessoa = idPessoa;
		this.nomePessoa = nomePessoa;
		this.email = email;
								
	}
	
	public int getIdPessoa() {
	return idPessoa;
	}
	public void setIdPessoa(int idPessoa) {
	this.idPessoa = idPessoa;
	}
	public String getNomePessoa() {
		return nomePessoa;
	}
	public void setNomePessoa(String nomePessoa) {
		this.nomePessoa = nomePessoa;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
	
	
	
	
		
	}
