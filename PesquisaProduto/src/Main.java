public class Main {
    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();
        estoque.exibirProdutos();

        estoque.adicionarProduto(1, "Produto A", 100,100);
        estoque.adicionarProduto(2, "Produto B", 800,5);
        estoque.adicionarProduto(3, "Produto C", 300,10);

        estoque.exibirProdutos();

        System.out.println("\n\n");
        System.out.println("Valor total do estoque: " + estoque.calculaValorEstoque());
        System.out.println("Produto mais caro: " + estoque.obterProdutoMasCaro());
    }
}