package cadastro_produtos;

import java.util.Locale;

public class Produto implements Comparable<Produto>{
    private long id;
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(long id, String nome, double preco, int quantidade) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public long getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public double getPreco() {
        return preco;
    }
    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public int compareTo(Produto produto) {
        return Long.compare(this.id, produto.id);
    }
    @Override
    public String toString() {
        return "Produto: " + this.getNome() + "\n" +
               "Código: " + this.getId() + "\n" +
               "Preço: R$" + String.format(Locale.forLanguageTag("BR"), "%.2f", this.getPreco()) + "\n" +
               "Quantidade: " + this.getQuantidade() + "\n" +
               "Preço Total: R$ " + String.format(Locale.forLanguageTag("BR"), "%.2f", this.getPreco() * this.getQuantidade()) + "\n";
    }
}
