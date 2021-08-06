package collections.estruturasDeDados.list.ordenacaoList;

import java.util.Comparator;

public class ComparatorCor implements Comparator<Gato> {
    @Override
    public int compare(Gato g1, Gato g2) {
        return g1.getCor().compareToIgnoreCase(g2.getCor()); //está comparando se a cor do gato um vem primeiro do que a cor do gato 2
    }
}
