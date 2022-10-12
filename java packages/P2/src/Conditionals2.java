import java.util.Scanner;


public class Conditionals2 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);

        int [] marks = {2,5,8,9,6};
        while(true){
            System.out.println("Enter the index of array marks");
           try {
               int index = S.nextInt();
               int a = marks[index];
               System.out.println(a);
               break;
           }
           catch (ArrayIndexOutOfBoundsException e){
               System.out.println("Array index out of bound \n Enter it again.");
           }
        }

    }
}
