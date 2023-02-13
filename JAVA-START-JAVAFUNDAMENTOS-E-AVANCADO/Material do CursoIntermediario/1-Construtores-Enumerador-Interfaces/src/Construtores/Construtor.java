package Construtores;

import Construtores.Aluno.MATRICULA;
import Construtores.Aluno.STATUS;
public class Construtor {

	public static void main(String[] args) {
		// passando os dados atrav�s do construtor com sobrecarga
		Aluno alu = new Aluno( 8,  8,  8);
		// calculando a m�dia
		double mediaAlunoFinal = alu.calcularMediaAluno();
		
		// definindo situa��o do aluno
		if (mediaAlunoFinal < 6 ) {
			alu.situacaoAluno = STATUS.REPROVADO;
		} else {
			alu.situacaoAluno = STATUS.APROVADO;
		}
		
		// imprimindo situa��o do aluno
		System.out.println("A m�dia do aluno � : " + alu.calcularMediaAluno() + " e o aluno est� " + alu.situacaoAluno);
	
		alu.situacaoMatricula = MATRICULA.PENDENTE;
		System.out.println("situacao matricula: " + alu.situacaoMatricula);
	
	}
	
	
}