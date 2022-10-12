//class Library {
//    String [] availableBooks;
//    String [] issuedBooks;
//
//    void addBook (int  bookNumber,String BookName){
//        availableBooks [bookNumber] = BookName;
//        System.out.println( BookName +" book has been added with book number "+bookNumber);
//    }
//    void issueBook (int availableBookNumber, int issueBookNumber){
//        issuedBooks[issueBookNumber] = availableBooks [availableBookNumber];
//        availableBooks [availableBookNumber] = "Book Has Been Issued";
//        System.out.println(issuedBooks[issueBookNumber]+" book has been issued");
//    }
//    void returnBook (int issueBookNumber , int addBookNumber){
//        availableBooks [addBookNumber] = issuedBooks[issueBookNumber];
//        System.out.println(availableBooks[addBookNumber]+" book has been returned with book number "+ addBookNumber );
//    }
//    void showAvailableBooks (){
//        System.out.println("These are the books we have - ");
//        for (String Books : availableBooks){
//            System.out.println(Books);
//        }
//    }
//}
//
//public class Online_Library {
//    public static void main(String[] args) {
//        Library Books = new Library();
//        Books.availableBooks = new String[5];
//        Books.issuedBooks = new String[5];
//        Books.addBook(0,"How to win friends");
//        Books.addBook(1,"Sapiens");
//        Books.addBook(2,"Ikigayi");
//
//        Books.showAvailableBooks();
//        Books.issueBook(0,0);
//        Books.showAvailableBooks();
//        Books.returnBook(0,0);
//    }
//}
