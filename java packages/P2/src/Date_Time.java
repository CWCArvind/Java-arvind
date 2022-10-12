import java.util.*;

import java.util.GregorianCalendar;
import java.util.TimeZone;

public class Date_Time {
    public static void main(String[] args) {

        Calendar c = Calendar.getInstance();
        c.set(2022,7,28);
        System.out.println(c.get(Calendar.DAY_OF_WEEK));



//       GregorianCalendar g = new GregorianCalendar();
//        System.out.println(g.isLeapYear());
//        System.out.println(g.getTime());
//        g.set(Calendar.YEAR,2005);
//        System.out.println(g.getTime().getYear());
//        g.set(Calendar.MONTH,7);
//        g.set(Calendar.DATE,7);
//
//        System.out.println(g.getTime());
//        System.out.println("Arvind Sharma birthday date: ");
//        System.out.println(g.getTime().getDate() + "/" + g.getTime().getMonth() + "/" + g.getTime().getYear());




    }
}
