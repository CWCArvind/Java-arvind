#include <stdio.h>
/*
// Problem 6 :

void positiveIntegersInArray (int *ptr , int n){
    int j = 0;
for(int i = 0;i<n;i++){
    if(*ptr>0){
        j++;
    }
    ptr++;
}
printf("The number of positive numbers in the array given is : %d",j);
}
*/

/*
//Reversing array method :

void reverseTheArray(int array[],int n){

    for(int i=0;i<(n/2);i++){
        int temp ;
        temp = array[i];
        array[i] = array[n-i-1];
        array[n-i-1] = temp;
    }

}
*/

int main()
{

    // Problem 1 :
    /*   int marks[] = {78,59,86,97,69,69,58,47,58,56};
       int *ptr = &marks[0];
       ptr ++ ;
       ptr ++;
       int check = *ptr;
       printf("Element pointed by the pointer is %d",*ptr);
       */

    // Problem 2 :
    /*  int S[3] = {1,2,3};
      printf("The element is %d",*(S+3));
      */

    // Problem 3 :
    /*   int table[10];
       int number;
       printf("Enter the number of which table you want\n");
       scanf("%d", &number);
       for (int i = 0; i < 10; i++)
       {
           table[i] = number * (i + 1);
       }
       printf("Table of %d is : \n\n", number);
       for (int i = 0; i < 10; i++)
       {
           printf("%d X %d = %d\n", number, i + 1, table[i]);
       }
       */

    // Problem 5 : Reversing the array by passing in the method
    /*  int arr[5] = {2,8,4,7,6};
      printf("This is the actual array : \n");
      for(int i = 0;i<5;i++){
          printf("%d ",arr[i]);
      }
      reverseTheArray(arr,5);
      printf("\nThis is the array after reversing by the reverse array method : \n");
      for(int i = 0;i<5;i++){
          printf("%d ",arr[i]);
      }
      */

    // Problem 6 :
    /*
    int arr[5] = {2,8,4,-9,6};
    positiveIntegersInArray(arr,5);
    */

// Problem 7 and 8 : 
/*
    int tables[3][10];
    printf("Enter three numbers you want tables of \n");
    int table1, table2, table3;
    scanf("%d\n%d\n%d\n", &table1, &table2, &table3);
    int num;
    for (int i = 0; i < 3; i++)
    {
        if (i == 0)
        {
            num = table1;
        }
        else if (i == 1)
        {
            num = table2;
        }
        else
        {
            num = table3;
        }
        printf("Table of %d\n\n",num);
        for (int j = 0; j < 10; j++)
        {
            tables[i][j] = num * (j + 1);
            printf("%d X %d = %d\n",num,j+1,tables[i][j]);
        }
        }
        */

       // Problem 9 : 

       int threeDArray [2][3][2];
       for(int i = 0;i<2;i++){
        for(int j = 0;j<3;j++){
            for(int k = 0;k<2;k++){

                int integer;
                printf("Enter the integer : \n");
                scanf("%d",&integer);
                threeDArray[i][j][k] = integer;
                
            }
        }
       }

       for(int i = 0;i<2;i++){
        for(int j = 0;j<3;j++){
            for(int k = 0;k<4;k++){

                int * ptr_array = &threeDArray[i][j][k];
                printf("The address at threeDArray [%d][%d][%d] %u\n",i,j,k,ptr_array);
            



            }
        }
       }
       
         return 0;
    }



   
