import java.util.Scanner;


public class Challenge {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        try { System.out.println("Enter the value of a , b, c");
        int a = S.nextInt();
        int b = S.nextInt();
        int c = S.nextInt();

         double discriminant = Math.sqrt(b * b - 4 * a * c);
         double root1 = (-b + discriminant) / (2 * a);
         double root2 = (-b - discriminant) / (2 * a);


         System.out.println("First root is : " + root1);
         System.out.println("Second root is : " + root2);
     }
     catch (Exception e){
         System.out.println(e);
     }
    }
}
