package My_Ever_Best_Library;
import java.util.Scanner;

public class cha_2practiceset {
    public static void main(String[] args) {
        //problem1
        float a =7/4*9/2;
        System.out.println(a);

        //problem2
        char grade = 'a';
        grade += (char)8;
        System.out.println(grade);
        grade -= (char)8;
        System.out.println(grade);
//        problem 3
        Scanner scan =new Scanner(System.in);
        int a2 = 8;
        int a3 =scan.nextInt();
        if(a2>=a3){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        //problem 4
        System.out.println("(v*v-u*u)/a*s*2");
        //problem 3




    }
}
