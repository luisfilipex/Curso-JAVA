public class Main {
    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();
        cadastroProdutos.adicionarProduto(1L, "Produto 5", 15d, 5);
        cadastroProdutos.adicionarProduto(2L, "Produto 1", 12d, 10);
        cadastroProdutos.adicionarProduto(3L, "Produto 7", 20d, 2);
        cadastroProdutos.adicionarProduto(4L, "Produto 2", 2d, 50);

        // Exibir todos os produtos no conjunto original
        System.out.println("Produtos no conjunto original:");
        System.out.println(cadastroProdutos.getProdutoSet());

        // Exibir produtos ordenados por nome
        System.out.println("Produtos ordenados por nome:");
        System.out.println(cadastroProdutos.exibirProdutosPorNome());

        // Exibir produtos ordenados por preço
        System.out.println("Produtos ordenados por preço:");
        System.out.println(cadastroProdutos.exibirProdutosPorPreco());
    }
}
