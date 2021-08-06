package collections.estruturasDeDados.map.ordenacaoMap;

import java.util.*;

public class ExemploOrdenacaoMap {

    public static void main(String[] args) {

        System.out.println("--- Ordem aleatória ---");
        Map<String, Livro> meusLivros = new HashMap<>() {{ //criando o dicionario HashMap pois ele adiciona o elementos de ordem aleatoria
            put("Hawking, Stephen", new Livro("Uma Breve Historia do Tempo", 256));
            put("Duhigg, Charles", new Livro("O Poder do Hábito", 408));
            put("Harari, Yuval Noah", new Livro("21 Lições Para o Século 21", 432));
        }};
        for (Map.Entry<String, Livro> livro :meusLivros.entrySet()) { //pede pra retornar um Set com os seus elementos seja um Map com as suas senhas e valores
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }

        System.out.println("--- Ordem inserção ---");
        Map<String, Livro> meusLivros1 = new LinkedHashMap<>() {{ //o LinkedHashMap adiciona os elementos na ordem de inserção
            put("Hawking, Stephen", new Livro("Uma Breve Historia do Tempo", 256));
            put("Duhigg, Charles", new Livro("O Poder do Hábito", 408));
            put("Harari, Yuval Noah", new Livro("21 Lições Para o Século 21", 432));
        }};
        for (Map.Entry<String, Livro> livro: meusLivros1.entrySet()) {
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }

        System.out.println("--- Ordem alfabetica autores");
        Map<String, Livro> meusLivros2 = new TreeMap<>(meusLivros1); //o TreeMap é para deixar em ordem alfabetica as chaves do dicionario
        Set<Map.Entry<String, Livro>> entries = meusLivros2.entrySet(); //se quiser trabalhar com as chaves, e os elementos separados, tem que se fazer o entrySet
        for (Map.Entry<String, Livro> livro: entries) {
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }

        System.out.println("--- Ordem alfabetica nome de livros ---");
        Set<Map.Entry<String, Livro>> meusLivros3 = new TreeSet<>(new ComparatorNome()); //criando um Comparator para dizer ao TreeSet como deve ordernar a inserção dos elementos
        meusLivros3.addAll(meusLivros.entrySet());
        for (Map.Entry<String, Livro> livro: meusLivros3) {
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }

        System.out.println("--- Ordem número de página");
        Set<Map.Entry<String, Livro>> meusLivros4 = new TreeSet<>(new ComparatorNumeroPaginas()); //criando um novo Comparator para dizer ao TreeSet como deve Ordenar a inserção
        meusLivros4.addAll(meusLivros3);
        for (Map.Entry<String, Livro> livro: meusLivros4) {
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome() + " - paginas: " +
                    livro.getValue().getPagina());
        }

    }
}
