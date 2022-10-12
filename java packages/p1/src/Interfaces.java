interface Bicycle {
    void speedup();

    void applyBreak();
}
 interface Horn {
        void blowhornKGF ();
        void blowhornNIT ();
    }

class AvonBicycle implements Bicycle, Horn {
    public void blowhornKGF (){
        System.out.println("Tannan Tannan Tannan po po po...");
    }
    public void blowhornNIT (){
        System.out.println("Mai hoon na po po po...");
    }

    public void speedup (){
        System.out.println("Speed has been increased.");
    }
    public void applyBreak (){
        System.out.println("Breaks has been applied.");
    }
    public void blowHorn(){
        System.out.println("pee po pee po");
    }
}

public class Interfaces {
    public static void main(String[] args) {
        AvonBicycle Arvind_Bicycle = new AvonBicycle();
        Arvind_Bicycle.applyBreak();
        Arvind_Bicycle.speedup();
        Bicycle herculus = new AvonBicycle();
        herculus.applyBreak();
        Arvind_Bicycle.blowhornNIT();

    }
}
