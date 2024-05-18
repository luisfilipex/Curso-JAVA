import java.util.Scanner;
import java.io.File;


public class Principal1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		
		System.out.print("Digite o nome de um arquivo com o seu path :\n");
		String nome = teclado.next();
		
		
		File objFile = new File(nome);
		if(objFile.exists()) {
			if(objFile.isFile()) {
				System.out.print("Nome do arquivo: " + objFile.getName());
				System.out.print("Tamanho do arquivo: " + objFile.getName());
			}
		}else System.out.println("Arquivo inexistente");
		
		
	}

}
