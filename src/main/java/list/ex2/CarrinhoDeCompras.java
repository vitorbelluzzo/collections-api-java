package main.java.list.ex2;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    List<Item> listaDeCompra = new ArrayList<>();


    public void adicionarItem(double preco, int quantidade, String nome) {
        listaDeCompra.add(new Item(preco, nome, quantidade));
        System.out.println(nome + " adicionado ao carrinho");
    }

    public void removerItem(String nome) {
        listaDeCompra.removeIf(item -> item.getNome().equalsIgnoreCase(nome));
    }

    public double calcularTotal() {
        double total = 0.0;
        for (Item item : listaDeCompra) {
            total += item.getPreco() * item.getQuantidade();
        }
        return total;
    }


    public void exibirItens() {
        System.out.println(listaDeCompra);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        carrinhoDeCompras.adicionarItem(9, 2, "Melancia");
        carrinhoDeCompras.adicionarItem(1.5, 5, "Laranja");
        System.out.println(carrinhoDeCompras.calcularTotal());
        carrinhoDeCompras.exibirItens();
        carrinhoDeCompras.removerItem("Laranja");
        System.out.println(carrinhoDeCompras.calcularTotal());
        carrinhoDeCompras.exibirItens();

    }
}
