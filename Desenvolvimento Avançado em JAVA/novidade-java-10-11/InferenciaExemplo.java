import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.stream.Collectors;

public class InferenciaExemplo {

    // o var não pode ser utilizado em nivel de classe (variaveis globais)
    public static void main(String[] args) throws IOException {
//        printarNomeCompleto("joao", "santos");
//        printarSoma(5,5,5);
        connectAndPrintURLOracle();
    }

    private static void connectAndPrintURLOracle() throws IOException {
        //Pegando o HTML de uma página
        var url = new URL("https://www.oracle.com/");
        var urlConnection = url.openConnection();

        try (var bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));){
            System.out.println(bufferedReader.lines().collect(Collectors.joining()).replaceAll(">", ">\n"));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void printarNomeCompleto(String nome, String sobrenome) {
        //o var não pode ser utilizado como parametro
        var nomeCompleto = String.format("%s %s", nome, sobrenome);
        System.out.println(nomeCompleto);
    }

    public static void printarSoma(int... numeros) {
        // o var não pode ser utilizados em variaveis não inicializadas
        int soma;
        if (numeros.length > 0) {
            soma = 0;
            for (int numero: numeros) {
                soma += numero;
            }

            System.out.println("A soma é ::: " + soma);
        }
    }
}
