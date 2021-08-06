package collections.estruturasDeDados.streamAPI;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExerciciosStreamAPI {

    public static void main(String[] args) {

        List<String> numerosAleatorios = Arrays.asList("1", "0", "4", "1", "2", "3", "9", "6", "5");

        System.out.println("Imprima todos os elementos dessa lista de String: ");
        //fazendo um forEach para apresentar todos os valores da List
        numerosAleatorios.forEach(System.out::println); //lembrando que esse daqui é uma forma resumida do forEach, utilizando o streamAPI

        //Lembrando que o Set não aceita números repetidos
        System.out.println("Pegue os 5 primeiros números e coloque dentro de um Set: "); //
        //UTILIZANDO UM MÉTODO QUE NAO FOI VISTO ANTES: o collect manda coletar o dados e colocar em algo que vai dentro do argumentro, no parenteses
        Set<String> collectSet = numerosAleatorios.stream().limit(5).collect(Collectors.toSet());
        //EXPLICAÇÃO DA LINHA DE CIMA: primeiro está pedindo para o limit, do steam, pegar os 5 primeiro itens da lista, deppois pede para o collect colocar esses itens em um Set

        System.out.println("Transforme essa lista de String em uma lista de numero inteiros.");
        //UTILIZANDO UM MÉTODO QUE NÃO FOI VISTO ANTES: o map desta linha, irá transforma o String em numero
        List<Integer> numerosAleatoriosInteger = numerosAleatorios.stream().map(Integer::parseInt).collect(Collectors.toList());
        System.out.println(numerosAleatoriosInteger);

        System.out.println("Pegue os números pares e maiores que 2 e coloque em uma lista: ");
//        List<Integer> listParesMaioresQue2 = numerosAleatorios.stream().map(Integer::parseInt).filter(new Predicate<Integer>() {
//            @Override
//            public boolean test(Integer i) {
//                if ((i % 2 == 0) && i > 2) return true;
//                return false;
//            }
//        }).collect(Collectors.toList());

        List<Integer> listParesMaioresQue2 = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .filter(i -> (i % 2 == 0 && i > 2))
                .collect(Collectors.toList());
        System.out.println(listParesMaioresQue2);

        System.out.println("Mostre a média dos números: ");
        numerosAleatorios.stream()
                .mapToInt(Integer::parseInt) //transformando cada elemento em int, e retornando um elemento por vez
                .average() //tira a média
                .ifPresent(System.out::println); //verifica se deu tudo certo, se sim, ele imprime o valor, mas se der Null, ele não faz nada

//        System.out.println("Remova os valores impares: ");
//        numerosAleatoriosInteger.removeIf(i -> (i % 2 != 0));
//        System.out.println(numerosAleatoriosInteger);

//        Para você
        System.out.println("Ignore os 3 primeiros elementos da lista e imprima o restante:");
        List<Integer> collect = numerosAleatorios.stream().map(Integer::parseInt).skip(3).collect(Collectors.toList());
        System.out.println(collect);

        System.out.println("Retirando os números repetidos da lista, quantos números ficam? ");
        long quantidadeNumerosUnicos = numerosAleatoriosInteger.stream().distinct().count();
        System.out.println(quantidadeNumerosUnicos);

        System.out.print("Mostre o menor valor da lista: ");
        numerosAleatoriosInteger.stream().mapToInt(Integer::intValue)
                .min()
                .ifPresent(System.out::println);


        System.out.print("Mostre o maior valor da lista: ");
        numerosAleatoriosInteger.stream().mapToInt(Integer::intValue)
                .max()
                .ifPresent(System.out::println);

        System.out.println("Pegue apenas os números ímpares e some: ");
        long countNumeroImpares = numerosAleatoriosInteger.stream()
                .filter(i -> (i % 2 != 0))
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(countNumeroImpares);

        System.out.println("Mostre a lista na ordem númerica: ");
        List<Integer> listOrdemNumerica = numerosAleatoriosInteger.stream()
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());
        System.out.println(listOrdemNumerica);

        System.out.println("Agrupe os valores ímpares múltiplos de 3 ou de 5:");
//        dica: collect(Collectors.groupingBy(new Function())
        Map<Boolean, List<Integer>> collectNumerosMultiplosDe3e5 = numerosAleatoriosInteger.stream()
                .collect(Collectors.groupingBy(i -> (i % 3 == 0 || i % 5 == 0)));
        System.out.println(collectNumerosMultiplosDe3e5);

    }
}
