package main.java.set.ordenacao.ex1;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produto> listaDeProdutos;

    public CadastroProdutos() {
        this.listaDeProdutos = new HashSet<>();

    }


    public void adicionarProdutos(int cod, String nome, Double preco, int quantidade) {
        listaDeProdutos.add(new Produto(cod, nome, preco, quantidade));
    }

    public Set<Produto> exibirProdutoPorNome() {
        Set<Produto> produtorPorNome = new TreeSet<>(listaDeProdutos);
        return produtorPorNome;
    }

    public Set<Produto> exibirProdutoPorPreco() {
        Set<Produto> produtoPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtoPorPreco.addAll(listaDeProdutos);
        return produtoPorPreco;
    }


    public static void main(String[] args) {
        CadastroProdutos listaDeProdutos = new CadastroProdutos();

        listaDeProdutos.adicionarProdutos(01, "Café", 7.50, 100);
        listaDeProdutos.adicionarProdutos(02, "Açúcar", 4.30, 50);
        listaDeProdutos.adicionarProdutos(03, "Leite", 5.80, 200);
        listaDeProdutos.adicionarProdutos(04, "Pão", 3.20, 150);
        listaDeProdutos.adicionarProdutos(05, "Chá", 6.40, 75);

        System.out.println(listaDeProdutos.exibirProdutoPorNome());
        System.out.println(listaDeProdutos.exibirProdutoPorPreco());
    }
}
