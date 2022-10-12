package BhuvneshSharma;

interface Bicycle {
    int a= 2;
    void applyBreak(int decrement);
    void speedUp(int increment);
    private void stop (){
        System.out.println("Your journey ends here");
    }
    default void start (){
        System.out.println("your welcome to the cycle ride.");
        stop();
    }
}
class AvonCycle implements Bicycle{
   public void applyBreak(int decrement){
        System.out.println("speed decremented by "+decrement);
    }
   public void speedUp(int increment){
        System.out.println("Speed incremented by "+ increment);
    }
}
/*
abstract class shapes {
    int dim1;
    int dim2;
    abstract void area (int dim1, int dim2);
    abstract void perimeter(int dim1, int dim2);
}
class Rectangle extends shapes {
    void area (int dim1, int dim2){
        System.out.println(dim1*dim2);
    }
    void perimeter (int dim1, int dim2){
        System.out.println(2*(dim1+dim2));
    }
}
*/

/*class shapes {
    int dim1;
    int dim2;
    void meth1 (){
        System.out.println("I am method one of base class. ");
    }
    void meth2 (){
        System.out.println("I am method two of base class.");
    }
}
class Bh_shapes extends shapes{
    @Override
    void meth1 (){
        System.out.println("I am overrided method in derived class");
    }
    void bh_meth2 (){
        System.out.println("I am method of derived class.");
    }
}

 */



public class Bh_abstract_class_and_interface {
    public static void main(String[] args) {

//        Rectangle rect = new Rectangle();
//        rect.area(2,5);
//        rect.perimeter(2,8);

//        shapes bh = new Bh_shapes();

        AvonCycle avonCycle = new AvonCycle();
        avonCycle.applyBreak(5);
        avonCycle.speedUp(10);




    }
}
