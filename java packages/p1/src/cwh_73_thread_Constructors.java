//Creating a thread using thread class;
class Thread1 extends Thread {
    Thread1(String name) {
        super(name);
        System.out.println("Haa... I am ..."+name);
    }
    @Override
    public void run (){
        System.out.println("Apun ko to bass drill karna hai... kisi se nahi bhidna hai");
    }
}


public class cwh_73_thread_Constructors {
    public static void main(String[] args) {

        Thread1 Th1 = new Thread1("Arvind");

        Th1.start();
        Thread1 Th2 = new Thread1("Tharun");
        Th2.setPriority(1);
        Th2.start();
        Thread1 Th3 = new Thread1("Chandu");
        Th3.start();
        Thread1 Th4 = new Thread1("Chimkandi");
        Th4.start();
        Th4.setPriority(10);



    }
}
