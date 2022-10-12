class Ekclass {
    int a;

    Ekclass (int a){
        this.a = a;
    }
    public int getA(){
        return a;
    }
}

class Doclass extends Ekclass {
    Doclass (){
        super(5);
      System.out.println("mai ek constructor hoon.");
    }

}
public class this_super {
    public static void main(String[] args) {

//        System.out.println(e.a);

        Doclass d = new  Doclass();
        System.out.println(d.getA());

    }

}
