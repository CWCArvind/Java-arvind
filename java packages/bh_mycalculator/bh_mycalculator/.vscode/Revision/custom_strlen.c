#include<stdio.h>

int custom_strlen(char *str){

    int i=0;
    while(*str!='\0'){
        i++;
        str++;
    }
    return i;

}

int main(){

    char greet[] = "Hi! My name is Arvind Sharma";
    int length = custom_strlen(greet);
    printf("The length of the string passed is %d",length);

    
    return 0;
}