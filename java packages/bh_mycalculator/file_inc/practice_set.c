#include <stdio.h>

int main()
{

    // Problem 1 :

    /*
    FILE *ptr;
     ptr = fopen("myFile.txt","r");
       int a;
       fscanf(ptr,"%d%d%d",&a,&b,&c);
       fclose(ptr);
       printf("The value of integer a is %d,%d,%d",a,b,c);
       */

    // Problem 2 :

    /*  FILE *ptr;
      ptr = fopen("mult_tables.txt","w");
      int a = 2;
      fprintf(ptr,"The multiplication table of %d is : \n\n",a);
      for(int i=1;i<=10;i++){
       fprintf(ptr,"%d x %d = %d\n",a,i,a*i);
      }
      fprintf(ptr,"\n**********************XX**********************");
      fclose(ptr);
      */

    // Problem 3 :
    /*
      FILE *ptr;
      FILE *cptr;
      ptr = fopen("myTextFile.txt","r");
      cptr = fopen("Copiedfile.txt","w");
      */

    /*
    // part1 : Reading whole file

    char c = fgetc(ptr);
     while(c!=EOF){
        printf("%c",c);
        c = fgetc(ptr);
      }
      */
    /*

    // Part 2 : Writing whole file in another file two times

      for(int i=0;i<2;i++){
        char c = fgetc(ptr);
      while(c!=EOF){

        fputc(c,cptr);
        c = fgetc(ptr);
      }
      fprintf(cptr,"\n");
      fclose(ptr);
      ptr = fopen("myTextFile.txt","r");
      }
      */

    // Problem 4 : That's a nice problem 

    /*

       FILE *ptr;
    ptr = fopen("userInfo.txt", "w");

    char name1[30];
    char name2[30];
    int salary1;
    int salary2;

    printf("Enter the name of user1 : \n");
    gets(name1);
    printf("Enter the name of user2 : \n");
    gets(name2);
    printf("Enter the salary of user1 : \n");
    scanf("%d", &salary1);
    printf("Enter the salary of user2 : \n");
    scanf("%d", &salary2);


    fflush(stdin);

 

    int i = 0;
    char c1 = name1[i];

    while (c1 != '\0')
    {
        
        fputc(c1, ptr);
        i++;
        c1 = name1[i];

        
    }
    fprintf(ptr, " , %d\n", salary1);

    int j = 0;
    char c2 = name2[j];
    while (c2 != '\0')
    {
        fputc(c2, ptr);
        j++;
        c2 = name2[j];
        
        
    }
    fprintf(ptr, " , %d\n", salary2);

    fclose(ptr);
    */

   // Problem 5 : 

   FILE *ptr;

   ptr = fopen("lastFile.txt","r");
   int num;
   fscanf(ptr,"%d",&num);
   num *= 2;
   fclose(ptr);

   ptr = fopen("lastFile.txt","w");
   fprintf(ptr,"%d",num);
   fclose(ptr);

    return 0;
}