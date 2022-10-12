public class Methods_Practice_Set {
    static void patrn (int n) {

        if(n>0){
            for(int a = 1;a<=n;a++){
                System.out.print("*");
            }
            System.out.println();

        patrn(n-1);
    }
    }
    static int fib (int n){
        if(n==1){
            return 0;
        }
        else if (n==2){
            return 1;
        }
        else{
            return fib(n-1) + fib(n-2);
        }
    }
    static int sumn (int n){
        if (n==1){
            return 1;
        }
        else{
            return n+sumn(n-1);
        }
    }

    static void fibonacci (int i) {
        int[] arr = new int[i+1];
        arr[0] = 0;
        arr[1] = 1;
        if (i == 1) {
            System.out.println(arr[0]);

        } else if (i == 2) {
            System.out.println(arr[1]);
        } else {
            for (int a = 1; a <= i; a++) {
                arr[a + 1] = arr[a] + arr[a - 1];
                if (a == i - 1) {
                    break;
                }
            }
            System.out.println(arr[i - 1]);
        }
    }

    static void sum_i(int n){
        int sum = 0;
        for(int a =1;a<=n;a++){
            sum += a;
        }
        System.out.println(sum);

    }



    // 1.8F + 32:
    static float conversion (float c){
        float f = 1.8f * c + 32;
        return f;
    }



    static float avg(int ... array){
        float sum = 0.0f;
        for(int element: array){
            sum += element;
        }
        return  sum/array.length;
    }




    static void Pattern_2(int n){//where n is no. of rows:
        for (int a = n;a>=1;a--){
            for(int b=1;b<=a;b++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    static int sum (int n){
        if(n==1)
            return 1;
        else{
            return n + sum(n-1);
        }

    }



    static void pattern(int n){//where n are rows:
        for(int a=1;a<=n;a++){
            for(int b = 1;b<=a;b++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }


    static void table (int n){
        for(int a =1; a<=10;a++){

            System.out.println(n + " X " + a + " =  " + n*a);
        }
    }
    public static void main(String[] args) {
//        table(67);
//        pattern(4);
//        System.out.println(sum(4));
//        Pattern_2(4);
//        System.out.println(avg(1,2,3,4,5,6,7,8));
//        System.out.println(conversion(37));
//        sum_i(10);
//        fibonacci(7);
//        System.out.println(sumn(4));
//        System.out.println(fib(7));
        patrn(4);



        }
    }
