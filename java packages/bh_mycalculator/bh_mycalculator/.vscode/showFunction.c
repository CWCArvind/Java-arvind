#include<stdio.h>



struct employee{
int id;
float salary;
};

void show (struct employee emp){
    printf("id of first employee is : %d\n",emp.id);
    printf("salary of first employee is : %f",emp.salary);
}

int main(){

    struct employee e1;
    e1.id = 155;
    e1.salary = 39.6;
    show(e1);

    
    return 0;
}