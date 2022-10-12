package java_Revision;
import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;

/*class my_Thread_07 implements Runnable{
    @Override
    public void run() {
        while(true){
            System.out.println("Chai With Code");
        }
    }
}
class my_Thread_08 extends Thread {
    @Override
    public void run() {
        while(true) {
            System.out.println("Coffee With Code");
        }
    }
}

 */

import java.util.ArrayList;
import java.util.Scanner;

public class Java_Revision_07 {
    public static void main(String[] args) {

        Scanner S = new Scanner(System.in);
/*
        ArrayList<String> arrayList = new ArrayList<>();
        List<List<String>> list = new ArrayList<List<String>>();

        System.out.println(System.currentTimeMillis());

        Date date = new Date();
        System.out.println(date.getTime());

        // Calendar Class

        Calendar calendar = Calendar.getInstance(); // Calendar class is a abstract class that's why we cannot instantiate it :

        //System.out.println(calendar.get(Calendar.DAY_OF_WEEK));

        // Printing the date :

        System.out.println(calendar.get(Calendar.DATE)+":"+calendar.get(Calendar.MONTH)+":"+calendar.get(Calendar.YEAR));


 */
        // Java.Time package :

        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt.toLocalDate());

        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd MMMM yyyy");
        System.out.println(dt.format(df));






        // Keep accessing an array until a valid index is given :
/*
        int [] marks = {2,5,4,7,8,9,4,5,6,3,2,1,5};

        while(true){
            System.out.println("Enter the index at which you want an integer : ");
            int index = S.nextInt();

            try{
                System.out.println("The value at given index is : " + marks[index]);
                break;
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Sorry, No value exist at this index. Please try a different one !");

            }

        }

 */
      /*  my_Thread_07 obj1 = new my_Thread_07();
        my_Thread_08 obj2 = new my_Thread_08();
        Thread obj = new Thread(obj1);

        obj2.start();
        try {
            obj2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        obj.start();

       */




    }
}
