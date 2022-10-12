import javax.swing.*;
import java.util.Scanner;

public class bh_practice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

//        int [][] twod = {{2,5,6},
//                        {2,3,4}};
//
//        int [] marks = {56,78,98,85,78};
//        int [] marks1 = new int[5];
//        marks1[0] = 47;
//        marks1[1] = 475;
//        marks1[2] = 4;
//        marks1[3] = 7;
//        marks1[4] = 447;
//
//        for(int i=0;i<marks1.length;i++){
//            int a = S.nextInt();
//            marks1[i] = a;
//
//        }
//        System.out.println(marks1[0]);
//        for(int i=0;i<marks1.length;i++){
//            System.out.println(marks1[i]);
//        }

//        for(int elements : marks){
//            System.out.println(elements);
     //   }
//        float [] marks ={21.0f,56.0f,54.0f,54.0f,65.0f};
//        float sum =marks[0]+marks[1];
//        float sum1=0;
//        for( int i=0;i<marks.length;i++){
//
//            sum1 +=marks[i];
//
//        }
//        System.out.println(sum1);

        //Problem 2:

//        boolean bool = false;
//        int a= S.nextInt();
//        int [] marks={45,65,41,23,32,56};
//        for (int i=0;i<marks.length;i++){
//           if (marks[i]==a){
//              bool = true;
//              break;
//           }
//
//        }
//        if(bool){
//            System.out.println("Yes");
//        }
//        else{
//            System.out.println("False");
//        }

        // Problem 6:

    /*    int [] marks={45,65,41,23,32,56};

        int a = Integer.MIN_VALUE;

        for(int i=0;i<marks.length;i++){

            if(a<marks[i]){
                a = marks[i];
            }
        }
        System.out.println(a);
*/

        //Problem 8:

   /*     boolean bool = false;

        int [] marks={45,65,67,70,80,96};

        for(int i=0;i<marks.length-1;i++){
            for(int j=i+1;j<marks.length;j++){
                if(marks[i]>marks[j]){
                    bool = true;
                    break;
                }
            }
        }
        if(bool){
            System.out.println("Not Sorted");
        }
        else{
            System.out.println("Sorted");
        }
        */
        // problem no 4


//
//        int [][] mat1 = {{1,2,4},
//                         {2,3,5}};
//        int [][] mat2 = {{1,2,4},
//                         {2,3,5}};
//        int [][] mat3 = {{0,0,0},
//                         {0,0,0}};
//
//
//        for(int i=0;i<mat1.length;i++){
//            for(int j=0;j<mat1[i].length;j++){
//
//                mat3[i][j] = mat1[i][j] + mat2[i][j];
//                System.out.print(mat3[i][j]);
//                System.out.print(" ");
//
//            }
//            System.out.println();
//        }
       // prctice set 6;
        //problem 1
//        float sum =0;
//        float [] marks ={25f,65f,89f,32f,42f};
//        for (int i=0;i<marks.length;i++){
//            sum+=marks[i];
//        }
//        System.out.println(sum);
//        problem 2
//        boolean boll =false;
//        int a= scan.nextInt();
//        int [] marks ={54,65,45,85,96,75};
//        for (int i=0;i<marks.length;i++){
//            if(marks[i]==a){
//                boll=true;
//
//            }
//
//
//        }if(boll==true){
//        System.out.println("true");}
//        else{
//            System.out.println("false");


      //  }
        //problem 3 using for loop
    //    int sum =0;
       // int [] physics={54,65,85,41,21,74};
//        for(int i=0;i<physics.length;i++){
//            sum+=physics[i];
//        }
//        System.out.println(sum/physics.length);
        // using the for each loop
//        for (int elements: physics ){
//            sum+=elements;
//
//        }
//        System.out.println(sum/physics.length);
        // problem no 6
//        int a =Integer.MIN_VALUE;
//        int [] array ={23,56,45,85,74,96,100,102};
//        for (int i=0;i<array.length;i++){
//            if(a<array[i]){
//                a=array[i];
//            }
//        }
//        System.out.println(a);
        // problem 7
//        int a=Integer.MAX_VALUE;
//        int [] array={63,52,41,78,12,36,96};
//        for (int i=0;i<array.length;i++){
//            if(a>array[i]){
//                a=array[i];
//            }
//        }
//        System.out.println(a);
        // problem 8
//        boolean bool=false ;
//        int [] array ={41,52,56,98};
//        for (int i=0;i<array.length;i++){
//            for(int j=i+1;j<array.length;j++){
//              if ( array[i]>array[j]){
//                  bool =true;
//                  break;
//              }
//            }
//        }
//        if (bool) {
//            System.out.println("not sorted");
//        }else {
//            System.out.println("sorted");
//        }
        // problem 5
//        int [] array={12,63,45,52,14};
//        for (int i=0;i<array.length/2;i++){
//           int a=0;
//                   a=array[i];
//                  array[i]= array[array.length-i-1];
//            array[array.length-i-1] =a ;
//
//        }
//        for(int i=0;i<array.length;i++){
//            System.out.println(array[i]);
//        }
        // problem no 4
//        int [][] marks={{2,3,4},
//                       { 4,6,7}};
//        int[][] marks1={{3,6,5},
//                        {5,8,4}};
//        int[][]marks2={{0,0,0},
//                         {0,0,0}};
//        for(int i=0;i<marks.length;i++){
//            for(int j=0;j<marks[i].length;j++){
//                marks2 [i][j] =marks [i][j] +marks1 [i][j];
//                System.out.print(marks2[i][j]);
//                System.out.print(" ");
//            }
//            System.out.println();
//        }revision25156516
//        int n =scan.nextInt();
//        boolean bool =false;
        //int [] array={12,32,65,45,98,7,45,46,52};
//        for (int i=0;i<array.length;i++){
//            if(n==array[i]){
//                bool=true;
//            }
//        }
//        if (bool){
//            System.out.println("yes");
//        }else{
//            System.out.println("no");
       // }













    }
}
