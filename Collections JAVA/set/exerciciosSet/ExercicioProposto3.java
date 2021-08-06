package collections.estruturasDeDados.set.exerciciosSet;

import java.util.*;

public class ExercicioProposto3 {

    public static void main(String[] args) {

        Set<String> cores = new LinkedHashSet<>(){{
            add("violeta");
            add("anil");
            add("azul");
            add("verde");
            add("amarelo");
            add("laranja");
            add("vermelho");
        }};

        System.out.println("--- Exiba todas as cores uma abaixo da outra ---");
        for (String cor: cores) System.out.println(cor);

        System.out.println("--- A quantidade de cores que um arco-íris tem: " + cores.size());

        System.out.println("--- Exiba as cores em ordem alfabética: ---");
        Set<String> cores1 = new TreeSet<>(cores);
        System.out.println(cores1);

        System.out.println("--- Exiba as cores da forma de inserção: ---");
        System.out.println(cores);

        System.out.println("--- Exiba as cores em ordem inversa: ---");
        List<String> coresList = new ArrayList<>(cores);
        Collections.reverse(coresList);
        System.out.println(coresList);

        System.out.println("--- Exiba todas as cores que comecem com a letra 'v': ---");
        for (String cor: cores){
            if (cor.startsWith("v")) System.out.println(cor);
        }

        System.out.println("--- Remova todas as cores que comecem com a letra 'v': ---");
        Iterator<String> iterator = cores.iterator();
        while (iterator.hasNext()) { //quando for percorrer um iterator, sempre faça com o while, é bem mais facil
            String next = iterator.next();
            if (next.startsWith("v")) iterator.remove();
        }
        System.out.println(cores);

        System.out.println("--- Limpe o conjunto: ---");
        cores.clear();
        System.out.println(cores);
    }
}
