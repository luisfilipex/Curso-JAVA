package carros;

public class Autodramo {

	public static void main(String[]args) {
		Carro jeep = new Carro();
		jeep.setChassi("878787");
		//jeep.ligar();
		
		
		moto  Dt180 = new moto ();
		Dt180.setChassi("101012");
		//Dt180.ligar();
		
		veiculo coringa = Dt180;
		coringa.ligar();
	}
	 
}
