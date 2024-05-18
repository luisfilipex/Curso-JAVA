package carros;

public class Carro extends veiculo {
	
    public void ligar() {
        confereCambio();
        confereCombustivel();
        System.out.println("Carro ligado");
    }

    private void confereCombustivel() {
        System.out.println("Conferir combustível");
    } 

    private void confereCambio() {
        System.out.println("Conferir câmbio em P");
    }
}
