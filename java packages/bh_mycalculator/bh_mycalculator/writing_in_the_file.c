#include<stdio.h>

int main(){
    FILE *fptr;
    int number = 34;
    fptr = fopen("generatefile.txt","w");
    fprintf(fptr,"The value of number is %d",number);
    fclose(fptr);
    return 0;
}