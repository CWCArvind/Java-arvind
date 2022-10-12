#include<stdio.h>
#include<stdlib.h>

int factorial (int n){
     if(n==1){
        return 1;
     }
     return n*factorial(n-1);
}


int main(){

    int *ptr;
    int query;
    int n;
    printf("Enter the total no of things to arrange : \n");

    scanf("%d",&n);

    printf("Enter the no sub of queries : \n");
    scanf("%d",&query);
    ptr = (int *) malloc(query * 4);
    
    
    for(int i=0;i<query;i++){
        printf("Enter the sub queries : \n");
        scanf("%d",&ptr[i]);
    }

     int sum =0;
    for(int i=0;i<query;i++){
        sum += ptr[i];
    }
    

    if(sum > n){
        printf("Conditions are not possible.");
    }
    else{
        
    int fact = factorial(n);
   for(int i=0;i<query;i++){
        fact = fact / factorial(ptr[i]);
    }
    
    free(ptr);

    printf("The total no of arrangements for entered conditions is %d",fact);
    }

    return 0;

}
    

 //   float b=factorial1(n1);
 //  float c= factorial2(n2);
    