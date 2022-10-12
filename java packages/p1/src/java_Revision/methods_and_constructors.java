package java_Revision;

class Cylinder {
    float radius;
    float height;
    Cylinder(float r , float h){
        this.radius = r;
        this.height = h;
    }
    double volume (){
        return Math.PI*radius*radius*height;
    }
}

public class methods_and_constructors {


    public static void main(String[] args) {
        System.out.println("how your day is going on :");
        Cylinder cylinder = new Cylinder(7,7);
        System.out.println(cylinder.volume());


    }
}
