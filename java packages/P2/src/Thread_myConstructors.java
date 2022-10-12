
class mynewThread extends Thread {
    String name ;
    mynewThread (String name) {
        super(name);

            this.name = name;
            System.out.println("I am a thread constructor... having " + name + "as my name");
        }


    @Override
    public void run (){
        while(true) {
            System.out.println("I only starts with .start method... Haa... Haa..." + name + " that's my name");
        }
    }
}


public class Thread_myConstructors {
    public static void main(String[] args) {

        mynewThread t1 = new mynewThread("Sharmaji");
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        mynewThread t2 = new mynewThread("Panditji");
        t2.start();







    }
}
