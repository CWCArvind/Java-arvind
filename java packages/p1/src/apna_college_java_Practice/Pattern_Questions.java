package apna_college_java_Practice;

import java.util.Scanner;

public class Pattern_Questions {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        // Solid Rectangle:
//        System.out.println("Enter the edge of the rectangle:");
//        int n = S.nextInt();
//        for(int j = 0;j<n;j++){
//        for(int i = 0;i<n;i++) {
//            System.out.print("*");
//        }
//            System.out.println();
//        }

        // Hollow Rectangle:
//        int n = 4;
//        int m = 5;
//
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=m;j++){
//                if(i==1||i==n||j==1||j==m){
//                    System.out.print("*");
//                }
//                else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }

//        Half Pyramid:
//        for(int i=1;i<=4;i++){
//            for(int j=0;j<i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        // Inverted half Pyramid:

//        for(int i=4;i>0;i--) {
//            for (int j = 0; j < i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        // half pyramid rotated by one eighty degrees:
//        int n=5;
//        for(int i=0;i<n;i++){
//            for(int j=0;j<=i;j++){
//                for(int k=n-1;k>i;k--){
//                    if(j>=1){
//                        break;
//                    }
//                    System.out.print(" ");
//                }
//                System.out.print("*");
//            }
//            System.out.println();
//        }
////     Second approach:
//        for(int i=0;i<n;i++){
//            for(int j=0;j<n-i-1;j++){
//                System.out.print(" ");
//            }
//            for(int j=0;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
////        Printing the numbers in place of stars:
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }
////        Printing numbers in place of stars in inverted half pyramid problem:
//        for(int i=n;i>=1;i--){
//            for(int j=1;j<=i;j++){
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }
////        Floyd's triangle:
//
//        int pro = 1;
//        for(int i=0;i<n;i++){
//            for(int j=0;j<=i;j++){
//                System.out.print(pro+" ");
//                pro++;
//            }
//            System.out.println();
//        }
//
////        printing zero and one in a particular order:
//
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=i;j++){
//                if((i+j)%2==0){
//                    System.out.print("1 ");
//                }
//                else{
//                    System.out.print("0 ");
//                }
//            }
//            System.out.println();
//        }
//      Butterfly pattern:
//         int n = 4;
//         for(int i=1;i<=n;i++){
//             for(int j =1;j<=i;j++){
//                 System.out.print("*");
//             }
//             for(int j=n-i;j>0;j--){
//                 System.out.print("  ");
//             }
//             for(int j =1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//         for(int i =n;i>=1;i--){
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             for(int j=n-i;j>0;j--){
//                 System.out.print("  ");
//             }
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//         Solid Rhombus:
//        int n =5;
//        for(int i = 1;i<=n;i++){
//            for(int j=n-i;j>=1;j--){
//                System.out.print(" ");
//            }
//            for(int j = 1;j<=n;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        //Pyramid problem:

//        int n = 5;
//        for(int i=1;i<=n;i++){
//            for(int j=n-i;j>=1;j--){
//                System.out.print(" ");
//            }
//            for(int j=1;j<=i;j++) {
//                System.out.print(i+" ");
//            }
//            System.out.println();
//        }

        //Palindrome problem:
//        int n=5;
//
//        for(int i=1;i<=n;i++){
//            for(int j=n-i;j>=1;j--){
//                System.out.print(" ");
//            }
//            for(int j=i;j>=1;j--){
//                System.out.print(j+" ");
//
//            }
//            for(int j=1;j<=i;j++){
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }
//      Diamond Pattern:
        int n =4;
        for(int i=1;i<=n;i++){

            for(int j=n-1;j>=i;j--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=2;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--){
            for(int j=n-i;j>=1;j--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=2;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        }


    }

