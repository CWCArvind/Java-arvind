#include<stdio.h>

void showTables(int *ptr,int m,int n){
for(int i=0;i<m;i++){
    int a;
    printf("Enter the number of which table you want : \n");
    scanf("%d",&a);
    
    for(int j=0;j<n;j++){
        printf("%d x %d = %d\n",a,j+1,*ptr);
        ptr++;
    }
    printf("**********************************************\n\n");
}
}

void tables (int *table,int n,int m){

for(int i=0;i<n;i++){
    int a;
    printf("Enter the number of which table you want : \n");
    scanf("%d",&a);

    for(int j=0;j<m;j++){
        *table = a*(j+1);
        table++;
    }
}
}

int main(){



   // Problem 7 :

   int mult_Tables[3][10];
   tables(&mult_Tables[0][0],3,10);
   showTables(&mult_Tables[0][0],3,10);

   


    
    return 0;
}