#include<stdio.h>

void slice(char *str,int n,int m){
    int j =0;
for(int i=n;i<m;i++){
    str[j] = str[i];
    j++;
}
str[j] = '\0';
}

int main(){

    char name[] = "Hi! I am Arvind Sharma";
    slice(name,2,6);
    printf("%s",name);

    
    return 0;
}