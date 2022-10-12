#include <stdio.h>

int main()
{
    /*  int a;
      printf("Enter the number");
      scanf("%d",&a);
      if(a%97==0){
          printf("No is divisible by 97");
      }
      else{
          printf("No is not divisible by 97");
      }

      if(5){
          printf("\nit's true");
      }
      */
    int a = 2;
    int b;
    a < 3 ? printf("a is less than three") : printf("a is greater than three");
    switch (a)
    {
    case 2:{
        b = 2;
    }
        break;
    default:
    {
     b = 3;
    }
        break;
    }
    printf("\n%d",b);
    return 0;
}