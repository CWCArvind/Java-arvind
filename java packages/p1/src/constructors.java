class MyMainEmployee {
    private int id;
   private String name;

   public MyMainEmployee(int d,String x){
       id = d;
       name =x;
   }
   public MyMainEmployee (){
       id = 25;
       name = "Yash Sharma";
   }

    public void setId (int i) {
        id = i;
    }
    public void setName (String n) {
        name = n;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    }


public class constructors {
    public static void main(String[] args) {
        MyMainEmployee Arvind = new MyMainEmployee();
//        Arvind.setName("Arvind Sharma");
        System.out.println(Arvind.getName());
        System.out.println(Arvind.getId());


    }
}
