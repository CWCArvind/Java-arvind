

public class bh_methods_practice_set {
    float scale (int c){

        return (9f/5)*c+32;
    }
//problem no 2
//    void myPattern (int n){
//
//        if(n>0) {
//            myPattern(n - 1);
//        }
//        for(int i=1;i<=n;i++){
//            System.out.print("*");
//        }
//        System.out.println();
//    }




// revision
//    void pattern (int n){
//
//        for(int i=0;i<n;i++){
//            pattern (n-1);
//            if(n==1){
//                break;
//            }
//
//
//            System.out.print("*");
//            System.out.print( " ");
//        }
//        System.out.println();



//    }
  //  problem no 6
//    int sum =0;
//    void average (int ... array){
//        for (int i=0;i<array.length;i++){
//            sum+=array[i];
//        }
//        System.out.println(sum/ array.length);
//    }

//int sum =0;
//    void sum1 (int n ){
//        for (int i=0;i<=n;i++){
//
//            sum+=i;
//        }
//        System.out.println(sum);
//    }
//
  /*  void multiplicationtable (int n){
        for (int i=1;i <=10;i++){
            int mul=1;
            System.out.println(mul=n*i);
        }
    }
*/


    // Problem 4:
 /*   void Pattern (int n){

        for(int i=0;i<n;i++){
            System.out.print("*");
            if(n==1){
                break;
            }
        }
        System.out.println();
        if(n>=1) {
            Pattern(n - 1);
        }
    }
    */

//    Problem 6:
 /*   float avg (int ... array){
        float sum =0;
        for(int elements : array) {
            sum += elements;
        }
      float avg =  sum/array.length;

        return avg;
    }


  */


    //Problem1:
 /*   void multiplicationTable (int n){
        for(int i=1;i<=10;i++){
            System.out.println(n*i);
        }
    }
    */

    // Problem 3:

 /*   int sum (int n){
        if(n==1){
            return 1;
        }
        return n+sum(n-1);
    }
    */

    // Fibonacci Sequence: Problem 5

  int fibonacci (int n){
        if(n==1||n==2){
            return n-1;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }



    // Factorial using recursion:
 /*
    int factorial (int n){
        if(n==1){
            return 1;
        }
        return n*factorial(n-1);
    }*/
    public static void main(String[] args) {

        bh_methods_practice_set fact = new bh_methods_practice_set();
    //    System.out.println(fact.scale(32));
       // fact.myPattern(4);
      //  fact.average(6,3,4,2,1,3,1);


 //       System.out.println(fact.factorial(5));

  //      System.out.println(fact.sum(10));

        System.out.println(fact.fibonacci(47));
 //       System.out.println(fact.avg(4,5,9,7,6,3,1,1));

      //  fact.Pattern(4);
       // fact.multiplicationtable(10);

    }
}
