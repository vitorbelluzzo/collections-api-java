package main.java.list.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoPessoas {
    private List<Pessoa> pessoa;

    public OrdenacaoPessoas() {
        this.pessoa = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        pessoa.add(new Pessoa(nome, idade, altura));
        System.out.println("pessoa adicionada.");
    }

    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoa);
        Collections.sort(pessoasPorIdade);
        System.out.println("Lista ordenada por idade");
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoa);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        System.out.println("Lista ordenada por altura");
        return pessoasPorAltura;
    }

    public void mostrarLista() {
        System.out.println(pessoa);
    }


    public static void main(String[] args) {
        OrdenacaoPessoas listadepessoas = new OrdenacaoPessoas();
        listadepessoas.adicionarPessoa("Vitor", 24, 1.85);
        listadepessoas.adicionarPessoa("Sophia", 22, 1.72);
        listadepessoas.adicionarPessoa("Luan", 24, 1.65);
        listadepessoas.adicionarPessoa("Emily", 20, 1.67);
        listadepessoas.adicionarPessoa("Gustavo", 19, 1.80);
        listadepessoas.adicionarPessoa("Laura", 25, 1.70);

        listadepessoas.mostrarLista();
        System.out.println(listadepessoas.ordenarPorIdade());
        System.out.println(listadepessoas.ordenarPorAltura());

    }

}
