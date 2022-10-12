import java.util.Random;
import java.util.Scanner;

class guessTheNumber {
    int computerInput;
    int userInput;
    boolean isCorrectNumber = true;
    int noOfAttempts = 1;

    public guessTheNumber (){
        Random R = new Random();
        computerInput = R.nextInt(100);
    }
    public void takeUserInput (){
        Scanner S = new Scanner(System.in);
        System.out.print("Enter your guessed number: ");
        userInput = S.nextInt();
    }
    public void statements (){

        if (userInput == computerInput){
            System.out.println("You guessed it correct...");
            isCorrectNumber = false;
        }
        else if (userInput > computerInput){
            System.out.println("You guessed it more...");
            noOfAttempts += 1;
        }
        else {
            System.out.println("You guessed it less...");
            noOfAttempts += 1;
            }
        }
    }



public class my_game {
    public static void main(String[] args) {

        System.out.println("Let's play guess the number game\nThe number could be upto 100 starting from 1...");

        guessTheNumber play = new guessTheNumber();
        while (play.isCorrectNumber) {
            play.takeUserInput();
            play.statements();
        }
        System.out.println("You guessed it correct in "+play.noOfAttempts+" attempts");


    }
}
