package main.java.list.pesquisa.ex2;

public class Numero implements Comparable<Numero> {
    private int valor;

    public Numero(int valor) {
        this.valor = valor;
    }

    @Override
    public int compareTo(Numero n) {
        return Integer.compare(this.valor, n.getNumero());
    }


    @Override
    public String toString() {
        return String.valueOf(valor);
    }

    public int getNumero() {
        return valor;
    }

}
