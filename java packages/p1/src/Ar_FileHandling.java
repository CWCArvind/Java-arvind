import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Ar_FileHandling {
    public static void main(String[] args) {
        System.out.println("Trying to create and write in java file.");

   /*     File file = new File("Gram_Deeghi_Society");
        try {
            file.createNewFile();
        }
        catch (Exception e){
            System.out.println("Some error occurred in creating your file");
        }


    */

        try {
            FileWriter fileWriter = new FileWriter("Gram_Deeghi_Society");

            fileWriter.write("Gram deeghi ki society ke chakkar m na aaye yaha ek se ek badkar gaandu hai ... ye meri personal suggestion hai please follow it unless you are going into a merciless society with mercy");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        File file = new File("Gram_Deeghi_Society");
        try {
            Scanner S = new Scanner(file);
            while (S.hasNextLine()){
                System.out.println(S.hasNext());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        file.delete();


    }
}
