class superclass {
    public int meth1 (){
        return 11;
    }
}

class subclass extends superclass {
    @Override
    public int meth1(){
        return 22;
    }
}

public class Method_Overriding {
    public static void main(String[] args) {
        subclass obj = new subclass();
        System.out.println(obj.meth1());



    }
}
