package com.company;

public class Arrays {
    public static void main(String[] args) {
//        int [] marks = new int [5];
//        marks [2]= 96;
//        System.out.println(marks[1]);
        // There are three ways to declare an array:
        //1)
//        int [] marks;
//        marks = new int[5];
//        marks[2]= 100;
       // int [] marks = {100,52,56,89,78};
        //System.out.println(marks[3]);
     //   System.out.println( marks.length);
//        String [] str = {"Arvind","Piyush","Harry"};
////        System.out.println(str[2]);
//
//        for (int i = (marks.length-1);i>=0;i--){
//            System.out.println(marks[i]);
//        }
//        System.out.println("Printing using for each loop");
//        for(int a : marks){
//            System.out.println(a);
//        }

        ///// Arrays of arrays:

       int [] marks = {100,52,89,96,85,78,58,56};
        System.out.println(marks.length);

        //////Multidimensional Array:
        // 2 - D array:
        int [][] numbers = new int [2][3];
        numbers[0][0] = 22;
        numbers[0][1] = 23;
        numbers[0][2] = 24;
        numbers[1][0] = 32;
        numbers[1][1] = 33;
        numbers[1][2] = 34;
        for(int a = 0; a<numbers.length;a++){
            for(int b = 0;b<numbers[0].length;b++) {
                System.out.print(numbers[a][b]);
                System.out.print(" ");
            }
            System.out.println();

            }

    }
}
