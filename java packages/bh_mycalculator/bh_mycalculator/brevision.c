#include<stdio.h>

/*

void reversethearray(int array[],int n){
   
    for(int i=0;i<n/2;i++){
         int khali;
         khali=array[i];
         array[i]=array[n-i-1];
         array[n-i-1]=khali;

    }

}
*/
/*problem no 6
void count(int array[],int n){
    int countt=0;
    int *ptr=array;
    for(int i=0;i<n;i++){
        if(*ptr>0){
            countt++;
        }
        
        ptr++;
    }
    printf("the no of positive integers are :%d",countt);
}
*/



int main(){

// strings practice set .







    // using the pointer to print the two dimensional array.
/*
    int array[3][10];
    int *ptr=&array[0][0];
    int num1;
    int num2;
    int num3;
    printf("enter the no you want to get the table of\n");
    scanf("%d%d%d",&num1,&num2,&num3);
    for(int i=0;i<3;i++){
        int num=i;
        if(num==0){
            num=num1;

        }
        else if (num==1){
            num=num2;
        }
        else{
            num=num3;
        }
        for(int j=0;j<10;j++){
             array[i][j]=num*(j+1);
             

        }




    }
    printf("the array so formed is :");
    for(int i=0;i<3;i++){
    
        for(int j=0;j<10;j++){
            printf("%d\n",*ptr);
            ptr++;
        }
    }

*/






// two dimensional array for print the multilication table of numbers in array.

    /*

    int array[3][10];
    int num1;
    int num2;
    int num3;
    printf("enter the no you want to get the table of\n");
    scanf("%d%d%d",&num1,&num2,&num3);
    for(int i=0;i<3;i++){
        int num=i;
        if(num==0){
            num=num1;

        }
        else if (num==1){
            num=num2;
        }
        else{
            num=num3;
        }
        for(int j=0;j<10;j++){
             array[i][j]=num*(j+1);

        }




    }
    printf("the array so formed is :");
    for(int i=0;i<3;i++){
    
        for(int j=0;j<10;j++){
            printf("%d\n",array[i][j]);
        }
    }
*/


    /*problem no 6

    int num;
    printf("entr the no of integers you want to enter:\n");
    scanf(" %d",&num);

    int array[num];
    
    printf("enter the numbers\n");
    for(int i=0;i<10;i++){
        scanf("%d",&array[i]); 
    }
   
*/
   // count(array,num);






    /*
int array[]={5,6,9,8,7,4,2};
int *ptr=array;
reversethearray(array,7);
printf("the reverse array is :");

for(int i=0;i<7;i++){
       printf("%d\n",array[i])  ;
}*/





/*

int array[10];
int *ptr=array;

    printf("enter the value");
    int num;
    scanf("%d",&num);
    for(int i=0;i<10;i++){

        *ptr=num*(i+1);
        ptr++;

    }
    for(int i=0;i<10;i++){
       ptr--;
       printf("  %d\n",*ptr);
       
        
    }*/




    /*
    int array[10];
    printf("enter the values");
    for(int i=0;i<10;i++){
    
    scanf("%d",&array[i]);
    
    }
    int *ptr=array;
    ptr=ptr+2;
    printf("the value at the pointer is %d",*ptr);*/

    return 0;
}