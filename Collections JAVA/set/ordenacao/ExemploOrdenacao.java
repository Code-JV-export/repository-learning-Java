package collections.estruturasDeDados.set.ordenacao;

import java.util.*;

public class ExemploOrdenacao {

    public static void main(String[] args) {

        System.out.println("--\tOrdem aleatória\t--");
        Set<Serie> minhasSeries = new HashSet<>(){{ //fazer uma list HashSet, pois ele registra os dados de ordem aleatoria
            add(new Serie("got", "fantasia", 60));
            add(new Serie("dark", "drama", 60)); //adicionando os elementos a lista
            add(new Serie("that '70s show", "comédia", 25));
        }};

        for (Serie serie: minhasSeries) System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " //fazendo uma varredura pela lista e imprimindo os seus valores
                + serie.getTempoEpisodio());

        System.out.println("--\tOrdem inserção\t--");
        Set<Serie> minhaSeries1 = new LinkedHashSet<>() {{ //o LinkedHashSet salva os elementos da lista na ordem de inserçã, então nesse caso é melhor esta estrutura
            add(new Serie("got", "fantasia", 60));
            add(new Serie("dark", "drama", 60));
            add(new Serie("that '70s show", "comédia", 25));
        }};

        for (Serie serie: minhaSeries1) System.out.println(serie.getNome() + " - " + serie.getGenero() + " - "
                + serie.getTempoEpisodio());

        System.out.println("--\tOrdem natural (Tempo episodio)\t--");
        Set<Serie> minhasSeries2 = new TreeSet<>(minhaSeries1); //o TreeSet registra os elementos da lista em ordem crescente, então se encaixa perfeitamente no caso
        for (Serie serie: minhasSeries2) System.out.println(serie.getNome() + " - " + serie.getGenero() + " - "
                + serie.getTempoEpisodio());

        System.out.println("--\tOrdem Nome/Gênero/TempoEpisodio\t--");
        Set<Serie> minhasSeries3 = new TreeSet<>(new ComparatorNomeGeneroEpisodio());//foi criado a classe ComparatorNomeGeneroEpisodio para poder implementar a interface Comparator, com o intuito de rescrever o método compare
        minhasSeries3.addAll(minhasSeries);
        for (Serie serie: minhasSeries3) System.out.println(serie.getNome() + " - " + serie.getGenero() + " - "
                + serie.getTempoEpisodio());

        System.out.println("ordernar por genero");
        Set<Serie> minhasSeries4 = new TreeSet<>(new ComparatorGenero());
        minhasSeries4.addAll(minhasSeries);
        for (Serie serie: minhasSeries4) System.out.println(serie.getNome() + " - " + serie.getGenero() + " - "
                + serie.getTempoEpisodio());


        System.out.println("ordernar por tempo episodio");
        Set<Serie> todasSeries = new TreeSet<>(minhasSeries);
        for (Serie serie: todasSeries) System.out.println(serie.getNome() + " - " + serie.getGenero() + " - "
                + serie.getTempoEpisodio());
    }
}
