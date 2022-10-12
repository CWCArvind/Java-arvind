#include<stdio.h>

void printArray (int i[],int n){
for(int j=0;j<n;j++){
    printf("%d ",i[j]);
}
}

void printArrayUsingPointer (int *i,int n){

    for(int j=0;j<n;j++){
        printf("%d ",*i);
        i++;
    }

}

int main(){

    int marks[] = {48,78,76,89,54};
    printArray(marks,5);

    printf("\n");
    
    printArrayUsingPointer(&marks[0],5);
    
    return 0;
}