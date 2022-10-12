#include<stdio.h>

float  factorial (int n){
     if(n==1){
        return 1;
     }
     return n*factorial(n-1);
}
float factorial1(int n1){
    if(n1==1){
        return 1;
    }
    return n1*factorial1(n1-1);
}
float factorial2 (int n2){
    if(n2==1){
        return 1;
    }
    return n2*factorial2(n2-1);

}

int main(){
    int n;
    int n1;
    int n2;
/*    scanf("%d",&n);
     scanf("%d",&n1);
      scanf("%d",&n2);
      */
    float a=factorial(5);
    float b=factorial(2);
    float c= factorial2(2);
    

 //   float b=factorial1(n1);
 //  float c= factorial2(n2);
    printf(" the arrangement of n elements in which n1 , n2 are of same type is %f ",(a)/(b*c));






    return 0;
}