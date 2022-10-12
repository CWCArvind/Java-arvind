import java.util.ArrayList;

class myGenerics <T1,T2>{
    int val;
    private T2 t2;

    public T2 getT2() {
        return t2;
    }

    public void setT2(T2 t2) {
        this.t2 = t2;
    }

    private T1 t1 ;

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public T1 getT1() {
        return t1;
    }

    public void setT1(T1 t1) {
        this.t1 = t1;
    }

    public myGenerics(int val, T1 t1,T2 t2) {
        this.val = val;
        this.t1 = t1;
        this.t2 = t2;
    }
}

public class Java_Generics {


    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(46);
//        arrayList.add("Arvind");
//        String str = (String)arrayList.get(1);
        int a = arrayList.get(0);
    //    System.out.println(str);
        System.out.println(a);

        myGenerics<String,Integer> g1 = new myGenerics<>(1,"Arvind Sharma",3000);
        String str = g1.getT1();
        int s = g1.getT2();
        System.out.println(str+s);

    }
}
