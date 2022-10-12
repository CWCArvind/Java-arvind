package My_Ever_Best_Library;

import java.time.format.DateTimeFormatter;
import java.util.*;
import java.time.*;

public class adv_java_Practice_Set {
    public static void main(String[] args) {
        //Collection Frameworks:
        /* 1) List -- To store and edit data
        2) ArrayList --> we use it as a variable size array to store and manipulating data easily and advancedly
        3)Linked List--> It provides fast deletion and addition of data in a really long size array.
        4)Array Deque--> It is used to provide double ended addition and deletion of data
        5)HashSet or Hashing --> It provides fast searching of data in a really long size array because of the concept of hashing.

         */

        ArrayList<Integer> marks = new ArrayList<>();
        LinkedList<String> names = new LinkedList<>();
        ArrayDeque<Character>  firstNameCharacter = new ArrayDeque<>();
        HashSet<Integer> ID = new HashSet<>();

        // Making multiple arraylists in a for loop using concept of list inside list

        List<List<Integer>> lists = new ArrayList<List<Integer>> ();

        /*
        Date and time in java:

         */
        System.out.println(System.currentTimeMillis());

        // Date class

        Date d = new Date();
        System.out.println(d);

        // Calendar class is an abstract class it has an static method which helps user to instantiate
        // the calendar class which is .getInstance()

        Calendar calendar = Calendar.getInstance();
        //System.out.println(calendar);
        // for calendar class we have two very important methods which are .get and .set method

        System.out.println(calendar.get(Calendar.DATE) + ":"+ calendar.get(Calendar.MONTH)+":"+calendar.get(Calendar.YEAR));

        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(Calendar.MONTH,Calendar.SEPTEMBER);

        System.out.println(TimeZone.getDefault());

        // java.time package

        LocalDate date = LocalDate.now();
        System.out.println(date);
        System.out.println(date.getDayOfWeek());

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("ddLLLLyyyy");
        System.out.println(date.format(dateFormatter));




    }
}
