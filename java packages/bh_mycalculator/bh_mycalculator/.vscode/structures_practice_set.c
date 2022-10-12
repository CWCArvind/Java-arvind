#include<stdio.h>

typedef struct Vector {
int x;
int y;
}vect;

struct Vector sumVector ( struct Vector v1,struct Vector v2,struct Vector sum){
sum.x = v1.x +v2.x ;
sum.y = v1.y + v2.y;
return sum;
}

int main(){
    // Problem 1 : representing a vector using structures;

    vect v1 = {2,6};
    vect v2 = {4,5};
    vect sum;

    printf("The vector v1 is (%d,%d) \n",v1.x,v1.y);
    sum = sumVector (v1,v2,sum);
    printf("the final vector is (%d,%d) ",sum.x,sum.y);

    // Problem 2 : 


    


    return 0;
}