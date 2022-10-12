class parent{
    parent(int x){
        System.out.println("I am a parent class constructor."+x);
    }
    parent(){
        System.out.println("I am a parent class constructor.");
    }
}
class child extends parent{
    child (){
      super (10);
      System.out.println("I am a child class constructor.");
    }

    child (int x,int y){
       super (x);
        System.out.println("I am a child class constructor."+y);
    }
}
class grandChild extends child{
    grandChild(){
        System.out.println("I am a grandchild class constructor.");
    }
    grandChild(int x,int y,int z){
        super ();
        System.out.println("I am a grandchild class constructor."+z);
    }

}




public class Constructors_in_Inheritence {
    public static void main(String[] args) {
        grandChild son = new grandChild(1,2,3);

    }
}
