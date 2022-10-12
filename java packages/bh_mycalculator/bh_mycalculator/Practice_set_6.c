#include<stdio.h>

// Problem 6 : 
void changeByValue (int a){
  a = 5;
}
  

// Problem 4:
/*void sumUsingPointer (int *a,int *b){

  int value_a = *a;
  int value_b = *b;

  printf("Sum of two numbers using pointers is %d\n",value_a+value_b);
  printf("Average of two numbers using pointers is %d",(value_a+value_b)/2);
  

}
*/
/*
void changeValue (int *a){
  int b = *a;
  b = 10*b;
  printf("%d",b);
}
*/
/*
void printAddress (int a){
    printf("The address of i is %u",&a);
}
*/
/*
void changeValue (int *a){
printf("The value is changed to %u",10*(*a));
}
*/

int main(){
  int a = 1;
  printf("The value of a before applying call by method is %d\n",a);
  changeByValue(a);
  printf("The value of a after applying call by method is %d\n",a);
/*
// Problem 4 :
  int a = 4;
  int b = 6;

  sumUsingPointer(&a,&b);
*/

// Problem 5 : 
/*
int i = 10;
int *a = &i;
int **b = &a;
printf("The value of i using pointer to pointer is %d",*(*b));
*/

 /* int a=2;
  int *b =&a;
  printf("%u\n",b);
  changeValue(&a);
  */

    // printing the adress of a number 
    // Problem 1:

  /*  int a = 5;
    int *b = &a;
    printf("The address of a is %u\n",&a);
    printf("The value of a  using address is %d",*b);
    */

   // Problem 2:

  /* int i = 2;
   printf("The address of i is %u\n",&i);
   printAddress(i);
   */

  // Problem 3:
/*
  int a = 2;
  changeValue(&a);
  */


   

    return 0;
}
