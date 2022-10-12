import java.util.Scanner;
//problem 1&2
class b_thread extends Thread{
    @Override
    public  void run() {
       for (int i=0;i<96;i++){
            System.out.println("good morning "+"\n"+"welcome");
        }
        super.run();
    }
}
class a_thred extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                a_thred.sleep(200);
                System.out.println("welcome");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
/*
class myThread3 extends Thread {
    @Override
    public void run() {

        for(int i=0;i<100;i++) {
            System.out.println("I am run method of myThread3 class");
        }
    }
}
class myThread4 extends Thread {
    @Override
    public void run() {
        for(int i=0;i<100;i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("I am run method of myThread4 class");
        }
    }
}

class myThread5 implements Runnable {
    @Override
    public void run() {
        for(int i=0;i<100;i++) {
            System.out.println("I am run method of Runnable interface");
        }
    }
}
*/
public class bh_threading {
    public static void main(String[] args) throws InterruptedException {
        b_thread obj=new b_thread();
        a_thred abc=new a_thred();
        System.out.println(abc.getState());
        abc .start();
        abc.join();
       obj.start();
       abc.setPriority(10);
       obj.setPriority(5);
     //   System.out.println(abc.getPriority());
    //    System.out.println(obj.getPriority());


     /*   myThread4 Th4 = new myThread4();
        myThread3 Th3 = new myThread3();
        myThread5 goli = new myThread5();
        Thread bandook = new Thread(goli);


//        bandook.start();
        Th3.start();
        Th4.start();
        Th4.join();
        System.out.println(Th3.getPriority());

        System.out.println(Th3.getState());

        Th3.setPriority(10);
        Th4.setPriority(1);

//        Th4.start();
        Th3.start();

        System.out.println(Th3.getState());
*/
    }
}
