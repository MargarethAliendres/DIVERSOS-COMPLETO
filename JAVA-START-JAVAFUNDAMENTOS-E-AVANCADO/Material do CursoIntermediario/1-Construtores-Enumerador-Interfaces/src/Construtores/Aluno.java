package Construtores;

public class Aluno {
	private double nota1;
	private double nota2;
	private double nota3;
	STATUS situacaoAluno;
	MATRICULA situacaoMatricula;	
	public Aluno(double nota1, double nota2, double nota3) {
		super();
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
	}
    
	public enum MATRICULA{
	   MATRICULADO,
	   PENDENTE,
	   RECUSADA
	  
}
	// DEFININDO UM ENUMERADOR
	public enum STATUS {
		 APROVADO,
	     REPROVADO
	}

	// M�todo para calcular m�dia do aluno
	public double calcularMediaAluno() {
		double mediaAluno = 0;
		// c�lculo da media
		mediaAluno = (this.nota1 + this.nota2 + this.nota3) / 3;
		return mediaAluno;
	}
}
