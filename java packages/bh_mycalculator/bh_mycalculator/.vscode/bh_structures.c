#include<stdio.h>
#include<string.h>
/*
typedef struct employee {
    int id;
    char name[20];
}employee;*/


/*
void show ( employee emp){
    printf("The id of the employee e1 is %d\n",emp.id);
    printf("The name of the employee is %s",emp.name);
}*/

struct vector{
    int a;
    int b;
    char c;


};

  struct vector sumvector (struct vector v1,struct vector v2){
    struct vector v3;
     v3.a =v1.a+v2.a;
     v3.b =v1.b+v2.b;
    // printf("the vector after added the like dimensions(%d,%d)",x,y);
    return v3;
}





int main(){





    


    // problem no 4
/*
    struct vector e1;
    struct vector *ptr;
    ptr =&e1;
    ptr->a=89;
    printf("the value of pointer is %d",(*ptr).a);

*/



    
    struct vector v1,v2;
    v1.a=7;
    v1.b=8;
    printf("the first vector is(%d,%d)",v1.a,v2.b);
    v2.a=5;
    v2.b=1;
    printf("the second vector is (%d,%d)\n",v2.a,v2.b);


    struct vector l=sumvector(v1,v2);
    printf("(%d,%d)",l.a,l.b);
    
    






    /*
    struct vector v1;
    v1.a=8;
    v1.b=6;
    printf("the vector of two points is (%d,%d)",v1.a ,v1.b);
*/






/*
    struct employee e1[100];
    for(int i=0;i<100;i++){
        int id;
        char name[20];
        printf("Enter the id and name of the employeee : \n");
        scanf("%d\n%s",&id,name);
    e1[i].id = id;
    strcpy(e1[i].name,name);
    }
    */

   /* employee e1 = {155,"Bhuvnesh"};
   show(e1);
   */


    
    return 0;
}