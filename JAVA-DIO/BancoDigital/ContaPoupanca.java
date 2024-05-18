public class ContaPoupanca extends conta{
    
    public ContaPoupanca() {
        super.agencia = Conta.AGENCIA_PADRAO;
        super.numero = SEQUENCIAL++;
    }

}
