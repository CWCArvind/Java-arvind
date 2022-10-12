import java.util.*;

public class myCalender {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance(TimeZone.getTimeZone(" GMT"));//--> Calendar class is an abstract class . This is the way to instantiate it using one of its static methods.
        System.out.println(c.getTime());
        System.out.println(c.getCalendarType());
        System.out.println(c.getTimeZone());

    }
}
