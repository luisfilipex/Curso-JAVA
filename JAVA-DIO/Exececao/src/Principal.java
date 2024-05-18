
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		try {
			throw new ExececaoCustomizada("Minha Execao");
			
		}catch (ExececaoCustomizada exececaoCustomizada) {
			System.out.println("Ocorreu uma execacao");
			System.out.println(exececaoCustomizada.getMessage());
		}
		
		
		
		
	}

}
