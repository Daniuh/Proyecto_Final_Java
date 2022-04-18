import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class punto13 {
    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        System.out.println("La fecha y hora: "+dtf.format(LocalDateTime.now()));
    }
}
