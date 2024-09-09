package main.java.list.operacoesBasicas.ex2;

public class Item {
    private double preco;

    public Item(double preco, String nome, int quantidade) {
        this.preco = preco;
        this.nome = nome;
        this.quantidade = quantidade;
    }

    private String nome;
    private int quantidade;

    @Override
    public String toString() {
        return "Item{" + "preco=" + preco + ", nome='" + nome + '\'' + ", quantidade=" + quantidade + '}';
    }


    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public int getQuantidade() {
        return quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public String getNome() {
        return nome;
    }


}
