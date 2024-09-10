package main.java.set.operacoesBasicas.ex2;

import main.java.set.operacoesBasicas.ex2.PalavrasUnicas;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<PalavrasUnicas> listaDePalavras;

    public ConjuntoPalavrasUnicas() {
        this.listaDePalavras = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        listaDePalavras.add(new PalavrasUnicas(palavra));
        System.out.println(palavra + ": palavra adicionada");
    }

    public void removerPalavra(String palavra) {
        PalavrasUnicas PalavraParaRemover = null;

        for (PalavrasUnicas p : listaDePalavras) {
            if (Objects.equals(p.getPalavra(), palavra)) {
                PalavraParaRemover = p;
                break;
            }
        }

        if (PalavraParaRemover != null) {
            listaDePalavras.remove(PalavraParaRemover);
            System.out.println(palavra + ": palavra removida");
        } else {
            System.out.println(palavra + " não foi encontrada");
        }
    }

    public void exibirPalavras() {
        System.out.println("Palavras na caixa: " + listaDePalavras);
    }

    public void verificarPalavra(String palavra) {
        boolean palavraEncontrada = false;

        for (PalavrasUnicas p : listaDePalavras) {
            if (Objects.equals(p.getPalavra(), palavra)) {
                palavraEncontrada = true;
                break;
            }
        }

        if (palavraEncontrada) {
            System.out.println("A palavra \"" + palavra + "\" está presente no conjunto");
        } else {
            System.out.println("A palavra \"" + palavra + "\" não está presente no conjunto");
        }
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas caixaDePalavras = new ConjuntoPalavrasUnicas();

        caixaDePalavras.adicionarPalavra("Comer");
        caixaDePalavras.adicionarPalavra("Correr");
        caixaDePalavras.adicionarPalavra("Beber");

        caixaDePalavras.exibirPalavras();

        caixaDePalavras.verificarPalavra("Comer");


        caixaDePalavras.removerPalavra("Comer");

        caixaDePalavras.exibirPalavras();
    }
}