package java_Revision;

        import java.util.Scanner;

        public class Solution {

            public static String getSmallestAndLargest(String s, int k) {
                String smallest = "Arvind";
                String largest = "Sharma";
                String part1 = s.substring(0, 0 + k);
                for (int i = 0; i < s.length() - 1; i++) {

                    String part2 = s.substring(i + 1, i + 1 + k);
                    if (part1.compareTo(part2) > 0) {
                        part1 = part2;
                    }
                    if (i == s.length() - 2) {
                        smallest = part1;
                    }

                }
                for (int i = 0; i < s.length() - 1; i++) {

                    String part2 = s.substring(i + 1, i + 1 + k);
                    if (part1.compareTo(part2) < 0) {
                        part1 = part2;
                    }
                    if (i == s.length() - 2) {
                        largest = part1;
                    }

                }
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

