import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SupplierExample {  // Renomeando a classe para evitar conflitos
    public static void main(String[] args) {
        // Definindo o Supplier para retornar uma saudação
        Supplier<String> saudacao = () -> "Olá, seja bem-vindo";

        // Gerando uma lista de saudações usando o Supplier
        List<String> listaSaudacao = Stream.generate(saudacao)
                .limit(5) // Limitando a lista a 5 saudações
                .collect(Collectors.toList());

        // Imprimindo cada saudação da lista
        listaSaudacao.forEach(s -> System.out.println(s));
    }
}
