#include<stdio.h>

int main(){
    int marks[5];
    printf("Enter the marks of five subjects : ");
    int marks1,marks2,marks3,marks4,marks5;
    scanf("%d\n%d\n%d\n%d\n%d",&marks[0],&marks[1],&marks[2],&marks[3],&marks[4]);
    printf("Every element of array is \n%d\n%d\n%d\n%d\n%d\n",marks[0],marks[1],marks[2],marks[3],marks[4]);
    return 0;
}