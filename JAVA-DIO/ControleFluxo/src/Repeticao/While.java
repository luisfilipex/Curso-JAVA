package Repeticao;

public class While {

    public static void main(String[] args) {

        double mesada = 50.0;

        while (mesada > 0) {
            Double valorDoce = valorAleatorio();
            if (valorDoce > mesada)
                valorDoce = mesada;

            mesada -= valorDoce; // Subtrai o valor doce da mesada
        }
    }

    // Função fictícia para gerar um valor aleatório
    private static Double valorAleatorio() {
        // Implemente a lógica para gerar um valor aleatório
        return Math.random() * 20; // Exemplo: valor aleatório entre 0 e 20
    }
}
