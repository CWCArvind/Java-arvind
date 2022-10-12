//import org.w3c.dom.ls.LSOutput;
//
//import java.util.Random;
//import java.util.Scanner;
//
//class game {
//    int noOfGuesses;
//    int userInput;
//    int randomNumber;
//
//
//    public game(){
//        Random R =new Random();
//         randomNumber = R.nextInt(0,100);
//    }
//
//    public  String takeUserInput (){
//        System.out.print("Guess the number:");
//        Scanner S = new Scanner(System.in);
//        userInput = S.nextInt();
//        if(userInput==randomNumber) {
//            return "You had guessed it correct";
//        } else if (userInput>randomNumber) {
//            return  "You had entered a larger number from the guessed number"  + takeUserInput();
//
//        }
//        else{
//            return "You had entered a smaller number from the guessed number" + takeUserInput();
//
//        }
//
//    }
//
//
//
//    }
//
//
//public class Exercise3 {
//    public static void main(String[] args) {
//        game play = new game();
//        System.out.println(play.takeUserInput());
//
//
//    }
//}
