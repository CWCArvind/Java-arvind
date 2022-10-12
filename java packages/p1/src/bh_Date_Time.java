import java.time.format.DateTimeFormatter;
import java.util.*;
import java.time.*;

public class bh_Date_Time {
    public static void main(String[] args) {
 /*       System.out.println(System.currentTimeMillis());
        System.out.println(Long.MAX_VALUE);
        Date d = new Date();
        System.out.println(d);
        System.out.println( d.getTime());
        System.out.println(d.getDate());

        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);
        System.out.println(calendar.getTime());

        System.out.println(calendar.get(Calendar.DATE) + "/" + calendar.get(Calendar.MONTH) + "/" + calendar.get(Calendar.YEAR));

        calendar.set(2020,Calendar.SEPTEMBER,19);


        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));

        System.out.println(calendar.getCalendarType());

        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        System.out.println(gregorianCalendar);
        System.out.println(gregorianCalendar.isLeapYear(2400));


        System.out.println(TimeZone.getDefault());
        System.out.println(Arrays.toString(TimeZone.getAvailableIDs()));
        System.out.println(TimeZone.getTimeZone("Asia/Calcutta"));


  */


        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd LLLL yyyy");
        DateTimeFormatter dfTime = DateTimeFormatter.ofPattern("hh:mm:ss:nnnnnnnnn a ");

        LocalDate d = LocalDate.now();
        System.out.println(d);
        System.out.println(d.getDayOfWeek());
        System.out.println(d.getDayOfMonth());
        System.out.println(d.getDayOfMonth() + " " + d.getDayOfWeek() + " " + d.getYear());



        LocalTime t = LocalTime.now();
        System.out.println(t.getHour() + ":" + t.getMinute() );

        LocalDateTime dt = LocalDateTime.now();

        System.out.println(d.format(df));

        System.out.println(t.format(dfTime));




    }
}
