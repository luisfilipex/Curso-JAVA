public class ContaCorrente extends conta{

public void imprimirExtrato() {

System.out.println("Extrato Conta Corrente: ");
System.out.println(String.format("Agencia: %d"), super.agencia);
System.out.println(String.format("Conta: %d"), super.conta);
}
}
