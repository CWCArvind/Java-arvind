import java.io.*;
import java.util.*;

public class Solution56 {

    static void printArray (ArrayList<Integer> arr1 , ArrayList<String> arr2){
        for(int element1 : arr1){
            System.out.println(element1);
        }
        for (String element2 :arr2){
            System.out.println(element2);
        }
    }

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);

        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<String> arr2 = new ArrayList<>();
        for(int i = 0;i<3;i++){
            int a = S.nextInt();
            arr1.add(a);
        }
        for(int i = 0;i<3;i++){
            String a = S.nextLine();
            arr2.add(a);
        }

        printArray(arr1, arr2);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
