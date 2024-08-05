import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Main {
    public static void main(String[] args) {


    }

    public static class BinaryOperatorExample { // Nome da classe alterado para evitar conflito
        public static void main(String[] args) {
            List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

            BinaryOperator<Integer> somar = (num1, num2) -> num1 + num2;

            int resultado = numeros.stream()
                    .reduce(0, somar);

            System.out.println("A soma dos números é: " + resultado);
        }
    }
}