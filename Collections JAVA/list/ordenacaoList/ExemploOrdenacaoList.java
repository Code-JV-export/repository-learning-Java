package collections.estruturasDeDados.list.ordenacaoList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploOrdenacaoList {

    public static void main(String[] args) {

        List<Gato> meusGatos = new ArrayList<>(){{ //criando a lista de gatos
            add(new Gato("Jon", 18, "preto")); // criando e adicionando os gatos na lista na mesma linha da criação da lista
            add(new Gato("Simba", 6, "Tigrado")); // criando e adicionando os gatos na lista na mesma linha da criação da lista
            add(new Gato("Jon", 12, "amarelo")); // criando e adicionando os gatos na lista na mesma linha da criação da lista
        }};

        System.out.println("--\tOrdem de Inserção\t---");
        System.out.println(meusGatos);

        System.out.println("--\tOrdem de Aleatória\t---");
        Collections.shuffle(meusGatos); // pedindo para que a classe Collections misture os elementos da lista
        System.out.println(meusGatos);

        System.out.println("--\tOrdem Natural (Nome)\t---"); // 1: implemente a interface Comparable na classe do seu objeto, em seguida sobrescreva o metodo compareTo
        Collections.sort(meusGatos); // utiliza o metodo sort do Collections porque ele aceita uma lista, mas o objeto tem que ter um metodo compareTo
        System.out.println(meusGatos);

        System.out.println("--\tOrdem Idade\t---"); // 1: você tem que criar uma classe nova para implementar a interface Comparator
//        meusGatos.sort(new ComparatorIdade());
        Collections.sort(meusGatos, new ComparatorIdade() ); // depois você deve sobrescrever o metodo compare. obs: procure saber se o tipo que voce está comparando tem o seu proprio compare
        System.out.println(meusGatos);

        System.out.println("--\tOrdem por Cor\t---"); // 1: você tem que criar uma classe nova para implementar a interface Comparator
        meusGatos.sort(new ComparatorCor()); // depois você deve sobrescrever o metodo compare. obs: procure saber se o tipo que voce está comparando tem o seu proprio compare
        System.out.println(meusGatos);

        System.out.println("--\tOrdem Nome/Cor/Idade\t---");
        meusGatos.sort(new ComparatorNomeCorIdade());
        System.out.println(meusGatos);

    }
}
