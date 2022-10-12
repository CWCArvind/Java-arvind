#include<stdio.h>
#include <string.h>

int main(){
    // 1) Count the total no of digits in an integer: 
/*
    int num;
    printf("Enter the integer:\n ");
    scanf("%d",&num);
    int no_of_digits = 0;

    while(num!=0){

        no_of_digits++;
        num = num/10;
    }
    printf("The no of digits are : %d",no_of_digits);
    */

   // 2) Reverse the no : 
/*
   int num;
   printf("Enter the integer : \n");
   scanf("%d",&num);
   int rev = 0;

   while(num!=0){
    int rem = num%10;
    rev = rev*10 + rem;
    num /= 10;
   }
   printf("The reversed of entered integer is %d",rev);

   */

  // Convert the decimal no to binary : 
/*
  int deci;
  printf("Enter the integer : \n");
  scanf("%d",&deci);
  int binary = 0;

  while(deci!=0){

    int rem = deci%2;
    binary = binary*10 + rem;
    deci = deci/2;

  }

  printf("The binary of given decimal is %d",binary);
  */

 //  Problem 1 --> Sorting an array :  in the ascending order 
/*
 int arr[] = {5,5,8,4,2,3,1,4,7};
 int length = 9;


 for(int i=0;i<length-1;i++){
    for(int j=i+1;j<length;j++){

        if(arr[i]>arr[j]){ // Here if condition will be opposite to the
        // condition of ascending order then we will swap the values respectively : 
            int temp;
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        

        }

    }
 }

 // Printing the array : 

 for(int i=0;i<length;i++){
    printf("%d ",arr[i]);
 }
 */

 // To sort an array of strings, we will use strcmp() 
 //function in the if condition else most of the thing 
 //will remain same. 
 
 /* Problem 2 : You will take a string and an integer from the user Suppose welcometojava and 3 , now you have to make all  possible
 substrings of size 3 and return the print the largest and the smallest substring of the string when compared lexicographically.*/

 char str[30];
 printf("Enter the string : \n");
 gets(str);

 int length = strlen(str);
  char substr[length-2][3];
int k=0;

for(int i=0;i<length-2;i++){
    for(int j=i;j<i+3;j++){
        substr[i][k] = str[j];
        k++;
    }
}

// Now sort the 2D array of characters or should say array of strings : 

for(int i=0;i<length-3;i++){
    for(int j=i;j<length-2;j++){

        if(strcmp(substr[i],substr[j])>0){
        char temp[] = substr[i];
     //   substr[i] = substr[j];
     //   substr[j] = temp;
        }

    }
}


    
    return 0;
}