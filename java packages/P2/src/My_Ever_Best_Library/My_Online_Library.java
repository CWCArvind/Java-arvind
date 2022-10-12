package My_Ever_Best_Library;

import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;


class Library {
    String BookName ;
    String IssuerName ;
    //String AuthorName ;
    String issueDate ;
    ArrayList<String> issueBookInfo = new ArrayList<>(); // contains information such as issued to , issued on ;

    int conform = 0;// 0 means not available and 1 means available and issued


    ArrayList<String> Books = new ArrayList<>();
    Scanner S = new Scanner(System.in);

    LocalDate myOwnDate = LocalDate.now();
    //LocalTime time = LocalTime.now();
    DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd LLL yyyy");
    DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("kk:mm:ss");

    String printDate = myOwnDate.format(dateFormatter);
   // String printTime = time.format(timeFormatter);


    public void addBooks (){
        System.out.print("Enter book name you want to add: ");
        BookName = S.nextLine();
        Books.add(BookName);
        System.out.println(BookName + " book successfully added.");
    }

    public void showAvailableBooks (){
        System.out.println("These are the available books we have -");
        for(String elements : Books){
                System.out.println("*" + elements);
        }

    }


    public void issueBooks (){
        System.out.print("Enter your name: ");
        IssuerName = S.nextLine();

        System.out.print("Enter book name you want to issue: ");
        BookName = S.nextLine();

        for(String elements : Books){
            if(elements.equalsIgnoreCase(BookName)){
                Books.remove(BookName);
                conform = 1;
                System.out.println(BookName+" book has been successfully issued. ");
                issueBookInfo.add(IssuerName+" issued " + BookName + " on " + printDate );
                break;
            }
        }
        if(conform == 1){
            conform = 0;
        }
        else {
            System.out.println("Sorry! "+BookName + " book is not available in the library");
        }

    }

    public void returnBooks (){
        System.out.print("Enter the book name you want to return: ");
        BookName = S.nextLine();
        System.out.print("Enter your name: ");
        IssuerName = S.nextLine();
        System.out.println("Enter the date you issued this book(in the format 07 Aug 2005): ");
        issueDate = S.nextLine();

        for(String elements : issueBookInfo){
            if(elements.equalsIgnoreCase(IssuerName+" issued " + BookName + " on "+ issueDate)){
                Books.add(BookName);
                conform = 1;
                issueBookInfo.remove(IssuerName+" issued " + BookName + " on "+ issueDate);
                System.out.println(BookName + " book successfully returned by " + IssuerName);
                break;
            }
        }
        if(conform == 1){
            conform = 0;
        }
        else{
            System.out.println("You had not issued this book on these particulars");
        }

    }
}

/**
 * @author Arvind Sharma (Black Rider)
 * @version 2.0
 * @since 2022
 * @see <a href="https://docs.oracle.com/en/java/javase/14/docs/api/index.html></a>Java Docs
 */

public class My_Online_Library {

    public static void main(String[] args) {

        Library library = new Library();
        library.addBooks();
        library.addBooks();
        library.addBooks();
//        library.addBooks();
//        library.addBooks();
//        library.addBooks();
//        library.addBooks();
//        library.addBooks();
//        library.addBooks();
//        library.addBooks();
//        library.addBooks();
//        library.addBooks();
//        library.addBooks();
//        library.addBooks();
//        library.addBooks();

        library.showAvailableBooks();

        library.issueBooks();
        library.issueBooks();

        library.showAvailableBooks();

        library.returnBooks();
        library.returnBooks();


        /*

        Create a library management system which is capable of issuing book to the students
        * book should have info like -
                                    Book name
                                    Author name
                                    Issued to
                                    Issued on
        * User should be able to add books and should be able to return books and issue books.
        * Assume that all the users are registered at the central database.

         */

    }
}
