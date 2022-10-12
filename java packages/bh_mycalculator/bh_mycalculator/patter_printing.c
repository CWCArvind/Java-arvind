#include<stdio.h>


/*
int pattern(int n){// Here n is the no of lines of stars pattern


if(n==0){
return 0;
}
pattern(n-1);
for(int i=1;i<2*n;i++){
    printf("*");
}
printf("\n");

}
*/

int main(){

    int i = 5;
    int *j = &i;
    int **k = &j;
    printf("The value of i is %d",*(*k));

//    pattern(20);
    return 0;
}