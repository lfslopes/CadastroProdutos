import cadastro_produtos.CadastroProdutos;
import cadastro_produtos.Produto;

public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto(1055519, "Carne 1kg", 45.99, 2);
        Produto produto2 = new Produto(1055501, "Abacate 1kg", 10.50, 1);
        Produto produto3 = new Produto(1055575, "Tomate 500g", 4.99, 1);
        Produto produto4 = new Produto(1055521, "Detergente 300ml", 6.99, 5);
        Produto produto5 = new Produto(1055562, "Papel Higiênico 6 rolos, 60m", 18.50, 1);
        Produto produto6 = new Produto(1055503, "Bala Icekiss", 0.10, 10);

        CadastroProdutos cadastroProdutos = new CadastroProdutos(produto, produto2, produto3, produto4, produto5, produto6);

        cadastroProdutos.adicionarProduto(1055523, "Desodorante Rollon", 10.99, 2);
        System.out.println("################################### - Produtos por Nome - ###################################");
        cadastroProdutos.exibirProdutosPorNome();
        System.out.println("################################### - Produtos por Preço - ###################################");
        cadastroProdutos.exibirProdutosPorPreco();
    }
}
