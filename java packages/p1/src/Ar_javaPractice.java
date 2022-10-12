import java.util.Scanner;
import java.util.*;

class Thread_Practice extends Thread{
    @Override
    public void run() {
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        while(true){
        System.out.println("I am run method of Thread class.");
    }
    }

}
class Tread_Practice implements Runnable {
    @Override
    public void run() {
        while (true) {
            System.out.println("I am run method of Runnable interface.");
        }
    }
}

class MyException4 extends Exception {
    @Override
    public String toString() {
        return "an exception occured due to your invalid input";
    }
}

interface johnCena{
    void interfaceMethod ();
    default void winnerOfFame (){
        System.out.println("The all time best fame player in WWE is JohnCena the chotu bhaiya or the short guy, he is still short means if you are short then you are no one is coming to make you tall.");
    }
        }
    class WWE implements johnCena{
    public void interfaceMethod (){
        System.out.println("I am overrided method of an interface and now i am in a class named very dangerous.");
    }
    }

abstract class Shape{
    int dim1;
    int dim2;
    void setDim1 (int dim1){
        this.dim1 = dim1;
    }
    void setDim2 (int dim2){
        this.dim2 = dim2;
    }
    abstract float area ();
    abstract float perimeter ();
}

class myRectangle5 extends Shape {
    @Override
    float area()  {
        if(dim1==dim2){
            throw new ArithmeticException();
        }
        return dim1*dim2;
    }

    @Override
    float perimeter() {
        float peri = (dim1+dim2)*2;
        return peri;
    }

    void newMethod (int a) throws MyException4{
        if (a==1){
            throw new MyException4();
        }
        System.out.println("This is the new method.");
    }
}




public class Ar_javaPractice {
    public static void main(String[] args) {

        myRectangle5 rectangle = new myRectangle5();
        rectangle.setDim2(3);
        rectangle.setDim1(2);
        System.out.println(rectangle.area());
        System.out.println(rectangle.perimeter());

        Shape Sh = new myRectangle5();

//        Packages

        // Interpreter vs Compiler --> Complier converts code in one go whereas interpreter converts code line by line but java is a hybrid language and hence it also has compiler and interpreter as well compiler compiles the java code into byte code . Now this machine code can be run on any platform like io windows linux etc. Hence it is platform independent.

//        java code ----------> byte code -----------> machine code
//                    compiler              interpreter

        try {
            rectangle.newMethod(1);
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("I am finally, really an extraordinary mind and place i have in my heart for everyone got it or not.");
        }

        Thread_Practice obj1 = new Thread_Practice();
        Tread_Practice obj2 = new Tread_Practice();
        Thread obj = new Thread(obj2);
        obj.getState();
        obj.start();

        try {
            obj.join();
        }
        catch (Exception e){
            System.out.println(e);
        }

        obj1.start();
        obj.setPriority(10);








    }
}
