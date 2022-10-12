class Rectangle {

    int length ;
    int breadth ;

    void setLength (int length){
        this.length = length;
    }
    int getLength (){
        return length;
    }

    void setBreadth (int breadth){
        this.breadth = breadth;
    }
    int getBreadth (){
        return breadth;
    }

    int area (){
        return length*breadth;
    }



    int perimeter (){
        return 2*(length + breadth);

    }
}

class Square extends Rectangle {
    int side;

    void setSide (int side){
        this.side = side;
    }
    int getSide (){
        return this.side;
    }

    void equalise (){
        this.side = this.breadth = this.length;
    }
}


class Circle2 {

    int radius;

    void setRadius (int radius){
        this.radius = radius;
    }
    int getRadius(){
        return radius;
    }


    double area (){
        return (Math.PI)*radius*radius;
    }

    double perimeter (){
        return 2*(Math.PI)*radius;

    }
}


class Cylinder2 extends Circle2{

    float height;

    void setHeight (float height){
        this.height = height;
    }
    float getHeight(){
        return height;
    }


    double volume (){
        double x = area()*this.height;
        return x;
    }

    double surfaceArea (){
        double y = perimeter() * this.height + 2.0f * area();
        return y;

    }
}


class Sphere2 extends Circle2 {

    double volume (){
        return 4/3.0f*area()*this.radius;
    }

    double surfaceArea (){
        return 4.0f*area();

    }
}


public class ThugLife {
    public static void main (String[] args){

        Rectangle Rect = new Rectangle();
        Square Sq = new Square();
        Circle2 Cir = new Circle2();
        Cylinder2 Cyl = new Cylinder2();
        Sphere2 Sph = new Sphere2();

        Rect.setLength(4);
        Rect.setBreadth(3);
        System.out.println("Area of Rectangle is: "+ Rect.area());
        System.out.println("Perimeter of Rectangle is: "+ Rect.perimeter());

        Sq.setSide(3);
        Sq.equalise();
        System.out.println("Area of Square is: " + Sq.area());
        System.out.println("Perimeter of Square is: " + Sq.perimeter());

        Cir.setRadius(7);
        System.out.println("Area of Circle is: " + Cir.area());
        System.out.println("Perimeter of Circle is: " + Cir.perimeter());

        Cyl.setHeight(4.0f);
        System.out.println("Volume of Cylinder is: " + Cyl.volume());
        System.out.println("Surface Area of Cylinder is: " + Cyl.surfaceArea());

        Sph.setRadius(14);
        System.out.println("Volume of Sphere is: " + Sph.volume());
        System.out.println("Surface Area of Sphere is: " + Sph.surfaceArea());


    }
}

