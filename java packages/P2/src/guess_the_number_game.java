import java.util.Random;
import java.util.Scanner;

class MyGame {
    int computerInput;
    MyGame (){
        Random R = new Random();
        this.computerInput=R.nextInt(100);
    }

    int UserInput ;
    boolean b = false;
    int noOfGuesses = 0;
    Scanner S = new Scanner(System.in);
    void takeUserInput (){
        System.out.print("Guess the number:");
        UserInput = S.nextInt();
        if(computerInput==UserInput){
            System.out.println("You guessed it correct.");
            b=true;
        } else if (computerInput>UserInput) {
            System.out.println("too low...");
        }
        else{
            System.out.println("too high...");
        }
    }



}


public class guess_the_number_game {
    public static void main(String[] args) {

        MyGame game = new MyGame();
        while(!game.b){
            game.noOfGuesses ++;
            game.takeUserInput();
        }
        System.out.println("Your score is:"+game.noOfGuesses);


    }
}
