import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

interface Odd {
    boolean odd (int a);
}

interface Prime {
    boolean prime (int a);
}

interface Palindrome {
    boolean palindrome (int a);
}

public class Solutions {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner S = new Scanner(System.in);
        int n = S.nextInt();


        Odd obj1 = (a)->{
            if(a%2==0){
                return false;
            }
            else {
                return true;
            }
        };

        Prime obj2 = (a)->{
            int b =0;
            for(int i =1;i<=a;i++){
                if(a%i==0){
                    b += 1;
                }
            }
            if(b>2){
                return false;
            }
            else {
                return true;
            }
        };

        Palindrome obj3 = (a)->{
            String str = Integer.toString(a);
            int length = str.length();
            boolean bool = false;


            for(int i = 0;i<=length/2;i++){
                if(str.substring(i,i+1).equalsIgnoreCase(str.substring(length-i-1,length-i))){

                    bool = true;

                }
                else{
                    bool = false;
                    break;
                }
            }

            if(bool){
                return true;
            }
            else{
                return false;
            }

        };

        for(int i =0;i<n;i++){

            int which = S.nextInt();
            int a = S.nextInt();
            if(which == 1){
                System.out.println(obj1.odd(a));
            }
            else if(which == 2){
                System.out.println(obj2.prime(a));
            }
            else if(which == 3){
                System.out.println(obj3.palindrome(a));
            }


        }



    }
}

