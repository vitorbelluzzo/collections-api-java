package main.java.set.operacoesBasicas.ex2;

public class PalavrasUnicas {
    private String palavra;

    public PalavrasUnicas(String palavra) {
        this.palavra = palavra;
    }

    public String getPalavra() {
        return palavra;
    }

    @Override
    public String toString() {
        return "PalavrasUnicas{" + "palavra='" + palavra + '\'' + '}';
    }


}
