
public class Principal {

	public static void main(String[] args) {
		
		AlunoEnsinoMedio aluno = new 	AlunoEnsinoMedio();
		Professor professor = new Professor();
		AlunoEnsinoSuperior alunoEnSuperior = new AlunoEnsinoSuperior(); 
		
		aluno.setNome("Luis Filipe");
		aluno.teste = 9;
		aluno.prova = 10;
		
		alunoEnSuperior.setNome("Calor Alberto");
		alunoEnSuperior.teste = 9;
		alunoEnSuperior.prova = 10;
		
		System.out.println("Aluno do Ensino Médio");
		System.out.println(aluno.getNome());
		System.out.println("Sua média é: " + aluno.getMedia());
		
		System.out.println("Aluno do Ensino Superior");
		System.out.println(alunoEnSuperior.getNome());
		System.out.println(alunoEnSuperior.getMedia2());
		
		professor.setNome("Carlos");
		professor.setSalario(1000);
		
		System.out.println(professor.getNome());
		System.out.println("Seu Inss é: " + professor.getInss());
		System.out.println("Seu salario é: " + professor.getSalarioLiquido());
	}

}
