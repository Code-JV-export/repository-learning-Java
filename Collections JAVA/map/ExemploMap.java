package collections.estruturasDeDados.map;

import java.util.*;

public class ExemploMap {

    public static void main(String[] args) {

        System.out.println("Crie um dicionário que relacione os modelos e seus respectivos consumos: ");
        Map<String, Double> carrosPopulares = new HashMap<>(){{ // o HashMap adiciona os elementos de forma aleatoria
           put("gol", 14.4);
           put("uno", 15.6);
           put("mobi", 16.1);
           put("hb20", 14.5);
           put("kwid", 15.6);
        }};
        System.out.println(carrosPopulares);

        System.out.println("Substitua o consumo do gol por 15,2 km/l: ");
        carrosPopulares.put("gol", 15.2); //Está substituindo o valor, já que a chave não se repete
        System.out.println(carrosPopulares.toString());

        System.out.println("Confira se o modelo tuckson está no dicionário: " +
                carrosPopulares.containsKey("tuckson")); // Verificando se existe o tuckson no dicionário

        System.out.println("Exiba o consumo do uno: " + carrosPopulares.get("uno")); //retorna o valor da chave uno

//        System.out.println("Exiba o terceiro modelo adicionado: ");

        System.out.println("Exiba os modelos: ");
        Set<String> modelos = carrosPopulares.keySet(); //retorna todas as chaves
        System.out.println(modelos);

        System.out.println("Exiba os consumos dos carros: ");
        Collection<Double> consumos = carrosPopulares.values(); //retorna todos os valores
        System.out.println(consumos);

        System.out.println("Exiba o modelo mais econômico e seu consumo: ");
        Double maisEficiente = Collections.max(carrosPopulares.values()); //retorna o maior valor
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet(); //retorna uma coleção set entry
        String modeloMaisEficiente = "";

        for (Map.Entry<String, Double> entry: entries) { //percorrendo a coleção
            if (entry.getValue().equals(maisEficiente)) {
                modeloMaisEficiente = entry.getKey(); //verificando atraves do entry se o valor é igual ao maior encontrado mais a cima
                System.out.println(modeloMaisEficiente + ", " + maisEficiente);
            }
        }

        System.out.println("Exiba o modelo menos econômico e seu consumo: ");

        Double consumoMenosEficiente = Collections.min(carrosPopulares.values());
        String modeloMenosEficiente = "";
        for (Map.Entry<String, Double> entry :carrosPopulares.entrySet()) {  //o entry é para poder manipular chaves e velores do map separadamente
            if (entry.getValue().equals(consumoMenosEficiente)) {
                modeloMenosEficiente = entry.getKey();
                System.out.println(modeloMenosEficiente + ", " + consumoMenosEficiente);
            }
        }

        System.out.println("Exiba a somas do consumo: ");
        Iterator<Double> iterator = carrosPopulares.values().iterator(); //o values retorna uma collection, dai já podemos chamar o iterator
        Double soma = 0.0;
        while (iterator.hasNext()) {
            soma += iterator.next();
        }
        System.out.println(soma);

        System.out.println("Exiba a média dos consumos deste dicionário de carros: " + (soma/carrosPopulares.size()));

        System.out.println(carrosPopulares);
        System.out.println("Remova os modelos com o consumo igual a 15,6 km/l: ");
        Iterator<Double> iterator1 = carrosPopulares.values().iterator();
        while (iterator1.hasNext()) {
            if (iterator1.next().equals(15.6)) iterator1.remove();
        }
        System.out.println(carrosPopulares);

        System.out.println("Exiba todos os carros na ordem que foram informadas: ");
        Map<String, Double> carrosPopulares1 = new LinkedHashMap<>() {{ //o LinkedHashMap salva os elementos na ordem que foram informadas
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carrosPopulares1);

        System.out.println("Exiba o modelo ordenado pelo modelo: ");
        Map<String, Double> carrosPopulares2 = new TreeMap<>() {{ //o TreeMap organiza os elementos em ordem crescente atraves da chave
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carrosPopulares2);

        System.out.println("Apague o dicionário de carros: ");
        carrosPopulares.clear();

        System.out.println("Confira se o dicionário está vazio: " + carrosPopulares.isEmpty());

    }
}
