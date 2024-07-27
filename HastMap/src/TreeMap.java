import java.util.TreeMap;

public class TreeMap {

	public static void main(String[] args) {
		
		TreeMap<String, String> listaNomes = new TreeMap<>();
        listaNomes.put("Luis", "Pedro");
        listaNomes.put("Calors", "Sandro");
        listaNomes.put("Jose", "Salvador");
        listaNomes.put("Antonio", "Tiao");
        listaNomes.put("Lucas", "Augusto");

        System.out.println("LinkedHashMap1: " + listaNomes);

	}

}
