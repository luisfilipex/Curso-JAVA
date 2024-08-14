package dio;

public class Pilha {

    private No refNoEntradaPilha;

    // O construtor inicializa a pilha como vazia
    public Pilha() {
        this.refNoEntradaPilha = null;
    }

    // Método para desempilhar (pop) um nó
    public No pop() {
        if (!this.isEmpty()) {
            No noPoped = refNoEntradaPilha; // Salva a referência do nó a ser removido
            refNoEntradaPilha = refNoEntradaPilha.getProximoNo(); // Ajusta a referência para o próximo nó
            return noPoped; // Retorna o nó removido
        }
        return null; // Retorna null se a pilha estiver vazia
    }

    // Método para empilhar (push) um novo nó
    public void push(No novoNo) {
        No refAux = refNoEntradaPilha;
        refNoEntradaPilha = novoNo;
        refNoEntradaPilha.setProximoNo(refAux); // Ajustando para usar setProximoNo
    }

    // Método para retornar o topo da pilha sem removê-lo
    public No top() {
        return refNoEntradaPilha;
    }

    // Método para verificar se a pilha está vazia
    public boolean isEmpty() {
        return refNoEntradaPilha == null;
    }

    @Override
    public String toString() {
        String stringRetorno = "---------------\n";
        stringRetorno += "   Pilha\n";
        stringRetorno += "---------------\n";

        No noAux = refNoEntradaPilha;

        while (noAux != null) {
            stringRetorno += "[No{dado=" + noAux.getDado() + "}]\n";
            noAux = noAux.getProximoNo(); // Avança para o próximo nó
        }

        stringRetorno += "===============\n";
        return stringRetorno;
    }
}
