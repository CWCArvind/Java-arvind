


/**
 * This is a class which has some greeting methods.
 * @author : Bhuvnesh Sharma
 * @version : 2.0
 * @since : 1998
 */

public class bh_adv_java2 {

    /**
     * This method gives you the info about how to introduce when you meet someone first time
     * @param name is the name of the person you met.
     * @return it returns a first time greet if the person is of your age.
     * @deprecated This is method has old style greeting method which is now not be in use to have an effective impression.
     * @throws ArithmeticException this method can throw Arithmetic Exception.
     */

    @Deprecated
    public String firstMeeting (String name)throws ArithmeticException{
        return "Hi! "+ name ;
    }

    public static void main(String[] args) {
        System.out.println("Hello, Today we are going to create out own documentation in java");
    }
}
