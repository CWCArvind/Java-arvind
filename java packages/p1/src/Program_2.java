import java.util.Random;
import java.util.Scanner;


public class Program_2 {
    public static void main(String[] args) {
        // Rock paper Scissor:

       System.out.println("Lets play Rock Paper and Scissor game");
         Random R = new Random();
         Scanner S = new Scanner(System.in);
        System.out.println("Enter your choice:");
         String str = S.nextLine();


        int a = R.nextInt(1,3);
        if(a==1) {
            System.out.println("Rock");
        }
         else if (a==2) {
            System.out.println("Paper");
        }
       else if (a==3) {
            System.out.println("Scissor");

        }
       else {
            System.out.println("Error");
        }

        if ((str.equalsIgnoreCase("rock")  && a == 1)||(str.equalsIgnoreCase("paper") && a == 2)||(str.equalsIgnoreCase("scissor") && a == 3)) {
            System.out.println("Shit! Match got a tie");
        }
        else if((str.equalsIgnoreCase("rock")&& a == 2)||(str.equalsIgnoreCase("Paper")&& a == 3)||(str.equalsIgnoreCase("scissor")&&a==1)) {
            System.out.println("Booyah! I won ");
        }
        else if((str.equalsIgnoreCase("rock")&& a == 3)||(str.equalsIgnoreCase("paper")&& a == 1)||(str.equalsIgnoreCase("scissor")&&a==2)){
            System.out.println("You won.\nDamn! How can I make such a mistake");
        }
        else {
            System.out.println("I am not mad.\nYou had not entered key from the game keys");
        }


    }
}
