package main.java.list;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {

    private List<Tarefa> tarefaList;


    public ListaTarefas() {
        this.tarefaList = new ArrayList<>();
    }


    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
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
}
