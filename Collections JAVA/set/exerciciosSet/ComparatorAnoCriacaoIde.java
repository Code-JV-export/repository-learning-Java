package collections.estruturasDeDados.set.exerciciosSet;

import java.util.Comparator;

public class ComparatorAnoCriacaoIde implements Comparator<LinguagemFavorita> {
    @Override
    public int compare(LinguagemFavorita lf1, LinguagemFavorita lf2) {
        int anoCriacao = Integer.compare(lf1.getAnoDeCriacao(), lf2.getAnoDeCriacao());
        if (anoCriacao != 0) return anoCriacao;
        int ide = lf1.getIde().compareToIgnoreCase(lf2.getIde());
        return ide;
    }
}
