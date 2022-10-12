package java_Revision;

import java.util.Random;
import java.util.Scanner;

public class rock_paper_scissor_game {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        Random random = new Random();
        // random no 0-3  --> compare with user input

        System.out.println("Some conventions are as follows --> 0 is for rock , 1 is for paper , 2 is for scissor");
        System.out.println("Enter the no of games you want to play in one game : ");
        int noOfGames = S.nextInt();

        int computerWon = 0;
        int userWon = 0;
        int drawMatches = 0;

        for(int i=1;i<=noOfGames;i++) {
            int computerInput = random.nextInt(0, 3);
            System.out.println("Enter your input : ");
            int userInput = S.nextInt();
            System.out.println(computerInput);


            if (computerInput == userInput) {
                System.out.println("Match Draw");
                drawMatches++;
            }
            else if (userInput == computerInput + 1 || computerInput == 2 && userInput == 0) {
                System.out.println("You won");
                userWon++;
            }
            else {
                System.out.println("I won");
                computerWon++;
            }
        }

        System.out.println("no of matches you won : "+userWon+"\nno of matches I won : "+computerWon+"\nno of matches draw "+drawMatches);

        if(userWon>computerWon){
            System.out.println("You won the game");
        }
        else if(userWon==computerWon){
            System.out.println("Game Draw");
        }
        else{
            System.out.println("I won the game");
        }

    }
}
