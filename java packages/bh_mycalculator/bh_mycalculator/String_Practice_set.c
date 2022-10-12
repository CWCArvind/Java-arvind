#include<stdio.h>
#include<string.h>
/*
int lengthOfString (char arr[]){
    int z =0;
for(int i=0;i<strlen(arr);i++){
    if(arr[i] == ' '){
        continue;
    }
    z++;
}
return z;
}
*/

int main(){
/*
    char name[20];
    gets(name);
    puts(name);
//    printf("\nYour name is %s",name);
    
    */

   // Problem 2 : 

 char user1[10];
   int z = 0;
   char alphabet;
   printf("Enter your name: ");
    scanf("%c",&alphabet);
   
   while(alphabet!='\n'){
    user1[z] = alphabet;
    z++;
    scanf("%c",&alphabet);
   }
   user1[z] = '\0';

   fflush(stdin);

   char user2[10];
   printf("Enter your name : ");
   scanf("%s",user2);

   int val = strcmp(user1,user2);
   printf("The value of comparison is %d",val);
   /*
   int check = strcmp("dog","d");
   printf("The value of comp is %d",check);
   */
  

  //Problem 3 : 
/*
  char array1[] = "My name is Hello World";

  int length = lengthOfString(array1);
  printf("The actual length of the string is %d\n",strlen(array1));
  printf("The length of the string is %d",length);

*/
   
return 0;
}