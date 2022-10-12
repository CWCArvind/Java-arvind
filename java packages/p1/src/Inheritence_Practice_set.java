class MyRectangle {
    public int length;
   public int breadth;

    public MyRectangle (int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    int area (){
        return length*breadth;
    }

}

class Cuboid extends MyRectangle {
    public Cuboid ( int length,int breadth,int height){
        super( length, breadth);
        this.height=height;
    }
    int height;

    int Volume (){
        return area()*height;
    }

}


class Circle {
    Circle(int radius){
        this.radius =radius;
    }
    public int radius;
    public double area (){
        return Math.PI*radius*radius;
    }


}

class myCylinder extends Circle {
    public int height;

    myCylinder (int height,int radius){
        super(radius);
        this.height=height;
    }
    public double volume (){
        return area()*height;
    }

}

public class Inheritence_Practice_set {
    public static void main(String[] args) {

//        myCylinder mensuration = new myCylinder(5,10);
//        System.out.println(mensuration.volume());

        Cuboid cuboid = new Cuboid(4,8,5);
        System.out.println(cuboid.Volume());


    }
}
