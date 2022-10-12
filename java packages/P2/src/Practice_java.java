public class Practice_java {
    void pattern(int n) {//where n is number of rows:
        if (n==1){
            System.out.println("*");
        }
      else { pattern(n-1);
            for (int i = 1; i <= n; i++) {
                System.out.print("*");
            }
            System.out.println();

        }

    }

    public static void main(String[] args) {
        Practice_java myPattern =new  Practice_java();
        myPattern.pattern(4);


    }
}
