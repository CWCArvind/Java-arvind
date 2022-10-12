   interface myWifi {
    void AvailableNetworks ();
    private void connection (){
        System.out.println("Connect to network");
    }
    default void connecting (){
        connection();
        System.out.println("Connecting...");
    }
   }

abstract class My_Phone {
    public My_Phone(){
        System.out.println("Good Morning");
    }
       public My_Phone(int love){
           System.out.println("Love you"+love);
       }
    private String morningVibes;
    void setMorningVibes (String morningVibes){
        this.morningVibes = morningVibes;
    }
    String getMorningVibes (){
        return morningVibes;
    }

   abstract public void calling();
    public void pickUpCall(){
        System.out.println("hara batan dabakar call uthaiye");
    }
}

class My_Smartphone extends My_Phone implements myWifi{
   public void AvailableNetworks (){
        System.out.println("");
    }
   public My_Smartphone(int love) {
       super (love);
       System.out.println("How are you ?");
   }
   @Override
  public void calling (){
      System.out.println("Aarambh hai prachand ");
   }
}

public class all_in_one {
    public static void main(String[] args) {
        //My_Smartphone Smartphone = new My_Smartphone(3000);
        myWifi polym = new My_Smartphone(5000);
       // Smartphone.calling();
        polym.connecting();


    }
}
