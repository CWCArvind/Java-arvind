import java.util.Scanner;

class javaException extends Exception {
    @Override
    public String toString() {
        return "You had not entered the integer according to our given conditions\nPlease enter a valid integer";

    }
}

public class Exception_class {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the integer:");
            int a = S.nextInt();
            if (a <= 0) {
                try {
                    throw new javaException();
                } catch (Exception e) {
                    System.out.println(e);
                }

            }
            else{
                break;
            }

        }
        System.out.println("Finished");
    }
}
