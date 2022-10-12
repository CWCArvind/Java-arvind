#include <stdio.h>
#include <string.h>

/*
int customstrlen(char array[])
{
    int length = 0;

    int i = 0;

    while (array[i] != '\0')
    {
        
        if(array[i]==' '){
           i++;
        }
        else{
        length++;
        i++;
        }
    }
    return length;
}*/


/*
 void slice(char array[],int m ,int n){
    char *ptr=&array[m];
    int j=0;
    for(int i=m;i<n;i++){
        array[j]=*ptr;
        ptr++;
        j++;

    }
    array[j] ='\0';
 }
*/
/*

void custom_strcpy(char array[],char array2[]){
    int i=0;
    
    while(array[i]!='\0'){
        array2[i]=array[i];
        i++;
        
    }
    array2[i]='\0';
}*/



int main()
{



    
   /*
   
    char str[]="bhuvnesh sharma ia a legend";
    char str2[40];
custom_strcpy(str,str2);
printf("%s",str2);
*/



    /*
    char str[]="bhuvnesh sharma";
    char*ptr=str;
    slice(str,2,6);
    printf("%s",str);

*/




    /*char st[] = "this is a good boy";
    int a = strlen(st);
    printf("%d\n", a);
    int d = customstrlen(st);
    printf("%d", d);*/

    /*
    char st[10];
    char chart;
    int i=0;
    scanf("%c",&chart);
    while(chart!='\n'){

       st[i] = chart;
       scanf("%c",&chart);
        i++;

    }

    st[i] = '\0';

    fflush(stdin);


    char st1[10];
    scanf("%s",st1);

   int check= strcmp(st,st1);
    if(check==0){
        printf("the entered string are equal.");

    }
    else{
        printf("entered values are not equal");
    }
    printf("%d",check);

    */

    return 0;
}