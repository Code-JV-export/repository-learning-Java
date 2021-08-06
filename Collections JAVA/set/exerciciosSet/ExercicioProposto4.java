package collections.estruturasDeDados.set.exerciciosSet;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExercicioProposto4 {

    public static void main(String[] args) {

        Set<LinguagemFavorita> minhasLinguagemFavorita = new LinkedHashSet<>();
        minhasLinguagemFavorita.add(new LinguagemFavorita("Java", 1993, "Intellij"));
        minhasLinguagemFavorita.add(new LinguagemFavorita("JavaScript", 1995, "VScode"));
        minhasLinguagemFavorita.add(new LinguagemFavorita("HTML", 1991, "VScode"));

        System.out.println("--- Apresentar em ordem de inserção: ---");
        System.out.println(minhasLinguagemFavorita);

        System.out.println("--- Apresentar em ordem Naturaal (nome): ---");
        Set<LinguagemFavorita> minhasLinguagemFavorita2 = new TreeSet<>(minhasLinguagemFavorita);
        System.out.println(minhasLinguagemFavorita2);

        System.out.println("--- Apresentar em ordem Natural (IDE): ---");
        Set<LinguagemFavorita> minhasLinguagemFavorita3 = new TreeSet<>(new ComparatorIDE());
        minhasLinguagemFavorita3.addAll(minhasLinguagemFavorita);
        System.out.println(minhasLinguagemFavorita3);

        System.out.println("--- Apresentar em ordem Natural (Ano de criação e IDE): ---");
        Set<LinguagemFavorita> minhasLinguagemFavorita4 = new TreeSet<>(new ComparatorAnoCriacaoIde());
        minhasLinguagemFavorita4.addAll(minhasLinguagemFavorita);
        System.out.println(minhasLinguagemFavorita4);

        System.out.println("--- Apresentar em ordem Natural (nome, ano de criação e IDE): --- ");
        Set<LinguagemFavorita> linguagemFavoritaSet = new TreeSet<>(new ComparatorNomeAnoCriacaoIde());
        linguagemFavoritaSet.addAll(minhasLinguagemFavorita);
        System.out.println(linguagemFavoritaSet);

        System.out.println("--- Apresentar as linguagens uma abaixo da outra: ---");
        for (LinguagemFavorita lf: linguagemFavoritaSet) System.out.println(lf.getNome() + ", " +
                lf.getAnoDeCriacao() + ", " + lf.getIde());

    }
}
