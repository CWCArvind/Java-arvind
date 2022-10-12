package onlineLibrary;

import java.util.Scanner;

class Library {
    Scanner S = new Scanner(System.in);
    String [] AvailableBooks = new String[5];
    String [] IssuedBooks = new String[5];

    int noOfBooks = 0;


    public void addBooks (){
        System.out.println("Enter book name you want to add");
        String bookName = S.nextLine();
        AvailableBooks[noOfBooks] = bookName;
        noOfBooks += 1;
        System.out.println(bookName+" book successfully added.");

    }
    public void showAvailableBooks (){
        System.out.println("These are the available books we have : ");
        for (String Books : AvailableBooks){
            if(Books == null ){
                continue;
            }
            System.out.println("*"+Books);
        }

    }
    public void issueBook (){
        System.out.println("Enter book name you want to issue");
        String bookYouWant = S.nextLine();
        int a = 10;
        for(int i =0;i<AvailableBooks.length;i++){
            if(AvailableBooks[i].equalsIgnoreCase(bookYouWant)){
                System.out.println(bookYouWant+" book has been successfully issued. ");
                AvailableBooks[i] = null;
                a =i;
                break;

            }
        }
        if(a==10){
            System.out.println(bookYouWant+"book is not available in our library.");
        }

    }
    public void returnBook (){
        System.out.println("Enter book name you want to return");
        String BookYouReturn = S.nextLine();
        for(int i =0;i<AvailableBooks.length;i++){
            if(AvailableBooks[i] == null){
                AvailableBooks[i] = BookYouReturn;
                break;
            }
        }

    }

}


public class comebackAgain {
    public static void main(String[] args) {

        Library Books = new Library();
        Books.addBooks();
        Books.addBooks();
        Books.addBooks();
        Books.addBooks();

        Books.showAvailableBooks();

        Books.issueBook();

        Books.showAvailableBooks();

        Books.returnBook();

        Books .showAvailableBooks();


    }
}
