import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution69 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];

        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }


//Write your code here
        int a = 1;
        System.out.println(a);

        for(int j =0;j<t-1;j++) {

            if (pair_left[j].equalsIgnoreCase(pair_left[j+1]) && pair_right[j].equalsIgnoreCase(pair_right[j+1])) {
                System.out.println(a);
            } else {
                a = a + 1;
                System.out.println(a);
            }
        }

    }
}

