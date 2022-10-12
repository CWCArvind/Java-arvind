#include<stdio.h>
#include<string.h>

 void slice(char *st,int m,int n){

int j =0;
for(int i =m;i<n;i++){
    st[j] = st[i];
    j++;
}
st[j] = '\0';
    
}

int main(){
    printf("Hi");
    char str[] = "I am the king";
    printf("%s",str);
    slice(str,2,6);
    printf("This is the sliced string %s",str);


    return 0;
    
    
}