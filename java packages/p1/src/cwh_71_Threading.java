class myThread1 implements Runnable {
    @Override
    public void run (){
        for(int i =1;i<=100;i++) {
            System.out.println("Radhe Radhe...");
        }
    }
}
class myThread2 implements Runnable {
    @Override
    public void run (){
        for(int i =1;i<=200;i++) {
            System.out.println("Krishna Krishna...");
        }
    }
}
public class cwh_71_Threading {
    public static void main(String[] args) {

        myThread1 t1 = new myThread1();
        Thread win1 = new Thread(t1);

        myThread2 t2 = new myThread2();
        Thread win2 = new Thread(t2);

        win1.start();
        win2.start();





    }
}
