package collections.estruturasDeDados.set.exerciciosSet;

import java.util.Comparator;

public class ComparatorNomeAnoCriacaoIde implements Comparator<LinguagemFavorita> {
    @Override
    public int compare(LinguagemFavorita lf1, LinguagemFavorita lf2) {
        int nome = lf1.compareTo(lf2);
        if (nome != 0) return nome;
        int anoCriacao = Integer.compare(lf1.getAnoDeCriacao(), lf2.getAnoDeCriacao());
        if (anoCriacao != 0) return anoCriacao;
        int ide = new ComparatorIDE().compare(lf1, lf2);
        return ide;
    }
}
