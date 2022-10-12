import java.util.Scanner;

public class Regular_Expressions {

    public static String getSmallestAndLargest(String s, int k) {

        String [] substrings = new String[s.length()-k+1];

        for(int i = 0;i<s.length()-k;i++){
            String str = s.substring(i,i+k);
            substrings[i] = str;
        }
        for(int i =0;i<substrings.length-1;i++){
            for(int j=i+1;j<substrings.length;j++){
                if(substrings[i].compareTo(substrings[j])>0){
                    String temp = substrings[i];
                    substrings[i] = substrings[j];
                    substrings[j] = temp;
                }
            }
        }

        String smallest = substrings[0];
        String largest = substrings[substrings.length];

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
