import java.util.Random;
import java.util.Scanner;

class game{
//    int noOfGuesses ;
//
//    public int getNoOfGuesses() {
//        return noOfGuesses;
//    }
//
//    public void setNoOfGuesses(int noOfGuesses) {
//        this.noOfGuesses = noOfGuesses;
//    }


    int computerInput;


    public game (){
        Random R = new Random();
        this.computerInput = R.nextInt(0,100);
    }

    int userInput;


    void takeUserInput (){
        Scanner S = new Scanner(System.in);
        userInput = S.nextInt();
    }

    boolean guess;


    void isCorrectNumber (){
        guess = computerInput == userInput;
    }

}

public class Program3 {
    public static void main(String[] args) {
        game guessTheNumber = new game();
        int noOfGuesses = 0;

        System.out.println("Let's play guess the number game");
        System.out.print("Guess the number:");
        guessTheNumber.takeUserInput();
        for (int i = 1; i < 100; i++) {
            noOfGuesses = noOfGuesses + 1;
            if (guessTheNumber.userInput== guessTheNumber.computerInput) {
                System.out.println("You guessed it correct");
                break;
            } else if (guessTheNumber.userInput > guessTheNumber.computerInput) {
                System.out.print("You had guessed more than the number.\nGuess again:");
                guessTheNumber.takeUserInput();
            } else {
                System.out.print("You had entered a smaller number.\nGuess it again:");
                guessTheNumber.takeUserInput();
            }





        }

        System.out.println("Your score is:"+noOfGuesses);
    }
}
