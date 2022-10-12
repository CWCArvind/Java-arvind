import java.util.Scanner;
class CustomException extends Exception {
    @Override
    public String toString() {
        return "Error";
    }
}

public class Exception_Handling_2 {
   public void myMethod ()throws CustomException{

       Scanner S = new Scanner(System.in);
       int [] marks = {32,56,78,95,83};
       int i = 0;
       while(true){
           System.out.println("Enter index number: ");
           try {
               int index = S.nextInt();
               int a = marks[index];
               System.out.print("These are the marks at your entered index: ");
               System.out.println(a);
               break;
           }
           catch (ArrayIndexOutOfBoundsException e){
               System.out.println("This index number does not exist.\nPlease enter a correct index number ");
           }
           i++;

           if(i==5){
               throw new CustomException();
           }


       }
   }

    public static void main(String[] args) {

       Exception_Handling_2 obj = new Exception_Handling_2();
       try {
           obj.myMethod();
       }
       catch (CustomException e){
           System.out.println(e);
       }

//       try {
//           int a = S.nextInt();
//           int b = S.nextInt();
//           method(5);
//           int c = a / b;
//       }
//       catch (ArithmeticException e){
//           System.out.println("HaHa");
//
//       }
//       catch(IllegalArgumentException e){
//           System.out.println("HeHe");
//       }

    }
}
