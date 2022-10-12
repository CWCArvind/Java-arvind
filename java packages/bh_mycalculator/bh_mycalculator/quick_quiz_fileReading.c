#include<stdio.h>

int main(){
    FILE *ptr;
    ptr = fopen("myfile3.txt","r");
    if(ptr == NULL){
        printf("The file does not exist.");
    }
    else{
        int num;
        fscanf(ptr,"%d",&num);
        fclose(ptr);
        printf("The value stored in num is %d",num);
    }
    return 0;
}