class Animal {
    //String talk;
    //String behaviour;

    void talk (){
        System.out.println("Humans can not understand their talks.");
    }
    void behaviour (){
        System.out.println("they are the mirror image of the humans behaviour with them.");
    }
}

    class Dog extends Animal{
        void sound (){
            System.out.println("Dogs bark.");
        }
        void loyality (){
            System.out.println("Dogs are very loyal to humans.");
        }
    }


class base {
    public int a;
    public int b;

    public void setA (int a){
        this.a=a;
    }
    public void setB (int b){
        this.b=b;
    }
    public int getA (){
        return a;
    }
    public int getB (){
        return b;
    }
}

class derived extends base {

    int y;
    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

}



public class Inheritence {
    public static void main(String[] args) {
        //Inheritence of a class:
//        base b = new base();
//        derived d = new derived();
//        b.setA(5);
//        System.out.println(b.getA());
//        d.setA(4);
//        System.out.println(d.getA());

//        Animal pets = new Animal();
//        Dog dog = new Dog();
//        dog.behaviour();
//        dog.talk();
//        dog.sound();
//        dog.loyality();




    }
}
