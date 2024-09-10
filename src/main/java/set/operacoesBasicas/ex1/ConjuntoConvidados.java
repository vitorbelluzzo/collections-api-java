package main.java.set.operacoesBasicas.ex1;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> listaConvidados;

    public ConjuntoConvidados() {
        this.listaConvidados = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite) {
        listaConvidados.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidado(int codigoConvite) {
        Convidado convidadoParaRemover = null;
        for (Convidado c : listaConvidados) {
            if (codigoConvite == c.getCodigoConvite()) {
                convidadoParaRemover = c;
                break;
            }
        }
        listaConvidados.remove(convidadoParaRemover);
    }

    public int contarConvidados() {
        return listaConvidados.size();
    }


    public void exibirConvidado() {
        System.out.println(listaConvidados);
    }

    public static void main(String[] args) {
        ConjuntoConvidados lista = new ConjuntoConvidados();

        lista.adicionarConvidado("Vitor", 01);
        lista.adicionarConvidado("Sophia", 02);
        lista.adicionarConvidado("Onésimo", 03);
        lista.adicionarConvidado("Doralyce", 04);

        System.out.println(lista.contarConvidados());
        lista.exibirConvidado();
        lista.removerConvidado(01);
        System.out.println(lista.contarConvidados());
        lista.exibirConvidado();
    }

}
