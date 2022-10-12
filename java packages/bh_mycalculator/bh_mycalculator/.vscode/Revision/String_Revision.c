#include<stdio.h>
#include<string.h>

int main(){
    // Taking input from the user using %c : 
     
     char character;
     printf("Enter your name : \n");
     char name[20];
     int z =0;
     while(character!='\n'){
     scanf("%c",&character);
     name[z] = character;
     z++;
     }
     
     fflush(stdin);

      char sir_name[20];
      
      printf("Enter your sir name : \n");
      scanf("%s",sir_name);

      int check = strcmp(name,sir_name);
      printf("%d",check);
      if(check >0||check<0){
        printf("Not equal");
      }
      else{
        printf("Both strings are equal");
      }

    return 0;
}