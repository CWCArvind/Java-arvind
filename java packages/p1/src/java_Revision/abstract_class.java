package java_Revision;
class Monkey {
    void jump(){
        System.out.println("I am jumping ");
    }
    void bite (){
        System.out.println("I can bite");
    }
}

interface  BasicAnimal{
    void eat ();
    void sleep();
}

class Human extends Monkey implements BasicAnimal{
    @Override
    public void eat() {
        System.out.println("I can eat Because I had to live");
    }

    @Override
    public void sleep() {
        System.out.println("I am sleeping , DND");
    }
}

public class abstract_class {
    public static void main(String[] args) {

        Human human = new Human();
        human.eat();
        human.sleep();

//        we use nested try catch when we have to explicitly check some part of code present in the try hence for this particular code we use another try catch withing the first try :

    }
}
