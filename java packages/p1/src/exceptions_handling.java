import java.io.IOException;
import java.util.Scanner;
class myException extends Exception {
    @Override
    public String toString() {
        return  "I am to string";
    }

    @Override
    public String getMessage() {
        return   "I am get message";
    }

    @Override
    public void printStackTrace() {
        super.printStackTrace();
    }
}

public class exceptions_handling {
    public static void main(String[] args) {

        int[] marks = new int[5];
        marks[0] = 2;
        marks[1] = 45;
        marks[2] = 56;
        marks[3] = 82;
        marks[4] = 24;
        boolean flag = true;
        Scanner S = new Scanner(System.in);
        int a = S.nextInt();
        if(a<9){
            try {

                //throw new myException();
                throw new ArithmeticException("this is an Arithmetic exception");

            }
            catch (Exception e ){

                System.out.println(e.getMessage());
                e.printStackTrace();
                System.out.println( e);

            }
        }
        System.out.println("i am the winner");


    }
}
