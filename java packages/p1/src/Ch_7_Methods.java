public class Ch_7_Methods {
    //RECURSION:
    static int factorial (int n){
        if(n==0||n==1){
            return 1;
        }
        else{
            return n* factorial(n-1);

        }
    }
    static int factorial (int a,int b){
        int prt = 1;
        for(int x = 1;x<=a;x++){
            prt *= x;
        }
        return prt;
    }




    // VARARGS:
    static int sum (int a ,int ... arr){
        int sum = a;
        for(int element:arr ){
            sum += element;
        }
        return sum;

    }

    //Recursion method:
//    public static void change(int [] arr){
//        arr[1] = 45;
//
//    }
//    static int factorial(int n){
//        if ( n==0||n==1){
//            return 1;
//        }
//        else{
//            return n*factorial(n-1);
//        }
//    }
//    static int factorial(int n,int c){
//        if ( n==0||n==1){
//            return 1;
//        }
//        else{
//            return n*factorial(n-1);
//        }
//    }
    //method to find sum of first n natural numbers:
    static int sum (int n){
        if ( n ==1 ){
            return 1;
        }
        else{
            return n + sum((n-1));
        }
    }

    public static void main(String[] args) {
        //System.out.println(factorial(4));
//        System.out.println(sum(1));
//        int [] array ={1,5,89};
//        change(array);
//        System.out.println(array[1]);
//        System.out.println(sum(array[0],array[1],array[2]));

        //Recursion:
        System.out.println(factorial(5));
        System.out.println(factorial(5,6));








}
        }