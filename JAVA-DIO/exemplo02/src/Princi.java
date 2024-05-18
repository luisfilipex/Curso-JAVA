

import discentes.AlunoSuperior;

public class Princi {

	public static void main(String[] args) {

		
		AlunoSuperior aluno = new AlunoSuperior();
		
		
		aluno.setNome("Luis");
		aluno.setTeste(9);
		aluno.setProva(10);
		
		System.out.println("Sua média é " + aluno.getMedia());

		
	}

}
