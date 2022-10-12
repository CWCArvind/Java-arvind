import java.time.*;

public class cwh_100_TimeAPI  {
    public static void main(String[] args) {
//        LocalDate d = LocalDate.now();
//        System.out.println(d);
//        LocalTime t = LocalTime.now();
//        System.out.println(t);
//
//        LocalDateTime dt = LocalDateTime.now();
//        System.out.println(dt);


//        LocalDate d = LocalDate.now();
//        System.out.println(d);
//        System.out.println();
//        System.out.println(d.withYear(2022).withMonth(8).withDayOfMonth(28).getDayOfWeek());
//        System.out.println(d.getDayOfWeek());

        LocalDate d = LocalDate.now();
        System.out.println(d.withYear(2024).withMonth(07).withDayOfMonth(07).getDayOfWeek());

        LocalTime t = LocalTime.now();
        System.out.println(t.getHour()+":"+t.getMinute()+":"+t.getSecond());

        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt.getDayOfWeek());

    }
}
