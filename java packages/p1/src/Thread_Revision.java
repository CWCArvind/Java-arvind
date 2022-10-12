class thread5 extends Thread {
    thread5(String name){
        super(name);
    }
    @Override
    public void run() {
        while (true)
        System.out.println("I am run method of thread class");
    }
}

class thread6 implements Runnable{
    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        }
        catch (Exception e){
            System.out.println(e);
        }
        while (true)
        System.out.println("i am run method of runnable interface");
    }
}

public class Thread_Revision {
    public static void main(String[] args) {
        //why do we use thread - to do multiple tasks , it is mainly used in development of software like autosaving thread -
        // thread is used when the time to execute it is not compulsory like a auto saving thread will work with a takeuserinput thread.

        //How to make a thread - 1) by extending a thread class - you can override run method and make an object of the class which will work like a thread.
        // 2)by implementing a runnable interface- you have to override the run method and object of class will be placed in the object of thread class.

        thread6 bullet6 = new thread6();
        Thread gun6 = new Thread(bullet6);

        thread5 gun5 = new thread5("autosavingthread");
        System.out.println(gun5.getName());
        gun6.start();
        gun5.start();






    }
}
