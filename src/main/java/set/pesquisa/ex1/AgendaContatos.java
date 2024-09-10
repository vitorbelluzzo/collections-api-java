package main.java.set.pesquisa.ex1;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> ListaDeContato;

    public AgendaContatos() {
        ListaDeContato = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        ListaDeContato.add(new Contato(nome, numero));
        System.out.println(nome + " Adicionado com sucesso");
    }

    public void exibirContatos() {
        System.out.println(ListaDeContato);
    }

    public Set<Contato> pesquisarContato(String nome) {
        Set<Contato> ContatoPorNome = new HashSet<>();
        for (Contato c : ListaDeContato) {
            if (c.getNome().startsWith(nome)) {
                ContatoPorNome.add(c);
            }
            return ContatoPorNome;
        }


        return ContatoPorNome;
    }

    public Contato AtualizarNumeroContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;
        for (Contato c : ListaDeContato) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                c.setNumeroTelefone(novoNumero);
                contatoAtualizado = c;
                System.out.println("Número alterado para " + novoNumero);
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos listaContato = new AgendaContatos();

        listaContato.adicionarContato("Vitao", 1199354506);
        listaContato.exibirContatos();
        System.out.println(listaContato.pesquisarContato("Vit"));
        listaContato.AtualizarNumeroContato("Vitao", 1199746579);
       

    }

}
