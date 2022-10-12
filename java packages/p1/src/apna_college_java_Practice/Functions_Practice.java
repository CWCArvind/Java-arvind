package apna_college_java_Practice;
import java.util.Scanner;
public class Functions_Practice {

//    Problem no ten:

    public static int FibonacciSeries (int n){
        if(n==1||n==2){
            return n-1;
        }
        else{
            return FibonacciSeries(n-1) + FibonacciSeries(n-2);
        }
    }

//   Problem no nine:
    /*
    public static int greatestCommonDivisor (int a , int b){
        int greatestCommonDivisor = 1;
        int n = Math.min(a,b);
        for(int i=1;i<=n;i++){
            if(a%i==0 && b%i==0){
                greatestCommonDivisor = i;
            }
        }
        return greatestCommonDivisor;
    }
    */


   /* public static float average (int a , int b, int c){
        return (a+b+c)/3.0f;
    }*/
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("I am back");
        int n = S.nextInt();
        System.out.println("This is the nth term in the fibonacci series: ");
        System.out.println(FibonacciSeries(5));

//       Problem no nine;
    /*    System.out.println("This is the greatest common divisor of six and nine ");
        System.out.println(greatestCommonDivisor(6,9));*/

//        Problem one:

   /*     System.out.println("Enter three numbers whose average we have to find");
        int a = S.nextInt();
        int b = S.nextInt();
        int c = S.nextInt();
        System.out.println(average(a,b,c));   */

//        Problem two:
      /*  System.out.println("Enter the value of n");
        int n=S.nextInt();
        int sum = 0;
        for(int i=1;i<=n;i++){
        if(i%2!=0) {
            sum += i;
        }
        }
        System.out.println(sum);
        */
//        Problem three:
     /*   int noOfPositive = 0;
        int noOfNegative =0;
        int noOfZeros =0;

        while(S.hasNextInt()){
            int a = S.nextInt();
            if(a>0){
                noOfPositive += 1;
            }
            else if(a<0){
                noOfNegative += 1;
            }
            else{
                noOfZeros += 1;
            }
        }
        System.out.println("No of negative numbers entered are: "+noOfNegative + "\nNo of positive numbers entered are: " + noOfPositive + "\nNo of zeros entered are: " + noOfZeros);
*/
    }
}
