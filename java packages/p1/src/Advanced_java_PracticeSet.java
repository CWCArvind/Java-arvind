import java.time.format.DateTimeFormatter;
import java.util.*;
import java.time.*;

public class Advanced_java_PracticeSet {
    public static void main(String[] args) {


//     Question 1:

        ArrayList<String> Friends_Names = new ArrayList<>();
        Friends_Names.add("Rajat");
        Friends_Names.add("Tarun");
        Friends_Names.add("Aayush");
        Friends_Names.add("Priyanshu");
        Friends_Names.add("Prince");
        Friends_Names.add("Utkarsh");
        Friends_Names.add("Amit");
        Friends_Names.add("Chandresh");
        Friends_Names.add("Venu");
        Friends_Names.add("Sumit");

        ArrayList<String> School_Friends_Names = new ArrayList<>();
        Friends_Names.add("Rajat");
        Friends_Names.add("Tarun");
        Friends_Names.add("Aayush");
        Friends_Names.add("Priyanshu");
        Friends_Names.add("Prince");
        Friends_Names.add("Utkarsh");
        Friends_Names.add("Amit");
        Friends_Names.add("Chandresh");
        Friends_Names.add("Venu");
        Friends_Names.add("Sumit");

        for (String elements:Friends_Names) {
            System.out.println(elements);
        }

        // Question 2:

        Date d = new Date();
        System.out.println(d.getHours()+":"+d.getMinutes()+":"+d.getSeconds());

        // Question 3:
        Calendar myTime = Calendar.getInstance();
        System.out.println(myTime.get(Calendar.HOUR)+":"+myTime.get(Calendar.MINUTE)+":"+myTime.get(Calendar.SECOND));

        // Question 4:

        LocalTime mytime = LocalTime.now();
        System.out.println(mytime.getHour()+":"+mytime.getMinute()+":"+mytime.getSecond());
// 2nd method :
        DateTimeFormatter mydf = DateTimeFormatter.ofPattern("kk:mm:ss");
        System.out.println(mytime.format(mydf));

        // Question 5:

        HashSet<Integer> lol = new HashSet<>();
        lol.add(15);
        lol.add(58);
        lol.add(15);
        System.out.println(lol);





    }
}
