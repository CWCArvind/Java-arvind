import java.util.Scanner;

public class bh_loops {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
//        int a =7;
//        while (a<10){
//            System.out.println("a is natural no ");
//            a++;
//        }
//        do {
//            System.out.println("print the no ");
//            a++;
//        }
//        while(a<151);
//        for (int b=5;b<8;b++){
//            System.out.println("print the no ");
     //   }
//        for (int a=100;a<=200;a++){
//            System.out.println( a );
       // }

        // #print the natural no
//
//       int d= scan.nextInt();
//        int c =1;
//
//        do{
//            System.out.println(c);
//            c++;
//
//        }
//        while(c<=d);

        //print n odd no using for loop .

        int j = scan.nextInt();

        for (int s =j;s<=j;s--){
            if(s==1){
            continue;
        }
            if(s==0){
                break;
            }
            System.out.println(2*s);


        }


    }
}
