package Repeticao;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        try {
            System.out.println("Digite seu nome");
            String nome = scanner.next();

            System.out.println("Digite seu sobrenome");
            String sobreNome = scanner.next();

            System.out.println("Digite sua idade");
            int idade = scanner.nextInt();

            System.out.println("Digite sua altura");
            double altura = scanner.nextDouble();

            System.out.print("Olá, me chamo " + nome.toUpperCase() + " " + sobreNome.toUpperCase());
            System.out.print(" tenho " + idade + " anos");
            System.out.println(" minha altura é " + altura + " cm");
        } catch (InputMismatchException e) {
            System.out.println("Erro: Os campos idade e altura precisam ser numéricos");
        } finally {
            scanner.close();
        }
    }
}