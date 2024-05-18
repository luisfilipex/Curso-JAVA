import java.util.LinkedHashMap;

public class Has {

    public static void main(String[] args) {

        Has<String, String> listaNomes = new Has<>();
        listaNomes.put("Luis", "Pedro");
        listaNomes.put("Calors", "Sandro");
        listaNomes.put("Jose", "Salvador");
        listaNomes.put("Antonio", "Tiao");
        listaNomes.put("Lucas", "Augusto");

        System.out.println("LinkedHashMap1: " + listaNomes);
    }
}
 