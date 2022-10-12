#include<stdio.h>

struct Vector{
int x;
int y;
};

struct Vector sumVector(struct Vector v1,struct Vector v2){
    struct Vector resultant;
    resultant.x = v1.x + v2.x;
    resultant.y = v1.y + v2.y;
}

int main(){
    // writing a function to do sum of two vectors using structures :

    struct Vector v1,v2,sum;
    v1.x = 4;
    v1.y = 5;

    v2.x = 4;
    v2.y = 5;

    sum = sumVector(v1,v2);

    printf("The resultant vector is %d,%d",sum.x,sum.y);
    
    return 0;
}