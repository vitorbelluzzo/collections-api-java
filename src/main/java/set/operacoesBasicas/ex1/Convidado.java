package main.java.set.operacoesBasicas.ex1;

import java.util.Objects;

public class Convidado {
    private String nome;
    private int codigoConvite;

    public Convidado(String nome, int codigoConvite) {
        this.nome = nome;
        this.codigoConvite = codigoConvite;
    }

    @Override
    public String toString() {
        return "Convidado{" +
                "nome= '" + nome + '\'' +
                ", codigoConvite= " + codigoConvite +
                '}';
    }

    @Override
    public boolean equals(Object c) {
        if (this == c) return true;
        if (c == null || getClass() != c.getClass()) return false;
        Convidado convidado = (Convidado) c;
        return codigoConvite == convidado.codigoConvite;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, codigoConvite);
    }

    public int getCodigoConvite() {
        return codigoConvite;
    }

    public String getNome() {
        return nome;
    }
}
