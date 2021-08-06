package collections.estruturasDeDados.list.exerciciosList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExercicioProposto1 {

    public static void main(String[] args) {
        List<Double> temperaturas = new ArrayList<>(){{ //criando a lista, e já adicionando os elementos
            add(28.2);
            add(32.2);
            add(25.5);
            add(30.2);
            add(24.9);
            add(38.8);
        }};

        Double somatoria = 0.0;
        Iterator<Double> iterator = temperaturas.iterator();

        while (iterator.hasNext()) {
            Double next = iterator.next();
            somatoria += next;
        }

        Double media = somatoria / temperaturas.size();
        System.out.println("A somatoria das temperaturas é: " + somatoria);
        System.out.println("A média das temperaturas é: " + media);

        for (Double temp: temperaturas) {
            if (temp > media) {
                int index = temperaturas.indexOf(temp);
                switch (index) {
                    case 0:
                        System.out.println((index + 1) + " - Janeiro: " + temp + "oC");
                        break;
                    case 1:
                        System.out.println((index + 1) + " - Fevereiro: " + temp + "oC");
                        break;
                    case 2:
                        System.out.println((index + 1) + " - Março: " + temp + "oC");
                        break;
                    case 3:
                        System.out.println((index + 1) + " - Abril: " + temp + "oC");
                        break;
                    case 4:
                        System.out.println((index + 1) + " - Maio: " + temp + "oC");
                        break;
                    case 5:
                        System.out.println((index + 1) + " - Junho: " + temp + "oC");
                        break;
                }
            }
        }
    }
}
