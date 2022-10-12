import java.io.*;
import java.util.*;
interface PerformOperation {
    boolean check(int a);
}
class MyMath {
    public static boolean checker(PerformOperation p, int num) {
        return p.check(num);
    }

    // Write your code here
    PerformOperation isOdd () {
        return  (a)->{
            if(a%2==0){
                return false;
            }
            else {
                return true;
            }
        };



    }

    PerformOperation isPrime () {
        return (a)->{
            int b =0;
            for(int i =1;i<=a;i++){
                if(a%i==0){
                    b += 1;
                }
            }
            if(b>2){
                return false;
            }
            else {
                return true;
            }
        };


    }

    PerformOperation isPalindrome () {
        return  (a)->{
            String str = Integer.toString(a);
            int length = str.length();
            boolean bool = false;


            for(int i = 0;i<=length/2;i++){
                if(str.substring(i,i+1).equalsIgnoreCase(str.substring(length-i-1,length-i))){

                    bool = true;

                }
                else{
                    bool = false;
                    break;
                }
            }

            if(bool){
                return true;
            }
            else{
                return false;
            }

        };
    };
    }

    public class Solutions_lambda_Expression {

        public static void main(String[] args) throws IOException {
            MyMath ob = new MyMath();
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int T = Integer.parseInt(br.readLine());
            PerformOperation op;
            boolean ret = false;
            String ans = null;
            while (T--> 0) {
                String s = br.readLine().trim();
                StringTokenizer st = new StringTokenizer(s);
                int ch = Integer.parseInt(st.nextToken());
                int num = Integer.parseInt(st.nextToken());
                if (ch == 1) {
                    op = ob.isOdd();
                    ret = ob.checker(op, num);
                    ans = (ret) ? "ODD" : "EVEN";
                } else if (ch == 2) {
                    op = ob.isPrime();
                    ret = ob.checker(op, num);
                    ans = (ret) ? "PRIME" : "COMPOSITE";
                } else if (ch == 3) {
                    op = ob.isPalindrome();
                    ret = ob.checker(op, num);
                    ans = (ret) ? "PALINDROME" : "NOT PALINDROME";

                }
                System.out.println(ans);
            }
        }
    }
