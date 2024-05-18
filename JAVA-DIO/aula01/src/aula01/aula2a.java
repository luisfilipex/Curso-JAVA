package aula01;

import java.util.Scanner;

public class aula2a {

	public static void main(String[] args) {

		int valor ;
		
		try (Scanner teclado = new Scanner(System.in)) {
			System.out.println("Digite um valor: ");
			valor = teclado.nextInt();
		}
		
		System.out.println(valor/2);
		System.out.println(valor%2);
	}

}
