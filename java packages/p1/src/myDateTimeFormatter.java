import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class myDateTimeFormatter {
    public static void main(String[] args) {

        LocalDateTime dt = LocalDateTime.now();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("EEEE\ndd LLL yyyy \nkk:mm:ss a");
        String myDateTime = dt.format(df);
        System.out.println(myDateTime);

    }
}
