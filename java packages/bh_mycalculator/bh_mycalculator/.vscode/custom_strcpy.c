#include<stdio.h>
void encrypt (char *str){
while(*str!='\0'){
*str = (char)(*str + 1);
str++;
}
}
/*
void custom_strcpy(char *target,char *source){
    int i =0;
    while(*source!='\0'){
        *target = *source;
        source++;
        target++;
    }
  *target = '\0';
    
    
}
*/

int main(){
 //   char target[20];
  char source[] = "ArvindSharma";
  encrypt(source);
  printf("%s",source);

  

    /*custom_strcpy(target,source);
    printf("%s",target);
    */




    return 0;
}