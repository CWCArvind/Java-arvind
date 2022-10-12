#include<stdio.h>
#include<string.h>
#include<stdlib.h>

// Very Important : If you had made an structure and you are using it in any method then the method should be below the structure unless you have to face error.

/*
typedef struct complex_number {
int real;
int imaginary;
}complex;

void display (complex a){
    printf("The complex no is : %d + %di\n",a.real,a.imaginary);
}
*/
/*
void slice (char str[],int m,int n){
int len = strlen(str);
int j =0;

for(int i=m;i<n;i++){
    str[j] = str[i];
    j++;
}
str[j] = '\0';
}
*/


/*
void Reverse(int num[],int n){

    for(int i=0;i<n/2;i++){
        int temp = num[i];
        num[i] = num[n-i-1];
        num[n-i-1] = temp;

    }

}
*/
/*
int change(int *ptr){
    int b = *ptr;
    b = 10*b;

    return b;
}
*/
/*
int fibonacci (int n){
    if(n==1||n==2){
        return n-1;
    }
    return fibonacci(n-1) + fibonacci(n-2);
}
*/

int main(){

    // This is the practice set created by Arvind Sharma : Do this practice set and you will be perfect in any programming language.


    
    
    // Problem 1 : Write a function to convert Celsius to Farenheit                                                "Done"
/*
    int celsius;
    printf("Enter the temperature in celsius : \n");
    scanf("%d",&celsius);

    float farenheit = (9/5.0)*celsius + 32;

    printf("The value of temperature in farenheit is %f",farenheit);

*/





    // Problem 2 : Evaluate on copy --> 3*x/y - z + k  where x = 2 , y = 3 , z = 3 and k = 1              "DONE"

    // 2 - 3 + 1 = 0;

   // printf("%d",3*2/3-3+1);




    // Problem 3 : Write a program to find whether a year entered by the user is a leap year or not.            "DONE"
/*
    int year;
    printf("Enter the year you want to check it a leap year or not : \n");
    scanf("%d",&year);

    if((year%100==0&&year%400==0) || (year%100!=0&&year%4==0)){
        printf("Year is a leap year");
    }

    else{
        printf("Entered year is not a leap year");
    }
    */





    // Problem 4 : Write a program to determine whether a character entered by the user is a lowercase or not .
/*
    char alphabet;
    printf("Enter a character : \n");
    scanf("%c",&alphabet);

    int a = (int)alphabet;

    if(a<100){
        printf("Entered character is in Upper Case.");
    }
    else{
        printf("Entered character is in lower case.");
    }
    */




    // Problem 5 : Write a program to find greatest of four numbers by the user.            "Done"
/*
    int a,b,c,d;
    printf("Enter four integers to find the greates of these four : \n");
    scanf("%d%d%d%d",&a,&b,&c,&d);

    int a1;
    int a2;

    if(a>b){
     a1 = a;
    }
    else{
     a1 = b;
    }
    if(c>d){
     a2 = c;
    }
    else{
     a2 = d;
    }

    if(a1>a2){

        printf("The greatest value of all four is %d",a1);

    }
    else{

        printf("The greatest value of all four is %d",a2);

    }
    */




    // Problem 6 : Write a program to calculate the sum of the numbers occuring in the multiplication table of a number entered by the user.
/*
    int table ;
    printf("Enter the number of which multiplication table you want : \n");
    scanf("%d",&table);
    int sum = 0;

    for(int i=0;i<10;i++){
      sum += table*(i+1);
    }

    printf("The sum of the multiplication table of %d is %d",table,sum);
    */




    // Problem 7 : Write a program to calculate the factorial of a given number using a loop.               "Done"
/*
    int fact;
    printf("Enter the number of which you want the factorial of : \n");
    scanf("%d",&fact);
    int factorial = 1;

    for(int i= 1;i<=fact;i++){
        factorial *= i;
    }

    printf("Factorial of %d is %d",fact,factorial);

    */



    // Problem 8 : Write a program to check whether a number is prime or not.                 "Done"
/*
    int a;
    printf("Enter the number to check for prime : \n");
    scanf("%d",&a);
    if(a==1){
        printf("Not a prime number.");
    }
    int j=2;

    for(int i=2;i<a;i++){
        if(a%i==0){
            printf("Not a prime number");
            break;
        }
        j++;
    }
    if(j==a){
        printf("Yes, it's a prime number");
    }
    */



    // Problem 9 : Modify above program to find no of prime no between two numbers entered by the user.          "Done"
/*
    int m;
    int n;
    printf("Enter the starting and ending point to count the prime nos.\n");
    scanf("%d%d",&m,&n);
    int k=0;

    if(m>n){
        printf("Second integer should be greater than first.");
        return;
    }

    if(n==3){
        printf("No of prime no is 1");
        return;
    }
    


    for(int i=m;i<n;i++){
        for(int j=2;j<i;j++){
            if(i%j==0){
                break;
            }
            if(j==i-1){
            k++;
        }
        }
        
    }

    if(m<=2&&n>2){
        k++;
    }

    printf("The no prime nos between %d and %d are %d",m,n,k);
    */



    // Problem 10 : Write a program to calculate nth element of fibonacci series.                 "Done"

    // I will prefer it to solve using recursion : 
/*
    int fib;
    printf("Enter the value of n to get nth element of fibnoacci series : \n");
    scanf("%d",&fib);

    int a = fibonacci(fib);

    printf("The value of fibonacci %dth element is %d",fib,a);
    */



    // Problem 11 : Write a program to calculate the sum of first n natural nos. (Using both loop and recursion).     "Done"




    // Problem 12 : Write a function to change the value of a variable to ten times of its current value.          "Done"
/*
    int a;
    printf("Enter the value of a : \n");
    scanf("%d",&a);
    int *ptr;
    ptr = &a;

    int c = change(ptr);

    printf("The ten times value of %d is %d",a,c);
    */



    // Problem 13 : Write a program containing a function which reverses the array passed to it.          "Done"
/*
    int arr[5] = {1,2,5,4,7};

    printf("The array before running Reverse function is : \n");
    for(int i=0;i<5;i++){
        printf("%d ",arr[i]);
    }

    Reverse(arr,5);

    printf("\nThe array after running Reverse function is : \n");

    for(int i=0;i<5;i++){
        printf("%d ",arr[i]);
    }
    */




    // Problem 14 : Create an array of size 3 X 10 containing multiplication tables of the numbers 2,7and 9.        "Done"
/*
    int tables[3][10];
    
    for(int i=0;i<3;i++){
        printf("Enter the number of which table you want to store in the array : \n");
        int num;
        scanf("%d",&num);
        for(int j=0;j<10;j++){
            tables[i][j] = num*(j+1);
        }
    }

    for(int i=0;i<3;i++){
        for(int j=0;j<10;j++){
            printf("%d x %d = %d\n",tables[i][0],j+1,tables[i][j]);
        }
        printf("\n*********************************\n\n");
    }
    */


    // Problem 15 : Write a function slice() to slice a string. It should change the original string such that it is now the sliced
    // string.Take m and n as the start and ending position for slice.                        "Done"
/*
    char str[30];
    printf("Enter the string : \n");
    
    gets(str);
    fflush(stdin);

    int m,n;
    printf("Enter the starting and end index to slice the string : \n");
    scanf("%d%d",&m,&n);


    slice(str,m,n);

    printf("The sliced string is %s",str);
    */




    // Problem 16 : Write a program to check the occurence of a given character in a string .         "Done"




    //Problem 17 Create an array of 3 complex numbers and display them with the help of a display function.the values must be taken as an input from the user.

                                          // "Done"

/*
    complex cn[3];
    for(int i=0;i<3;i++){
        int a,b;
        printf("Enter the value real and imaginary value of any complex number : \n");
        scanf("%d %d",&a,&b);
    cn[i].real = a;
    cn[i].imaginary =b;
    }
for(int i=0;i<3;i++){
    display(cn[i]);
}
*/



    //Problem 18 Write a program to modify a file containing an integer to double its value.
    //   2(Written previously) --> 4(Written in the same file in place of 2 after the program is run).        "Done"
/*
    FILE *ptr;
    ptr = fopen("temp_file.txt","r");
    
    int a;
    fscanf(ptr,"%d",&a);
    fclose(ptr);

    ptr = fopen("temp_file.txt","w");
    fprintf(ptr,"%d",2*a);
    */




    //Problem 19 Create an array of multiplication table of 7 upto 10(7x10 = 70). Use realloc to make it store 15 numbers (from 7x1 to 7x15).

                                        //  "Done"

/*
    int *ptr;
    ptr =(int *) malloc(10 * sizeof(int));

    for(int i=0;i<10;i++){
        ptr[i] = 7*(i+1);
    }

    ptr = (int *)realloc(ptr,15 * sizeof(int));

    for(int i=0;i<15;i++){
        ptr[i] = 7*(i+1);
    }

    for(int i=0;i<15;i++){
        printf("%d x %d = %d\n",7,i+1,ptr[i]);
    }

    printf("\n\n*******Haa**Haa**It's**Done***********\n\n");
    */



    // Problem 20 : Write a program to count the integers in an integer and to reverse it .                   "Done"

    // Reversing the integer :                  

/*
    int num;
    printf("Enter the integer you want to reverse : \n");
    scanf("%d",&num);
    int rev =0;

    while(num!=0){

        int rem = num%10;
        rev = rev*10 + rem;
        num /= 10;

    }

    printf("The reverse of the integer entered by you is %d",rev);
    
    */



    // Problem 21 : Write a program to convert decimal to binary.

    int a;
    printf("Enter the decimal : \n");
    scanf("%d",&a);
    int arr[10];
    int i=0;

    while(a!=0){
        int rem = a%2;
        a = a/2;
        arr[i] = rem;
        i++;

    }

    for(int j=i-1;j>=0;j--){
        printf("%d",arr[j]);
    }



    // Problem 22 : Write a program to tell the integer enterd by the user whether it is even or odd             "Done"



    // Problem 23 : Arrange two strings in dictionary order .                       "Done"



    // Problem 24 : Sorting of the array (also try for string array).

    // Arranging in ascending order :                                              "Done"
    /*

    int arr[] = {2,4,7,8,5,4,7,8,9};
    for(int i=0;i<8;i++){
        for(int j=i;j<9;j++){
            if(arr[i]>arr[j]){
                // Swap kar do 

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

            }
        }
    }

    for(int i=0;i<9;i++){
        printf("%d ",arr[i]);
    }
    */



    // Problem 25 : Write a function which returns the sum of all the divisors of a number enterd by the user :       "Done"


/*
    int num;
    printf("Enter the integer of which sum of divisors you want : \n");
    scanf("%d",&num);
    int divsum = 0;

    for(int i=1;i<=num;i++){
        if(num%i==0){
           divsum += i;
        }
    }

    printf("The sum of all divisors of %d is %d",num,divsum);
    */



    // Problem 26 : Write a funtion to check the Palindrom of a string passed to it .        "Done"

    



    // Pattern Printing --->


       // Pattern 1 : 

/* *
   **
   ***
   ****   */

/*
  for(int i=0;i<4;i++){
    for(int j=0;j<=i;j++){
        printf("*");
    }
    printf("\n");
  }
  */


    // Pattern 2 : 
/*  ****
    *  *
    *  *
    ****     */
/*
   for(int i =0;i<4;i++){
    for(int j=0;j<4;j++){
        if(i==0||j==0||i==3||j==3){
            printf("*");
        }
        else{
            printf(" ");
        }
    }
    printf("\n");
   }
   */



   // Pattern 3 : 

/*    *                 
     **
    ***
   ****   */
/*
  for(int i=0;i<4;i++){
    for(int j=4;j>i+1;j--){
        printf(" ");
    }
    for(int j=0;j<=i;j++){
        printf("*");
    }
    printf("\n");
  }



  // Pattern 4 : 

  /*   ****
        ***
         **
          *    */

/*
         for(int i=0;i<4;i++){
            for(int j=0;j<i;j++){
                printf(" ");
            }
            for(int j=4;j>i;j--){
                printf("*");

            }
            printf("\n");
         }



   // Pattern 5 :
    /*            1
                  12
                  123
                  1234
                  12345   */

    /*              for(int i=0;i<5;i++){
                    for(int j=0;j<=i;j++){
                        printf("%d",j+1);
                    }
                    printf("\n");
                  }


    // Pattern 6 : 

    /*   
    1
    2 3
    4 5 6
    7 8 9 10
    11 12 13 14 15   */   

 /*   int k=0;      

    for(int i=0;i<5;i++){
    for(int j=0;j<=i;j++){
        k++;
         printf("%d ",k);
     }
      printf("\n");
     }
     */



    // Patten 7 : 

/*  1
    01
    101
    0101
    10101    */

  /*  for(int i=0;i<5;i++){
        for(int j=0;j<=i;j++){
            if((i+j)%2==0){
                printf("1");
            }
            else{
                printf("0");
            }
        }
        printf("\n");
    }


    // Patten 8 : 

/* *      *
   **    **
   ***  ***
   ********  
   ********
   ***  ***
   **    **
   *      *   */

 /* for(int i=1;i<=4;i++){
    for(int j=1;j<=i;j++){
        printf("*");
    }
    for(int j=4;j>i;j--){
        printf("  ");
    }
    for(int j=1;j<=i;j++){
        printf("*");
    }
    printf("\n");
  }

  for(int i=4;i>=1;i--){
    for(int j=1;j<=i;j++){
        printf("*");
    }
    for(int j=4;j>i;j--){
        printf("  ");
    }
    for(int j=1;j<=i;j++){
        printf("*");
    }
    printf("\n");
  }


  // Pattern 9 : 

  /*    *****
       *****
      *****
     *****
    *****   */

 /*  for(int i=1;i<=5;i++){
    for(int j=5;j>i;j--){
        printf(" ");
    }
    for(int j=0;j<5;j++){
        printf("*");
    }
    printf("\n");
   }



   // Pattern 10 : 

/*     1
      2 2
     3 3 3
    4 4 4 4
   5 5 5 5 5   */ 

 /*  for(int i=1;i<=5;i++){
    for(int j=5;j>i;j--){
        printf(" ");
    }
    for(int j=1;j<=i;j++){
        printf("%d ",i);
    }
    printf("\n");
   }



   // Pattern 11 : 

/*         1
         2 1 2
       3 2 1 2 3
     4 3 2 1 2 3 4
   5 4 3 2 1 2 3 4 5     */

 /*  for(int i=1;i<=5;i++){
    for(int j=5;j>i;j--){
        printf(" ");
    }
    for(int j=i;j>=1;j--){
        printf("%d",j);
    }
    for(int j=2;j<=i;j++){
        printf("%d",j);
    }
    printf("\n");
   }






    // Pattern 12 : 

/*
               *
              ***
             *****
            *******
            *******
             *****
              ***  
               *       */


 /*             for(int i=1;i<=4;i++){
                for(int j=4;j>i;j--){
                    printf(" ");
                }
                for(int j=1;j<2*i;j++){
                    printf("*");
                }
                printf("\n");
            
              }
              for(int i=4;i>=1;i--){
                for(int j=4;j>i;j--){
                    printf(" ");
                }
                for(int j=1;j<2*i;j++){
                    printf("*");
                }
                printf("\n");
            
              }

              */



     

























    // Project 1 : Make a guess the no game (Random no generated should be between 0 and 100).



    // Project 2 : Make Rock,Paper and Scissor Game. 


  

    return 0;
}