

public class bh_methods {
    int factorial (int n){
        if(n==1){
            return 1;
        }
        return n*factorial(n-1);
    }

    int sum (int a, int b){
        int sum = a+b;

        return sum;
    }
    float sum(float a, float b){

        return a+b;
    }
    void sum(int ... numbers){
        int sum = 0;
        for(int i=0;i<numbers.length;i++){
            sum += numbers[i];
        }
        System.out.println(sum);
    }


//    int sum (int a,int b,int ... integers){
//        int sum =0;
//        for(int elements : integers){
//            sum+=elements;
//        }
//        return sum+a+b;
//    }

// Overloaded methods

//     int sum (int a,int b){
//        return a+b;
//    }
//    int sum(int c,int d,int e){
//         return c+d+e;
//    }

//    void hello (){
//        System.out.println("Hello");
//    }
    public static void main(String[] args) {

        bh_methods obj = new bh_methods();

        int d =4;
        int e =8;

        int c = obj.sum(d,e) + 6;
        System.out.println(c);

//        System.out.println(obj.sum(a,b));
//        System.out.println(obj.sum(4,5,6));

//        System.out.println(obj.sum(2,5,7,8,9,6,15));

        obj.sum(2,5,6,9,8,7,4,5);
        System.out.println(obj.factorial(10));


    }
}
