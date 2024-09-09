package main.java.list.operacoesBasicas.ex1;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {

    private final List<Tarefa> tarefaList = new ArrayList<>();


    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
        System.out.println("Tarefa adicionada");
    }

    public void removerTarefa(String descricao) {
        tarefaList.removeIf(tarefa -> tarefa.getDescricao().equalsIgnoreCase(descricao));
    }

    public int obterNumeroTotalTarefas() {
        return tarefaList.size();
    }

    public void exibirDescricaoTarefas() {
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();
        System.out.println(listaTarefas.obterNumeroTotalTarefas());
        listaTarefas.adicionarTarefa("Arrumar");
        listaTarefas.adicionarTarefa("guardar");
        System.out.println(listaTarefas.obterNumeroTotalTarefas());
        listaTarefas.exibirDescricaoTarefas();
        listaTarefas.removerTarefa("Arrumar");
        System.out.println(listaTarefas.obterNumeroTotalTarefas());

    }
}
