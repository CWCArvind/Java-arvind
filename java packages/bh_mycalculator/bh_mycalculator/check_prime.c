#include<stdio.h>
#include<conio.h>
#include<stdlib.h>

int main(){

 /*   int a;
    printf("Enter the number ");
    scanf("%d",&a);
    for(int i = 1;i<=10;i++){
        printf("\n%d X %d = %d",a,i,a*i);
    }
    */
 /*  int i = 10;
   int sum = 0;
   while(i>0){
    sum += 8*i;
    i--;
   }
   printf("%d",sum);
   */

  // Checking a number is prime or not
  int n;
  printf("Enter the number to check");
  scanf("%d",&n);
  int a = 0;
  for(int i = 2;i<n;i++){
  if(n%i==0){
    a = 5;
  }
  }
  if(a==5){
    printf("Not a prime number");
  }
  else{
    printf("given number is a Prime number");
  }
    return 0;
}