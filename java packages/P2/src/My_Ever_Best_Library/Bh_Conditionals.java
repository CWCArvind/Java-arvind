package My_Ever_Best_Library;

import java.util.Scanner;

public class Bh_Conditionals {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int computerInput = 4;
        int  userInput = S.nextInt();

        if(userInput>computerInput){
            System.out.println("UserInput is greater than computerInput");
        }
        else if(userInput==computerInput){
            System.out.println("UserInput is equals to computerInput");
        }
        else{
            System.out.println("UserInput is less than computerInput");
        }

        switch(userInput){
            case 1 :
                System.out.println("Sunday");
                System.out.println();
                break;
            case 4 :
                System.out.println("Saturday");
                break;
        }

        switch(userInput){
            case 1 -> {
                System.out.println();
            }
            case 2 -> {

            }
        }




    }
}
