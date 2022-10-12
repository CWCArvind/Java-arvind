@FunctionalInterface
interface meriMarzi {
    void merimarzi ();
}

class Phone{
    public void showTime (){
        System.out.println("Watch your right hand side below down your screen you will get the correct time");
    }
}

class NewPhone extends Phone {
    @Override
    @Deprecated
    public void showTime (){
        System.out.println("This is the correct time");
    }

}

public class java_Annotations {
     @SuppressWarnings("Deprecation")
    public static void main(String[] args) {
        /*Annotations --> provides metadata
        gives extra info
         */

        NewPhone phone = new NewPhone();
        // Functional Interface --> An interface which has only one method

        phone.showTime();





    }
}
