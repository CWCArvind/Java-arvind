import java.util.Scanner;

public class CWH_Chapter2 {
    public static void main(String[] args) {
       // precedence and associativity:
        /*int v = 5;
        int u = 10;
       // System.out.println((x-y)/5);
        int a =5;
        int b =10;
        int c = 1;

        System.out.println(v*v-u*u);
        */
        /* Increment and decrement operators:
        int a = 5;
        int b = a++;
        System.out.println(a++);
        System.out.println(a);
        */
       /* int y = 7;
        int x = ++y * 8;
        System.out.println(x);*/
       /* char c = 'f';
        System.out.println(++c);*/
        Scanner S = new Scanner(System.in);
        System.out.print("Physics: ");
        float a = S.nextInt();
        System.out.print("Chemistry: ");
        float b = S.nextInt();
        System.out.print("Maths: ");
       float c = S.nextInt();
        System.out.print("English: ");
        float d = S.nextInt();
        System.out.print("Phe: ");
        float e = S.nextInt();
        System.out.print("Total: ");
        float f = S.nextInt();
        System.out.print("Percentage: ");
        float g = (a+b+c+d+e)/f*100;
        System.out.println(g);
















    }
}
