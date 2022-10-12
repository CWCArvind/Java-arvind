import java.util.Random;
import java.util.Scanner;

class myGame {
    int userScore = 0;
    int computerScore = 0;

    int computerInput;
    int userInput;
   public void myGame (){
       System.out.println("Let's play rock paper scissor game");
        Random R = new Random();
        this.computerInput = R.nextInt(0,3);
    }
    public void conditions (){
        System.out.println("0 is for Rock, 1 is for paper and 2 is for Scissor...");
    }
    public void userInput (){
        System.out.print("Enter your choice: ");
        Scanner S = new Scanner(System.in);
        this.userInput = S.nextInt();
        System.out.println(computerInput);

    }
    public void whoWon (){
       if (computerInput == userInput){
           System.out.println("Match draw...");
       }
       else if (computerInput == 0&&userInput==2||computerInput == 1&&userInput==0||computerInput == 2&&userInput==1){
           System.out.println("Computer won...");
           computerScore += 1;
       }
       else{
           System.out.println("You won...");
           userScore += 1;
       }

    }

}

public class my_Rock_Paper_Scissor {
    public static void main(String[] args) {
        myGame play = new myGame();
        for(int a =1;a<6;a++) {
       play.myGame();
        play.conditions();
            play.userInput();
            play.whoWon();
        }
        System.out.println("Final result:");
        if(play.userScore==play.computerScore){
            System.out.println("Match draw");
        } else if (play.computerScore>play.userScore) {
            System.out.println("Computer won!");
        }
        else {
            System.out.println("You won!");
        }

    }
}

