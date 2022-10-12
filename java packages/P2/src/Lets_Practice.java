import java.util.Scanner;



public class Lets_Practice {
    public void patterns (int n){
        if(n==1){
            System.out.print("*");
        }
        else{

            patterns(n-1);
            System.out.println();
            for(int i = 1;i<=n;i++){
                System.out.print("*");
            }


        }

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Lets_Practice obj = new Lets_Practice();
        obj.patterns(4);


    }
}

