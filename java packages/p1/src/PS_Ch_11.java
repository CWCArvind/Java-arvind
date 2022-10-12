abstract class Telephone {
    abstract void ring ();
   abstract void lift ();
   abstract void disconnect ();
}
class SmartTelephone extends Telephone{
     @Override
    void ring (){
         System.out.println("Ringing...");
     }
    @Override
     void lift (){
         System.out.println("Lifting...");
     }
    @Override
     void disconnect (){
         System.out.println("Disconnecting...");
     }
     void socialMedia (){
         System.out.println("Delete Insta \nDeleting...");
     }
}



interface TVRemote {
    void Remote ();
}
interface SmartTVRemote extends TVRemote{

}
class TV implements TVRemote{
    public void Remote (){
        System.out.println("Connecting...");
    }
}
abstract class Pen {
    public abstract void write();
    public abstract void refill();
}

class FountainPen extends Pen{
   @Override
    public  void write(){
       System.out.println("writing");
    }
    @Override
    public  void refill(){
        System.out.println("refilling");
    }
    public void changeNib(){
        System.out.println("Nib has been changed");
    }
}


class Monkey {
    void jump (){
        System.out.println("Jumping...");
    }
    void bite (){
        System.out.println("biting...");
    }
}
interface BasicAnimal {
    void eat ();
    void sleep ();
}
class Human extends Monkey implements BasicAnimal{
    void speak (){
        System.out.println("Hello Sir, Sir Sir... Hello");
    }
    public void eat (){
        System.out.println("Eating...");
    }
    public void sleep (){
        System.out.println("Sleeping...");
        System.out.println("Reapeating");
    }
}
public class PS_Ch_11 {
    public static void main(String[] args) {
        FountainPen Arvind = new FountainPen();
        Arvind.changeNib();
        BasicAnimal obj = new Human();
        obj.eat();
        obj.sleep();

        Telephone action = new SmartTelephone();
        action.ring();
        SmartTelephone ok = new SmartTelephone();
        ok.socialMedia();



    }
}
