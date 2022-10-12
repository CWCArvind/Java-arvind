#include<stdio.h>

int pattern (int n){

    if(n==0){
        return 0;
    }

    pattern(n-1);

    for(int i = 1;i<2*n;i++){
        printf("*");
    }

    printf("\n");
}

int main(){

    pattern(3);
    
    return 0;
}