class rectangle {
   private int length;
    private int breadth;

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }

    public rectangle() {
        this.length = 4;
        this.breadth = 5;
    }

    public rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
}





class Cylinder {
    private int radius;
    private int height;

//    public Cylinder(int r,int h){
//        radius = r;
//        height = h;
//    }


//    double surfaceArea (){
//        return (2*(Math.PI)*radius*height + 2*(Math.PI)*radius*radius);
//    }
//
//    float volume (){
//        return (22/7.0f)*radius*radius*height;
//    }
//
//    public void setRadius(int radius) {
//        this.radius = radius;
//    }
//
//    public void setHeight(int height) {
//        this.height = height;
//    }
//
//    public int getRadius() {
//        return radius;
//    }
//
//    public int getHeight() {
//        return height;
//    }
}

public class Ch9_PS {
    public static void main(String[] args) {

//        Cylinder hr = new Cylinder();
//        hr.setHeight(12);
//        hr.setRadius(9);
//
////        System.out.println(hr.getHeight());
////        System.out.println(hr.getRadius());
//        System.out.println(hr.surfaceArea());
//        System.out.println(hr.volume());

       // Cylinder myCylinder = new Cylinder(7,12);

        rectangle myRectangle = new rectangle(4,5);
        System.out.println(myRectangle.getBreadth());
        System.out.println(myRectangle.getLength());




    }
}
