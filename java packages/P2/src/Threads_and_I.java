class greet1 extends Thread {
    greet1(String name){
        super(name);
    }
    @Override
    public void run() {
        for(int i =0;i<=100;i++) {
            System.out.println("Good Morning");
        }
        System.out.println(Thread.currentThread().getName());
    }
}class greet2 extends Thread {
    @Override
    public void run() {
        for(int i =0;i<=100;i++)  {
            System.out.println("Welcome");
        }

    }
}


public class Threads_and_I {
    public static void main(String[] args) {
        //Creating a thread;
        greet1 obj1 = new greet1("Arvind");
        greet2 obj2 = new greet2();
        System.out.println(obj1.getState());
        System.out.println();
        obj1.start();
        System.out.println();
        obj2.start();

    }
}
