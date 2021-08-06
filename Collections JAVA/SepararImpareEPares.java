package collections.estruturasDeDados;

import java.util.ArrayList;
import java.util.List;

public class SepararImpareEPares {

    public static void main(String[] args) {

        List<Integer> numeros = new ArrayList<>(){{
            add(-5);
            add(0);
            add(-3);
            add(-4);
            add(12);
        }};

        int somatorioPositivo = 0;
        int somatorioNegativo = 0;
        int somatorioPar = 0;
        int somatorioImpar = 0;

        for (Integer i: numeros) {
            if (i % 2 == 0) somatorioPar++;
            else somatorioImpar++;

            if (i < 0) somatorioNegativo++;
            else if (i > 0) somatorioPositivo++;
        }

        System.out.println(somatorioPar + " valor(es) par(es)");
        System.out.println(somatorioImpar + " valor(es) impar(es)");
        System.out.println(somatorioPositivo + " valor(es) positivo(s)");
        System.out.println(somatorioNegativo + " valor(es) negativo(s)");

    }
}
