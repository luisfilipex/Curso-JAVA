import javax.swing.*;

public class teste {
    public static void main(String[] args) {
        System.out.println("Estrutura de Dados");
        new Somar().executar();
    }

    static class Somar {
        public void executar() {
            int vetSoma[], i, soma = 0;
            vetSoma = new int[100];
            for (i = 0; i < 100; i++) {
                String input = JOptionPane.showInputDialog("Digite um valor inteiro");
                try {
                    vetSoma[i] = Integer.parseInt(input);
                    soma = soma + vetSoma[i];
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Por favor, digite um valor inteiro válido.");
                    i--; // para que o loop reitere no mesmo índice
                }
            }
            System.out.println("A soma dos 100 valores digitados é: " + soma);
        }
    }
}
