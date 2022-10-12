 class Tommy{
    public void hit(){
        System.out.println("Hitting the enemy");
    }
     public void fire(){
         System.out.println("Firing on the enemy");
     }
     public void run(){
         System.out.println("Running from the enemy");
     }
 }

class square {
    float side;

    public float area(){
        return side*side;
    }
    public float perimeter(){
        return 4*side;

    }
 }

class cellphone{
    public void ring (){
        System.out.println("Ringing...");
    }
    public void vibrate (){
        System.out.println("Vibrating...");
    }
}


  class Employee {
    int salary;
    String name;
    public int getSalary(){
        System.out.print("Your monthly salary is credited into your account which equals to:");
        return salary;
    }

    public String getName() {
        return name;
    }
    public void setName(String changeNameTo){
         name = changeNameTo;

    }
}



public class Ch_8practice_set {
    public static void main(String[] args) {
        /* Employee Rajat = new Employee();

        Rajat.setName("Rajat chauchan");
        System.out.println(Rajat.getName());

        cellphone asus = new cellphone();
        asus.vibrate();
        asus.ring(); */

//        square mensuration = new square();
//        mensuration.side = 5.8f;
//        System.out.println(mensuration.area());
//        System.out.println(mensuration.perimeter());

        Tommy player1 = new Tommy();
        player1.fire();
        player1.hit();




    }

}
