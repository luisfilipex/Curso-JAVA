package aula01;

import java.util.Scanner;

public class loop {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int op;
		
		
		
		do {
			System.out.println("----");
			System.out.println("Menu Principal");
			System.out.println("----");
			System.out.println("Selecione uma das opcoes abaixo");
			System.out.println("1 - Aluno");
			System.out.println("2 - Professor");
			System.out.println("3 - Coordenador");
			System.out.println("0 - Sair");
			
			System.out.println("Qual opcao deseja?");
			op = teclado.nextInt();
			
			if(op==0)
				break;
			switch(op) {
			
			case 1:
				System.out.println("Voce selecionou a opcao Aluno");
				break;
			case 2:
				System.out.println("Voce selecionou a opcao Professor");
			case 3:
				System.out.print("Voce Selecinou a opcao Coordenador");
				break;
				default:
				System.out.println("Voce Selecionou uma opcao Invalida");		
			}
		}while(true);
		System.out.println("Fim");
	}

}
