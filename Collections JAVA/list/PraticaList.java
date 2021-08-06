package collections.estruturasDeDados.list;

import java.util.*;

public class PraticaList {

    public static void main(String[] args) {

        System.out.println("Crie uma lista e adicione as setes notas: ");

        List<Double> notas = new ArrayList<>(); //iniciando um ArrayList
        notas.add(7.0); //adicionando itens
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);
        System.out.println(notas.toString()); //imprimindo a lista completa

        System.out.println("Exiba a posição da nota 5.0: " + notas.indexOf(5d)); //pesquisando um elemento da lista, e obtendo como resposta o indice dele

        System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
        notas.add(4, 8.0); //adicionando um novo elemento no index desejado
        System.out.println(notas);

        System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
        notas.set(notas.indexOf(5.0), 6d); //modificando o elemento, passando o indice desejado e o novo elemento
        System.out.println(notas);

        System.out.println("Confira se a nota 5.0 está na lista: " + notas.contains(5.0)); //procura na lista se o elemento está na lista. O retorno é boolean

        System.out.println("Exiba todas as notas na ordem em que foram informados: ");
        for (Double nota : notas) { //fazendo um forEach para rodar toda a List notas
            System.out.println(nota);
        }

        System.out.println(notas.toString());
        System.out.println("Exiba a terceira nota adicionada: " + notas.get(2)); //pegando um elemento pelo indice

        System.out.println("Exiba a menor nota: " + Collections.min(notas)); //utilizando da class Collections para descobrir a menor nota da Lista notas

        System.out.println("Exiba a maior nota: " + Collections.max(notas)); //utilizando da class Collections para descobrir a menor nota da Lista notas

        System.out.println("Exiba a soma dos valores: ");
        Iterator<Double> iterator = notas.iterator(); //passando o metodo interator para intenrar na lista
        Double soma = 0d;
        while (iterator.hasNext()) { //perguntando se tem proximo
            Double next = iterator.next(); //pegando o proximo elemento
            soma += next;
        }
        System.out.println(soma);

        System.out.println("Exiba a média das notas: " + (soma/notas.size())); //dividindo a soma, com a quantidade de elemento na lista notas

        System.out.println("Remova a nota 0: ");
        notas.remove(0d); //remover através do objeto
        System.out.println(notas);

        System.out.println("Remova nota na posição 0");
        notas.remove(0);
        System.out.println(notas);

        System.out.println("Remover as notas menores que 7 e exiba a lista: ");
        Iterator<Double> interator1 = notas.iterator();
        while (interator1.hasNext()) { //perguntado se existir proximo elemento na lista
            Double next = interator1.next(); //pegando o proximo elemento
            if(next < 7) interator1.remove(); //compara se a nota é menor que 7, e se for ele apaga a mesma
        }
        System.out.println(notas);

        System.out.println("Apague toda a lista");
//        notas.clear();
        System.out.println(notas);

        System.out.println("Confira se a lista está vazia: " + notas.isEmpty());

        //Para você: Resolva esses exercícios utilizando os métodos da implementação LinkedList:

        System.out.println("Crie uma lista chamada notas2 " +
                "e coloque todos os elementos da collections.estruturasDeDados.list.exerciciosList.list Arraylist nessa nova lista: ");

        List<Double> notas2 = new LinkedList<>();
        notas2.addAll(notas);
        System.out.println(notas2);

        System.out.println("Mostre a primeira nota da nova lista sem removê-lo: " + notas2.get(0));

        System.out.println("Mostre a primeira nota da nova lista removendo-o: " + notas2.remove(0));

        System.out.println(notas2);

    }
}
