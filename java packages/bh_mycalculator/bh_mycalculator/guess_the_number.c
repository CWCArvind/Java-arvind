#include<stdio.h>
#include<stdlib.h>
#include<time.h>

int main(){
// Generation of random number : 
    int number;
    srand(time(0));
    number = rand()%100 + 1;
    int score = 1;
    int userInput;
while(number){
    
    printf("Enter your guessed number : \n");
    scanf("%d",&userInput);

    if(userInput==number){
        printf("You guessed it right in %d guess\n",score);
        break;
    }
    else if(userInput>number){
        printf("You guessed more than the number\n");
        score++;
    }
    else{
        printf("You guessed less than the number\n");
        score++;
    }
}




    
    return 0;                                      
}