import java.util.Scanner;

class NegativeRadiusException extends Exception {
    @Override
    public String toString() {
       return  ("Radius cannot be negative");
    }
}


public class Throw_Throws {
    public static int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("divisor cannot be zero");
            }
        else {
            int c = a / b;
            return c;
        }
    }

    public static double area(int r) throws NegativeRadiusException {
        if (r < 0) {try {
            throw new NegativeRadiusException();
        }
        catch (NegativeRadiusException e){
            System.out.println(e);
        }
        }
        double result = Math.PI * r * r;
        return result;
    }

    public static void main(String[] args) throws NegativeRadiusException {

        //System.out.println(divide(4, 0));

//        area(-5);
//        System.out.println("Finish");

        int [] marks = {2,5,9,6,3,8};
        Scanner S = new Scanner(System.in);
        while(true){
           try {
               System.out.println("Enter the index number:");
               int a = S.nextInt();
               try {
                   System.out.println(marks[a]);
               }
               catch (ArrayIndexOutOfBoundsException e){
                   System.out.println("Index is out of bound");
                   break;
               }
               System.out.println("Enter the number with which you want to divide the value at entered index number:");
               int b = S.nextInt();
               System.out.println("Result: " + marks[a] / b);
               break;

           }
           catch (ArithmeticException e){
               System.out.println("Entered number or index is not correct");
           }

           finally{
               System.out.println("Winner Winner Chicken Dinner");
           }
            System.out.println("Haa Haa...");

        }


    }
}

