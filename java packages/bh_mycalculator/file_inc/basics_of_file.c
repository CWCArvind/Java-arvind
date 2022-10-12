#include<stdio.h>

int main(){
    //file pointer is a tool to interact between the c program and the file
    FILE *ptr;

    //Writing a file : 

    /*ptr = fopen("myFile.txt","w");
    // text file and binary file;
    fprintf(ptr,"This is a file generated, edited using a c program");
    */

   //Reading a file :
/*
   ptr = fopen("myFile.txt","r");
   if(ptr==NULL){
    printf("Sorry!,This file does not exist.");
   }
   else{
   char arr[100];
   fscanf(ptr,"%s",arr);
   fclose(ptr);
   printf("%s",arr);
   }
   */

  // using fgetc and fputc : 

// Reading using fgetc : 

  ptr = fopen("myFile.txt","r");
  char c;
  c = fgetc(ptr);
  printf("The first character in the file is : %c\n",c);
  c = fgetc(ptr);
  printf("The second character in the file is : %c",c);
  fclose(ptr);

// Writing using fputc : 

/*  ptr = fopen("myFile.txt","w");
  fputc('A',ptr);
  */

 // Reading the whole file using fgetc : 
/*
 ptr = fopen("myFile.txt","r");
 char c;
 c = fgetc(ptr);
 while(c!=EOF){
    printf("%c",c);
    c = fgetc(ptr);
 }
 */




    return 0;
}