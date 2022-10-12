class MySuperClass {
    MySuperClass(){
        System.out.println("I am constructor of super class.");
    }

    void meth1 (){
        System.out.println("I am method 1 of super class.");
    }
    void meth2 (){
        System.out.println("I am method 2 of super class.");
    }

        }
    class MySubClass extends MySuperClass{
        MySubClass(){
            System.out.println("I am constructor of sub class.");
        }

        void meth3 (){
            System.out.println("I am method 3 of sub class.");
        }
        @Override
        void meth2 (){
            System.out.println("I am method 2 of sub class.");
        }

    }

public class Dynamic_Method_Dispatch {
    public static void main(String[] args) {

        MySuperClass object = new MySubClass();
        object.meth2();
        object.meth1();

    }
}
