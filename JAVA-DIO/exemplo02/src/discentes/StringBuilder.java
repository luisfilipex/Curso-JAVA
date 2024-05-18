package discentes;
public class StringBuilder {

	public static void main(String[] args) {	
		 
		String nome="Luis";
		String sobreNome="Filipe";
		String nomeCompleto = nome+sobreNome;
		String nomeComBuffer;
		
		
		
		StringBuilder buffer = new StringBuilder();
		
		buffer.append(nome);
		buffer.append(sobreNome);
		nomeComBuffer = buffer.toString();
		
		System.out.println(nomeCompleto);
		System.out.println(nomeComBuffer);
		
	}

	private void append(String nome) {
		// TODO Auto-generated method stub
		
	}

}
