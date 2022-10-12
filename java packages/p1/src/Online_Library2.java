class Library {
    String [] availableBooks;
    int noOfBooks = 0;

    void addBooks (String BookName) {
       availableBooks[noOfBooks] = BookName;
        System.out.println(BookName + " book has been added.");
        System.out.println();
       noOfBooks++ ;
    }
    void showAvailableBooks (){
        System.out.println("these are the available books:");
            for(String elements: availableBooks){
                if (elements == null){
                    continue;
                }
                System.out.print("*");
                System.out.println(elements);


       }
        System.out.println();
    }
    void issueBook (String BookName){
        System.out.println(BookName + " book has been issued");
        for (int a = 0;a < availableBooks.length;a++){
            if (availableBooks[a]==BookName){
                availableBooks[a] = null;
            }
        }
        System.out.println();
    }



}
public class Online_Library2 {
    public static void main(String[] args) {
        Library myLibrary = new Library();
        myLibrary.availableBooks = new String[10];
        myLibrary.addBooks("java");

        myLibrary.addBooks("AppDevelopment");
        myLibrary.showAvailableBooks();
        myLibrary.issueBook("java");
        myLibrary.showAvailableBooks();

    }
}
