package main.java.set.ordenacao.ex2;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    private Set<Aluno> AlunosSet;

    public GerenciadorAlunos() {
        AlunosSet = new HashSet<>();
    }

    public void adicionarAluno(String matricula, String nome, long nota) {
        AlunosSet.add(new Aluno(matricula, nome, nota));
    }

    public void removerAluno(String Matricula) {
        AlunosSet.removeIf(aluno -> aluno.getMatricula().equalsIgnoreCase(Matricula));
    }

    public void exibirAluno() {
        System.out.println(AlunosSet);
    }

    public Set<Aluno> exibirAlunosPorNome() {
        Set<Aluno> alunoPorNome = new TreeSet<>(AlunosSet);
        return alunoPorNome;
    }

    public Set<Aluno> exibirAlunosPorNota() {
        Set<Aluno> alunoPorNota = new TreeSet<>(new ComparatorPorNota());
        alunoPorNota.addAll(AlunosSet);
        return alunoPorNota;
    }


    public static void main(String[] args) {
        GerenciadorAlunos listaDeAluno = new GerenciadorAlunos();

        listaDeAluno.adicionarAluno("01", "Vitor", 9);
        listaDeAluno.adicionarAluno("02", "Sophia", 10);
        listaDeAluno.adicionarAluno("03", "Alex", 6);
        listaDeAluno.exibirAluno();
//        listaDeAluno.removerAluno("03");
        listaDeAluno.exibirAluno();
        System.out.println(listaDeAluno.exibirAlunosPorNome());
        System.out.println(listaDeAluno.exibirAlunosPorNota());
    }


}
