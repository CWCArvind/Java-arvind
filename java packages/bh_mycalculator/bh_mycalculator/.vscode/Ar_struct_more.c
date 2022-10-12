#include<stdio.h>

struct employee {
    int id;
    float salary;
    char name[22];

};

int main(){
/*
    struct employee e1 = {155,32.8,"Arvind"};
    printf("id is: %d\n ",e1.id);
      printf("name is : %s \n",e1.name);
     printf("salary is : %f \n",e1.salary);
     */

    struct employee e1;
    struct employee *ptr;
    ptr = &e1;
    ptr->id = 155;
    printf("id is %d\n",(*ptr).id);
    

    
    return 0;
}