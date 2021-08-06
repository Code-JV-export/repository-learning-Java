package collections.estruturasDeDados.map.ordenacaoMap;

import java.util.Comparator;
import java.util.Map;

public class ComparatorNumeroPaginas implements Comparator<Map.Entry<String, Livro>> {
    @Override
    public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {
        return Integer.compare(l1.getValue().getPagina(), l2.getValue().getPagina());
    }
}
