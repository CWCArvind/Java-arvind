import java.util.Scanner;

public class Practice_set_6 {
    public static void main(String[] args) {
//    float [] arr = {5.2f,6.9f,8.7f,6.4f,9.4f};
//    float sum = 0;
//    for(int a=0;a<arr.length;a++){
//        sum = sum + arr[a];
//    }
//        System.out.println(sum);
        Scanner S = new Scanner(System.in);
//        System.out.print("Enter the number to check: ");
//        boolean Is_in_array = false;
//        int a = S.nextInt();
//        int [] arr = {1,2,3,4,5,8,9};
//        for(int element :arr) {
//            if (a == element) {
//                Is_in_array = true;
//                break;
//            }
//
//        }
//       if(Is_in_array == true) {
//           System.out.println("It is there");
//       }
//       else {
//           System.out.println("It is not there:");
//       }


//        int [] marks={85,86,89,74,57};
//        float sum = 0;
//        for(int element:marks){
//            sum = sum + element;
//        }
//        float avg = sum/5.0f;
//        System.out.println(avg);


//        int [][] mat1 = {{1,2,4},
//                         {2,4,7}};
//        int [][] mat2 = {{4,2,8},
//                         {5,1,3}};
//        int [][] result_mat = {{0,0,0},
//                               {0,0,0}};
//
//        for(int i = 0;i<mat1.length;i++ ){
//            for(int j = 0;j<mat1[i].length;j++){
//                result_mat[i][j] = mat1[i][j] + mat2[i][j];
//                System.out.print(result_mat[i][j]);
//                System.out.print(" ");
//            }
//            System.out.println();
//        }


        // How to reverse an array:

//        int [] name = {1,2,3,4};
//        int [] temp = new int[5];
//
//        System.out.print("Before reversing:");
//        for(int element : name){
//            System.out.print(" "+element);
//        }
//        int a = Math.floorDiv(name.length,2);
//        int l = name.length;
//        for(int i = 0;i<name.length;i++){
//            temp[i] = name[i];
//            name[i] = name[l-i-1];
//            name[l-i-1] = temp[i];
//
//            if(i==(a-1)){
//                break;
//
//            }
//
//        }
//        System.out.println();
//        System.out.print("After reversing:");
//        for(int element : name){
//            System.out.print(" "+element);
//        }

//        int [] name = {5,56,42,89,24,51};
//        int min = Integer.MIN_VALUE;
//
//        for(int element : name){
//            if(element>=min){
//                min = element;
//
//            }
//
//        }
//        System.out.println(min);

//
//        int [] arr = {25,-56,45,21,35};
//        int max = Integer.MAX_VALUE;
//        for(int element:arr){
//            if(element<=max){
//                max = element;
//
//            }
//
//        }
//        System.out.println(max);


        int [] arr = {4,5,8,9,10};
        boolean isSorted = false;
        for(int a=0;a<arr.length;a++){
            if(a==(arr.length-1)){
                break;}
            if(arr[a]>arr[a+1]){


                isSorted = true;
                break;

            }

        }
        if(isSorted){
            System.out.println("NOT SORTED");
        }
        else{
            System.out.println("SORTED");
        }
    }
}





