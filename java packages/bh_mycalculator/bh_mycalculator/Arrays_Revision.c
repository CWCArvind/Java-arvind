#include<stdio.h>
/*
int factorial(int n){
    if(n==1){
    return 1;
    }
    return n*factorial(n-1);
}*/
/*
float average (float a, float b,float c){
    return (a+b+c)/3.0;

}
*/

/*
float function(float n){
    float f;
    float c=n;
    return f=(9.0/5.0)*c+32.0;
}*/
/*
int  sumo(int n){
    if(n==1){
        return 1;
    }
    return n+sumo(n-1);


}*/


// pattern for increasing ladder.
/*void pattern (int n ){ 
    
if(n==0){
    return 1;
}
   pattern(n-1);
    for (int i =0;i<n;i++){
        printf("%c",'*');
    }
    printf("\n");
}
*/

//pattern of 7
/*void pattern (int n){
if(n==0||n==-1){
    return 1;
}
    pattern (n-2);
    for (int i=0;i<n;i++){
        printf("%c",'*');

    }
    printf("\n");
}*/
// problem 2 of pointer
/*
void variablefun(int i){
    int *ptr=&i;
    printf(" value address %d/n",ptr);


}*/
// problem no 3
/*
void change_value(int *ptr){
    int b = *ptr;
    b=10*b;
    printf("%d",b);
}*/



   // problem 4 
   /*
void sum_average (int *ptr1 ,int *ptr2){
    int sum =*ptr1+*ptr2;
    printf("%d\n",sum);
    int average =(*ptr1+*ptr2)/2;
    printf("%d\n",average);
}*/




int main(){
    




//problem no 3

/*
int array[12];
//int *ptr =array;
for (int i=1;i<=10;i++){
    array[i]=5*i ;
    printf("%d,",array[i]);
}*/



// problem no 1 of practice set 7
/*
int array []={5,6,9,8,7,6,9,4,6,85};
int *ptr;
ptr=array;
printf("%d\n",*ptr);
ptr=ptr+2;
printf("%d\n",*ptr);*/




    /*
int var=56;
int *ptr1=&var;
int **ptr2=&ptr1;
printf(" value of varible using pointer to pointer %d",*(*ptr2));
*/


    /*
    int a=9;
    int b=6;
    sum_average(&a,&b);*/

  /*  
int a=7;
change_value(&a);*/



   /* int i =8;
    int *ptr=&i;
    printf(" your address is %u\n and your value is%d\n",&i,*ptr);
variablefun(9);*/



/*

int a =5;
int *ptr=&a;
printf("%u\n",ptr);
printf("%d",*ptr);*/
    
//pattern(5);
   //pattern(5);

//printf("%d",sumo(10));
/*int a=9;
printf("%d%d%d\n",a,++a,a++);*/




//printf("%f",function(37.0));
//printf("%f",average(3,5,5));





 /*   
int a;
int i=1;
int b=0;
printf("enter the number\n");
scanf("%d",&a);
while(i<=a){
    i++;
   if( a%i==0){
    
    b++;
   }


}if(b>2){
    printf("number entered is not prime no");
}else{
    printf("no entered is prime no");
}*/


/*int a;
int b=0;
printf("enter the no\n");
scanf("%d",&a);
for(int i=1;i<=a;i++){
   if (a%i==0){
    b++;
   }

}if(b>2){
    printf("no is not prime no ");
}else{
    printf("no is prime no ");
}*/






//printf("%d\n",factorial(5));



 /*   
int sum =0;
for (int i=1;i<=10;i++){
    int mul = 8*i;
    
    printf("%d\n",mul);
sum +=mul;
}
printf("%d",sum);
*/

/*int i=1;
int sum=0;
do{
    sum+=i;
    i++;
}
while (i<=10);
    

printf("%d",sum);

*/


   /* int a;
   scanf("%d",&a);
   for(int i=1;i<=10;i++){
    printf("%d x %i =%d\n",a,i,a*i) ;
   }*/

  /*  int a,b,c;
    printf("enter the number");
  scanf("%d%d%d",&a,&b,&c);
  int ave= (a+b+c)/3;
  if(a,b,c>=33&&ave>=40){
    printf("student is pass");
  }else{
    printf("student is fail");
  }

*/

    return 0;
}