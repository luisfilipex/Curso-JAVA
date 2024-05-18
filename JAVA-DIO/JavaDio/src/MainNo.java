
public class MainNo {
	public static void main(String []args) {
		projetoNo<String> no1 = new projetoNo<>("Conteudo no1");

		projetoNo<String> no2 = new projetoNo<>("Conteudo no2");
		no1.setProximoNo(no2);
		
		projetoNo<String> no3 = new projetoNo<>("Conteudo no3");
		no2.setProximoNo(no3);
		
		projetoNo<String> no4 = new projetoNo<>("Conteudo no4");
		no3.setProximoNo(no4);
		
		System.out.println(no1);
		System.out.println(no1.getProximoNo());
	}
 
}
 