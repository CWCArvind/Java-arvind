#include<stdio.h>

typedef struct Date {
int day;
int month;
int year;
}date;

void compareDates(date d1 , date d2){
    if(d1.year==d2.year&&d1.day==d2.day&&d1.month==d2.month){
        printf("Both dates are same");
    }
    else if(d1.year>d2.year||(d1.year==d2.year&&d1.month>d2.month)||(d1.year==d2.year&&d1.month==d2.month&&d1.day>d2.day)){
printf("d1 date is greater than d2 date");
    }
    else{
        printf("d1 date is less than d2 date");
    }
}

int main(){

    date d1 = {30,9,2022};
    date d2 = {30,9,2022};

    compareDates(d1,d2);
    
    return 0;
}