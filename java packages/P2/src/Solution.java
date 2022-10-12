import java.io.*;
import java.util.*;

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public  String findDay(int month, int day, int year) {

        Calendar c = Calendar.getInstance();
        c.set(year, month, day);
        int i = c.get(Calendar.DAY_OF_WEEK);
        System.out.println(i);
        if (i == 1) {
            return "Sunday";
        } else if (i == 2) {
            return "Monday";
        } else if (i == 3) {
            return "Tuesday";
        } else if (i == 4) {
            return "Wednesday";
        } else if (i == 5) {
            return "Thursday";
        } else if (i == 6) {
            return "Friday";
        }
        else if (i == 7) {
            return "Saturday";
        }

        else {return null;}
    }
}



public class Solution {
    public static void main(String[] args) {

        Scanner S = new Scanner(System.in);
        System.out.println("Year");
        int year = S.nextInt();
        System.out.println("Month");
        int month = S.nextInt();
        System.out.println("Day");
        int day = S.nextInt();

        Result r = new Result();
        System.out.println(r.findDay(month,day,year));



    }
}

