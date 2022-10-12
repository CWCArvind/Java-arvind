class greet1 extends Thread {
    public void run() {


                System.out.println("good morning");
            }
        }


    class greet2 extends Thread {

//        public void run() {
//
//            while (false) {
//
//                System.out.println("welcome");
//            }
//        }
   }

    public class Threads_Practice_set {
        public static void main(String[] args) {

            greet1 You1 = new greet1();
            greet2 You2 = new greet2();
//            System.out.println(You1.getPriority());
//            System.out.println(You2.getPriority());
//            You1.setPriority(1);
//            You2.setPriority(10);
            You1.start();
            You2.start();

            System.out.println(You1.getState());
            System.out.println(You2.getState());




        }
    }

