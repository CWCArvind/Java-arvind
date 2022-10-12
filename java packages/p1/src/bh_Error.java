import java.util.Scanner;
/*
class bh_mult_Exception extends Exception {
    @Override
    public String toString() {
        return "Value should not be greater than thousand";
    }
}

 */
class customexception9 extends Exception{
    @Override
    public String toString() {
        return "error";
    }
}
public class bh_Error {

   public static String bh_finally (){
        try {
            return "Bhuvnesh Sharma";
        }

       finally{
            System.out.println("Arvind Sharma");
        }

    }
/*    public static int mult (int a,int b) throws bh_mult_Exception{
        if(a>1000||b>1000){
            throw new bh_mult_Exception();
        }
        else return a*b;
    }

 */
    public static void main(String[] args) throws customexception9{
        Scanner S = new Scanner(System.in);

//        System.out.println(bh_finally());
//        while(true){
//            try {
//                System.out.println("Not possible");
//                break;
//            }
//            catch (Exception e){
//                System.out.println(e);
//            }
//            finally{
//                System.out.println("It's possible");
//            }
//            System.out.println("It's excess motivation");
//
//        }
   /*     try {
            System.out.println(mult(4000, 10));
        }
        catch (bh_mult_Exception e){
            System.out.println(e);
        }

    */

//        int [] marks = {2,5,8};
//        System.out.println(marks[3]);
//        int a = S.nextInt();
//        int b = S.nextInt();
//        try {
//            System.out.println(marks[a] / b);
//        }
//        catch (ArithmeticException e){
//            System.out.println("Arithmetic Exception countered");
//        }
//        catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("You have entered a wrong index");
//        }
   /*     try{
            try{
                int c = marks[a];
                System.out.println(c/b);
                System.out.println("Hello World");
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println(e);
            }

        }
        catch (ArithmeticException e){
            System.out.println(e);
        }*/
    /*    int [] marks = {2,5,8,5,9,8,7};
        while(true) {
            try {
                System.out.println("Enter the index:");
                int index = S.nextInt();
                System.out.println(marks[index]);
                break;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Wrong Index entered! Please enter a correct one");
            }
        }
        int a= 0;
        int b = 5;
        if(a==0){
            throw new ArithmeticException ();
        }
        else{
            System.out.println(b/a);
        }

     */
//    problem 3
     /*  float[] array = {5, 6, 8, 4, 0};

            for (int n = 1; n <= 5; n++) {
                try {

                    System.out.println("enter the index");
                    int a = S.nextInt();

                    System.out.println(array[a]);
                    break;
                } catch (IndexOutOfBoundsException e) {
                  if(n==5){
                      throw new customexception9();

                  }
                    System.out.println("invaid index found");

                }

               }
*/

        }


}
