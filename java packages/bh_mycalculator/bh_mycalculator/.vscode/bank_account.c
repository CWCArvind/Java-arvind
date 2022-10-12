#include<stdio.h>

typedef struct BankAccount {
    long accountNumber;
    char *name;
    long amount;
    int year_of_account_open;
}Account;

void debit(Account *A1,long decreaseBy){
A1->amount -= decreaseBy;
} 
void credit(Account *A1,long increaseBy){
A1->amount += increaseBy;
}
void openAccount (Account *A1,char *userName,long userAmount,int year,long Acc_Number){
    A1->name = userName;
    A1->amount = userAmount;
    A1->accountNumber = Acc_Number;
    A1->year_of_account_open = year;
}
void showAccountDetails(Account Acc){
    printf("Account holder's name : %s\n",Acc.name);
    printf("Account Number : %d\n",Acc.accountNumber);
    printf("Year of opening account : %d\n",Acc.year_of_account_open);
    printf("Total Amount : %d\n",Acc.amount);
}


int main(){

    Account A1;
    Account *A1_ptr = &A1;

    char user_name[20];
    printf("Enter user name : \n");
    fflush(stdin);
    scanf("%s",user_name);
    

    openAccount(A1_ptr,user_name,500,2022,221985707);
    showAccountDetails(A1);
    debit(A1_ptr,200);
    credit(A1_ptr,100);
    showAccountDetails(A1);

    
    return 0;
}