#include <stdio.h>
int main()
{
    printf("Calculating area of a rectangle :\n");

    int length, breadth;
    printf("Enter the length of rectangle: ");
    scanf("%d", &length);
    printf("Enter the breadth of rectangle: ");
    scanf("%d", &breadth);
    printf("The area of the rectangle is %d", length * breadth);

    printf("\nFinding area of a circle and with the little modification the volume of the cylinder :");

    float radius, height;
    printf("\nEnter the radius : ");
    scanf("%f", &radius);
    printf("The area of the circle is : %f", 3.14 * radius * radius);
    printf("\nEnter the height : ");
    scanf("%f", &height);
    printf("The volume of the cylinder constructed on the same circle is : %f", 3.14 * radius * radius * height);

    printf("\n Converting celsius to farenheit");

    float celsius, farenheit;
    printf("\nEnter the temperature in celsius : ");
    scanf("%f", &celsius);
    farenheit = 9 / 5.0 * celsius + 32;
    printf("The temperature in farenheit is : %f", farenheit);

    printf(" \nCalculating simple interest : ");

    int amount, rate, time;
    float finalAmount,interestAmount;
    printf("\nEnter the amount : ");
    scanf("%d", &amount);
    printf("Enter time for which amount is given : ");
    scanf("%d", &time);
    printf("Enter rate at which money is landed over : ");
    scanf("%d", &rate);
    interestAmount = (amount * rate * time) / 100;
    finalAmount = amount + interestAmount;
    printf("The total amount after one year is : %f", finalAmount);

    return 0;
    
}