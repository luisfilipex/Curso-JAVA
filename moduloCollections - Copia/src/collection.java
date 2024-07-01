import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class collection {
    public static void main(String[] args) {

        System.out.println("Crie um conjunto e adicione as notas: ");
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println(notas.toString());

        System.out.println("Confira se a nota 5 está no conjunto: " + notas.contains(5d));

        System.out.println("Exiba a menor nota: " + Collections.min(notas));
        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        System.out.println("Exiba a soma das notas:");
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0.0;
        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("A soma dos valores: " + soma);
        System.out.println("A média dos valores: " + (soma / notas.size()));

        // Remover a nota 0 após a iteração
        notas.remove(0d);
        System.out.println("Conjunto após remover 0: " + notas);
    }
}
