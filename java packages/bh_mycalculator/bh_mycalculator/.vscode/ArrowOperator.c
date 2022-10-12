#include<stdio.h>
typedef struct employee{
    char *name;
}emp;



int main(){

    emp e1;
    emp *ptr;
    ptr = &e1;

    (*ptr).name = "Arvind Sharma";
    ptr->name = "Arvind Sharma";

    
    return 0;
}