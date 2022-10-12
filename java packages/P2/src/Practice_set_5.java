import java.util.Scanner;
import java.util.Random;

public class Practice_set_5 {
    public static void main(String[] args) {
//       // QUESTION NO. 1
////        for(int a = 1; a<=10;a++) {
////
////            System.out.print("*");
////            if (a ==4) {
////                System.out.print("\n");
////            }
////            else if (a==7) {
////                System.out.print("\n");
////            }
////            else if (a==9) {
////                System.out.print("\n");
////            }
//
//      /*  for(int a = 1;a<=10;a++){
//            for(int b = 1;b<=a;b++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }*/
//
//        //PROBLEM:2:
////        int sum = 0;
////        for(int a = 0;a<=2;a++) {
////            sum = sum + (2 * a);
////
////        }  System.out.println(sum);
//
//
////
////        }
//        // QUESTION NO. 4:
////        for(int a =10;a!=0;a--) {
////            System.out.println(10 * a);
////        }
//
//
//        ///QUESTION NO.5:
////        int prt = 1;
////        for(int a = 10;a>=1;a--){
////            prt = prt*a;
////
////        }
////        System.out.println(prt);
//
//
////        }
//          // QUESTION 6
////        int a = 5;
////        int b = 1;
////
////        while (b<=10){
////            b++;
////            System.out.println(a);
////
////        }
//        //QUESTION 7:
////        int b = 1;
////        for(int a = 1;a<=5;a++){
////            System.out.println(b);
////        }
//        //QUESTION 9:
////        int sum = 0;
////        for(int a = 1;a<=10;a++){
////            sum = sum + 8*a;
////
////        }
//  //      System.out.println(sum);
//
//        //QUESTION 10:
////        int a = 5;
////        do {
////            System.out.println("At least once");
////        }
////        while(a>=10);
////        a--;
//
//        //QUESTION 11:
////        int a = 2;
////        for(int b = 1; b<=10;b++) {
////            if (b == 5) {
////                break;
////            }
////            System.out.println(a);
////
////        }
//
//      /*  for(int a =1;a<=10;a++ ) {
//            int c = 8 * a;
//            int sum = sum(c+);
//            System.out.println(sum);
//        }*/
////        for(int a = 1;a<=10;a++){
////            System.out.println("5 "+"X "+a +" =  "+5*a  );
////        }
////         int prt = 1;
////         for(int a = 3;a>=1;a--){
////             prt = prt*a;
////         }
////        System.out.println(prt);
//         int p =1;
//         int a = 3;
//         while(a>=1){
//
//             p = p*a;
//             --a;
//         }
//        System.out.println(p);


//        for(int a=1;a<=10;a++){
//            for(int b = 1;b<=a;b++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }



        //// Find out whether a year is a leap year or not:

        Scanner S = new Scanner(System.in);
        System.out.println("Enter The Year: ");
        int year = S.nextInt();
        boolean bool = false;
        for(int a = 0;a<=Integer.MAX_VALUE;a++) {
            if (year / 4 != 2 * a) {
                break;
            }
            else if(year/100!=2*a){
                break;
            }
            else if(year/400!=2*a){
                break;
            }
            else{
                bool=true;
            }

        }
        if(bool){
            System.out.println("It's a Leap Year");
        }
        else {
            System.out.println("Not a Leap Year");
        }


    }
}
