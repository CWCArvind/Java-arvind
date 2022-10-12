interface camera {
    void takesSnap ();
    void recordVideo ();
    default void voteOfThanks (){
        System.out.println("Thank you for using me.");
    }
}

interface Wifi extends camera {
    String[] getNetworks ();
    void connectToNetwork ();
}
class myCellPhone {
    void callNumber (int phoneNumber){
        System.out.println("Calling" + phoneNumber);
    }
    void pickCall() {
        System.out.println("Connecting... ");
    }
}


class SmartPhone extends myCellPhone implements  Wifi {

    public void takesSnap (){
        System.out.println("kya jeher photo li hai mene.");

    }
   public void recordVideo (){

    }

   public String[] getNetworks (){
       System.out.println("This is available network list...");
       String [] networklist = {"Arvind" ," Sharmaji" , "free ka nahi hai"};
       return networklist;
    }
   public void connectToNetwork (){

    }
        }

public class default_methods {
    public static void main(String[] args) {

        SmartPhone obj = new SmartPhone();

        String [] arr = obj.getNetworks();
        for (String elements : arr){
            System.out.println(elements);
        }
        obj.takesSnap();



    }
}