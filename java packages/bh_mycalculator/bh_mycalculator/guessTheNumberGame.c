#include <stdio.h>
#include <stdlib.h>

void GoodMorning();
void GoodAfterNoon();
void GoodNight();
void change (int b){
    b = 10;
}

int main()
{
int b = 2;

   GoodAfterNoon();
   GoodMorning();
   GoodNight();
   change(b);
   Areasq(2);
   printf("%d",b);
    return 0;
}

void GoodMorning (){
    printf("\nGoodMorning");
}
void GoodAfterNoon (){
    printf("\nGood Afternoon");
}
void GoodNight (){
    printf("\nGood Night");
}