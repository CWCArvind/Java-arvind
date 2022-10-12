package java_Revision;

import java.util.Scanner;

public class revision {
    public static void main(String[] args) {

        Scanner S = new Scanner(System.in);
/*
        String name = "arvind sharma";
        System.out.print(name.substring(0,1).toUpperCase());
        System.out.println(name.substring(1));

        System.out.println(name.replace(" ","_"));

        // Leap year or not

        System.out.println("Enter the year : ");

        int year = S.nextInt();
        if((year%100==0&&year%400==0)||(year%100!=0&&year%4==0)){
            System.out.println("Year is a leap year");
        }
        else{
            System.out.println("Year entered is not a leap year");
        }

 */

        // Loops practice set :
        System.out.println("Enter the no of rows you want");
        int n = S.nextInt();
        for(int i=n;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }



    }
}
