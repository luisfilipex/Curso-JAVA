import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class consumer{
    public static void main(String[] args) {
        // inicio da lista
        List<Integer> numeros = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));

        // Declaração da expressão lambda Consumer
        Consumer<Integer> imprimirNumeroPar = numero -> {
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
        };

        // Aplicação do Consumer em cada elemento da lista
        numeros.forEach(imprimirNumeroPar);
    }
}
