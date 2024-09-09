package main.java.list.pesquisa.ex2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SomaNumeros {
    private List<Numero> numerosInteiros;

    public SomaNumeros() {
        this.numerosInteiros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        numerosInteiros.add(new Numero(numero));
        System.out.println("Número adicionado: " + numero);
    }

    public int encontrarMaiorNumero() {
        Numero maiorNumero = Collections.max(numerosInteiros);
        return maiorNumero.getNumero();
    }

    public int encontrarMenorNumero() {
        Numero menorNumero = Collections.min(numerosInteiros);
        return menorNumero.getNumero();
    }
    public int calcularSoma() {
        int soma = 0;
        for (Numero numero : numerosInteiros) {
            soma += numero.getNumero();
        }
    return soma;
    }

    public void exibirNumerosInteiros() {
        System.out.println(numerosInteiros);
    }

    public static void main(String[] args) {
        SomaNumeros listadenumero = new SomaNumeros();

        listadenumero.adicionarNumero(2);
        listadenumero.adicionarNumero(3);
        listadenumero.adicionarNumero(4);
        listadenumero.adicionarNumero(5);
        listadenumero.adicionarNumero(6);

        System.out.println("o maior numero da lista é: " + listadenumero.encontrarMaiorNumero());
        System.out.println("o menor numero da lista é: " + listadenumero.encontrarMenorNumero());
        System.out.println("a soma  da lista resulta em: " + listadenumero.calcularSoma());

        listadenumero.exibirNumerosInteiros();

    }


}
