package main.java.set.ordenacao.ex2;

import java.util.HashSet;
import java.util.Set;

public class GerenciadorAlunos {
    private Set<Aluno> AlunosSet;

    public GerenciadorAlunos() {
        AlunosSet = new HashSet<>();
    }

    public void adicionarAluno(Aluno aluno) {
        AlunosSet.add(new Aluno(aluno));
    }


}
