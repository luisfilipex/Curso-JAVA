 import java.util.HashMap;
public class Principal {

	public static void main(String[] args) {
		
		HashMap<Integer, String> linguagensProgramacao = new HashMap<>();
		linguagensProgramacao.put(1, "C++");
		linguagensProgramacao.put(2, "Java");
		linguagensProgramacao.put(3, "Cobol");
		
		System.out.println("Conteudo HasMap: " + linguagensProgramacao);
		
		
		System.out.println("Chaves: " + linguagensProgramacao.keySet());
		System.out.println("Valores: " + linguagensProgramacao.values());
		System.out.println("Chave/Valores: " + linguagensProgramacao.entrySet());

		
	}

} 
