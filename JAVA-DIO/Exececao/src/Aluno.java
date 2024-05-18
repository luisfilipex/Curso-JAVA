import java.io.Serializable;


public class Aluno {

	private static final long serialVersionUID = 1l;
	
	private String nome;
	private int faltas;
	private double nota;
	
	
	Aluno(){
	};
	
	Aluno(String nome, int faltas, double nota ){
		this.nome = nome;
		this.faltas = faltas;
		this.nota = nota;
	}
	public String toString() {
		return "Nome: " +  nome + "\nFaltas: " + faltas + "\nNota: " + nota;   
	}
	
	
	
}
