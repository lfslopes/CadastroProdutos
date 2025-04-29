package cadastro_produtos;

import java.util.Arrays;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class CadastroProdutos {
    private Set<Produto> produtos;

    public CadastroProdutos(){
        this.produtos = new TreeSet<>();
    }
    public CadastroProdutos(Set<Produto> produtos){
        this.produtos = produtos;
    }
    public CadastroProdutos(Produto...produto){
        this.produtos = new TreeSet<>();
        this.produtos.addAll(Arrays.asList(produto));
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade){
        this.produtos.add(new Produto(cod, nome, preco, quantidade));
    }
    public void exibirProdutosPorNome(){
        this.produtos.stream().
                sorted((produto1, produto2) -> produto1.getNome().compareTo(produto2.getNome())).
                forEach(System.out::println);
    }
    public void exibirProdutosPorPreco(){this.produtos.stream().
            sorted((produto1, produto2) -> Double.compare(produto1.getPreco(), produto2.getPreco())).
            forEach(System.out::println);
    }
}
