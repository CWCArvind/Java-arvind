import java.util.*;

public class Ar_AdvanceJava {
    public static void main(String[] args) {
        System.out.println("I am back.");
//        Collection Framework:ArrayList, Linked List , ArrayDeque , Hashset.
        // ArrayList --> It allows us to manipulate data regarding an array such as adding elements removing elements and many more.

        ArrayList<String> names = new ArrayList<>();
        names.add("Rajat Chauchan");
        names.add("Tarun Sharma");
        names.add("Prince Chaudhary");
        names.add("Rajeev Meena");
        names.add("Boss D.k");
        names.set(4,"Amit Rathore");
        names.remove("Rajat Chauchan");

        System.out.println(names.clone());

        for(int i = 0;i<names.size();i++){
            System.out.println(names.get(i));
        }

        LinkedList<String> lkd = new LinkedList<>();

//        Date and Time in java:
        /*
        1) System.currenttimemillis
        2) Date class
        3) Calendar class --> get and set methods are prominent
        4) java.time API: --> here we have localdate class localtime class localdatetime class and datetimeformatter which helps to get date and time in desired format .
         */

        System.out.println(System.currentTimeMillis());
        Date d = new Date();
        System.out.println(d);

        Calendar cal = Calendar.getInstance();
        System.out.println(cal.get(Calendar.DATE));
        System.out.println(TimeZone.getDefault());
    }
}
