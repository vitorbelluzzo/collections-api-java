package main.java.set.pesquisa.ex2;

import java.util.Objects;

public class Tarefa {
    private String descricao;
    private boolean concluida;

    public Tarefa(boolean concluida, String descricao) {
        this.concluida = concluida;
        this.descricao = descricao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tarefa tarefa = (Tarefa) o;
        return Objects.equals(descricao, tarefa.descricao);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(descricao);
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "concluida=" + concluida +
                ", descricao='" + descricao + '\'' +
                '}';
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
