#include<stdio.h>


typedef struct ComplexNumber {
    int x;
    int y;
}complex;

void display(complex complex_number){



    printf("Enter the dimension x : \n");
    scanf("%d",&complex_number.x);
    printf("Enter the dimension y : \n");
    scanf("%d",&complex_number.y);
    printf("The complex number in x and y is %d,%d",complex_number.x,complex_number.y);
}

int main(){

    complex cN[5];

    display(cN[0]);
    
    return 0;
}