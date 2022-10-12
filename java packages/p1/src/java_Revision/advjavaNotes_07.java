package java_Revision;
import java.util.*;

import java.io.File;
import java.io.IOException;
/*
interface myWork{
    void MyWork();
    void yourWork();
}

interface CWC {
    int codesSolved();
}

 */



public class advjavaNotes_07 {
    public static void main(String[] args) {
        System.out.println("I can type very fastly");
        // Annotations --> @Override , @Functional Interface ,@Suppress Warning ,

        // Lambda Expressions and Anonymous Classes :

        // This is the anonymous class :
     /*   myWork obj = new myWork() {
            @Override
            public void MyWork() {

            }

            @Override
            public void yourWork() {

            }
        };

        // This is lambda expression :
        CWC website = ()->{
            System.out.println("No of codes solved per day are : ");
            return 9;
        };

      */

        // File Handling in Java :

        File CWC = new File("Reportskjdsal.txt");

        try {
            CWC.createNewFile();
        }
        catch (Exception e){
            System.out.println("Sorry ! File cannot be created");
        }

    }
}
