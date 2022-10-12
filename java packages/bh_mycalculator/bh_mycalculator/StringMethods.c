#include<stdio.h>
#include<string.h>

int main(){
  /*  char *Str = "Arvind Sharma";
    int length = strlen(Str);
    printf("The length of the string is %d",length);

    char target[50];
    strcpy(target,Str);
    printf("%s",target);
    */

   // Concatenating the two strings : 

   char S1[40] = "Arvind";
   char S2[20] = "Arvind";

/*
   strcat(S1,S2);
   printf("The final string is %s",S1);
   */

  int val = strcmp(S1,S2);
  printf("Now the val is %d",val);



    
    return 0;
}