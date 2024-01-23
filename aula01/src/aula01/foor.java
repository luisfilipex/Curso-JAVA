package aula01;

import java.util.Scanner;

public class foor {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        for (int aluno = 1; aluno <= 2; aluno++) {
            System.out.println("Aluno: " + aluno);
            System.out.println("Digite a nota 1:");
            double nota1 = input.nextDouble();

            System.out.println("Digite a nota 2:");
            double nota2 = input.nextDouble();

            double media = (nota1 + nota2) / 2;
            System.out.println("Sua média é: " + media);

            if (media >= 6) {
                System.out.println("Você está de recuperação, Aluno: " + aluno);
            }
        }
    }
}
