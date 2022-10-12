import java.util.Scanner;

public class Errors {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);

        try {
            int a = S.nextInt();
            System.out.println(100 / a);
        }
        catch (Exception e){
            System.out.println("Your input is invalid. Reason: "+e);
        }
        System.out.println("We won");
    }
}
