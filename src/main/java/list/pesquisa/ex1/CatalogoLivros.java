package main.java.list.pesquisa.ex1;


import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> listaDelivro;


    public CatalogoLivros() {
        this.listaDelivro = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        listaDelivro.add(new Livro(titulo, autor, anoPublicacao));
        System.out.println("Livro adicionado");
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!listaDelivro.isEmpty()) {
            for (Livro livro : listaDelivro) {
                if (livro.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(livro);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosPorIntervaloDeAnos = new ArrayList<>();
        if (!listaDelivro.isEmpty()) {
            for (Livro livro : listaDelivro) {
                if (livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao() <= anoFinal) {
                    livrosPorIntervaloDeAnos.add(livro);
                }
            }
        }
        return livrosPorIntervaloDeAnos;

    }

    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroPorTitulo = null;
        if (!listaDelivro.isEmpty()) {
            for (Livro livro : listaDelivro) {
                if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = livro;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }


    public static void main(String[] args) {
        CatalogoLivros catalogoDeLivros = new CatalogoLivros();
        catalogoDeLivros.adicionarLivro("O Senhor dos Anéis", "J. R. R. Tolkien", 1954);
        catalogoDeLivros.adicionarLivro("Cem Anos de Solidão", "J. R. R. Tolkien", 1967);
        catalogoDeLivros.adicionarLivro("Orgulho e Preconceito", "Jane Austen", 1813);
        catalogoDeLivros.adicionarLivro("Crime e Castigo", "Fiódor Dostoiévski", 1866);
        catalogoDeLivros.adicionarLivro("Cem Anos de Solidão", "Harper Lee", 1960);


        System.out.println(catalogoDeLivros.pesquisarPorTitulo("O Senhor dos Anéis"));
        System.out.println(catalogoDeLivros.pesquisarPorAutor("J. R. R. Tolkien"));
        System.out.println(catalogoDeLivros.pesquisarPorIntervaloAnos(1800, 1954));


    }
}




