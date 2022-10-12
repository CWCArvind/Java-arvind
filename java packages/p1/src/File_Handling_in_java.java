import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class File_Handling_in_java  {
    public static void main(String[] args) {
/*
        // Code to create a new file in java
        File file = new File("Arvind Sharma created this file");
        try {
            file.createNewFile();
        }
        catch (IOException e){
            System.out.println("Sorry, unable to create your file");
        }

        // Code to write in file:

        try {
            FileWriter fileWriter = new FileWriter("Arvind Sharma created this file");
            fileWriter.write("This is the first file from this java course\nOk now bye");
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // Reading from a file

        File myFile = new File("Arvind Sharma created this file");

        try {
            Scanner S = new Scanner(myFile);
            while(S.hasNextLine()){
                System.out.println(S.nextLine());
            }
            S.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

//    Deleting a file:

        File myFile = new File("Arvind Sharma created this file");
        if(myFile.delete()){
            System.out.println("Your file is deleted successfully");
        }
        else{
            System.out.println(myFile.getName()+" some error occurred in deleting this file");
        }*/

        // Creating a file:
        /*

        File file = new File("myJavaFile");
        try {
            file.createNewFile();
        }
        catch (IOException e){
            System.out.println("Sorry, file is not created some exception occurred");
        }
        */


        // Writing in the file
/*
        try {
            FileWriter fileWriter = new FileWriter("myJavaFile");
            fileWriter.write("This file is created for practicing the java. Hope! you understand");
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        */

        //Reading a file
/*

        File file = new File("myJavaFile");
        try {
            Scanner S = new Scanner(file);
            while(S.hasNextLine()) {
                System.out.println(S.nextLine());
            }
            S.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        */


        // Deleting the file
/*
        File file = new File("myJavaFile");
        if(file.delete()){
            System.out.println(file.getName()+" has been deleted successfully");
        }
        else{
            System.out.println("Some error occurred in deletion of file");
        }
*/
    }
}
