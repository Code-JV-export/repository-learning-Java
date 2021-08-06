import java.time.LocalDateTime;

public class TesteLocalDate {

    public static void main(String[] args) {
        LocalDateTime data = LocalDateTime.of(2010, 05, 15, 10, 00, 00);
        System.out.println(data);

        LocalDateTime futuro = data.plusYears(4).plusMonths(6).plusHours(13);
        System.out.println(futuro);

    }
}
