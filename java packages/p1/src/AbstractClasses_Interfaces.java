 abstract class shapes {
    abstract void area();
    abstract void perimeter();
}
 class MyRectang extends shapes{
    @Override
    void area (){
        this.area = length*breadth;
        System.out.println(area);
    }
    @Override
    void perimeter (){
        perimeter = 2*(length + breadth);
        System.out.println(perimeter);
    }
    int area;
    int perimeter;
    int length;
    int breadth;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }




}


public class AbstractClasses_Interfaces {
    public static void main(String[] args) {
        MyRectang mensuration = new MyRectang();
        mensuration.setLength(5);
        mensuration.setBreadth(4);
        mensuration.area();
        mensuration.perimeter();
        shapes obj = new MyRectang();
        obj.area();
        obj.perimeter();

    }
}
