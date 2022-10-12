import java.util.Random;
import java.util.Scanner;

public class rock_paper_scissor {
    public static void main(String[] args) {
        Random R = new Random();
        Scanner S = new Scanner(System.in);
        System.out.println("Let's play rock,paper,scissor game");
       for(int x =1;x<=5;x++) {
           System.out.print("Enter your choice: ");
           String choice = S.nextLine();

           int a = R.nextInt(1, 3);
           switch (a) {
               case 1 -> System.out.println("Rock");
               case 2 -> System.out.println("Paper");
               case 3 -> System.out.println("Scissor");
           }
               if (choice.equalsIgnoreCase("Rock")&& a ==1||choice.equalsIgnoreCase("Paper")&& a ==2||choice.equalsIgnoreCase("Scissor")&& a ==3) {
                   System.out.println("Shit! Match got tie.\n"+"Come On!Let's try again. ");
               }
               else if (choice.equalsIgnoreCase("Rock")&& a ==2||choice.equalsIgnoreCase("Paper")&& a ==3||choice.equalsIgnoreCase("Scissor")&& a ==1) {
                   System.out.println("Booyah! I won.");
               }
               else if (choice.equalsIgnoreCase("Rock")&& a ==3||choice.equalsIgnoreCase("Paper")&& a ==1||choice.equalsIgnoreCase("Scissor")&& a ==2) {

                   System.out.println("You won!" + "\nDamn! How can I make such a blunder mistake.");
               }
           }
       }




    }

