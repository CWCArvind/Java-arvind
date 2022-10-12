import java.util.*;
class threading5 extends Thread {
    @Override
    public void run() {
        int n;
        try (Scanner s = new Scanner(System.in)) {
            n = s.nextInt();
        }
        for (int i = 0; i < n; i++) {
            try {
                threading5.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("good morning " + "\n" + "welcome ");
        }
    }
}
//
//abstract class pennn {
//    pennn (){
//        System.out.println("i am default constructor ");
//    }
//    pennn(int a){
//        System.out.println("i am penn class constructor");
//    }
//   abstract void write();
//   abstract void refill();
//void rewrite (){
//    System.out.println("rewrite");
//}
//}
//class fountain extends pennn {
//    fountain(int a){
//        super(a);
//        System.out.println("i am fountain class constructor ");
//
//    }
//    public void write (){
//        System.out.println("i am write method ");
//    }
//    public void refill (){
//        System.out.println("i am refill method ");
//    }
//    void changenib (){
//        System.out.println("i am change nib");
//    }
//
//}




public class bh_11abstractclass {
    public static void main(String[] args) {
        threading5 obj =new threading5();
        obj.start();
    }
//        fountain obj = new fountain(6);
//        obj.write();
//        obj.refill();
//        obj.changenib();
//        obj.rewrite();

}

