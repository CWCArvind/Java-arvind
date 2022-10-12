package java_Revision;

class custom_Exception extends Exception{
    @Override
    public String toString() {
        return "Error";
    }

    @Override
    public String getMessage() {
        return "Array OUt of bound exception";
    }

    @Override
    public  void printStackTrace() {
        System.out.println("No error just wanted to chill with you");
    }
}

public class exceptionHandling {
    public static void main(String[] args) throws custom_Exception{
        System.out.println("Let's do some hustle");
        int [] marks = {2,5,8,7,9,6,4};


    }
}
