#include<stdio.h>

struct employee {
    int id;
    float salary;
    char name[30];


};

int main(){

   struct employee e1 ;
   struct employee e2;
   struct employee e3;
   char myName[20];
      
   printf("Enter your id:\n");
   scanf("%d",&e1.id);
   printf("Enter your salary : \n");
   scanf("%d",&e1.salary);
   printf("Enter your name : \n");
   fflush(stdin);
   gets(e1.name);

   printf("Enter your id:\n");
   scanf("%d",&e2.id);
   printf("Enter your salary : \n");
   scanf("%d",&e2.salary);
   printf("Enter your name : ");
   fflush(stdin);
   gets(e2.name);

   printf("Enter your id:\n");
   scanf("%d",&e3.id);
   printf("Enter your salary : \n");
   scanf("%d",&e3.salary);
   printf("Enter your name : ");
   fflush(stdin);
   gets(e3.name);

   
 


    return 0;
}