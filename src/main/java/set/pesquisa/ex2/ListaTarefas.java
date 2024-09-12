package main.java.set.pesquisa.ex2;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> listaDeTarefa;

    public ListaTarefas() {
        this.listaDeTarefa = new HashSet<>();
    }

    public void adicionarTarefa(String descricao, boolean concluida) {
        listaDeTarefa.add(new Tarefa(concluida, descricao));
        System.out.println("tarefa " + descricao + " adicionada a lista");
    }

    public void removerTarefa(String concluida) {
        Tarefa tarefaParaRemover = null;

        for (Tarefa t : listaDeTarefa) {
            if (t.getDescricao() == concluida) {
                tarefaParaRemover = t;
            }
        }
        listaDeTarefa.remove(tarefaParaRemover);

    }

    public void exibirTarefas() {
        System.out.println(listaDeTarefa);
    }

    public int contarTarefa() {
        int contagem = 0;
        for (Tarefa t : listaDeTarefa) {
            if (t != null) {
                contagem += 1;
            }
        }

        return contagem;
    }

    public int obterTarefasConcluidas() {
        int counter = 0;
        for (Tarefa t : listaDeTarefa) {
            if (t.isConcluida()) {
                counter += 1;
            }
        }

        return counter;
    }

    public int obterTarefasPendente() {
//        listaDeTarefa.size();
        int counter = 0;
        for (Tarefa t : listaDeTarefa) {
            if (!t.isConcluida()) {
                counter += 1;
            }
        }

        return counter;

    }

    public void marcarTarefaConcluida(String descricao, boolean concluida) {
        for (Tarefa t : listaDeTarefa) {
            if (t.getDescricao() == descricao) {
                if (t.isConcluida() == concluida) {
                    t.setConcluida(true);
                    System.out.println(descricao + " setada para: Concluida");
                    break;
                } else {
                    System.out.println("tarefa já concluída: " + descricao);
                }
            }
        }
    }

    public void marcarTarefaPendente(String descricao, boolean concluida) {
        for (Tarefa t : listaDeTarefa) {
            if (t.getDescricao() == descricao) {
                if (t.isConcluida() == !concluida) {
                    t.setConcluida(false);
                    System.out.println(descricao + " setada para: Pendente");
                    break;
                } else {
                    System.out.println("tarefa já está pendente: " + descricao);
                }
            }

        }
    }

    public void limparListaTarefas() {
        listaDeTarefa.clear();
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();
        listaTarefas.adicionarTarefa("tarefa 1", false);
        listaTarefas.adicionarTarefa("tarefa 2", false);
        listaTarefas.adicionarTarefa("tarefa 3", false);
        listaTarefas.adicionarTarefa("tarefa 4", false);

        listaTarefas.limparListaTarefas();
        listaTarefas.exibirTarefas();


        System.out.println(listaTarefas.contarTarefa() + " tarefas na lista");

        listaTarefas.marcarTarefaConcluida("tarefa 2", false);
        listaTarefas.marcarTarefaConcluida("tarefa 1", false);
        listaTarefas.marcarTarefaConcluida("tarefa 2", false);

        System.out.println("Tarefas concluidas: " + listaTarefas.obterTarefasConcluidas());
        System.out.println("Tarefas pendentes: " + listaTarefas.obterTarefasPendente());

        listaTarefas.marcarTarefaPendente("tarefa 2", false);
        listaTarefas.marcarTarefaPendente("tarefa 1", false);
        listaTarefas.marcarTarefaPendente("tarefa 2", false);

        System.out.println("Tarefas concluidas: " + listaTarefas.obterTarefasConcluidas());
        System.out.println("Tarefas pendentes: " + listaTarefas.obterTarefasPendente());


        listaTarefas.removerTarefa("tarefa 3");


        listaTarefas.exibirTarefas();


    }
}
