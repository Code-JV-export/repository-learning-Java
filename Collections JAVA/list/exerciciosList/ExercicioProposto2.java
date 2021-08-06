package collections.estruturasDeDados.list.exerciciosList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExercicioProposto2 {

    public static void main(String[] args) {
        List<String> perguntas = new ArrayList<>(){{
           add("Telefonou para a vítima? ");
           add("Esteve no local do crime? ");
           add("Mora perto da vítima? ");
           add("Devia para a vítima? ");
           add("Já trabalhou para a vítima? ");
        }};

        List<String> respostas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println(perguntas.get(i));
            String next = scanner.next();
            respostas.add(next);
        }

        int somatoria = 0;
        for (String res: respostas) {
            if (res.equalsIgnoreCase("s")) somatoria++;
        }

        if (somatoria == 2) System.out.println("Suspeita");
        else if (somatoria == 3 || somatoria == 4) System.out.println("Cúmplice");
        else if (somatoria == 5) System.out.println("Assassina");
        else System.out.println("Inocente");
    }
}
