package collections.estruturasDeDados.set.exerciciosSet;

import java.util.Comparator;

public class ComparatorIDE implements Comparator<LinguagemFavorita> {
    @Override
    public int compare(LinguagemFavorita lf1, LinguagemFavorita lf2) {
        return lf1.getIde().compareToIgnoreCase(lf2.getIde());
    }
}
