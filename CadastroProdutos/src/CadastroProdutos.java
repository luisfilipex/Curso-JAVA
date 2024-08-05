import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
        produtoSet.add(new Produto(cod, nome, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome() {
        return new TreeSet<>(produtoSet);
    }

    public Set<Produto> exibirProdutosPorPreco() {
        Set<Produto> produtosOrdenadosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosOrdenadosPorPreco.addAll(produtoSet);
        return produtosOrdenadosPorPreco;
    }

    // Método para verificar o conteúdo do produtoSet
    public Set<Produto> getProdutoSet() {
        return produtoSet;
    }
}
