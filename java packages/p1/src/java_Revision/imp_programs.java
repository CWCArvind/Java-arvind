package java_Revision;

import java.util.ArrayList;
import java.util.Scanner;

public class imp_programs {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
/*
        int a = S.nextInt();
        if(a%2==0){
            System.out.println("The no is even");
        }
        else{
            System.out.println("The no is odd");
        }

 */
       /* System.out.println("Enter the integer");
        int a = S.nextInt();
        System.out.println("Enter the string");
        System.out.println();
        String str = S.nextLine();
        System.out.print(str);
        //String str1 = S.nextLine();

        */
/*
        String Str = "hello";
        System.out.println(Str.toUpperCase());
        System.out.print(Str.substring(0,1).toUpperCase());
        System.out.println(Str.substring(1));
        */

        // Lexicographical order ;
      /*  System.out.println("Enter the two strings to compare : ");
        String str1 = S.nextLine();
        String str2 = S.nextLine();
        int check = str1.compareTo(str2);
        if(check>0){
            System.out.println("str1 is lexicographically greater than str2");
        }
        else{
            System.out.println("str1 is lexicographically smaller than str2");
        }

       */

        // Sorting an array :
/*
        int []marks = {2,5,4,8,7,6,5,22,5,4,7,8,5,2,6,4,4,2,6,8,9,4,4,2,6,6,8,4,5,5,};
        // Arranging in ascending order ;

        for(int i=0;i<marks.length-1;i++){
            for(int j=i+1;j<marks.length;j++){
                if(marks[i]>marks[j]){
                    int temp = marks[i];
                    marks[i] = marks[j];
                    marks[j] = temp;
                }
            }
        }
        for(int element : marks){
            System.out.print(element + " ");
        }
        */


// Divisors of a number :
     /*   System.out.println("Enter the integer");
        int a = S.nextInt();
        int sum =0;
        for(int i=1;i<=a;i++){
            if(a%i == 0){
               sum += i;
            }
        }
        System.out.println(sum);
        */
/*
        while(S.hasNextLine()){
            System.out.println(S.nextLine());
        }

 */

        // substring comparison :
        /*
        System.out.println("Enter the String : ");
        String str = S.nextLine();
        System.out.println("Enter the length of the substring : ");
        int a = S.nextInt();
        int size = str.length() - a + 1;
        String []substring = new String[size];


        for(int i=0;i<=str.length()-3;i++){
                substring[i] = str.substring(i,i+3);
        }
        for(int i=0;i<substring.length-1;i++){
            for(int j=i+1;j<substring.length;j++){
                if(substring[i].compareTo(substring[j])>0){

                    String temp = substring[i];
                    substring[i] = substring[j];
                    substring[j] = temp;

                }
            }
        }

        System.out.printf("The largest substring of length %d is : %n",a);

        System.out.println(substring[substring.length-1]);

        System.out.printf("The smallest substring of length %d is : %n",a);

        System.out.println(substring[0]);


         */






    }

}
