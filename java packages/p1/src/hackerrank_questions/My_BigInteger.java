package hackerrank_questions;
import java.math.BigInteger;
import java.util.*;

public class My_BigInteger {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        BigInteger bigInteger1 = new BigInteger(String.valueOf(S.nextInt()));
        BigInteger bigInteger2 = new BigInteger(String.valueOf(S.nextInt()));
        System.out.println(bigInteger1.add(bigInteger2));
        System.out.println(bigInteger1.multiply(bigInteger2));


    }
}
