
import java.util.Scanner;

        public class s {
            public static void main(String[] args) {
                System.out.println("Let's play \"Rock Paper Scissor\" game");
                Scanner S = new Scanner(System.in);
                System.out.print("Enter Your Choice: ");
                String str = S.nextLine();


                if (str.equalsIgnoreCase("Rock")) {
                    System.out.println("Paper\n"+"Booyah! I won.");
                }
                else if (str.equalsIgnoreCase("Scissor")) {
                    System.out.println("Rock\n"+"Booyah! I won.");
                }
                else if (str.equalsIgnoreCase("Paper")) {

                    System.out.println("Scissor\n"+"Booyah! I won.");
                }

               }
            }

