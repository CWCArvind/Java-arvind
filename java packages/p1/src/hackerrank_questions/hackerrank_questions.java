package hackerrank_questions;

import java.util.*;

public class hackerrank_questions {

    public static boolean canWin(int leap, int[] game) {
        int j=0;
        int k=0;
        int i=0;
        boolean bool = false;
        // Return true if you can win the game; otherwise, return false.
        while(i<game.length){
            while(game.length>i&&game[i]==1){
                j+=1;
                i++;
                bool = true;
            }

                i++;

            if(j>=k){
                k=j;
            }
        }
        if(leap>k){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}
