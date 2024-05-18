package aula01;

import java.util.Scanner;

public class aula05 {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            double nota1, nota2, nota3, media;

            System.out.println("Digite a nota 1: ");
            nota1 = input.nextDouble();

            System.out.println("Digite a nota 2: ");
            nota2 = input.nextDouble();

            System.out.println("Digite a nota 3: ");
            nota3 = input.nextDouble();

            media = (nota1 + nota2 + nota3) / 3;

            
            String mediaFormatada = String.format("%.2f", media);

            if (media >= 6) {
                System.out.println("Parabéns, você está APROVADO! Sua nota foi: " + mediaFormatada);
            } else if (media >= 4) {
                System.out.println("Você está de RECUPERAÇÃO. Sua nota foi: " + mediaFormatada);
            } else {
                System.out.println("Você está REPROVADO. Sua nota foi: " + mediaFormatada);
            }
        }
    }
}
