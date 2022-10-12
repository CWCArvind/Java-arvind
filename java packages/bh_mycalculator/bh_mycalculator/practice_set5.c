#include<stdio.h>
/*float avg(int a, int b,int c){
    return (a+b+c)/3.0;

}
*/
/*float fibonacci(int n ){
    if (n==1||n==2){
        return n-1;
    }
    return fibonacci(n-1)+fibonacci(n-2);
}*/
/*int sum (int n){
    if (n==1){
        return 1;
    }
    return n+sum(n-1);
}*/
int pattern (int n ){
    if(n<=0){
        return 0;
    }
    
    pattern(n-2);
    
    for (int i=1;i<=n;i++){
        printf("*");
    }
    printf("\n");
}

int main(){
    pattern(5);
  //  printf("%d",sum(10));
  /*  printf("%f",avg(6,8,9));
*/

//printf("%f",fibonacci(40));
//int a = 1;
//printf("\n%d\n%d\n%d\n",a,++a,a++);
    return 0;
}