package classe;

public class Pessoa {
	
	private int idpessoa;
	private String nomepessoa;
	private String email;
	
	
	public Pessoa() {
		
		
	}
	         /*esse construtor que vamos fazer operacao*/
	public Pessoa(String nomepessoa, String email) {      
		super();       /*usa quando tem heranca, vai ter heranca no classe pessoaDao*/
		this.nomepessoa = nomepessoa;
		this.email = email;
	}
		
	                              /**esse construtor que vamos fazer inclusao**/
	public Pessoa(int idpessoa, String nomepessoa, String email) {
		super();         /*usa quando tem heranca, vai ter heranca no classe pessoaDao*/     
        this.idpessoa = idpessoa;
		this.nomepessoa = nomepessoa;
		this.email = email;
								
	}
	
	public int getIdpessoa() {
	return idpessoa;
	}
	public void setIdpessoa(int idpessoa) {
	this.idpessoa = idpessoa;
	}
	public String getNomepessoa() {
		return nomepessoa;
	}
	public void setNomepessoa(String nomepessoa) {
		this.nomepessoa = nomepessoa;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
	
	
	
	
		
	}
