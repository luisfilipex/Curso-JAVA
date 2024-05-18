
public class CaixaEletronico {
	
	public static void main(String[] args) {

		double saldo = 25.0;
		double valorSolicitado = 22.0;
		
		
		if(valorSolicitado < saldo) {
			saldo = saldo - valorSolicitado;
		System.out.print("Seu saldo atual R$: " + saldo);
		
		}else
			System.out.println("Saldo Insuficiente ");
		
			
		
}
}