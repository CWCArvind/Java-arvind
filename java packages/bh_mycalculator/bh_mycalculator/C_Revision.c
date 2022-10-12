#include <stdio.h>

int main()
{
    // Let's revise the whole c : in just one hour :

    // Leap year or not
   /* int year;
    printf("Enter the year : ");
    scanf("%d", &year);
    if ((year % 100 == 0 && year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))
    {
        printf("Entered year is a leap year.");
    }
    else
    {
        printf("Entered year is not a leap year.");
    }
    */

    // Find the greatest of the three numbers entered by the user :
 /*   int a, b, c;
    printf("Enter the value of a,b,c ");
    scanf("\n%d\n%d\n%d", &a, &b, &c);
    if (a >= b)
    {

        if (a >= c)
        {
            printf("%d is the greatest of the three numbers", a);
        }
        else
        {
            printf("%d is the greatest of the three numbers", c);
        }
    }
    else
    {

        if (b >= c)
        {
            printf("%d is the greatest of the three numbers", b);
        }
        else
        {
            printf("%d is the greatest of the three numbers", c);
        }
    }
    */

   // 65-90 --> Upper case ;97-122 -->lower case
/*
   char character ;
   printf("Enter the character : \n");
   scanf("%c",&character);
   int asciiCode = (int)character;

   if(asciiCode <= 90){
    printf("The character is in upper case");
   }
   else{
    printf("The character is in lower case");
   }
   */

   // Checking a number whether it is prime or not :

   int n;
   int check = 0;
   printf("Enter the number : \n");
   scanf("%d",&n);
   for(int i=2;i<n;i++){
    if(n%i==0){
        check = 1;
        break;
    }
    else{
        check = 0;
    }
   }

   if(check == 0){
    printf("Yes , it's a prime number");
   }
   else{
    printf("Not a prime number");
   }



    return 0;
}