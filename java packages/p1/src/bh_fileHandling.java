import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class bh_fileHandling {
    public static void main(String[] args) {

//        file handling in java

        // Creating a new file
    /*   File myFile = new File("proteinWithCode");
        try {
            myFile.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


     */

        // Writing in the file using java code
  /*    try {
            FileWriter myFileWriter = new FileWriter("proteinWithCode");
            myFileWriter.write("\"Protein is very necessary for proper logic building in code, \n because if you have weak nerves and muscles you can't build logic efficiently\"");
            myFileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

     */

        // Reading of file :
/*       File myFile = new File("proteinWithCode");
        try {
            Scanner S = new Scanner(myFile);
            while(S.hasNextLine()){
                System.out.println(S.nextLine());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

 */



        // Deleting the file
    /*    File myFile = new File("proteinWithCode");
        if(myFile.delete()){
            System.out.println("Your file has been deleted successfully");
        }
        else{
            System.out.println("Sorry! We can't delete your file");
        }

     */



    }
}
