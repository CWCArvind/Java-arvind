import java.util.Random;
import java.util.Scanner;


public class Program_1 {

    public static void main(String[] args) {
        System.out.println("Let's play \"Rock Paper Scissor\" game");
        Random R = new Random();
        Scanner S = new Scanner(System.in);
        System.out.print("Enter Your Choice: ");
        String str = S.nextLine();
        int a = R.nextInt(1,4);
        if (a == 1) {
            System.out.println("Rock");
        }
        else if (a == 2) {
            System.out.println("Paper");
        }
        else if (a == 3) {
            System.out.println("Scissor");
        }
        else {
            System.out.println("Error");
        }
        if (str.equalsIgnoreCase("Rock")&& a ==1||str.equalsIgnoreCase("Paper")&& a ==2||str.equalsIgnoreCase("Scissor")&& a ==3) {
            System.out.println("Shit! Match got tie.\n"+"Come On!Let's try again. ");
        }
        else if (str.equalsIgnoreCase("Rock")&& a ==2||str.equalsIgnoreCase("Paper")&& a ==3||str.equalsIgnoreCase("Scissor")&& a ==1) {
            System.out.println("Booyah! I won.");
        }
        else if (str.equalsIgnoreCase("Rock")&& a ==3||str.equalsIgnoreCase("Paper")&& a ==1||str.equalsIgnoreCase("Scissor")&& a ==2) {

            System.out.println("You won!" + "\nDamn! How can I make such a blunder mistake.");
        }


    }
}