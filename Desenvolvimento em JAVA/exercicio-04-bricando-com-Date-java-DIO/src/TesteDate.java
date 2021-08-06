import java.sql.Time;
import java.util.Date;

public class TesteDate {

    public static void main(String[] args) {
        var tempo = System.currentTimeMillis();
        var tempoNascimento = 803315417;
        Date nascimento = new Date(tempoNascimento);
        Date tempoProfessor = new Date(tempo);
        System.out.println(tempo);


        System.out.println("data de nascimento " + nascimento);
        System.out.println("data passada pelo professor " + tempoProfessor);


    }
}
