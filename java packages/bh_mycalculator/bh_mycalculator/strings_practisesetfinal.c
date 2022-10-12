#include<stdio.h>
#include <string.h>
// Problem 9 : 
/*
void present (char *ptr,char checkMe){
    int a = 0;
    while(*ptr!='\0'){
        if(*ptr == checkMe){
            a++;
            break;
        }
        ptr++;
    }
    if(a==0){
        printf("%c is not present in the given string",checkMe);

    }
    else{
        printf("%c is present in the given string",checkMe);
        
    }
}
*/



//Problem 8 : 
/*
void occurence (char * ptr,char charact){
    int count = 0;
    while(*ptr!='\0'){
        if(*ptr==charact){

            count++;

        }
        ptr++;
    }
    printf("The occurence of %c is %d",charact,count);
}
*/

//Problem 6 and 7 : 
/*
void encrypt (char *name_ptr){
    while(*name_ptr!='\0'){
        char a = (char)*name_ptr + 1;
        *name_ptr = a;
        name_ptr++;
    }
}

void decrypt (char *ptr){
    while(*ptr!='\0'){
        char a = (char)*ptr - 1;
        *ptr = a;
        ptr++;
    }
}
*/


//Problem 5 : 
/*

void custom_strcpy (char *target_ptr,char *source_ptr){
    while(*source_ptr!='\0'){
        *target_ptr = *source_ptr;
        source_ptr++;
        target_ptr++;
    }
}
*/

//Problem 4 : 
/*
void slice (char st[],int m, int n){
    char *ptr = &st[m];
    for(int i=m;i<n;i++){
        printf("%c",*ptr);
        ptr++;
    }
}
*/

// Problem 3 : 
/*
int length (char *ptr){
    int len = 0;
    while (*ptr != '\0'){
        
        len++;
        ptr++;
        
    }
    return len;
    
}
*/


// modifying strlen function.
/*
int  length_function(char arrray[]){

    int z=0;
    for (int i =0;i<strlen(arrray);i++){
        if(arrray[i]==' '){
            continue;
        }

        z++;
    }
    return z;

}*/



   







int main(){
    




    //modifying the strlen function.

    /*
    char array[]="hello this is the length of array";
   
    printf("actual length of array %d\n",strlen(array));
     length_function(array);
    printf("the new length of string is %d\n",length_function(array));

*/









// entering the inputs by using the two metod percent s and percent s.
    /*char array[30];
    char alphabet;
    int z=0;
    printf("enter the name\n");
    while (alphabet!='\n'){
        
     scanf("%c",&alphabet);
     array[z]=alphabet;
     z++; 

    }
    printf("%s",array);

    char user2[30];


        fflush(stdin);
        printf(" using the 2 method enter the name\n");
        scanf("%s",user2);
        printf("%s",user2);
    */
    



   // use of gets and puts function. 
   /* char array[20];
    gets(array);
    printf("your entered string is\n");
    puts(array);
    printf("%s",array);*/


    //Problem 3 : 
 /*   char str[] = "Hello Man";
    int value = length(&str[0]);
    printf("The length of the string is %d",value);
    
    */

   // Problem 4 : 
/*
   char st[] = "Harry";
   slice(st,0,4);
   */
   
   // Problem 5 : 
/*
   char user1[] = "Arvind";
   char user2[20];

   custom_strcpy(user2,user1);
   printf("%s",user2);
   */

// Problem 6 and 7 :
/*
  char name[] = "bhuvnesh";
  encrypt(name);
  printf("The encrypted string is %s\n",name);

  decrypt(name);
  printf("The decrypted string is %s",name);
  */

 // Problem 8 : 
/*
 char str[] = "Sharma";
 occurence(str,'a');
 */
// Problem 9 : 
/*
 char str[] = "Sharma";

present(str,'b');
*/

   

   return 0;
}