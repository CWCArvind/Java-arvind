#include<stdio.h>

int main(){
// Reading a file using pointer.
FILE *ptr ;
int num;
int num2;
ptr = fopen("myfile.txt","r");

fscanf(ptr,"%d",&num);
fscanf(ptr,"%d",&num2);
fclose(ptr);
printf("The value of num is %d\n",num);

printf("The value of num is %d",num2);



    return 0;
}