import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionExample {
    public static void main(String[] args) {
        // Criando uma lista de números inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        // Função para dobrar o número
        Function<Integer, Integer> dobrar = numero -> numero * 2;

        // Aplicando a função 'dobrar' a cada elemento da lista e coletando os resultados em uma nova lista
        List<Integer> numerosDobrados = numeros.stream()
                .map(n -> n * 2)
                .toList();

        // Imprimindo os números dobrados
        numerosDobrados.forEach(n -> System.out.println(n));
    }
}
