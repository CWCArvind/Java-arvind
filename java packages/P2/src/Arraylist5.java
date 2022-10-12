import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

public class Arraylist5 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int n = S.nextInt();
       List<List<Integer>> lists = new ArrayList<List<Integer>>();

        for(int j = 0;j<n;j++){
            int a = S.nextInt();
            ArrayList<Integer> list = new ArrayList<>(a);
            for(int i = 0;i<a;i++) {
                int b = S.nextInt();
                list.add(b);
            }
            lists.add(list);

        }
        int c = S.nextInt();
        for(int k = 0;k<c;k++){
            int d = S.nextInt(); int e = S.nextInt();
            try {
                System.out.println(lists.get(d - 1).get(e - 1));

            }
            catch (ArrayIndexOutOfBoundsException ex){
                System.out.println("Error!");
            }

        }
    }
}
