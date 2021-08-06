package collections.estruturasDeDados.map.exerciciosMap;

import javax.swing.text.html.HTMLDocument;
import java.util.*;

public class ExercicioProposto5 {

    public static void main(String[] args) {

        System.out.println("crie um dicionario e relacione os estados e suas populações: ");
        Map<String, Integer> estadosNE = new HashMap<>() {{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3254265);
        }};
        System.out.println(estadosNE);

        System.out.println("substitua a população do estado do RN por 3.534.165");
        estadosNE.put("RN", 3354165);
        System.out.println(estadosNE);

        System.out.println("confira se o estado PB está no dicionário, caso não, adicione: PB - 4.039.277");
        boolean existe = estadosNE.containsKey("PB");
        System.out.println("o estado PB está no dicionario? " +  existe);
        if (! existe) {
            estadosNE.put("PB", 4039277);
        }
        System.out.println(estadosNE);

        //exiba a população de PE
        int populacaoEncontrada = 0;
        Set<Map.Entry<String, Integer>> entries = estadosNE.entrySet();
        for (Map.Entry<String, Integer> estado: entries) {
            if (estado.getKey().compareToIgnoreCase("PE") == 0) populacaoEncontrada = estado.getValue();
        }
        System.out.println("exiba a população de PE: " + populacaoEncontrada);

        System.out.println("exiba todos os estados e suas populações na ordem que foi informado");
        Map<String, Integer> estadosNE1 = new LinkedHashMap<>() {{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3254265);
        }};
        estadosNE1.put("PB", 4039277);
        System.out.println(estadosNE1);

        System.out.println("exiba os estados e suas populações em ordem alfabética: ");
        Map<String, Integer> estadosNE2 = new TreeMap<>(estadosNE1);
        System.out.println(estadosNE2);

        System.out.println("exiba o estado com a menor poupulação e sua quantidade: ");
        Integer min = Collections.min(estadosNE2.values());
        Set<Map.Entry<String, Integer>> entries1 = estadosNE2.entrySet();
        for (Map.Entry<String, Integer> estado: entries1) {
            if (estado.getValue().equals(min)) System.out.println(estado.getKey() + " - " + min);
        }

        System.out.println("exiba o estado com a maior população e sua quantidade: ");
        Integer max = Collections.max(estadosNE2.values());
        Set<Map.Entry<String, Integer>> entries2 = estadosNE2.entrySet();
        for (Map.Entry<String, Integer> estado : entries2) {
            if (estado.getValue().equals(max)) System.out.println(estado.getKey() + " - " + max);
        }

        //exiba a soma da população desses estados
        Collection<Integer> values = estadosNE2.values();
        Iterator<Integer> iterator = values.iterator();
        int somatorio = 0;
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            somatorio += next;
        }
        System.out.println("exiba a soma da população desses estados: " + somatorio);

        System.out.println("exiba a média da população deste dicionário de estados: " + (somatorio / estadosNE2.size()));

        System.out.println(estadosNE2);
        System.out.println("remova os estados com a população menor que 4.000.000");
        Iterator<Integer> iterator1 = estadosNE2.values().iterator();
        while (iterator1.hasNext()) {
            if (iterator1.next() < 4000000) iterator1.remove();
        }
        System.out.println(estadosNE2);

        System.out.println("apague o dicionário de estados: ");
        estadosNE.clear();

        System.out.println("Confira se o dicionário está vazio: " + estadosNE.isEmpty());

    }
}
