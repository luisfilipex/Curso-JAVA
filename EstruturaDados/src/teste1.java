import java.util.Scanner;

public class teste1 {

    public static void main(String[] args) {
        // Declaração das variáveis
        double[] numeros = new double[50];
        double soma = 0;
        double media;

        Scanner scanner = new Scanner(System.in);

        // Entrada de dados e cálculo da soma
        for (int i = 0; i < 50; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = scanner.nextDouble();
            soma += numeros[i];
        }

        // Cálculo da média
        media = soma / 50;

        // Saída do resultado
        System.out.println("A média dos 50 números digitados é: " + media);

        // Fechar o scanner
        scanner.close();
    }
}
