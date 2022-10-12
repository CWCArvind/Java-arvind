#include <stdio.h>
#include <math.h>

int main()
{

    // If character is in uppercase or not:
    /*  char character ;
      printf("Enter the character ");
      scanf("%c",&character);
      */

    // Greatest of the four numbers:

    int check1, check2;
    int a, b, c, d;
    printf("Enter the numbers");
    scanf("%d%d%d%d", &a, &b, &c, &d);
    int Max = (a,b,c,d);
    printf("%d",Max);

   /* printf("Enter the numbers");
    scanf("%d%d%d%d", &a, &b, &c, &d);

    if (a >= b)
    {
        check1 = a;
    }
    else
    {
        check1 = b;
    }

    if (c >= d)
    {
        check2 = c;
    }
    else
    {
        check2 = d;
    }
    if (check1 >= check2)
    {
        printf("%d", check1);
    }
    else
    {
        printf("%d", check2);
    }
    */

    return 0;
}