package java_Revision;
import java.util.*;

interface work{
    void workHard ();
}


public class lambda_expressions {
    String method (){
        Calendar calendar = Calendar.getInstance();

        int integer = calendar.get(Calendar.DAY_OF_WEEK);
        return switch (integer) {
            case 1 -> "Sunday";
            case 2 -> "Monday";
            case 3 -> "Tuesday";
            case 4 -> "Wednesday";
            case 5 -> "Thursday";
            case 6 -> "Friday";
            case 7 -> "Saturday";
            default -> "Nothing";
        };
    }
    public static void main(String[] args) {



        // Lambda expression used for functional interface in place of lambda expressions :

        work myWork = () -> {
                System.out.println("Working hard for your dreams is the most important key to be happy and disciplined");
        };


    }
}
